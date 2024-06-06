import java.util.Scanner;

public class A2PecahanUang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan uang yang ingin ditukar: ");
        double money = scan.nextDouble();

        double[] pecahan = {100,50,20,10,5,2,1,0.5,0.2,0.1};
        int[]jumlahPecahan = new int[pecahan.length];

        int i = 0;
        while(money > 0 && i < pecahan.length){
            jumlahPecahan[i] = (int)(money/pecahan[i]);
            money = money % pecahan[i];
            money = Math.round(money * 100.0 )/ 100.0;
            i++;
        }

        System.out.println("Pecahaannya adalah");
        for(int j = 0; j <jumlahPecahan.length; j++){
            if(jumlahPecahan[j] != 0){
                if (pecahan[j] >= 1){
                    System.out.println(jumlahPecahan[j] + " lembar " + (int)pecahan[j]);
                } else {
                    System.out.println(jumlahPecahan[j] + " koin " + pecahan[j]);
                }
            }
        }
    }

}

