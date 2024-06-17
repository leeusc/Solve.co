import java.text.DecimalFormat;

public class Area {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double area = circle(4);
        double r = Circumference(4);
        System.out.println("Area of circle is " + df.format(area));

        System.out.println("\n\n");
        System.out.println("The Circumference of circle is: "+ df.format(r));;
    }

    static double circle(double r){

        double A;
        A = Math.PI * Math.pow(r, 2);
        return A;
    }

    static double Circumference(double r){

        return Math.PI * 2 * r;

    }
}