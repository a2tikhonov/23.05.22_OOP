public class ServiceStation implements VehicleService {

    @Override
    public void check(MechanicalVehicle mechanicalVehicle) {
        printModelName(mechanicalVehicle);
        for (int i = 0; i < mechanicalVehicle.getWheelsCount(); i++) {
            mechanicalVehicle.updateTyre();
        }
        mechanicalVehicle.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        printModelName(truck);
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

}
