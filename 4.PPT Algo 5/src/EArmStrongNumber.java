import java.util.Scanner;

public class EArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ArmStrongNumber check: ");
        int n = scan.nextInt();
        System.out.println(ArmStrongNumber(n) + "\n");


        System.out.println("The correct numbers are: ");
        for(int i = 100; i < 1000; i ++){
            if(ArmStrongNumber(i)){
                System.out.print(i + " ");

            }
        }

        System.out.println("\n\n");
        ArmStrongNumber2(1634);
    }

    static boolean ArmStrongNumber(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;

    }
    static void ArmStrongNumber2(int number){
        int original = number;
        int sum = 0;
        int n = 0;
        int remainder;

        for(;original != 0; original/=10, ++n);

        original = number;

        for(;original != 0; original/=10){
            remainder = original % 10;
            sum += Math.pow(remainder, n);
        }
        if(sum == number){
            System.out.println(number + " is an armstrongNumber");
        } else {
            System.out.println(number + " is not an armstrongNumber");

        }    }
}
