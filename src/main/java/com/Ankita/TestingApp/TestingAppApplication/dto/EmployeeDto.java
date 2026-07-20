package com.Ankita.TestingApp.TestingAppApplication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {


    private Long id;

    private String  email;

    private String name;

    private Long salary;

}
