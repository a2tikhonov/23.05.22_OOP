public class Truck extends MechanicalVehicle implements VehicleService {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {
        printModelName();
        for (int i = 0; i < getWheelsCount(); i++) {
            this.updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

}
