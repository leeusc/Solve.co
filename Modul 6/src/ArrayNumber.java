import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayNumber {
    //private final ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of number: ");
        int n = scan.nextInt();
         double[] number = new double[n];

        System.out.println("Input the number: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Number #" + (i + 1));
            number[i] =  scan.nextDouble();
        }
            System.out.println("Average: " + Mean(number));
            System.out.println("Median: " + Median(number));
            System.out.println("Max Value: " + Max(number));
            System.out.println("Min Value: " + Min(number));

            scan.close();
        }

        static String Mean (double[] num){
            //return Arrays.stream(num).sum() / num.length;
//            DecimalFormat df = new DecimalFormat("0.00");
            double sum = Arrays.stream(num).average().orElse(Double.NaN);

            return String.format("%.2f", sum);

            //--- double ----//
//            double sum = 0;
//            for(double value : num){
//                sum+= value;
//        }
//            return sum /num.length;

    }
        static double Median(double[] num){
            Arrays.sort(num);
            int n = num.length;
            if (n % 2 == 0) {
                return ((num[n / 2 - 1] + num[n / 2]) / 2.0);
            } else {
                return num[n / 2];

            }
        }

        static double Max ( double[] num){
            return Arrays.stream(num).max().orElse(Double.NaN);
        }

        static double Min ( double[] num){
            return Arrays.stream(num).min().orElse(Double.NaN);
        }

    }
