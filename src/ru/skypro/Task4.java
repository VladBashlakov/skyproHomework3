package ru.skypro;

public class Task4 {
    public static void main(String[] args) {
        String ping = " ping ";
        String pong = " pong ";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":" + ping + pong);

            } else if (i % 3 == 0) {
                System.out.println(i + ":" + ping);

            } else if (i % 5 == 0) {
                System.out.println(i + ":" + pong);

            } else {
                System.out.println(i + ": ");
            }
        }
    }
}
