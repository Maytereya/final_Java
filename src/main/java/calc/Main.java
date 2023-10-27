package calc;

import calc.controller.Calculator;
import calc.controller.Logging;
import calc.hadling.Dialoger;
import calc.hadling.Reader;

public class Main {
    public static void main(String[] args) {
        Dialoger dialog = new Dialoger();
        Reader reader = new Reader();
        Logging logging = new Logging();

        dialog.dialog1();
        int a = reader.read();

        dialog.dialog2();
        int b = reader.read();

        dialog.dialogOperator();
        char op = reader.readOperator();

        dialog.dialogResult(Calculator.calculate(op, a, b));
        logging.loggingFiling(a, b, op);
    }
}