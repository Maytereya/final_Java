package calc.view;

import java.util.Scanner;

public class Reader {
    int x;
    char op;
    Scanner iScan = new Scanner(System.in);

    public Reader() {
    }

    public int read(){
        x = Integer.parseInt(iScan.nextLine());
        return x;
    }

    public char readOperator(){
        op = iScan.nextLine().charAt(0);
        return op;
    }


}
