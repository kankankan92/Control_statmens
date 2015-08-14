package ru.kourilenko;

import java.util.Arrays;

public class IfElse_SwitchCase {
    public void maxDigit(int a) { //Метод выводит наибольшую цифру в числе
        int num = a;
        int max = 0;
        a = Math.abs(a);
        while (a > 0) {
            int b = a % 10;
            if (max < b) max = b;
            a = a / 10;
        }
        System.out.println("В числе " + num + " самая большая цифра " + max);
    }

    public void inInterval() {
        int a = (int) (Math.random() * 150 + 5);
        if (a > 25 && a < 100) System.out.println("Число " + a + " содержится в интервале (25;100)");
        else System.out.println("Число " + a + " не содержится в интервале (25;100)");
    }

    public void move(int a, int b, int c) {
        System.out.println("Числа в переменных а, b и c: " + a + ", " + b + ", " + c);
        int first;
        int second;
        int third;
        if (a < b && a < c) {
            first = a;
            if (b < c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        }else if(b<a && b<c){
            first = b;
            if (a<c){
                second = a;
                third = c;
            }else {
                second = c;
                third = a;
            }
        }else {
            first= c;
            if(a<b){
                second= a;
                third = b;
            }else {
                second = b;
                third = a;
            }
        }
        System.out.println("Возрастающая последовательность: " + first + ", " + second + ", " + third);
    }

    public void timeGoHome(int a) { //Метод выводит сколько часов до конца рабочего дня осталось, если известно сколько секунд
        System.out.println(a);
        int b = a / 3600;
        switch (b) {
            case 7:
            case 6:
            case 5:
                System.out.println("Осталось " + b + " часов");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Осталось " + b + " часа");
                break;
            case 1:
                System.out.println("Остался " + b + " час");
                break;
            case 0:
                System.out.println("Осталось менее часа");
                break;
            default:
                System.out.println("Некорректное время");
        }
    }
}
