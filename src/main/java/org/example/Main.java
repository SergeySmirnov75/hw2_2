public class Main {
    public static void main(String[] args)
    {
        Car car = new Car("Лада", 4);
        Car car2 = new Car("Мазератти", 4);
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("Белаз", 6);
        Truck truck2 = new Truck("Камаз", 6);
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle("Минск", 2);
        Bicycle bicycle2 = new Bicycle("Иж", 3);
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
