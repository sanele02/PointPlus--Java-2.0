


import java.util.Scanner;

// Extends PointPlusAccount to inherit customer data and points functionality
public class MembershipLevel extends PointPlusAccount {
    private String membershipLevel;
    private PointPlusAccount account;
    
    // Constructor that works with existing account
    public MembershipLevel(PointPlusAccount account) {
        super();
        this.account = account;
        updateMembershipLevel();
    }
    
    public String getMembershipLevel() {
        return membershipLevel;
    }
    
    // Updates membership level based on account's reward points
    public void updateMembershipLevel() {
        int points = account.getRewardPoints();
        if (points >= 1000) {
            membershipLevel = "Gold";
        } else if (points >= 500) {
            membershipLevel = "Silver";
        } else {
            membershipLevel = "Bronze";
        }
    }
    
    // Convert points to credit using the linked account
    public void convertPointsMenu(String phoneNumber) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your current points: " + account.getRewardPoints());
        System.out.println("Minimum conversion: 100 points (R1.00)");
        System.out.print("How many points do you want to convert? ");
        int pointsToConvert = input.nextInt();
        
        if (pointsToConvert < 100) {
            System.out.println("Minimum 100 points required for conversion.");
        } else if (pointsToConvert > account.getRewardPoints()) {
            System.out.println("Insufficient points. You only have " + account.getRewardPoints() + " points.");
        } else {
            double creditValue = pointsToConvert * 0.01;
            account.addPoints(-pointsToConvert);
            account.addStoreCredit(creditValue);
            System.out.println("Converted " + pointsToConvert + " points to R" + creditValue + " store credit!");
        }
        
        // Return to login menu instead of main menu
        Login login = new Login();
        login.showLoginMenu(phoneNumber);
    }
    

}
