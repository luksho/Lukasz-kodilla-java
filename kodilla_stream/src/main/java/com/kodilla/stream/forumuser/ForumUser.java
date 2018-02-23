package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    final private int id;
    final private String userName;
    final private char sex;
    final private LocalDate dateOfBirth;
    final private int postQuantity;

    public ForumUser(int id, String userName, char sex, LocalDate dateOfBirth, int postQuantity) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postQuantity = postQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
