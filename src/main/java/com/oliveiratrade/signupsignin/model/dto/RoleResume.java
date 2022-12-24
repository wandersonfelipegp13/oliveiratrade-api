package com.oliveiratrade.signupsignin.model.dto;

import java.util.Objects;
import java.util.UUID;

public class RoleResume {

    private UUID id;
    private String name;

    public RoleResume() {
    }

    public RoleResume(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
        RoleResume that = (RoleResume) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RoleResume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
