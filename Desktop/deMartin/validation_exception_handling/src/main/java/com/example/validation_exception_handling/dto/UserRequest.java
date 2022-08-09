package com.example.validation_exception_handling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "User's name must not be null")
    private String name;
    @Email(message = "Invalid email Address")
//    @UniqueElements
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$")
    private String mobile;
    private String gender;
    @Min(12)
    @Max(80)
    private int age;
    @NotBlank
    private String nationality;
}
