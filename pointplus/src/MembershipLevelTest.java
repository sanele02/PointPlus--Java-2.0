import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MembershipLevelTest {
    @Test
    public void testBronzeLevel() {
        PointPlusAccount acc = new PointPlusAccount();
        acc.addPoints(100); // < 500 points
        MembershipLevel m = new MembershipLevel(acc);

        assertEquals("Bronze", m.getMembershipLevel());
    }

    @Test
    public void testSilverLevel() {
        PointPlusAccount acc = new PointPlusAccount();
        acc.addPoints(600); // >= 500 points
        MembershipLevel m = new MembershipLevel(acc);

        assertEquals("Silver", m.getMembershipLevel());
    }

    @Test
    public void testGoldLevel() {
        PointPlusAccount acc = new PointPlusAccount();
        acc.addPoints(1500); // >= 1000 points
        MembershipLevel m = new MembershipLevel(acc);

        assertEquals("Gold", m.getMembershipLevel());
    }
  
}