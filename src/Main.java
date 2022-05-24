public class Main {
    public static void main(String[] args) {
        MechanicalVehicle car1 = new MechanicalVehicle("car1", 4);
        MechanicalVehicle car2 = new MechanicalVehicle("car2", 4);
        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Vehicle bicycle1 = new Vehicle("bicycle1", 2);
        Vehicle bicycle2 = new Vehicle("bicycle2", 2);
        VehicleService[] service = {car1, car2, truck1, truck2, bicycle1, bicycle2};
        for (int i = 0; i < service.length; i++) {
            service[i].check();
        }

    }
}