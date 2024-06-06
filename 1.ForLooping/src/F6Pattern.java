public class F6Pattern {
    public static void main(String[] args) {
        //Hollow Inverted HalfPyramid

        int n = 5;
        for (int row = 0; row <= n; row ++){
            for(int col = 1 + row; col <= n; col++){
                if(row == 0 || col == n || col == 1 + row) {
                    System.out.print(col + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}

