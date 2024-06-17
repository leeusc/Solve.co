import java.lang.foreign.SequenceLayout;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CRestaurant {
    public static void main(String[] args) {
        String MainMenu = """
                Main Menu:
                (A)Paket A_$10
                (B)Paket B_$12
                (C)Paket C_$14
                (D)Paket D_$15
                (E)Paket E_$20
                Choose Combo (A-E):
                //leave blank -> exit \n""";
        System.out.println(MainMenu);

        FinalRevenue();
    }

    static void FinalRevenue(){
        double grantTotal = Customer();

        double vat = Value_AddedTax(grantTotal);
        double SC = ServiceCharge(grantTotal);
        double deduction = PPNnSC(grantTotal);
        double net = Expenses(deduction);

        System.out.println("Grant Total before deduction: $" + grantTotal);
        System.out.println("Total Value-Added Tax (VAT)- : $" + vat);
        System.out.println("Total Service Charge+ : " + SC);
        System.out.println("Net Profit after all deduction: $" + net);
    }

    static double Customer(){
        Scanner scan = new Scanner(System.in);
        int customerCount = 0;
        double grandTotal = 0;
        //boolean moreCustomer = true;


        do {
            customerCount++;
            double customerTotal = 0;
            boolean ordering = true;

            while (ordering) {
                System.out.println("Choose combo (A-E), leave blank to finish order: ");

                String input = scan.nextLine();
                if (input.isBlank()) {
                    ordering = false;
                    continue;
                }

                char choose = input.toLowerCase().charAt(0);
                customerTotal += switch (choose) {
                    case 'a' -> 10;
                    case 'b' -> 12;
                    case 'c' -> 14;
                    case 'd' -> 15;
                    case 'e' -> 20;
                    default -> {
                        System.out.println("Invalid choice try again.");
                        yield 0;
                    }
                };

                System.out.println("Total so far: $" + customerTotal);
                System.out.println("Choose another combo? (yes/no)");
                ordering = scan.nextLine().equalsIgnoreCase("yes");

            }

            System.out.println("Customer " + customerCount + " final total: $" + customerTotal);
            grandTotal += customerTotal;


            System.out.println("Is there any more customers?(yes/no)");
        } while (scan.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Grand total for all customers : $" + grandTotal);
        return grandTotal;
}
    static double Value_AddedTax(double grandTotal){
         final double PPN = 0.10;
         return (grandTotal * PPN);
    }
    static double ServiceCharge(double grandTotal){
        final double SC = 0.05;
        return grandTotal * SC;
    }
    static double PPNnSC(double grandTotal){
        return grandTotal - Value_AddedTax(grandTotal) - ServiceCharge(grandTotal);
    }
    static double Expenses(double grandTotal){
        final double Utility = 0.10;
        final double SalaryEm = 0.15;
        final double IngredientEx = 0.20;

        double utilityCOst = grandTotal * Utility;
        double employeeSalaries = grandTotal * SalaryEm;
        double ingredientExpenses = grandTotal * IngredientEx;

        return grandTotal - (utilityCOst + employeeSalaries + ingredientExpenses);
//        return PPNnSC(grandTotal) - (PPNnSC(grandTotal * Utility) -
//                PPNnSC(grandTotal * SalaryEm) - PPNnSC(grandTotal - IngredientEx));
    }
    }
