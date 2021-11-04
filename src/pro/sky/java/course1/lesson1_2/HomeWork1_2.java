package pro.sky.java.course1.lesson1_2;

public class HomeWork1_2 {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        byte littleNumber=1;
        System.out.println(littleNumber);
        short shortNumber=128;
        System.out.println(shortNumber);
        int middleNumber=1000;
        System.out.println(middleNumber);
        long longNumber=365L;
        System.out.println(longNumber);
        float floatNumber= 0.1f;
        System.out.println(floatNumber);
        double doubleNumber=1.2;
        System.out.println(doubleNumber);
        char charValue= (char) 65536;
        System.out.println(charValue);
        boolean booleanValue=true;
        System.out.println(booleanValue);

        System.out.println("Второе задание");
        float firstFight=78.2f;
        float secondFight=82.7f;
        float fightsWeight=firstFight+secondFight;
        float differentWeight=secondFight-firstFight;
        System.out.println("Общий вес двух бойцов равен "+fightsWeight+" кг!");
        System.out.println("Разница между бойцами равена "+differentWeight+" кг!");

        System.out.println("Третее задание");
        int bananasWeight=80;
        int bananasNumber=5;
        int milkWeight=210;
        int iceCreamWeight=100;
        int iceCreamNumber=2;
        int eggsWeight=70;
        int eggsNumber=4;
        int sportBreakfastGram=bananasNumber*bananasWeight+milkWeight+iceCreamNumber*iceCreamWeight+eggsNumber*eggsWeight;
        float sportBreakfastKg=sportBreakfastGram/1000f;
        System.out.println("Обший вес спорт-завтрака равен "+sportBreakfastGram+ " грамм");
        System.out.println("Обший вес спорт-завтрака равен "+sportBreakfastKg+ " кг");

        System.out.println("Четвертое задание");
        int firstGoal=250;
        int secondGoal=500;
        int middleGoal=(firstGoal+secondGoal)/2;
        float need=7000;
        float firstDays=need/firstGoal;
        float secondDays=need/secondGoal;
        float middleDays=need/middleGoal;
        System.out.println("Если спортсмен будет терять по "+firstGoal+" грамм в день, то уйдет "+firstDays+" дней!");
        System.out.println("Если спортсмен будет терять по "+secondGoal+" грамм в день, то уйдет "+secondDays+" дней!");
        System.out.println("В среднем спортсмену потребуется "+middleDays+" дней!");

        System.out.println("Пятое задание");
        float salaryMarya=67760f;
        float salaryDenis=83690f;
        float salaryKris=76230f;
        float achieve=0.1f;
        float newSalaryMarya=salaryMarya+(achieve*salaryMarya);
        float newSalaryDenis=salaryDenis+achieve*salaryDenis;
        float newSalaryKris=salaryKris+achieve*salaryKris;
        float salaryYearMarya=salaryMarya*12;
        float newSalaryYearMarya=newSalaryMarya*12;
        float salaryYearDenis=salaryDenis*12;
        float newSalaryYearDenis=newSalaryDenis*12;
        float salaryYearKris=salaryKris*12;
        float newSalaryYearKris=newSalaryKris*12;
        float differMarya=newSalaryYearMarya%salaryYearMarya;
        float differDenis=newSalaryYearDenis%salaryYearDenis;
        float differKris=newSalaryYearKris%salaryYearKris;
        System.out.println("Маша теперь получает "+newSalaryMarya+" рублей. Годовой доход вырос на "+differMarya+" рублей.");
        System.out.println("Маша теперь получает "+newSalaryDenis+" рублей. Годовой доход вырос на "+differDenis+" рублей.");
        System.out.println("Маша теперь получает "+newSalaryKris+" рублей. Годовой доход вырос на "+differKris+" рублей.");

        System.out.println("Шестое задание");
        int a=12;
        int b=27;
        int c=44;
        int d=15;
        int e=9;
        int result=a*(b+(c-d*e));
        int revertResult=result*(-1);
        System.out.println(result);
        System.out.println(revertResult);

        task7();

        task8();
    }

    private static void task7() {
        System.out.println("Седьмое задание");
        int a=5;
        int b=7;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    private static void task8() {
        System.out.println("Восьмое задание");
        float a=789f;
        float b=(a%100-a%10)/10;
        System.out.println(b);
    }
}
