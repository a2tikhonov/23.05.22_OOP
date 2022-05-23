public interface VehicleService {
    default void check(Vehicle vehicle) {
            printModelName(vehicle);
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
    }

    default void printModelName(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
    }

    void check(MechanicalVehicle mechanicalVehicle);

    void check(Truck truck);
}
