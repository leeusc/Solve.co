import java.util.Scanner;

public class ByOrn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        String input;

        do {
            System.out.println("Input percent grade: ");
            int number = scan.nextInt();
            sum += number;
            count++;
            max = Math.max(max, number);

            System.out.println("Still want to input (Y/N): ");
            input = scan.next();
        }
        while(input.equalsIgnoreCase("Y"));

        double average = (double) sum/count;
        System.out.println("\nmax :" + max);
        System.out.printf("average: %.2f\n", average);

    }
}
