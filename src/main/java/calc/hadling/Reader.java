package calc.hadling;

import java.util.Scanner;

public class Reader {
    Scanner iScan = new Scanner(System.in);

    public Reader() {
    }

    public int read(){
        return Integer.parseInt(iScan.nextLine());
    }

    public char readOperator(){
        return iScan.nextLine().charAt(0);
    }


}
