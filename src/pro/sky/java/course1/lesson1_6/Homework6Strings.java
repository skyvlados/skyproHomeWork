package pro.sky.java.course1.lesson1_6;

public class Homework6Strings {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task7();
        task8();

    }

    private static void task1() {
        System.out.println("Первое задание:");
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName=lastName+"-"+firstName+"-"+middleName;
        System.out.println("ФИО сотрудника - "+fullName.replace("-"," "));
    }
    private static void task2() {
        String fullName="Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета – "+fullName.toUpperCase());
    }

    private static void task3() {
        System.out.println("Третее задание:");
        String fullName="Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для административного отдела –"+fullName.replace(" ", ";"));
    }
    private static void task4() {
        System.out.println("Четверное задание:");
        String fullName="Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника – "+fullName.replace("ё", "е"));
    }
    private static void task5() {
        System.out.println("Пятое задание:");
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName=lastName+"-"+firstName+"-"+middleName;
        System.out.println("Имя сотрудника – "+fullName.substring(fullName.indexOf("-")+1,fullName.lastIndexOf("-")));
        System.out.println("Фамилия сотрудника – "+fullName.substring(0,fullName.indexOf("-")));
        int lastPosition=fullName.length();
        System.out.println("Отчество сотрудника – "+fullName.substring(fullName.lastIndexOf("-")+1,lastPosition));
    }
    private static void task7() {
        System.out.println("Седьмое задание:");
        String firstString="135";
        String secondString="246";
        StringBuilder sumString=new StringBuilder(firstString);
        sumString.append(secondString);
        String resultString=sumString.toString();
        char[] massiveResultString=resultString.toCharArray();
        for (int i = 0; i < massiveResultString.length; i++) {
            int min=massiveResultString[i];
            for (int j = i + 1; j < massiveResultString.length; j++) {
                if (massiveResultString[j] < min) {
                 min=massiveResultString[j];
                 massiveResultString[j]=massiveResultString[i];
                }
            }
            int min1=Character.getNumericValue(min);
            System.out.print(min1);
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Восьмое задание:");
        String a="aabccddefgghiijjkk";
        char[] massiveForA=a.toCharArray();
        for (int i = 0; i < massiveForA.length-1; i++) {
            if (massiveForA[i] == massiveForA[i + 1]) {
                System.out.print(massiveForA[i]);
            }
        }

    }
}
