package pro.sky.java.course2.lesson2_2;

public class Bicycle extends AbstractTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle(String modelName) {
        super(modelName, 2);
    }


}
