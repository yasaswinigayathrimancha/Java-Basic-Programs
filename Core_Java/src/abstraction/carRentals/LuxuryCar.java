package abstraction.carRentals;

public class LuxuryCar extends CarBase {
    public LuxuryCar(String model) {
        super(model);
    }

    @Override
    protected double calculateRentalCost(int days) {
        return days * 80.0;
    }
}
