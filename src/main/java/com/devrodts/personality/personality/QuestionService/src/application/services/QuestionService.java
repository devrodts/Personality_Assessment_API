package com.devrodts.personality.personality.QuestionService.src.application.services;

import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityFacet;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityTrait;
import com.devrodts.personality.personality.QuestionService.src.domain.model.Questions;
import com.devrodts.personality.personality.QuestionService.src.domain.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @PostConstruct
    public void init() {
        if (questionRepository.count() == 0) {
            // OPENNESS
            questionRepository.save(new Questions("I have a vivid imagination.", PersonalityTrait.OPENNESS, PersonalityFacet.IMAGINATION, 1.0, false));
            questionRepository.save(new Questions("I enjoy art and music.", PersonalityTrait.OPENNESS, PersonalityFacet.ARTISTIC_INTERESTS, 1.0, false));
            questionRepository.save(new Questions("I am emotionally open.", PersonalityTrait.OPENNESS, PersonalityFacet.EMOTIONALITY, 1.0, false));
            questionRepository.save(new Questions("I like to explore new ideas.", PersonalityTrait.OPENNESS, PersonalityFacet.INTELLECT, 1.0, false));

            // CONSCIENTIOUSNESS
            questionRepository.save(new Questions("I am reliable and always get my work done on time.", PersonalityTrait.CONSCIENTIOUSNESS, PersonalityFacet.DUTIFULNESS, 1.0, false));
            questionRepository.save(new Questions("I prefer to have a set plan rather than improvising.", PersonalityTrait.CONSCIENTIOUSNESS, PersonalityFacet.ORDERLINESS, 1.0, false));
            questionRepository.save(new Questions("I set high goals for myself.", PersonalityTrait.CONSCIENTIOUSNESS, PersonalityFacet.ACHIEVEMENT_STRIVING, 1.0, false));

            // EXTROVERSION
            questionRepository.save(new Questions("I enjoy being the center of attention.", PersonalityTrait.EXTROVERSION, PersonalityFacet.ASSERTIVENESS, 1.0, false));
            questionRepository.save(new Questions("I feel energized when I am around other people.", PersonalityTrait.EXTROVERSION, PersonalityFacet.FRIENDLINESS, 1.0, false));
            questionRepository.save(new Questions("I seek out excitement and adventure.", PersonalityTrait.EXTROVERSION, PersonalityFacet.EXCITEMENT_SEEKING, 1.0, false));

            // AGREEABLENESS
            questionRepository.save(new Questions("I trust others easily.", PersonalityTrait.AGREEABLENESS, PersonalityFacet.TRUST, 1.0, false));
            questionRepository.save(new Questions("I am compassionate and feel others' emotions.", PersonalityTrait.AGREEABLENESS, PersonalityFacet.SYMPATHY, 1.0, false));
            questionRepository.save(new Questions("I am willing to help others.", PersonalityTrait.AGREEABLENESS, PersonalityFacet.ALTRUISM, 1.0, false));

            // NEUROTICISM
            questionRepository.save(new Questions("I often feel anxious or nervous.", PersonalityTrait.NEUROTICISM, PersonalityFacet.ANXIETY, 1.0, false));
            questionRepository.save(new Questions("I frequently experience mood swings.", PersonalityTrait.NEUROTICISM, PersonalityFacet.DEPRESSION, 1.0, false));
            questionRepository.save(new Questions("I get irritated easily.", PersonalityTrait.NEUROTICISM, PersonalityFacet.ANGER, 1.0, false));


            questionRepository.save(new Questions("I often enjoy contemplating abstract concepts.", PersonalityTrait.OPENNESS, PersonalityFacet.INTELLECT, 1.0, false));
            questionRepository.save(new Questions("I always keep my workspace organized.", PersonalityTrait.CONSCIENTIOUSNESS, PersonalityFacet.ORDERLINESS, 1.0, false));
            questionRepository.save(new Questions("I feel comfortable taking the lead in group situations.", PersonalityTrait.EXTROVERSION, PersonalityFacet.ASSERTIVENESS, 1.0, false));
            questionRepository.save(new Questions("I tend to avoid conflicts and always seek harmony.", PersonalityTrait.AGREEABLENESS, PersonalityFacet.ALTRUISM, 1.0, false));
            questionRepository.save(new Questions("I often feel overwhelmed by stress.", PersonalityTrait.NEUROTICISM, PersonalityFacet.ANXIETY, 1.0, false));
            questionRepository.save(new Questions("I enjoy philosophical discussions about life.", PersonalityTrait.OPENNESS, PersonalityFacet.INTELLECT, 1.0, false));
            questionRepository.save(new Questions("I meticulously plan my daily activities.", PersonalityTrait.CONSCIENTIOUSNESS, PersonalityFacet.ORDERLINESS, 1.0, false));
            questionRepository.save(new Questions("I thrive in social gatherings and enjoy meeting new people.", PersonalityTrait.EXTROVERSION, PersonalityFacet.FRIENDLINESS, 1.0, false));
            questionRepository.save(new Questions("I sometimes feel insecure about myself.", PersonalityTrait.NEUROTICISM, PersonalityFacet.DEPRESSION, 1.0, false));
        }
    }

    public List<Questions> getAllQuestions() {
        return questionRepository.findAll();
    }
}
