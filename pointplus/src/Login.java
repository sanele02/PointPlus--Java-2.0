import java.util.Scanner;

public class Login {
    private static final double RAND_PER_POINT = 5.0;


 public void startLogin(){
     Scanner userInput = new Scanner(System.in);
     boolean registered = false;
     String phoneNumber;
     boolean cellFormat;
     
     // Phone validation loop
     do{
         System.out.println("Enter customer Phone Number (e.g +27xxxxxxxxx): ");
         phoneNumber = userInput.nextLine();
         String message = "";

         if (!PointPlusAccount.checkCellPhoneNumber(phoneNumber)) {
             message = PointPlusAccount.cellErrorMessage(PointPlusAccount.checkCellPhoneNumber(phoneNumber));
             System.out.println(message);
             cellFormat = false;
         } else {
             cellFormat = true;
             if(PointPlusAccount.phoneNumberExists(phoneNumber)){
                 message = "Phone number is registered";
                 registered = true;
             } else {
                 message = "Phone number is not registered, try again!";
                 System.out.println(message);
                 registered = false;
             }
         }
     } while (!registered || !cellFormat);

     // Once validated, show the menu
     showLoginMenu(phoneNumber);
 }

 public void showLoginMenu(String phoneNumber) {
     Scanner userInput = new Scanner(System.in);
     PointPlusAccount account = PointPlusAccount.findAccount(phoneNumber);
     MembershipLevel membership = new MembershipLevel(account);
     
     System.out.println("_________________________________________________");
     System.out.println("Welcome "+ account.getCustomerName()+ "!");
     System.out.println("_________________________________________________");
     System.out.println("Please select an option:");
     System.out.println("A. View your points balance");
     System.out.println("B. Add new points");
     System.out.println("C. Convert points to credit");
     System.out.println("D. Exit the program");
     System.out.print("Please enter a letter: ");
     String options = userInput.next().toUpperCase();

     if (options.equals("A")) {
         BalanceReport(phoneNumber);
     } else if(options.equals("B")){
         addPoints(account, phoneNumber);
     } else if(options.equals("C")){
         membership.convertPointsMenu(phoneNumber);
     } else if(options.equals("D")){
         System.out.println("Exiting the program...");
         return;
     } else {
         System.out.println("Invalid input. Please enter A, B, C, or D.");
         showLoginMenu(phoneNumber); // Show menu again for invalid input
     }
 }

 public void BalanceReport(String phoneNumber){
     PointPlusAccount loggedIn = PointPlusAccount.findAccount(phoneNumber);

     if (loggedIn != null) {
         System.out.println("_________________________________________________");
         System.out.println("Rewards Point: " + loggedIn.getRewardPoints());
         System.out.println("Store credit: R " +loggedIn.getStoreCredit());
         System.out.println("_________________________________________________");
     }
     showLoginMenu(phoneNumber); // Return to menu without re-validation
 }
 public void addPoints(PointPlusAccount loggedIn, String phoneNumber){
     Scanner userInput = new Scanner(System.in);
     System.out.print("Enter Transaction Amount: R ");
     double amountSpent = userInput.nextDouble();
     System.out.println("================================");

     int pointsEarned = calPoints(amountSpent);
     loggedIn.addPoints(pointsEarned);

     System.out.println("You spent: R" + amountSpent);
     System.out.println("Points earned: " + pointsEarned + " pt.");
     System.out.println("Total Points balance: " + loggedIn.getRewardPoints() + " pt.");
     
     MembershipLevel membership = new MembershipLevel(loggedIn);
     System.out.println("=================================================");
     System.out.println("Membership Level: " + membership.getMembershipLevel());
     System.out.println("=================================================");
     
     showLoginMenu(phoneNumber); // Return to menu without re-validation
 }
 public static int calPoints(double amountSpent){
     int pointsEarned = (int) (amountSpent / RAND_PER_POINT);

     return pointsEarned;
 }



}
