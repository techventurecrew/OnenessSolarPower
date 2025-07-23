package com.solar.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "feedbacks")
@Schema(description = "Feedback entity representing application feedback")
public class Feedback {
    @Id
    private String id;

    private String name;
    private String email;
    private Integer rating;
    private String feedbackMessage;
}
