import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CAPP {

    static class Pasien{
        String name;
        String address;
        int age;
        String diagnostic;
        String drug;

        public Pasien(String name, String address, int age){
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    private static final List<Pasien> daftarPasien = new ArrayList<>();

    public static void main(String[] args) {
        String mainMenu = """
                Main Menu:
                1. Daftar Pasien
                2. Diagnosis
                3. Obat
                4. Print Data Pasien
                5. Exit
                Pilih menu (1-5):\s""";

        boolean isRunning = true;

        while(isRunning){
            String input = JOptionPane.showInputDialog(null,mainMenu,
                    "SISTEM RUMAH SAKIT", JOptionPane.QUESTION_MESSAGE);
            if(input == null || input.isEmpty()) continue;
            int pilihan = Integer.parseInt(input);

            switch(pilihan){
                case 1:
                    String name = JOptionPane.showInputDialog("Input nama pasien:");
                    String address = JOptionPane.showInputDialog("Input alamat pasien:");
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Input umur pasien"));

                    daftarPasien.add(new Pasien(name, address, age));
                    break;
                case 2:
                    String[] pilihanPasien = daftarPasien.stream().map(p -> p.name).toArray(String[]::new);
                    String pasienDipilih = (String)JOptionPane.showInputDialog(null, "Pilihan pasien:", "MENU DIAGNOSIS",
                            JOptionPane.QUESTION_MESSAGE,null, pilihanPasien, pilihanPasien[0]);

                    String diagnosis = JOptionPane.showInputDialog("Input diagnosis dokter: ");

                    daftarPasien.stream().filter(p -> p.name.equals(pasienDipilih))
                            .findFirst().ifPresent(p -> p.diagnostic = diagnosis);
                    break;
                case 3:
                    String[] pilihanPasienObat = daftarPasien.stream().map(p -> p.name).toArray(String[]::new);
                    String pasienDipilihaObat = (String)JOptionPane.showInputDialog(null,"Pilih Pasien:", "MENU OBAT",
                            JOptionPane.QUESTION_MESSAGE, null, pilihanPasienObat, pilihanPasienObat[0]);

                    String obat = JOptionPane.showInputDialog("Input obat yang diberikan: ");

                    daftarPasien.stream().filter(p -> p.name.equals(pasienDipilihaObat)).findFirst().
                            ifPresent(p -> p.drug = obat);
                    break;
                case 4:
//                    StringBuilder dataPasien = new StringBuilder();
                    String[] pilihanPasienData = daftarPasien.stream().map(p -> p.name).toArray(String[]::new);
                    String pasienDipilihaData= (String)JOptionPane.showInputDialog(null,"Pilih Pasien:", "MENU PRINT DATA PASIEN",
                            JOptionPane.QUESTION_MESSAGE, null, pilihanPasienData, pilihanPasienData[0]);

                    Optional<Pasien> pasiendipilih = daftarPasien.stream().filter(p -> p.name.equals(pasienDipilihaData)).findFirst();

                    if(pasiendipilih.isPresent()){
                        Pasien pasien = pasiendipilih.get();
                        String pasienInfo = "Nama: " + pasien.name +
                                "\nAlamat:" + pasien.address +
                                "\nUmr:"+ pasien.age + "\nDiagnosis:"
                                + (pasien.diagnostic != null ? pasien.diagnostic : "Belum ada diagnosis") +
                                "\nObat: "+ (pasien.drug != null ? pasien.drug : "Belum ada obat");

                        JOptionPane.showMessageDialog(null, pasienInfo, "Data Pasien",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "Pasien tidak ditemukan.", "Eroor",
                                JOptionPane.ERROR_MESSAGE);
                    }
//                    for (Pasien pasien : daftarPasien){
//
//                        dataPasien.append("Nama: ").append(pasien.name).
//                                append("\nAlamat:").append(pasien.address).
//                                append("\nUmur:").append(pasien.drug).
//                                append("\nObat:").append(pasien.drug).
//                                append("\n\n");

                        break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Menu tidak valid. Silakan pilih (1-5),",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

    }
}
