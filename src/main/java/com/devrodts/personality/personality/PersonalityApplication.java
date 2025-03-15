package com.devrodts.personality.personality;

import com.devrodts.personality.personality.AssessmentService.src.application.services.AssessmentService;
import com.devrodts.personality.personality.QuestionService.src.application.services.QuestionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PersonalityApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssessmentService.class, args);
        SpringApplication.run(QuestionService.class, args);
    }

}
