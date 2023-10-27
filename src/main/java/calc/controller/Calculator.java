package calc.controller;

public class Calculator {
    private static int result;


    public static int calculate(char op, int a, int b) {

        if (op == '+')
            result = a + b;
        else if (op == '-')
            result = a - b;
        else if (op == '*')
            result = a * b;
        else if (op == '/')
            result = a / b;

        return result;
    }
}
