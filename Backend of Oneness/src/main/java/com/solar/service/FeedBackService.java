package com.solar.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solar.dto.FeedbackDto;
import com.solar.entity.Feedback;
import com.solar.repo.FeedbackRepo;

@Service
public class FeedBackService {

    @Autowired
    private FeedbackRepo repo;

    @Autowired
    private ModelMapper modelMapper;

    public FeedbackDto createFeedback(FeedbackDto feedbackDto) {
        Feedback fb = modelMapper.map(feedbackDto, Feedback.class);
        Feedback saved = repo.save(fb);
        return modelMapper.map(saved, FeedbackDto.class);
    }

    public List<FeedbackDto> getAllFeedback() {
        List<Feedback> feedbackList = repo.findAll();
        return feedbackList.stream()
                .map(fb -> modelMapper.map(fb, FeedbackDto.class))
                .collect(Collectors.toList());
    }

}
