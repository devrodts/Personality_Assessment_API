package com.devrodts.personality.personality.AssessmentService.src.infra.dtos;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityFacet;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityTrait;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;


public class AnswerDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID questionId;


    private PersonalityTrait trait;
    private PersonalityFacet facet;

    private int response; // Escala Likert (1 a 5)
    private double weight;
    private boolean reverseScored;

    // Getters e Setters
    public UUID getQuestionId() {
        return questionId;
    }
    public void setQuestionId(UUID questionId) {
        this.questionId = questionId;
    }
    public PersonalityTrait getTrait() {
        return trait;
    }
    public void setTrait(PersonalityTrait trait) {
        this.trait = trait;
    }
    public PersonalityFacet getFacet() {
        return facet;
    }
    public void setFacet(PersonalityFacet facet) {
        this.facet = facet;
    }
    public int getResponse() {
        return response;
    }
    public void setResponse(int response) {
        this.response = response;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isReverseScored() {
        return reverseScored;
    }
    public void setReverseScored(boolean reverseScored) {
        this.reverseScored = reverseScored;
    }
}
