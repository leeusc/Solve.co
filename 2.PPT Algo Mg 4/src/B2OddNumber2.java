import java.util.Scanner;

public class B2OddNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        int sum = 0;
        for(int i = 1 ; i <= n; i++){

            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Jumlah ganjil dari 1 sampai " + n + " adalah: " + sum);
    }
}
