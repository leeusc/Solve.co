import java.util.Scanner;

public class FNaturalLogarithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms n: ");
        int num = scan.nextInt();
        NL(num);

    }
    static void NL(int n){
        double ln2= 0.0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                ln2 -= 1.0 /i;
            } else {
                ln2 += 1.0 / i;
            }

        }
        System.out.println("The natural logarithm of 2 calculated up to " + n +  " terms is: " + ln2) ;
    }
}
