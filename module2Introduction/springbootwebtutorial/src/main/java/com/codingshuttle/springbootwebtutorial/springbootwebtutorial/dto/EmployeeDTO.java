package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//if u are sure that only these data can go to the response/request
public class EmployeeDTO {
   private Long id;
   private  String name;
   private String email;
   private Integer age ;
   private LocalDate dateOfJoining;
   private Boolean isActive;
}
