import java.util.*;

public class ATM_Project {

    public static void main(String args[]) {
        int password = 1111;
        int balance = 10000;

        // initializing with 0

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scan = new Scanner(System.in);

        // we have to take an input from the user

        System.out.println("Hey welcome to NAIK!!!");
        System.out.println("Enter your PIN number :");

        int PIN = scan.nextInt();

        // code arrangement shift+alt+f

        if (PIN == password) {
            System.out.println("Enter your name");
            name = scan.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to EXIT");

                int option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;

                    case 2:
                        System.out.println("How much money you wish to add to your account?");
                        AddAmount = scan.nextInt();
                        System.out.println("Successfully credit.");
                        balance = AddAmount + balance;
                        // 10,000=10,000+5000 --> 15,0000
                        // balance=15,000
                        break;

                    case 3:
                        System.out.println("How much money do you want to take?");
                        TakeAmount = scan.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("Insufficient balance");
                        } else {
                            System.out.println("You can get your money now");
                            balance = balance - TakeAmount;
                            // balance=15,000-5000
                            // balanc=10000
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to NAIK Bank!");
                        System.out.println("Availabl balance is : " + balance);
                        System.out.println("Amount deposited    : " + AddAmount);
                        System.out.println("Amount withdrawal   : " + TakeAmount);
                        System.out.println("Thank you!!!");

                }
                if (option == 5) {
                    System.out.println("Thank you");
                    break;
                }
            }
        } 
        else {
            System.out.println("Sorry,invalid PIN number ");
        }
    }

}
