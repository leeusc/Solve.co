public class DoodNumber {
    public static void main(String[] args) {
        int targetSum = 10;
        int sum = 0;
        int count = 0;
        int currentOddNumber = 1;

        while(sum < targetSum){
            sum+= currentOddNumber;
            count++;
            currentOddNumber += 2;
        }

        System.out.println("Odd number from 0 to " + targetSum + " are " + count);
        System.out.println();

        limit(10);
    }

    static void limit(int n){
        for(int i = 1; i < n; i += 2){
            System.out.print(i + (i < n - 2 ? ", " : ""));
        }
    }
}
