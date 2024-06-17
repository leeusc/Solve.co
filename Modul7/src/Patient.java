public class Patient {
    private String name;
    private String address;
    private String telephone;
    private int age;
    private int gender;
    private String diagnosis;
    private boolean BPJS;

    public Patient(String name, String address, String telephone, int age, int gender, String diagnosis, boolean BPJS) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.age = age;
        this.gender = gender;
        this.diagnosis = diagnosis;
        this.BPJS = BPJS;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isBPJS() {
        return BPJS;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", diagnosis='" + diagnosis + '\'' +
                ", BPJS=" + BPJS +
                '}';
    }
}
