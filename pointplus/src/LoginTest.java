import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    public void testCalPointsExact() {
        // Spend R50, each point = R5 → 10 points
        assertEquals(10, Login.calPoints(50.0));
    }

    @Test
    public void testCalPointsRoundedDown() {
        // Spend R52, should give 10 points (not 10.4)
        assertEquals(10, Login.calPoints(52.0));
    }

    @Test
    public void testCalPointsZero() {
        // Spend less than R5
        assertEquals(0, Login.calPoints(3.0));
    }
  
}