public class C3Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
