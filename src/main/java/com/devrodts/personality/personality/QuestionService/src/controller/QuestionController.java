package com.devrodts.personality.personality.QuestionService.src.controller;

import com.devrodts.personality.personality.QuestionService.src.application.services.QuestionService;
import com.devrodts.personality.personality.QuestionService.src.domain.model.Questions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/questions")
public class QuestionController {

    private final QuestionService questionDomainService;

    public QuestionController(QuestionService questionDomainService) {
        this.questionDomainService = questionDomainService;
    }

    @GetMapping
    public List<Questions> getAllQuestions() {
        return questionDomainService.getAllQuestions();
    }
}
