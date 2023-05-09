package abstraction.carRentals;

//Define a CarFactory class that creates instances of different types of cars based on the car type
class CarFactory {
 public static Car createCar(CarType type, String model) {
     switch (type) {
         case SEDAN:
             return new SedanCar(model);
         case SUV:
             return new SUVCar(model);
         case LUXURY:
             return new LuxuryCar(model);
         default:
             throw new IllegalArgumentException("Invalid car type: " + type);
     }
 }
}
