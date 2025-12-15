import java.util.ArrayList;
import java.util.Scanner;

public class PointPlusAccount {

    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String phoneNumber;
    private String email;
    private int rewardPoints =0;
    private double storeCredit = 0.0;
    private String dateOfBirth;  // Example: "2005-03-09"// not in use

    // Database/ array list (all accounts stored here)
    private static ArrayList<PointPlusAccount> accounts = new ArrayList<>();

    // Constructor
    public PointPlusAccount() {
        this.customerName = this.customerName;
        //this.dateOfBirth =dateOfBirth;
        this.customerSurname = this.customerSurname;
        this.customerAddress = this.customerAddress;
        this.phoneNumber = this.phoneNumber;
        this.email = this.email;
    }

    // Getters (to access fields outside)
    public String getPhoneNumber() { return phoneNumber; }
    public String getCustomerName() { return customerName; }
    public String getCustomerSurname() { return customerSurname; }
    public String getEmail() { return email; }
    public int getRewardPoints() { return rewardPoints; }
    public double getStoreCredit() { return storeCredit; }



    public static void start(){

    }
    public  void createAccount() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Create New Account");
        System.out.println("Enter customer Name: ");
        customerName = userInput.nextLine();
        System.out.println("Enter customer Surname: ");
        customerSurname = userInput.nextLine();

        // enter phone number
        do{
            System.out.println("Enter customer Phone Number (e.g +27xxxxxxxxx): ");
            phoneNumber = userInput.nextLine();
            String message;
            //ask for phone number until user uses the phone number format
            // corect error message handling
            if (!checkCellPhoneNumber(phoneNumber)) {
                // print out message if phone number is not in the correct format
                message = cellErrorMessage(checkCellPhoneNumber(phoneNumber));
                System.out.println(message);

            }else if(phoneNumberExists(phoneNumber)){
                message = "Phone number already registered, try another!";
                System.out.println(message);
            }
            // check phone formating and also check if phone number already exists
        }while(!checkCellPhoneNumber(phoneNumber) && phoneNumberExists(phoneNumber));

        // enter email address
        do{
            System.out.println("Enter customer Email Address: ");
            email = userInput.nextLine();
            String message = emailErrorMessage(checkEmail(email));
            System.out.println(message);
        }while(!checkEmail(email));

        System.out.println("Enter customer  Home Address: ");
        customerAddress = userInput.nextLine();
        System.out.println("Account created successfully for " + customerName + "!");

        // Create new account object
        //PointPlusAccount newAccount = new PointPlusAccount(customerName, customerSurname, customerAddress, phoneNumber, email);

        // Store in ArrayList
        // calling it like this i am storing the values directly from the constructor
        // without having to pass parametters in the constutor
        accounts.add(this);
        // call the start function in the main class so the program does not stop running
        Main.start();

    }

    // Phone number check
    public static boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("^\\+27\\d{9}$");
        //return phoneNumber.matches("\\+27\\d{9}");
    }

    // check email : looking for an @ in the email
    public static boolean checkEmail(String email){
        if (email == null || email.isEmpty()) {
            return false;
        }
        //email.contains("@")
        return email.contains("@");
        }

        public static String emailErrorMessage(boolean e){
         String message = " ";
          if (e == false) {
              message = "invalid email address, try again!";
          }return message;
            
        }
        public static String cellErrorMessage(boolean e){
        String message = " ";
        if (e == false) {
            message = "invalid phone number , try again!";
        }return message;

    }

    // Lookup user by phone number (ID)
    // Check if phone number already exists in accounts
    public static boolean phoneNumberExists(String phoneNumber) {
        for (PointPlusAccount acc : accounts) {
            if (acc.getPhoneNumber().equals(phoneNumber)) {
                return true; // phone number already in use
            }
        }
        return false; // phone number not found
    }

    // Search for user
    public static PointPlusAccount findAccount(String phoneNumber) {
        for (PointPlusAccount acc : accounts) {
            if (acc.phoneNumber.equals(phoneNumber)) {
                return acc;
            }
        }
        return null;
    }

    // Update points
    public void addPoints(int points) {
        this.rewardPoints += points;
    }
    
    // Update store credit
    public void addStoreCredit(double credit) {
        this.storeCredit += credit;
    }

}
