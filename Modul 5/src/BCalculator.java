import java.util.Calendar;
import java.util.Scanner;

public class BCalculator {
    public static void main(String[] args) {
        Calculator();
    }
    static void Calculator(){
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        do {
            System.out.println("Input first number: ");
            num1 = scanner.nextDouble();

            System.out.println("Type Sign of Operator (+, -, *, %): ");
            operator = scanner.next().charAt(0);

            System.out.println("Input second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Addition of two number is: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Subtraction of two number is: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Multiplication of two number is: " + multiple(num1, num2));
                    break;
                case '/':
                    System.out.println("Division of two number is: " + division(num1, num2));
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        } while (operator == '+' || operator == '-' || operator == '*' || operator == '/');
        scanner.close();
    }

    static double add(double a, double b){
        return a + b;
    }
    static double subtract(double a, double b){
        return a - b;
    }
    static double multiple(double a, double b){
        return a * b;
    }
    static double division(double a, double b){
        return a / b;
    }

}
