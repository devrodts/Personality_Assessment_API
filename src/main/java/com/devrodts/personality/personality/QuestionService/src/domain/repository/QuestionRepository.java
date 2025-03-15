package com.devrodts.personality.personality.QuestionService.src.domain.repository;

import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityFacet;
import com.devrodts.personality.personality.QuestionService.src.domain.model.PersonalityTrait;
import com.devrodts.personality.personality.QuestionService.src.domain.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, UUID> {


    Questions findQuestionsBy(UUID questionId);

    List<Questions> findAllByPersonalityTrait(PersonalityTrait personalityTrait);

    List<Questions> findAllByPersonalityFacet(PersonalityFacet personalityFacet);

    List<Questions> findTraitsOfUser(UUID userId);

    List<Questions> findTraitsOfUserAndPersonalityTrait(UUID userId, PersonalityTrait personalityTrait);

    @Override
    List<Questions> findAll();
    void deleteByQuestionId(UUID questionId);
}
