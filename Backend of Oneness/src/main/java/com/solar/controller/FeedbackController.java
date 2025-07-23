package com.solar.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solar.dto.FeedbackDto;
import com.solar.service.FeedBackService;

import jakarta.validation.Valid;

@Tag(name = "Feedback Controller", description = "Manage user feedback submissions and retrieval")
@RestController
@RequestMapping("/api/v1/feedbacks")
@CrossOrigin("*")
public class FeedbackController {

    @Autowired
    private FeedBackService feedbackService;

    @Operation(summary = "Create a new feedback entry")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Feedback successfully created",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackDto.class))),
        @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content)
    })
    @PostMapping
    public ResponseEntity<FeedbackDto> createFeedback(
        @RequestBody 
        @Valid 
        @Parameter(description = "Feedback details to be submitted", required = true)
        FeedbackDto feedbackDto
    ) {
        FeedbackDto savedFeedback = feedbackService.createFeedback(feedbackDto);
        return new ResponseEntity<>(savedFeedback, HttpStatus.CREATED);
    }

    @Operation(summary = "Get all feedback entries")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "List of feedback entries",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackDto.class)))
    })
    @GetMapping
    public ResponseEntity<List<FeedbackDto>> getAllFeedbacks() {
        List<FeedbackDto> feedbacks = feedbackService.getAllFeedback();
        return new ResponseEntity<>(feedbacks, HttpStatus.OK);
    }
}
