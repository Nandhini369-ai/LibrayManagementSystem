package com.Nandhini.LibrayManagementSystem.Model;

import java.time.LocalDate;

public class Mombers {
    private String memberId;
    private String name;
    private String email;

    // Constructor
    public void Members(String memberId, String name, String email, LocalDate membershipDate) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Members{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
