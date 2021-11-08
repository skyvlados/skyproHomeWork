package pro.sky.java.course1.course1Work;

public class Course1Work {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Бутусов Вячеслав Геннадьевич", 1, 100_000);
        employees[1] = new Employee("Кипелов Валерий Александрович", 2, 200_000);
        employees[2] = new Employee("Кобейн Курт Иванович", 3, 300_000);
        employees[3] = new Employee("Кержаков Александр Анатольевич", 4, 400_000);
        employees[4] = new Employee("Дуров Павел Валерьевич", 5, 500_000);
        employees[5] = new Employee("Галкин Владислав Борисович", 1, 600_000);
        employees[6] = new Employee("Тесла Никола Иванович", 2, 700_000);
        employees[7] = new Employee("Малевич Казимир Северинович", 3, 800_000);
        employees[8] = new Employee("Богров Данила Сергеевич", 4, 900_000);
        employees[9] = new Employee("Репин Илья Ефимович", 5, 1_000_000);
        employeesInfo();
        printResult("Сумма затрат на ЗП в месяц:  ", employeesSumSalary());
        employeesSumSalary();
        employeeMinSalary();
        employeeMaxSalary();
        employeeAverageSalary();
        employeesFullName();

    }

    public static void printResult(String text, double result) {
        System.out.println(text + result);
    }

    public static void employeesInfo() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double employeesSumSalary() {
        double employeesSum = 0;
        for (Employee employee : employees) {
            employeesSum = employeesSum + employee.getSalary();
        }
        return employeesSum;
    }

    public static void employeeMinSalary() {
        double employeeMin = 1000000000;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employeeMin > employees[i].getSalary()) {
                employeeMin = employees[i].getSalary();
                employeeId = i;
            }
        }
        System.out.println("Сотрудник с минимальной ЗП: " + employees[employeeId].getName());
    }

    public static void employeeMaxSalary() {
        double employeeMax = 0;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employeeMax < employees[i].getSalary()) {
                employeeMax = employees[i].getSalary();
                employeeId = i;
            }
        }
        System.out.println("Сотрудник с максимальной ЗП: " + employees[employeeId].getName());
    }

    public static void employeeAverageSalary() {
        double employeeAverage = employeesSumSalary() / employees.length;
        System.out.println("Среднее значение Зарплат: " + employeeAverage);
    }

    public static void employeesFullName() {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }
}
