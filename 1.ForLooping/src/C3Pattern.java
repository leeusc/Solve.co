public class C3Pattern {
    public static void main(String[] args) {
        //Hollow half Pyramid
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row || row == n){
                    System.out.print(col + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
