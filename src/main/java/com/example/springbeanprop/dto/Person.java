package com.example.springbeanprop.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private String sport;
}
