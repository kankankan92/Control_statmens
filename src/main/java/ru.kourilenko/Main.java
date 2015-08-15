package ru.kourilenko;

public class Main {
    public static void main(String[] args) {
        /*IfElse_SwitchCase test = new IfElse_SwitchCase();
        test.maxDigit(92078);
        test.timeGoHome(16567);
        test.inInterval();
        test.move(14, -9, 1);*/
        int [] a = {4, 2, 7, 6, 3, 8, 0, 0, 5, 8, 5, 1, 1, 3, 3, 3};
        int [] b = {4, 2, 7, 2, 2, 9, 0, 2, 0, 5, 6, 6, 0, 3, 9, 2};
        int [] c = {4, 2, 7, 6, 3, 8, 0, 0, 5, 8, 5, 1, 1, 3, 3, 6};

        Luhn_algorithm test1 = new Luhn_algorithm();
        test1.correct(a);
        test1.correct(b);
        test1.correct(c);

    }
}
