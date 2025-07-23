package com.solar.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDto {
    @Id
    private String id;
    private String name;
    private String email;
    private Integer rating;
    private String feedbackMessage;
}
