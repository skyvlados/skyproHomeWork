package pro.sky.java.course1.lesson1_4;

public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Первое задание");
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        for(int j=10;j>=1;j--){
            System.out.print(j+" ");
        }
    }
    private static void task2() {
        System.out.println("");
        System.out.println("Второе задание");
        int i=4;
        for(;i<=31;i=i+7){
            System.out.println("Сегодня пятница "+i+"-ое число. Необходимо подготовить отчет.");
        }
        }
    private static void task3() {
        System.out.println("Третее задание");
        int currentYear=2021;
        int previousPeriodCometYear=currentYear-200;
        int lastPeriodCometYear=currentYear+100;
        for(;previousPeriodCometYear<=lastPeriodCometYear;previousPeriodCometYear++){
            if(previousPeriodCometYear%79==0) {
                System.out.println(previousPeriodCometYear);
            }
        }
    }
    private static void task4() {
        System.out.println("Четвертое задание");
        int i=1;
        while(i<=30){
            String message;
            if(i%5==0&&i%3==0){
                message="ping pong";
            }
            else if(i%5==0){
                message="pong";
            }
            else if(i%3==0){
                message="ping";
            }
            else{
                message="";
            }
            System.out.println(i+": "+message);
            i++;
        }
    }
}
