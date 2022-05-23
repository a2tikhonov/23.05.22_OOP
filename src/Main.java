public class Main {
    public static void main(String[] args) {
        MechanicalVehicle car1 = new MechanicalVehicle("car1", 4);
        MechanicalVehicle car2 = new MechanicalVehicle("car2", 4);
        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Vehicle bicycle1 = new Vehicle("bicycle1", 2);
        Vehicle bicycle2 = new Vehicle("bicycle2", 2);
        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(truck1);
        station.check(truck2);
        station.check(bicycle1);
        station.check(bicycle2);
    }
}