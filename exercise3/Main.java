import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean working=true;
        Scanner sc1 = new Scanner(System.in);
        do{
            System.out.println("Enter F for Flight Booking\n" +
                    "Enter H for Hotel Booking\n" +
                    "Enter C for Car Rental");

            String selection = sc1.nextLine();

            if (selection.equals("F")){
                System.out.println("Insert Origin: ");
                String originInput = sc1.nextLine();

                System.out.println("Insert Destination: ");
                String destinationInput = sc1.nextLine();

                System.out.println("Insert Distance: ");
                int distanceInput = sc1.nextInt();

                FlightBooking fb1 = new FlightBooking(originInput,destinationInput,distanceInput);

                System.out.println("Calculating Flight Time: ");
                double avgSpeed = 500;
                System.out.println(fb1.computeFlightTime(avgSpeed) + "hours");

                System.out.println("Do you want to continue (y/n)? ");
                sc1.nextLine();
                String ans = sc1.nextLine();

                if (ans.equals("y")){
                    working = true;
                }
                else{
                    working = false;
                    break;
                }
            } else if (selection.equals("H")) {
                System.out.println("Write the Hotel selected name: ");
                String hotelInput = sc1.nextLine();

                System.out.println("How many nights are you planning to stay? ");
                int nightsInput = sc1.nextInt();

                System.out.println("Insert the hotel price per night: ");
                double pricePPNInput = sc1.nextDouble();

                HotelBooking hb1 = new HotelBooking(hotelInput,nightsInput,pricePPNInput);

                System.out.println("Calculating Hotel Total Cost: ");
                System.out.println(hb1.totalCost(nightsInput,pricePPNInput) + " USD");

                System.out.println("Do you want to continue (y/n)? ");
                sc1.nextLine();
                String ans = sc1.nextLine();

                if (ans.equals("y")){
                    working = true;
                }
                else{
                    working = false;
                    break;
                }
                
            }else if (selection.equals("C")) {
                System.out.println("Write the Car Model selected: ");
                String carInput = sc1.nextLine();

                System.out.println("How many days you'll need the car? ");
                int daysCarInput = sc1.nextInt();

                System.out.println("Insert the rate per day for the car rental: ");
                double rateCarInput = sc1.nextDouble();

                System.out.println("Insert the rate miles be used the car: ");
                double milesCarInput = sc1.nextDouble();

                CarRental cr1 = new CarRental(carInput,daysCarInput,rateCarInput,milesCarInput);

                System.out.println("Calculating Total car Rental Cost: ");
                System.out.println(cr1.totalRentalCost(daysCarInput,rateCarInput) + " USD");

                System.out.println("Total Miles Allowed: ");
                System.out.println(cr1.totalMilesAllowed(daysCarInput,milesCarInput) + " Miles");

                System.out.println("Do you want to continue (y/n)? ");
                sc1.nextLine();
                String ans = sc1.nextLine();

                if (ans.equals("y")){
                    working = true;
                }
                else{
                    working = false;
                    break;
                }

            }
        }
        while(working);

    }
}