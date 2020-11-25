package com.study.batch.entity.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BatchStepExecutionDto {
    private Long stepExecutionId;
    private Long version;
    private String stepName;
    private Long jobExecutionId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private Long commitCount;
    private Long readCount;
    private Long filterCount;
    private Long writeCount;
    private Long readSkipCount;
    private Long writeSkipCount;
    private Long processSkipCount;
    private Long rollbackCount;
    private String exitCode;
    private String exitMessage;
    private LocalDateTime lastUpdated;
}
