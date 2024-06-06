public class BaseConverter {
    public static void main(String[] args) {
        int decimalNumber = 156;
        System.out.println("Binary: ");
        System.out.println(convertToBase(decimalNumber,2));
        System.out.println("Octal: ");
        System.out.println(convertToBase(decimalNumber,8));
        System.out.println("Hexadecimal: ");
        System.out.println(convertToBase(decimalNumber,16));
    }

    static String convertToBase(int decimal, int base){
        StringBuilder result = new StringBuilder();
        int quotient = decimal;

        while(quotient>0){
            int remainder = quotient % base;
            if (base == 16){
                result.insert(0,toHexChar(remainder));
            } else {
                result.insert(0,remainder);
            }
            quotient /= base;
        }
    return result.toString();
    }

    static char toHexChar(int remainder){
        if(remainder < 10) {
            return (char) ('0' + remainder);
        } else {
            return (char) ('A' + remainder - 10);
        }
    }
}
