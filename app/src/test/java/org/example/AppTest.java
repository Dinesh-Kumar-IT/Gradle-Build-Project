package org.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testApp() {
        App classUnderTest = new App(); // Should now work!
        assertNotNull(classUnderTest.getMessage());
    }
}
