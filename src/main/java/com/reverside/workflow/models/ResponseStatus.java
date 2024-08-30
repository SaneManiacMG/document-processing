package com.reverside.workflow.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ResponseStatus extends Submission {
    private Statuses applicationStatus;
    private Statuses documentValidity;
    private Statuses profileStatus;
    private LocalDateTime applicationDateTime;

    public ResponseStatus(String companyName, String formUrl, Statuses applicationStatus, Statuses documentValidity,
            Statuses profileStatus, LocalDateTime applicationDateTime) {
        super(companyName, formUrl);
        this.applicationStatus = applicationStatus;
        this.documentValidity = documentValidity;
        this.profileStatus = profileStatus;
        this.applicationDateTime = applicationDateTime;
    }
}
