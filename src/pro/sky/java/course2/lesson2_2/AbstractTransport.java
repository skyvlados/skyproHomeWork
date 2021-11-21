package pro.sky.java.course2.lesson2_2;

public abstract class AbstractTransport implements Transport {
    private final String modelName;
    private final int wheelsCount;

    public AbstractTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void check() {
        System.out.println("Обслуживание: " + getModelName());
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
