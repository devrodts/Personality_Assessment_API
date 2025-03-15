package com.devrodts.personality.personality.QuestionService.src.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID questionId;


    private String text;

    @Enumerated(EnumType.STRING)
    private PersonalityTrait trait;

    @Enumerated(EnumType.STRING)
    private PersonalityFacet facet;

    public double weight;

    private boolean reverseScored;

    public Questions() {
    }

    public Questions(String text, PersonalityTrait trait, PersonalityFacet facet, double weight, boolean reverseScored) {
        this.text = text;
        this.trait = trait;
        this.facet = facet;
        this.weight = weight;
        this.reverseScored = reverseScored;
    }

    public UUID getQuestionId() {
        return questionId;
    }

    public void setId(UUID questionId) {
        this.questionId= questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
