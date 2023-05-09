package abstraction.carRentals;

public interface Car {
    String getModel();
    void rent(int days);
    double getRentalCost();
}