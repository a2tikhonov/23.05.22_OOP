public class Truck extends MechanicalVehicle implements VehicleService {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {
        printModelName(this);
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }

}
