package Com.CodeGym.Refactoring.Thuc_Hanh;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MUlTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int SecondOperand, char Operator) {
        switch (Operator) {
            case ADDITION:
                return firstOperand + SecondOperand;
            case SUBTRACTION:
                return firstOperand - SecondOperand;
            case MUlTIPLICATION:
                return firstOperand * SecondOperand;
            case DIVISION:
                if (SecondOperand != 0)
                    return firstOperand / SecondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
