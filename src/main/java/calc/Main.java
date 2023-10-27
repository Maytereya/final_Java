package calc;

import calc.controller.Calculator;
import calc.hadling.Logger;
import calc.hadling.Notifier;
import calc.hadling.Reader;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        Reader reader = new Reader();
        Logger logger = new Logger();

        notifier.dialog1();
        int a = reader.read();

        notifier.dialog2();
        int b = reader.read();

        notifier.dialogOperator();
        char op = reader.readOperator();

        notifier.dialogResult(Calculator.calculate(op, a, b));
        logger.loggingFiling(a, b, op);
    }
}