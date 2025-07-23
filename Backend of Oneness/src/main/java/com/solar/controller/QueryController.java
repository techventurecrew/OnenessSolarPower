package com.solar.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solar.dto.Queries;
import com.solar.entity.Otp;
import com.solar.repo.OtpRepo;
import com.solar.service.OtpService;
import com.solar.utility.Data;
import com.solar.utility.Utilities;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Tag(name = "Query Controller", description = "Handles customer queries and OTP verification")
@RestController
@RequestMapping("/api/v1/queries")
@CrossOrigin("*")
public class QueryController {

        @Autowired
        private OtpService otpService;

        @Autowired
        private JavaMailSender mailSender;

        @Operation(summary = "Send a customer query via email")
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "Query sent successfully"),
                        @ApiResponse(responseCode = "500", description = "Server error", content = @Content)
        })
        @PostMapping("/sendQuery")
        public ResponseEntity<String> sendQuery(
                        @RequestBody @Parameter(description = "Query data including email, name, location, and message") Queries queries)
                        throws MessagingException {
                // Logic to send email using mailSender
                MimeMessage mm = mailSender.createMimeMessage();
                MimeMessageHelper mmh = new MimeMessageHelper(mm, true);
                mmh.setTo("asasino3180@gmail.com");
                mmh.setSubject(queries.getConnectionType());
                mmh.setText(Data.getQueryEmailBody(
                                queries.getFirstName(),
                                queries.getLastName(),
                                queries.getPhoneNumber(),
                                queries.getEmail(),
                                queries.getCountry(),
                                queries.getCity(),
                                queries.getConnectionType(),
                                queries.getMessage()), true); // true to indicate HTML content
                mmh.setFrom(queries.getEmail());
                mailSender.send(mm);

                return ResponseEntity.ok("Query sent successfully!");
        }

        @Operation(summary = "Send an OTP to the user's email")
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "OTP sent successfully"),
                        @ApiResponse(responseCode = "500", description = "Server error", content = @Content)
        })
        @PostMapping("/sendOtp/{email}")
        public ResponseEntity<String> sendOtp(
                        @PathVariable @Parameter(description = "Email address to send OTP") String email)
                        throws MessagingException {
                // Logic to send OTP email using mailSender
                otpService.generateOtp(email);
                return ResponseEntity.ok("OTP sent successfully to " + email + "! Please check your inbox.");
        }

        @Operation(summary = "Verify the OTP sent to the user's email")
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "OTP verified successfully"),
                        @ApiResponse(responseCode = "400", description = "Invalid OTP or Email"),
                        @ApiResponse(responseCode = "500", description = "Server error", content = @Content)
        }) 
        @PostMapping("/verifyOtp")
        public ResponseEntity<String> verifyOtp(@RequestParam String email, @RequestParam String otp) {
                try {
                        Boolean isVerified = otpService.verifyOtp(email, otp);
                        if (isVerified) {
                                return ResponseEntity.ok("OTP verified successfully!");
                        } else {
                                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid OTP or Email.");
                        }
                } catch (Exception e) {
                        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                        .body("Error verifying OTP: " + e.getMessage());
                }
        }

}
