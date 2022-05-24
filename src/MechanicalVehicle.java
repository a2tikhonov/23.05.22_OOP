public class MechanicalVehicle extends Vehicle implements VehicleService{

    public MechanicalVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check() {
        printModelName(this);
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
    }
}
