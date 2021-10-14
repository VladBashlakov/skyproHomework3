package ru.skypro;

public class Task3 {
    public static void main(String[] args) {
        int todayYear = 2021;
        int pastYear = todayYear - 200;
        int futureYear = todayYear + 100;
        while (pastYear < futureYear) {
            if (pastYear % 79 == 0) {
                System.out.println(pastYear);
            }
            pastYear++;
        }
    }
}
