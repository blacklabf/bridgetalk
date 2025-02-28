package com.ssafy.bridgetalkback.reports.dto.response;

import software.amazon.awssdk.services.transcribe.model.TranscriptionJobStatus;

import java.util.Map;

public record TranscriptionDto(
        String jobName,
        Long accountId,
        TranscriptionJobStatus status,
        Map<String, Object> results
) {
}
