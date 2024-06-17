public class BOCEO extends BOEmployee{
    protected String name;
    protected String Position;

    public BOCEO(String name, String position) {
        super(name, position);
        this.name = name;
        this.Position = position;
    }


    @Override
    public String toString() {
        return "BOCEO{" +
                "name='" + name + '\'' +
                ", Position='" + Position + '\'' +
                '}';
    }
}
