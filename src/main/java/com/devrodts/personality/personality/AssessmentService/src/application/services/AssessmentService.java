package com.devrodts.personality.personality.AssessmentService.src.application.services;

import com.devrodts.personality.personality.AssessmentService.src.infra.dtos.AnswerDTO;
import com.devrodts.personality.personality.AssessmentService.src.infra.dtos.AssessmentRequestDTO;
import com.devrodts.personality.personality.AssessmentService.src.infra.dtos.PersonalityResultDTO;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityFacet;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityTrait;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

class FacetScore {
    private double totalScore = 0;
    private double totalWeight = 0;
    public void addScore(double score, double weight) {
        totalScore += score;
        totalWeight += weight;
    }
    public double getAverage() {
        return totalWeight > 0 ? totalScore / totalWeight : 0;
    }
}

class TraitScore {
    private double totalScore = 0;
    private double totalWeight = 0;
    private Map<PersonalityFacet, FacetScore> facetScores = new HashMap<>();

    public void addScore(double score, double weight) {
        totalScore += score;
        totalWeight += weight;
    }
    public void addFacetScore(PersonalityFacet facet, double score, double weight) {
        facetScores.computeIfAbsent(facet, k -> new FacetScore()).addScore(score, weight);
    }
    public double getAverage() {
        return totalWeight > 0 ? totalScore / totalWeight : 0;
    }
    public Map<PersonalityFacet, FacetScore> getFacetScores() {
        return facetScores;
    }
}

@Service
public class AssessmentService {

    public PersonalityResultDTO calculateAssessment(AssessmentRequestDTO request) {

        Map<PersonalityTrait, TraitScore> traitScores = new EnumMap<>(PersonalityTrait.class);
        for (PersonalityTrait trait : PersonalityTrait.values()) {
            traitScores.put(trait, new TraitScore());
        }


        for (AnswerDTO answer : request.getAnswers()) {
            int adjustedResponse = answer.isReverseScored() ? (6 - answer.getResponse()) : answer.getResponse();
            TraitScore currentTraitScore = traitScores.get(answer.getTrait());
            currentTraitScore.addScore(adjustedResponse * answer.getWeight(), answer.getWeight());

            if (answer.getFacet() != null) {
                currentTraitScore.addFacetScore(answer.getFacet(), adjustedResponse * answer.getWeight(), answer.getWeight());
            }
        }

        PersonalityResultDTO result = new PersonalityResultDTO();
        for (Map.Entry<PersonalityTrait, TraitScore> entry : traitScores.entrySet()) {
            PersonalityTrait trait = entry.getKey();
            TraitScore score = entry.getValue();
            result.addTraitScore(trait, score.getAverage());
            for (Map.Entry<PersonalityFacet, FacetScore> facetEntry : score.getFacetScores().entrySet()) {
                result.addFacetScore(trait, facetEntry.getKey(), facetEntry.getValue().getAverage());
            }
        }
        return result;
    }
}
