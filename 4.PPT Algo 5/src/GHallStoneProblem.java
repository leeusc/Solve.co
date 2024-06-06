public class GHallStoneProblem {
    public static void main(String[] args) {
        System.out.println(HailStone(3));
    }
    static int HailStone(int n){
        if(n == 1){
            return 1;
        }

        if(n % 2 != 0){
            return HailStone(n*3 + 1);
        } else {
            return HailStone(n/2);

        }
    }

}
