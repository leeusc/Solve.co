public class PatientNew {private String nama;
    private String alamat;
    private String telepon;
    private int usia;
    private int gender;
    private String keluhanPenyakit;
    private boolean bpjs;

    public PatientNew(String nama, String alamat, String telepon, int usia, int gender, String keluhanPenyakit, boolean bpjs) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.usia = usia;
        this.gender = gender;
        this.keluhanPenyakit = keluhanPenyakit;
        this.bpjs = bpjs;
    }

    public String getNama(){
        return nama;
    }
    public int getUsia(){
        return usia;
    }
    public boolean isBpjs(){
        return bpjs;
    }

    @Override
    public String toString() {
        return "PatientNew{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", telepon='" + telepon + '\'' +
                ", usia=" + usia +
                ", gender=" + gender +
                ", keluhanPenyakit='" + keluhanPenyakit + '\'' +
                ", bpjs=" + bpjs +
                '}';
    }
}
