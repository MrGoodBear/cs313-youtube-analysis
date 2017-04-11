package com.cs313.cameron.model;

/**
 * POJO for storing Users and the information discovered about each one.
 */
public class User {
    private String username;
    private int age;
    private String education;
    private String gender;
    private Comment userComment;

    public User(String username, int age, String education, String gender, Comment userComment) {
        this.username = username;
        this.age = age;
        this.education = education;
        this.gender = gender;
        this.userComment = userComment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Comment getUserComment() {
        return userComment;
    }

    public void setUserComment(Comment userComment) {
        this.userComment = userComment;
    }
}
