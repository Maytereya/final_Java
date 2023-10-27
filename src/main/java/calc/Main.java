package calc;

import calc.controller.Calculator;
import calc.hadling.Logger;
import calc.hadling.Dialoger;
import calc.hadling.Reader;

public class Main {
    public static void main(String[] args) {
        Dialoger dialog = new Dialoger();
        Reader reader = new Reader();
        Logger logger = new Logger();

        dialog.dialog1();
        int a = reader.read();

        dialog.dialog2();
        int b = reader.read();

        dialog.dialogOperator();
        char op = reader.readOperator();

        dialog.dialogResult(Calculator.calculate(op, a, b));
        logger.loggingFiling(a, b, op);
    }
}