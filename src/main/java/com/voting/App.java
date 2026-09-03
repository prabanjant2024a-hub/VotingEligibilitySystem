package com.voting;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Voter> voters = new ArrayList<>();
        voters.add(new Voter("Rohan", 20, "Indian", "VOT123", true));
        voters.add(new Voter("Priya", 16, "Indian", "VOT456", true));
        voters.add(new Voter("John", 30, "American", "VOT789", true));
        voters.add(new Voter("Anil", 25, "Indian", "VOT000", false));

        System.out.println("=== VOTING ELIGIBILITY REPORT ===");
        for (Voter v : voters) {
            System.out.println("Voter: " + v.getName() + " -> " + v.checkEligibility());
        }
    }
}
