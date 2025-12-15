import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PointPlusAccountTest {
    // --- Phone number tests ---
    @Test
    public void testCheckCellPhoneNumberTrue() {
        assertTrue(PointPlusAccount.checkCellPhoneNumber("+27812345678")); // valid
    }

    @Test
    public void testCheckCellPhoneNumberFalse() {
        assertFalse(PointPlusAccount.checkCellPhoneNumber("0812345678"));  // missing +27
        assertFalse(PointPlusAccount.checkCellPhoneNumber("+2781234"));    // too short
        assertFalse(PointPlusAccount.checkCellPhoneNumber(null));          // null case
    }

    // --- Email tests ---
    @Test
    public void testCheckEmailTrue() {
        assertTrue(PointPlusAccount.checkEmail("test@example.com")); // valid
    }

    @Test
    public void testCheckEmailFalse() {
        assertFalse(PointPlusAccount.checkEmail("testexample.com")); // no @
        assertFalse(PointPlusAccount.checkEmail(""));                // empty
        assertFalse(PointPlusAccount.checkEmail(null));              // null
    }

    // --- Error message tests ---
    @Test
    public void testEmailErrorMessageTrue() {
        assertEquals(" ", PointPlusAccount.emailErrorMessage(true));
    }

    @Test
    public void testEmailErrorMessageFalse() {
        assertEquals("invalid email address, try again!", PointPlusAccount.emailErrorMessage(false));
    }

    @Test
    public void testCellErrorMessageTrue() {
        assertEquals(" ", PointPlusAccount.cellErrorMessage(true));
    }

    @Test
    public void testCellErrorMessageFalse() {
        assertEquals("invalid phone number , try again!", PointPlusAccount.cellErrorMessage(false));
    }

    // --- Reward points / store credit ---
    @Test
    public void testAddPoints() {
        PointPlusAccount acc = new PointPlusAccount();
        acc.addPoints(10);
        assertEquals(10, acc.getRewardPoints()); // true case
        assertNotEquals(20, acc.getRewardPoints()); // false case
    }

    @Test
    public void testAddStoreCredit() {
        PointPlusAccount acc = new PointPlusAccount();
        acc.addStoreCredit(50.0);
        assertEquals(50.0, acc.getStoreCredit(), 0.001); // true case
        assertNotEquals(100.0, acc.getStoreCredit(), 0.001); // false case
    }
  
}