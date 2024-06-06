import java.util.Scanner;

public class EFibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        System.out.print("0 1");

        while (a + b <= n) {
            int next = a + b;
            System.out.print(" " + next);

            a = b;
            b = next;
        }

        System.out.println();


        for (int i = 0; i <= n; i++) {
            if(FiboFormula(i) < n){
            System.out.print(FiboFormula(i) + " ");
        } else{
                break;
            }
        }
        System.out.println();
    }

        static long FiboFormula(long n){
        double phi = (1 + Math.sqrt(5)) /2;
            return  Math.round(Math.pow(phi, n) / Math.sqrt(5));
        }
    }


