package pro.sky.java.course1.lesson1_3;

public class HomeWork1_3 {
    public static void main(String[] args) {

        task1();
    }

    private static void task1() {
        System.out.println("Первое задание");
        int clientOS=1;
        if(clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Установите в clientOS 0 - если у вас iOS или 1 - если у вас Android");
        }
    }
}
