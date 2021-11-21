package pro.sky.java.course2.lesson2_2;

public class Truck extends AbstractTransportWithEngine {
    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();

    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
