package com.oliveiratrade.signupsignin.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.Objects;

public class UserCreateForm {

    @NotEmpty(message = "Fill in the field correctly.")
    @Size(
            min = 4,
            max = 30,
            message = "'${validatedValue}' must be between {min} and {max} characters."
    )
    private String username;

    @NotEmpty(message = "Fill in the field correctly.")
    private String password;

    @NotEmpty(message = "Fill in the field correctly.")
    @Size(
            min = 5,
            max = 100,
            message = "'${validatedValue}' must be between {min} and {max} characters."
    )
    private String fullName;

    @NotEmpty(message = "Fill in the field correctly.")
    @CPF(message = "'${validatedValue}' is invalid.")
    private String cpf;

    @NotNull(message = "Fill in the field correctly.")
    @Past(message = "Date '${validatedValue} is invalid.'")
    private LocalDate birthday;

    public UserCreateForm() {
    }

    public UserCreateForm(String username, String password, String fullName, String cpf, LocalDate birthday) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.cpf = cpf;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCreateForm that = (UserCreateForm) o;
        return username.equals(that.username) && password.equals(that.password) && fullName.equals(that.fullName) && cpf.equals(that.cpf) && birthday.equals(that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, fullName, cpf, birthday);
    }

    @Override
    public String toString() {
        return "UserCreateFormulary{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
