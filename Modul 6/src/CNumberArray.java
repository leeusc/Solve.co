import javax.swing.plaf.IconUIResource;

public class CNumberArray {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5,6,2,2,6,2};
        System.out.println(findRedundancy(arr));
    }
    static int findRedundancy(int[] arr){
        int max = 0;
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (j == i) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }

//    static boolean removeFirst(int[] arr){
//
//        for(int n = 0; n <arr.length; n++) {
//            if(removeFirst(arr)){
//            int temp = arr[n];
//            }
//        }
//        return true;
//    }

}
