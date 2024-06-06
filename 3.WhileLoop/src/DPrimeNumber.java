import java.util.Scanner;

public class DPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number: ");
        int prime = scan.nextInt();
        System.out.println("Prime number from " + prime + ": ");

        for(int n = 2; n <= prime; n++){
            if(PrimeNumber(n)){
                System.out.print(n + " ");
            }
        }
    }

    static boolean PrimeNumber(int n){

        //
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c <= Math.sqrt(n)){
            if(n % c == 0){
                return false;
            } c++;
        }
        return true;

    }
}
