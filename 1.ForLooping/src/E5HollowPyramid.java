public class E5HollowPyramid {
    public static void main(String[] args) {
        // Hollow Full Pyramid
        int n = 5;

        for(int row = 1; row <= n; row++){

            for(int space = 0; space < n - row; space++){
                    System.out.print("  ");
                }

            for(int col = 1; col <= row; col++) {
                if (col == 1 || col == row || row == n) {
                    System.out.print(col + "   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        }
    }

