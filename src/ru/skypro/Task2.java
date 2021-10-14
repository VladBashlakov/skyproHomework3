package ru.skypro;

public class Task2 {
    public static void main(String[] args) {
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
    }
}
