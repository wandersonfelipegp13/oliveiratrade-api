package com.oliveiratrade.signupsignin.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class RoleCreateForm {

    @NotEmpty(message = "Fill in the field correctly.")
    @Size(
            min = 4,
            max = 30,
            message = "'${validatedValue}' must be between {min} and {max} characters."
    )
    private String name;

    public RoleCreateForm() {
    }

    public RoleCreateForm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleCreateForm that = (RoleCreateForm) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "RoleCreateForm{" +
                "name='" + name + '\'' +
                '}';
    }

}
