import javax.swing.*;

public class HospitalNew {

    private static PatientNew[] datapasien = new PatientNew[10];
    private static int jumlahPasien = 0;

    public static void main(String[] args) {
        while (true) {
            inputPasien();

            int response = JOptionPane.showConfirmDialog(null, "Apakah ingin input lagi? ", "Input lagi", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION || jumlahPasien >= 10) {
                {
                    if (jumlahPasien >= 10) {
                        JOptionPane.showMessageDialog(null, "Rumah sakit sudah penuh!");

                    }
                    break;

                }

            }

            hitungPasienTerdaftar();
            hitungPasienBPJSDIBawahUmurX();
            tamplikanPasienDenganNamaY();
        }
    }
    private static void inputPasien(){
        if(jumlahPasien >= 10){
            JOptionPane.showMessageDialog(null, " Rumah Sakit sudah penuh!");
            return;
        }

        String nama = JOptionPane.showInputDialog("Masukkan nama: ");
        String alamat = JOptionPane.showInputDialog("Masukkan alamat: ");
        String telepon = JOptionPane.showInputDialog("Masukkan nomor telephone");
        int usia = Integer.parseInt(JOptionPane.showInputDialog("Mauskkan usia: "));
        int gender = Integer.parseInt(JOptionPane.showInputDialog("Masukkan gender (0 = pria, 1 = wanita): "));
        String keluhanPenyakit = JOptionPane.showInputDialog("Masukan keluhan penyakit: ");
        boolean bpjs = JOptionPane.showConfirmDialog(null, "Menggunakan BPJS?", "BPJS", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION;

        datapasien[jumlahPasien++] = new PatientNew(nama, alamat, telepon, usia, gender, keluhanPenyakit, bpjs);
    }

        private static void hitungPasienTerdaftar(){
        int size = 10 - jumlahPasien;


        JOptionPane.showMessageDialog(null, "Jumlah pasien terdaftar: " + jumlahPasien + "\nSisa yang masih kosong " + size);
        }

        private static void hitungPasienBPJSDIBawahUmurX(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai X untuk umur: "));

        int count = 0;

        for(int i = 0; i < jumlahPasien; i++){
            if (datapasien[i].getUsia() < x && datapasien[i].isBpjs()){
                count++;
            }
        }

        JOptionPane.showMessageDialog(null, "Jumlah pasien dengan umur kurang dari " + x + " dan menggunakan BPJS " + count);
    }

    private static void tamplikanPasienDenganNamaY(){
        String namaY = JOptionPane.showInputDialog("Masukkan nama pasien yang dicari: ");
        boolean found = false;

        for(int i = 0; i < jumlahPasien; i++){
            if (datapasien[i].getNama().equalsIgnoreCase(namaY)){
                JOptionPane.showMessageDialog(null, "Data pasien:\n" + datapasien[i].toString());
                found = true;
                break;

            }
        }

        if (!found){
        JOptionPane.showMessageDialog(null, "Pasien dengan nama " + namaY + " tidal ditemukan.");
    }
    }
}
