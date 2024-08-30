package com.reverside.workflow.controllers;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reverside.workflow.models.ResponseStatus;
import com.reverside.workflow.models.Statuses;
import com.reverside.workflow.models.Submission;

@RestController
public class ApplicationController {
    @PostMapping("/apply")
    public ResponseStatus checkApplication(@RequestBody Submission submission) {
        ResponseStatus response = new ResponseStatus();

        response.setApplicationDateTime(LocalDateTime.now());
        response.setApplicationStatus(randomEnum(Statuses.class));
        response.setCompanyName(submission.getCompanyName());
        response.setDocumentValidity(randomEnum(Statuses.class));
        response.setFormUrl(submission.getFormUrl());
        response.setProfileStatus(randomEnum(Statuses.class));

        System.out.println(response.toString());

        return response;
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> values) {
        int i = new Random().nextInt(7);
        return values.getEnumConstants()[i];
    }
}
