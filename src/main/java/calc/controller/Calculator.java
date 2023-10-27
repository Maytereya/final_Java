package calc.controller;

public class Calculator {
    private static int result = 0;

    public Calculator() {
    }

    public static int calculate(char op, int a, int b) {

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else {
            System.out.printf("Некорректный оператор: %s", op);
        }
        return result;
    }
}
