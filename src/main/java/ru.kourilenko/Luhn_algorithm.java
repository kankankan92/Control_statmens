package ru.kourilenko;


public class Luhn_algorithm {
    public boolean correct(int[] a) {
        if (a.length < 12 || a.length > 19) {
            throw new RuntimeException("Некорректная длина номера");
        }
        int i = a.length - 1;
        while (i > -1) {
            if ((a.length - i) % 2 == 0) {
                if (a[i] * 2 > 9) {
                    a[i] = a[i] * 2 - 9;
                }else {
                    a [i] *= 2;
                }
            }
            i--;
        }
        int sum = 0;
        for (int j: a){
            sum += j;
        }
        if (sum%10 == 0){
            System.out.println("Корректный номер карты");
            return true;
        }else {
            System.out.println("Некорректный номер карты");
            return false;
        }
    }
}
