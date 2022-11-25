public class Main {
    public static void main(String[] args) {
        //homework1
        //task №1
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        //task №2
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();

        //task №3
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i +=2) {
            System.out.print(" " + i);
        }
        System.out.println();

        //task №4
        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
        System.out.println();

        //homework2
        //task №1
        System.out.println("Задача №1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //task №2
        System.out.println("Задача №2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(" " + i);
        }
        System.out.println();

        //task №3
        System.out.println("Задача №3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(" " + i);
        }
        System.out.println();

        //homework3
        //task №1
        System.out.println("Задача №1");
        int partOfMoney = 29000;
        int totalMoney = 0;
        for (int i = 1; i <= 12; i++) {
            totalMoney += partOfMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }

        //homework3
        //task №2
        System.out.println("Задача №2");
        double totalSavingsAmount = 0;
        for (int i = 1; i <= 12; i++) {
            totalSavingsAmount += totalSavingsAmount /100;
            totalSavingsAmount += partOfMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavingsAmount + " рублей");
        }
    }
}