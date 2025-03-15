package com.devrodts.personality.personality.AssessmentService.src.infra.controller;
import com.devrodts.personality.personality.AssessmentService.src.application.services.AssessmentService;
import com.devrodts.personality.personality.AssessmentService.src.infra.dtos.AssessmentRequestDTO;
import com.devrodts.personality.personality.AssessmentService.src.infra.dtos.PersonalityResultDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assessment")
public class AssessmentController {

    private final AssessmentService assessmentDomainService;

    public AssessmentController(AssessmentService assessmentDomainService) {
        this.assessmentDomainService = assessmentDomainService;
    }

    @PostMapping
    public ResponseEntity<PersonalityResultDTO> calculateAssessment(@RequestBody AssessmentRequestDTO requestDTO) {
        PersonalityResultDTO result = assessmentDomainService.calculateAssessment(requestDTO);
        return ResponseEntity.ok(result);
    }
}
