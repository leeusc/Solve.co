import java.util.Objects;

public class BOSalary {

    double Transportation;
    double Meal;

    public BOSalary(double transportation, double meal) {
        this.Transportation = transportation;
        this.Meal = meal;
    }

    public double getTransportation() {
        return Transportation;
    }

    public double getMeal() {
        return Meal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BOSalary boSalary = (BOSalary) o;
        return Double.compare(Transportation, boSalary.Transportation) == 0 && Double.compare(Meal, boSalary.Meal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Transportation, Meal);
    }

    @Override
    public String toString() {
        return "BOSalary{" +
                "Transportation=" + Transportation +
                ", Meal=" + Meal +
                '}';
    }
}
