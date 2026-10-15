package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServletTest {

    @Test
    void applicationNameShouldBeCorrect() {
        String applicationName = "Jenkins CI/CD";

        assertEquals("Jenkins CI/CD", applicationName);
    }

    @Test
    void javaVersionShouldBeSupported() {
        assertEquals(17, Runtime.version().feature());
    }
}