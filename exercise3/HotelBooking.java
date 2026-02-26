public final class HotelBooking {
    private final String hotelName;
    private final int nights;
    private final double pricePerNight;

    public String getHotelName(){
        return hotelName;
    }

    public int getNights(){
        return nights;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }

    public HotelBooking (String hotelName, int nights, double pricePerNight){
        if (nights <= 0){
            throw new IllegalArgumentException("Incorrect Value");
        }

        if (pricePerNight <= 0){
            throw new IllegalArgumentException("Incorrect Value");
        }

        if (hotelName == null){
            throw new IllegalArgumentException("Incorrect Value");
        }

        this.hotelName = hotelName;
        this.nights = nights;
        this.pricePerNight = pricePerNight;
    }

    public double totalCost(int nights, double pricePerNight){
        return nights * pricePerNight;
    }



}
