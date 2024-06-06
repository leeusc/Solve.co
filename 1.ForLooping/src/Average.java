import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int student = in.nextInt();

        double total = 0;
        for(int i = 0; i < student; i++){
            System.out.println("Enter percent grade from 1 to 100: " + '#'+ (i + 1));
            double grade = in.nextDouble();
            if(grade > 100){
                System.out.println("Please input the correct number!");
                return;
            }
            total += grade;
        }

        double avg = (double)total/student;
        System.out.println("Total average of " + student+ " student is: " + avg);

    }



}
