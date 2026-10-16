package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloServletTest {

    @Test
    void applicationNameShouldBeCorrect() {
        String applicationName = "Jenkins CI/CD";

        assertEquals("Jenkins CI/CD", applicationName);
    }

    @Test
    void javaVersionShouldBeSupported() {
        assertTrue(Runtime.version().feature() >= 17);
    }
}
