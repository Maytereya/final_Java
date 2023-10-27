package calc.hadling;

public class Notifier {

    public Notifier() {
    }

    public void dialog1() {
        System.out.print("Введите первое число: ");
    }

    public void dialog2() {
        System.out.print("Введите второе число: ");
    }

    public void dialogOperator() {
        System.out.print("Введите оператор: ");
    }

    public void dialogResult(int result) {
        System.out.println("Результат: " + result);
    }
}
