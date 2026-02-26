public final class FlightBooking {
    private final String origin;
    private final String destination;
    private final int distanceKM;

    public FlightBooking (String origin, String destination, int distanceKM){
        if (origin == null || origin.length() == 0){
            throw new IllegalArgumentException("Invalid Input origin");
        }
        if (destination == null || destination.length() == 0){
            throw new IllegalArgumentException("Invalid Input destination");
        }
        if (distanceKM == 0 ){
            throw new IllegalArgumentException("Invalid Input distance KM");
        }

        this.origin=origin;
        this.destination=destination;
        this.distanceKM=distanceKM;
    }

    public String getOrigin (){
        return origin;
    }

    public String getDestination (){
        return destination;
    }

    public int getDistanceKM (){
        return distanceKM;
    }

    public String toString(){
        return origin + " : " + destination + " : " + distanceKM;
    }

    public double computeFlightTime(double avgSpeed){
        if (avgSpeed <= 0){
            throw new IllegalArgumentException("Invalid Input avgSpeed");
        }
        else{
            double flightTime = distanceKM / avgSpeed;
            return flightTime;
        }


     }

}
