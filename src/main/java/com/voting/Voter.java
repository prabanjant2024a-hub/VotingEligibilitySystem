package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public String checkEligibility() {
        if (age < 18) {
            return "Ineligible: Underage (Must be at least 18).";
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            return "Ineligible: Not an Indian citizen.";
        }
        if (voterId == null || voterId.isEmpty() || !isIdValid) {
            return "Ineligible: Invalid Voter ID status.";
        }
        return "Eligible to Vote.";
    }

    public String getName() { return name; }
}
