public class SecurityGate {

    public static void main(String[] args)
    {
        //1. Variable Declaration and Initialization
        String passengerName = "Karthik";
        int passengerAge = 22;
        double passengerBaggageWeight = 18.5;
        boolean passengerHasBoardingPass = true;
        char gender = 'M';

        System.out.println("Processing Passenger: " + passengerName);
        System.out.println("Checking Baggage Weight: " + passengerBaggageWeight + "kg");

        System.out.println("Passenger: " + passengerName + "is allowed to board the plane: " + passengerHasBoardingPass);


    }
}
