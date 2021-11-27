package pro.sky.java.course2.lesson2_2;

public class main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Bicycle("Author"),
                new Bicycle("Scott"),
                new Car("Nissan", 4),
                new Car("BMW", 4),
                new Truck("Volvo", 6),
                new Truck("CAT", 8),

        };
        ServiceStation station = new ServiceStation();

        for (Transport transport : transports) {
            station.check(transport);

        }
    }
}
