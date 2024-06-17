
import java.util.Scanner;

public class CPatient {
    static Patient[] listOfPatient = new Patient[10];

    static int PatientAssigned = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continues = true;

        while (continues && PatientAssigned < listOfPatient.length){
            PatientAdded(scanner);
            System.out.println("Do you want to add another patient? (ya/tidak");

        String answer = scanner.next();
        if("tidak".equalsIgnoreCase(answer)){
            continues = false;
        }
        //continues = answer.equalsIgnoreCase("ya");
    }
    if(PatientAssigned == listOfPatient.length){
        System.out.println("Capacity is outreached");
    }

        System.out.println("Total of patient " +TotalPatient());
        System.out.println("Enter the max age to find patients with BPJS: ");
        int maxAge = scanner.nextInt();
        System.out.println("Enter the max age to find patients with BPJS and age less than " + maxAge + BPJSnAge(maxAge));

        System.out.println("Find Patient: ");
        scanner.nextLine();

        String Patientname = scanner.nextLine();

        display(Patientname);

        scanner.close();
    }


    public static void PatientAdded(Scanner scanner){
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("Telephone: ");
        String telephone = scanner.nextLine();

        System.out.println("Age: ");
        String age = scanner.nextLine();

        System.out.println("Gender (0 = man) (1 = woman): ");
        int gender = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Diagnose: ");
        String diagnose = scanner.nextLine();

        System.out.println("Do you have BPJS (true/false)");
        boolean BPJS = scanner.nextBoolean();
        scanner.nextLine();

        Patient newPatient = new Patient(name, address, telephone, Integer.parseInt(age), gender, diagnose, BPJS);

        listOfPatient[PatientAssigned] = newPatient;
            PatientAssigned++;
    }

    public static int TotalPatient() {
        return PatientAssigned;
    }



    public static int BPJSnAge(int maxAge){
            int total = 0;
            for(int i = 0; i < PatientAssigned; i++){
            if(listOfPatient[i].getAge() < maxAge && listOfPatient[i].isBPJS()){
                total++;

             }
            }
            return total;

        }



    public static void display(String name){
        for(Patient patient : listOfPatient){
            if(patient != null && patient.getName().equalsIgnoreCase(name)){
                System.out.println(patient);
                break;
            }
        }

    }
}