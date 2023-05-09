package abstraction.carRentals;

public class Main {
    public static void main(String[] args) {
        // Create a sedan car with model "Honda Civic"
        Car sedanCar = CarFactory.createCar(CarType.SEDAN, "Honda Civic");

        // Rent the sedan car for 4 days
        sedanCar.rent(4);

        // Print the rental cost of the sedan car
        System.out.println("Rental cost of " + sedanCar.getModel() + ": $" + sedanCar.getRentalCost());

        // Create a luxury car with model "BMW 7 Series"
        Car luxuryCar = CarFactory.createCar(CarType.LUXURY, "BMW 7 Series");

        // Rent the luxury car for 7 days
        luxuryCar.rent(7);

        // Print the rental cost of the luxury car
        System.out.println("Rental cost of " + luxuryCar.getModel() + ": $" + luxuryCar.getRentalCost());
    }
}