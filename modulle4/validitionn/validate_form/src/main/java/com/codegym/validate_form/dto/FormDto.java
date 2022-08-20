package com.codegym.validate_form.dto;

import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class FormDto implements Validator {
    private Long id;
    @NotBlank
    @Size(min = 5,max = 45)
    private String firstName;
    @NotBlank
    @Size(min = 5,max = 45)
    private String lastName;
    @Size(min = 9,max = 11)
    private String phone;
    @Min(18)
    private int age;
    @Email
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FormDto(){

    }

    public FormDto(Long id, @NotBlank @Size(min = 5, max = 45) String firstName, @NotBlank @Size(min = 5, max = 45) String lastName, @Size(min = 9, max = 11) String phone, @Min(18) int age, @Email String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
    }
}
