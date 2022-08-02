public class Calculator {

    public static final String ADDITION = "+";
    public static final String SUBTRACTION = "-";
    public static final String MULTIPLICATION = "*";
    public static final String DIVISION = "/";

    public static int calculate(int firstOpertand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOpertand + secondOperand;
            case SUBTRACTION:
                return firstOpertand - secondOperand;
            case MULTIPLICATION:
                return firstOpertand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOpertand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}