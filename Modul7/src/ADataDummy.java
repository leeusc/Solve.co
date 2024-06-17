
public class ADataDummy {
    private String name;
    private String province;
    private double latitude;
    private double longitude;

    public ADataDummy(String city, String province, double latitude, double longitude) {
        this.name = city;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void printCityData() {
        System.out.println("Name of the City: " + name);

        System.out.println("Name of Province: " + province);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }

    public void setName(String name) {
        this.name = name;
    }
}

    class CityTest{
    public static void main(String[] args) {

        ADataDummy city = new ADataDummy("Bandung", "West Java", -6.454335, 108.34324);

        city.setName("Cirebon");
        city.printCityData();

        String cityProvince = city.getProvince();
        System.out.println(cityProvince);
        }
    }
