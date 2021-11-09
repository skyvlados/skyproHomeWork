package pro.sky.java.course1.lesson1_5;

import java.util.Arrays;

public class Homework5Arrays {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        String a = Arrays.toString(arr);

        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    private static void task1(int[] arr) {
        System.out.println("Первое задание");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2(int[] arr) {
        System.out.println("Второе задание");
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей. Максимальная сумма трат за день составила " + maxValue + " рублей.");
    }

    private static void task3(int[] arr) {
        System.out.println("Третее задание");
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        float avg = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей.");
    }

    private static void task4() {
        System.out.println("Четвертое задание");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}
