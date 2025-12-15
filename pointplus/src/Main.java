import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();

    }

    public static void start(){
        Scanner userInput = new Scanner(System.in);
        String options;



        System.out.println("Welcome to PointPlus -Rewards program system ");
        System.out.println("_________________________________________________");
        System.out.println("Please enter the correct letter (e.g A,B or C)");
        System.out.println("A. Create new account");
        System.out.println("B. Log into an existing account");
        System.out.println("C. Exit the program");
        System.out.print("Please enter a letter: ");
        options = userInput.next().toUpperCase();

        //directing
        if (options.equals("A")) {
            //direct to ->PointPlusAccount -> createaccount method // create new account class
            // Create object first, then call createAccount()
            PointPlusAccount newCustomer = new PointPlusAccount();
            newCustomer.createAccount();

        }
        else if(options.equals("B")){
            //direct to Log into an existing account class
            Login login = new Login();
            login.startLogin();
            //System.out.println("direct to Log into an existing account class");
        }else if(options.equals("C")){
            System.out.println("Exiting the program...");
            return;
        }
        else{
            System.out.println("Invalid input. Please enter A, B, or C.");
        }
        userInput.close(); // Close scanner to avoid memory leaks
    }
    }
