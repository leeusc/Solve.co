public class D4NumberPattern {
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        // pattern4();
        //pattern5();
        //patternFrame5()
        //patternChristmasTree();
        //Diamond();
        letterX();
        //letterA();
        //letterB();
    }

    private static void pattern1() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern2() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern3() {

        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            //int num = i;
            // Loop through columns
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num + 1) % 10;
            }
            System.out.println();
        }
    }

    static void pattern4() {
        int n = 4;
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print(totalColsInRow + " ");
            }

            System.out.println();
        }
    }

    static void pattern5() {
        int n = 4;
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int space = n; space >= totalColsInRow; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print(totalColsInRow);
            }
            System.out.println();
        }
    }

    static void patternFrame5() { // Hollow Square
        int height = 7;
        int width = 13;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row <= 1 || row >= height - 2 || (col <= 1) || col >= width - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    static void patternChristmasTree() {
        int n = 7;
        int height = 3;
        int width = 3;
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row * 2 - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //int basePosition = height - width;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < n - 2; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Diamond() {
        int n = 4;
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInPlace = row > n ? 2 * n - row : row;
            for (int space = n; space > totalColInPlace; space--) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColInPlace; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void letterX() {
        int n = 11;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col || (row + col == 10)) {
                    System.out.print("**");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    static void letterA() {
        int n = 7;
        for (int row = 0; row < n; row++) {
            for (int space = n; space > row; space--) {
                System.out.print(" ");
                }
            for (int col = 0; col <= row; col++){
                if((row == 4 && col != 4)|| col == 0 || (col == row && col !=4) ){
                    System.out.print(" **");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void letterB(){
        int n = 7;
        int m = 5;
        for(int row = 0; row < n; row ++){
            for(int col = 0; col < m; col++){
                if(col == 0 || (row%3 == 0 && col!=4) || (row%3>0 && col == 4)){
                    System.out.print("** ");
                } else{
                    System.out.print("   ");

                }
            }
            System.out.println();
        }
    }
}
