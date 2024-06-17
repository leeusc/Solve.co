import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BStringArray {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        name();

    }

    static void name() {
        System.out.println("Enter the number or people: ");
        int n = scan.nextInt();
        scan.nextLine();

        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Name #" + (i + 1) + ": ");
            name[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(name));

        System.out.println("Enter the name to be replaced: ");
        String replaced = scan.nextLine();

        System.out.println("Enter new Name: ");
        String newName = scan.nextLine();

        for(int i = 0; i < name.length; i++){
            if(name[i].equals(replaced)) {
                name[i] = newName;
            }
        }

        for(String names : name){
            System.out.print(names + ", ");

        }
        System.out.println();
        System.out.println(Arrays.toString(name));
    }
    }





//    }

   // }


