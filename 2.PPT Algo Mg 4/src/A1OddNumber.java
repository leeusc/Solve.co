import java.util.Scanner;

public class A1OddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Integer number: ");
        int n = scan.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 2* i -1;
        }

        System.out.println("Jumlah " + n + " bilangan ganjil pertama adalah: " + sum);
    }
}
