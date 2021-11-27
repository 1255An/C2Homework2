package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Vehicle[] autoPark = new Vehicle[]{
                new Bicycle("Bicycle1", 2),
                new Bicycle("Bycicle2", 2),
                new Car("Car1"),
                new Car("Car2"),
                new Truck("Truck1", 6),
                new Truck("Truck2", 8)
        };

        ServiceStation station1 = new ServiceStation();

        for (Vehicle vehicle : autoPark) {
            station1.check(vehicle);
        }

    }
}
