package com.learn.kafka.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;

}
