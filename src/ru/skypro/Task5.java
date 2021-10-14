package ru.skypro;

public class Task5 {
    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        int x;

        for (int i = 0; i < 10; i++) {
            System.out.print(one + " ");
            x = one + two;
            one = two;
            two = x;

        }
    }
}
