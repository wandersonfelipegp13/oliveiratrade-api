package com.oliveiratrade.signupsignin.model.dto;

import java.time.LocalDate;
import java.util.Objects;

public class UserResume {

    private String username;
    private String fullName;
    private LocalDate birthday;

    public UserResume() {
    }

    public UserResume(String username, String fullName, LocalDate birthday) {
        this.username = username;
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        UserResume that = (UserResume) o;
        return username.equals(that.username) && fullName.equals(that.fullName) && birthday.equals(that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, fullName, birthday);
    }

    @Override
    public String toString() {
        return "UserResume{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
