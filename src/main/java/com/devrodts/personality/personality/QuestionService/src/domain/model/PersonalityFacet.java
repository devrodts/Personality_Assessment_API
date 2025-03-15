package com.devrodts.personality.personality.QuestionService.src.domain.model;

public enum PersonalityFacet {

    IMAGINATION(PersonalityTrait.OPENNESS),
    ARTISTIC_INTERESTS(PersonalityTrait.OPENNESS),
    EMOTIONALITY(PersonalityTrait.OPENNESS),
    INTELLECT(PersonalityTrait.OPENNESS),


    DUTIFULNESS(PersonalityTrait.CONSCIENTIOUSNESS),
    ORDERLINESS(PersonalityTrait.CONSCIENTIOUSNESS),
    ACHIEVEMENT_STRIVING(PersonalityTrait.CONSCIENTIOUSNESS),


    ASSERTIVENESS(PersonalityTrait.EXTROVERSION),
    FRIENDLINESS(PersonalityTrait.EXTROVERSION),
    EXCITEMENT_SEEKING(PersonalityTrait.EXTROVERSION),


    TRUST(PersonalityTrait.AGREEABLENESS),
    SYMPATHY(PersonalityTrait.AGREEABLENESS),
    ALTRUISM(PersonalityTrait.AGREEABLENESS),

    ANXIETY(PersonalityTrait.NEUROTICISM),
    DEPRESSION(PersonalityTrait.NEUROTICISM),
    ANGER(PersonalityTrait.NEUROTICISM);

    private final PersonalityTrait personalityTrait;

    PersonalityFacet(PersonalityTrait personalityTrait) {
        this.personalityTrait = personalityTrait;
    }

    public PersonalityTrait getPersonalityTrait() {
        return personalityTrait;
    }
}
