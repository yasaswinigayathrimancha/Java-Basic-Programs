package abstraction.carRentals;


//Define an abstract CarBase class that implements the Car interface and provides a common implementation for all types of cars

public abstract class CarBase implements Car {
    private String model;
    private int rentalDays;
    private double rentalCost;

    public CarBase(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void rent(int days) {
        rentalDays = days;
        rentalCost = calculateRentalCost(days);
    }

    @Override
    public double getRentalCost() {
        return rentalCost;
    }

    // Define an abstract method that calculates the rental cost of a car
    protected abstract double calculateRentalCost(int days);
}
