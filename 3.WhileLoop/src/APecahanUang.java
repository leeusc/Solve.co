import java.util.Scanner;

public class APecahanUang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan uang yang ingin di tukar: ");
        double money = scan.nextInt();

        double[] pecahan = {100,50,20,10,5,2,1};
        double[] totalpecahan = new double[pecahan.length];

        int i = 0;
        while (money > 0 && i < pecahan.length){
            totalpecahan[i] = money/pecahan[i];
            money = money % pecahan[i];
            i++;

        }
        System.out.println("Pecahannya adalah");
        for(int j = 0; j < totalpecahan.length; j++){
            if(totalpecahan[j] != 0){
                System.out.println(totalpecahan[j] + " lembar " + pecahan[j]);

            }
        }
    }
}
