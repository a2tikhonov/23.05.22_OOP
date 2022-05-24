public class Vehicle implements VehicleService {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void printModelName(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
    }

    public void check() {
        printModelName(this);
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
    }

}
