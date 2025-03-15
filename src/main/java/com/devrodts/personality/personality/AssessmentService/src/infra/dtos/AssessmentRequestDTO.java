package com.devrodts.personality.personality.AssessmentService.src.infra.dtos;

import java.util.List;

public class AssessmentRequestDTO {
    private List<AnswerDTO> answers;

    public List<AnswerDTO> getAnswers() {
        return answers;
    }
    public void setAnswers(List<AnswerDTO> answers) {
        this.answers = answers;
    }
}
