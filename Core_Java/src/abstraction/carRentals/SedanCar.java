package abstraction.carRentals;

class SedanCar extends CarBase {
    public SedanCar(String model) {
        super(model);
    }

    @Override
    protected double calculateRentalCost(int days) {
        return days * 30.0;
    }
}
