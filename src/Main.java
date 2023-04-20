public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int cash = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += cash;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
//        }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number += 1;
            System.out.print(" " + number);
        }
        System.out.println();

        number = 10;
        for (; number > 0; number--) {
            System.out.print(" " + number);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int natalityPer1000 = 17;
        int deathRatePer1000 = 8;
        int year = 0;
        while (year < 10) {
            year += 1;
            population += (population / 1000) * (natalityPer1000 - deathRatePer1000);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int firstdeposit = 15_000;
        double percent = 0.07;
        int totalDeposit = 0;
        int month = 0;
        while (totalDeposit < 12_00_000) {
            month += 1;
            totalDeposit += firstdeposit + (totalDeposit * percent);
            System.out.println("Месяц " + month + " Сумма накоплений " + totalDeposit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int firstdeposit = 15_000;
        double percent = 0.07;
        int totalDeposit = 0;
        int month = 0;
        while (totalDeposit < 12_00_000) {
            month += 1;
            totalDeposit += firstdeposit + (totalDeposit * percent);
            if (month % 6 == 0 || month > 24) {
                System.out.println("Месяц " + month + " Сумма накоплений " + totalDeposit);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int firstdeposit = 15_000;
        double percent = 0.07;
        int totalDeposit = 0;
        int month = 0;
        while (month < 9 * 12) {
            month += 1;
            totalDeposit += firstdeposit + (totalDeposit * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Сумма накоплений " + totalDeposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayOfMonth = 7;
        for (int i = dayOfMonth; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentDate = 2023;
        int pastDate = currentDate - 200;
        int futDate = currentDate + 100;
        for (int i = 0; i <= futDate; i += 79) {
            if (i >= pastDate) {
                System.out.println(i);
            }
        }
    }
}
