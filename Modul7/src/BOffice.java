import java.util.HashSet;

public class BOffice {

    public BOffice() {
    }

    public static void main(String[] args) {

        BOEmployee[] Employee = new BOEmployee[3];

        Employee[0] = new BOEmployee("Alice", "Manager",
                new BOAddress("Jl.Merdeka", "Jakarta", "DKI Jakarta"),
                new BOSalary(200, 100));

        BOEmployee employee = new BOEmployee("Alice", "Manager",
                new BOAddress("Jl.Merdeka", " Jakarta", "DKI Jakarta"),
                new BOSalary(200, 100));

        BOEmployee employee1 = new BOEmployee("Alice", "Manager",
                new BOAddress("Jl.Merdeka", " Jakarta", "DKI Jakarta"),
                new BOSalary(200, 100));


        Employee[1] = new BOEmployee("Alice", "Manager",
                new BOAddress("Jl.Merdeka", "Jakarta", "DKI Jakarta"),
                new BOSalary(200, 100));

        BOEmployee CEO =  new BOCEO("John", "CEO");

        System.out.println(CEO);


        System.out.println(employee1.equals(employee));

        System.out.println(Employee[0].getName());
        System.out.println(Employee[0]);


        HashSet<BOEmployee> employeesSet = new HashSet<>();

        employeesSet.add(Employee[0]);
        employeesSet.add(Employee[1]);

        for(BOEmployee emp : employeesSet){
            System.out.println(emp);
        }
    }
}
