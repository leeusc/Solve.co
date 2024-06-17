import java.util.Objects;

public class BOEmployee {

    String Name;
    String Position;
    BOAddress Address;
    BOSalary Income;

    public BOEmployee(String name, String position, BOAddress address, BOSalary income) {
        this.Name = name;
        this.Position = position;
        this.Address = address;
        this.Income = income;
    }

    public BOEmployee(String name, String position) {
        this.Name = "Default";
        this.Position = "Position";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BOEmployee employee = (BOEmployee) o;
        return Objects.equals(Name, employee.Name) && Objects.equals(Position, employee.Position) && Objects.equals(Address, employee.Address) && Objects.equals(Income, employee.Income);
    }

    public double getTransportation() {
        return getIncome().getTransportation();
    }

    public double getMeal() {
        return getIncome().getMeal();
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Position, Address, Income);
    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public BOAddress getAddress() {
        return Address;
    }

    public BOSalary getIncome() {
        return Income;
    }

    @Override
    public String toString() {
        return "BOEmployee{" +
                "Name=" + Name +
                ", Position='" + Position + '\'' +
                ", Address='" + Address + '\'' +
                ", Income=" + Income +
                '}';
    }



}
