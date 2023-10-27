package calc;

import calc.controller.Calculator;
import calc.view.Dialoger;
import calc.view.Reader;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        Dialoger dialog = new Dialoger();
        Reader reader = new Reader();

        java.util.logging.Logger ll = java.util.logging.Logger.getLogger(Main.class.getName());
        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        dialog.dialog1();
        int a = reader.read();

        dialog.dialog2();
        int b = reader.read();

        dialog.dialogOperator();
        char op = reader.readOperator();

        dialog.dialogResult(Calculator.calculate(op, a, b));

        ll.log(Level.INFO, "Log: " + a + " " + op + " " + b + " = " + Calculator.calculate(op, a, b));
    }
}