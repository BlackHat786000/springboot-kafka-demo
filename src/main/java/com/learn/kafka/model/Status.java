package com.learn.kafka.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Status {
    private String job_id;
    private String job_status;
}
