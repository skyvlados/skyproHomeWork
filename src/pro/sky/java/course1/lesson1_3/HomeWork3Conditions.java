package pro.sky.java.course1.lesson1_3;

public class HomeWork3Conditions {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Первое задание:");
        int clientOS=1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    private static void task2(){
        System.out.println("Второе задание:");
        int clientOS=1;
        int clientDeviceYear=2018;
        if (clientOS == 1) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }
    private static void task3(){
        System.out.println("Третее задание:");
        int year=2020;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Год не является високосным");
        }
    }
    private static void task4(){
        System.out.println("Четвертое задание:");
        int deliverDistance = 59;
        int timeDistance = 0;
        if(deliverDistance<=20){
            timeDistance += 1;
        }
        else if (deliverDistance > 20 && deliverDistance < 60) {
            timeDistance += 2;
        } else {
            timeDistance += 3;
        }
        System.out.println("На доставку банковской карты потребуется "+timeDistance+" дня");
    }
    private static void task5(){
        System.out.println("Пятое задание:");
        int monthNumber=9;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
