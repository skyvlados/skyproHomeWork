package pro.sky.java.course2.lesson2_2;

public abstract class AbstractTransportWithEngine extends AbstractTransport {
    public AbstractTransportWithEngine(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем движок");
    }

}
