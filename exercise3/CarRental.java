public final class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final double milesPerDay;

    public String getCarModel(){
        return carModel;
    }

    public int getDays(){
        return days;
    }

    public double getRatePerDay(){
        return ratePerDay;
    }

    public double getMilesPerDay(){
        return milesPerDay;
    }

    public CarRental (String carModel, int days, double ratePerDay, double milesPerDay){
        if (carModel == null){
            throw new IllegalArgumentException("Not a valid parameter.");
        }
        if (days <= 0){
            throw new IllegalArgumentException("Not a valid number of days");
        }
        if (ratePerDay <= 0){
            throw new IllegalArgumentException("Not a valid parameter");
        }

        this.carModel = carModel;
        this.days=days;
        this.ratePerDay=ratePerDay;
        this.milesPerDay=milesPerDay;
    }

    public double totalRentalCost(int days, double ratePerDay){
        return days * ratePerDay;
    }

    public double totalMilesAllowed(int days,double milesPerDay){
        return days * milesPerDay;
    }



}
