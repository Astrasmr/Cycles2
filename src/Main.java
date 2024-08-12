import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int target = 2459000;
        int saving = 15000;
        int month = 1;
        int sum = 0;
        int percent;

        while (sum <= target) {
            sum = sum + saving;
            percent = sum / 100;
            sum = sum + percent;
            System.out.println(sum + " в месяц " + month);
            month++;

        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");

        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int born;
        int dead;
        for (int j = 1; j <= 10; j++) {
            born = population / 1000 * 17;
            dead = population / 1000 * 8;
            population += born - dead;
            System.out.printf("Год %s, численность населения составляет  %s%n", j, population);
        }
        System.out.println("Задача 4");
        target = 12_000_000;
        month = 0;
        double summa = 15_000;
        while (summa <= target) {
            summa *= 1.07;
            month++;
            System.out.printf("Накоплено в  %s месяце %.2f%n", month, summa);
        }
        System.out.println("Задача 5");
        month = 0;
        summa = 15_000;
        while (summa <= target) {
            summa *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Накоплено в  %s месяце %.2f%n", month, summa);
            }
        }
        System.out.println("Задача 6");
        int monthTarget = 108;
        month = 0;
        summa = 15_000;
        while (month <= monthTarget) {
            summa *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Накоплено в  %s месяце %.2f%n", month, summa);
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 2;
        for (int j = firstFriday; j <= 31; j += 7) {
            System.out.printf("Сегодня пятница, %s -е число. Необходимо подготовить отчет.%n", j);
        }
        System.out.println("Задача 8");
        int period = 79;
        int nowYear = 2024;
        int beforeYears = nowYear - 200;
        int afterYears = nowYear + 100;
        for (int j = 0; j <= afterYears; j += period) {
            if (j >= beforeYears) {
                System.out.println(j);
            }

        }

    }
}


