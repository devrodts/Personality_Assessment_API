package com.devrodts.personality.personality.AssessmentService.src.infra.dtos;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityFacet;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityTrait;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class PersonalityResultDTO {
    private Map<PersonalityTrait, Double> traitScores = new EnumMap<>(PersonalityTrait.class);
    private Map<PersonalityTrait, Map<PersonalityFacet, Double>> facetScores = new EnumMap<>(PersonalityTrait.class);

    public Map<PersonalityTrait, Double> getTraitScores() {
        return traitScores;
    }
    public void setTraitScores(Map<PersonalityTrait, Double> traitScores) {
        this.traitScores = traitScores;
    }
    public Map<PersonalityTrait, Map<PersonalityFacet, Double>> getFacetScores() {
        return facetScores;
    }
    public void setFacetScores(Map<PersonalityTrait, Map<PersonalityFacet, Double>> facetScores) {
        this.facetScores = facetScores;
    }

    public void addTraitScore(PersonalityTrait trait, double score) {
        traitScores.put(trait, score);
    }
    public void addFacetScore(PersonalityTrait trait, PersonalityFacet facet, double score) {
        facetScores.computeIfAbsent(trait, k -> new HashMap<>()).put(facet, score);
    }
}

