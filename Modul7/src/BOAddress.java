import java.util.Objects;

public class BOAddress  {

    public String Street;
    public String City;
    public String Province;

    public BOAddress(String street, String city, String province) {
        this.Street = street;
        this.City = city;
        this.Province = province;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getProvince() {
        return Province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BOAddress boAddress = (BOAddress) o;
        return Objects.equals(Street, boAddress.Street) && Objects.equals(City, boAddress.City) && Objects.equals(Province, boAddress.Province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Street, City, Province);
    }

    @Override
    public String toString() {
        return "BOAddress{" +
                "Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", Province='" + Province + '\'' +
                '}';
    }
}
