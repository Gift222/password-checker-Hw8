package org.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {

    @Test
    void shouldReturnTrueForComplexPasswordWithDigitsAndSpecialChars() {
        assertTrue(PasswordChecker.checkPasswordComplexity("Password123!"));

    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlyNumbers() {
        assertFalse(PasswordChecker.checkPasswordComplexity("234785903"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlyLoverCase() {
        assertFalse(PasswordChecker.checkPasswordComplexity("gift"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlySpecialCharacters() {
        assertFalse(PasswordChecker.checkPasswordComplexity("@#$#*"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlyUpperCaseCharacters() {
        assertFalse(PasswordChecker.checkPasswordComplexity("JOHN"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsLessThanEightCharacters() {
        assertFalse(PasswordChecker.checkPasswordComplexity("Jack^1"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsSpace() {
        assertFalse(PasswordChecker.checkPasswordComplexity("John _12@"));
    }

    @Test
    void shouldReturnTrueIfPasswordContainsComplexPasswordWithDigitAndSpecialCharacters() {
        assertTrue(PasswordChecker.checkPasswordComplexity("Anu120^_"));
    }

}

