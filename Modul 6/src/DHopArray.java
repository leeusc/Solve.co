import java.util.ArrayList;
import java.util.Scanner;

public class DHopArray {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Contestant();
    }
    static void Contestant() {
        System.out.println("Enter Number of Contestant: ");
        int number = scan.nextInt();
        scan.nextLine();

        ArrayList<String> participants = new ArrayList<>();

        System.out.println("Input Name of contestants: ");
        for(int i = 0; i < number; i++){
            System.out.println("Name #" + (i+1));
            participants.add(scan.nextLine());
        }

        System.out.println("Input n: ");
        int n = scan.nextInt();

        int indexToEliminate = 0;

        while(participants.size() > 1){
            indexToEliminate = (indexToEliminate + n - 1) % participants.size();

            participants.remove(indexToEliminate);
        }

        System.out.println("Output: " + participants.getFirst());
    }


}
