 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;
 import java.util.Scanner;
 import java.util.function.BiFunction;
import java.util.stream.Stream;

public class BCalculator2 {
    public static void main(String[] args) {
        Calculator();
    }
    static void Calculator(){
        Scanner scan = new Scanner(System.in);
        Double currentResult = null;

        //Map to store operations
        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
        operations.put("+", Double::sum);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> a / b);
        operations.put("%", (a, b) -> a % b);

        while(true){
            try{
                if(currentResult == null){
                    System.out.println("Enter the number: ");
                    currentResult = Double.parseDouble(scan.next().trim());
                }
                System.out.println("Enter the operator (+, -, * , /, %) or 'C' to clear, 'X' to exit: ");
                String operator = scan.next().trim();

                if(operator.equalsIgnoreCase("X")){
                    System.out.println("Exiting the program...");
                    break;
                } else if(operator.equalsIgnoreCase("C")){
                    currentResult = null;
                    System.out.println("Answer Cleared. Starting form 0.");
                    continue;
                }

                System.out.println("Enter the next number: ");

                double num2 = Double.parseDouble(scan.next().trim());

                //Performs operation using lambda expression from the map

                BiFunction<Double, Double, Double> operation = operations.get(operator);

                if(operation == null){
                    System.out.println("Unsupported operator: " + operator);
                    continue;
                }

                //Check for division by zero

                if(operator.equals("/") && num2 == 0){
                    throw new ArithmeticException("Division by zero");
                }
                currentResult = operation.apply(currentResult, num2);

                System.out.println("Result: " + currentResult);
            } catch (NumberFormatException e){
                System.out.println("Invalid number format. Please try again");
            } catch (ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
                currentResult = null;
            }
        }
        scan.close();












    }
}