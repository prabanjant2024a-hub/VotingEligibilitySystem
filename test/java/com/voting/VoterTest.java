package com.voting;

import org.junit.Test;
import static org.junit.Assert.*;

public class VoterTest {
    @Test
    public void testValidVoter() {
        Voter v = new Voter("A", 22, "Indian", "ID1", true);
        assertEquals("Eligible to Vote.", v.checkEligibility());
    }

    @Test
    public void testUnderageVoter() {
        Voter v = new Voter("B", 17, "Indian", "ID2", true);
        assertTrue(v.checkEligibility().contains("Underage"));
    }
}
