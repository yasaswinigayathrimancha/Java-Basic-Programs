package abstraction.carRentals;

class SUVCar extends CarBase {
    public SUVCar(String model) {
        super(model);
    }

    @Override
    protected double calculateRentalCost(int days) {
        return days * 50.0;
    }
}
