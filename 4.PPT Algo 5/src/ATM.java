import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        final int correctPin = 129;
        int attempts = 0;
        Scanner scan = new Scanner(System.in);

        while(attempts < 3){
            System.out.print("Enter password: ");
            int enteredPin = scan.nextInt();

            if(enteredPin == correctPin){
                System.out.println("Hello Welcome, Can I help you? ");
                break;
            } else{
                System.out.println("Failed! Try again");
                attempts++;
            }

        }
        if (attempts == 3) {
            System.out.println("Reached the limit. The card has been blocked");
        }

        scan.close();
        }
    }

