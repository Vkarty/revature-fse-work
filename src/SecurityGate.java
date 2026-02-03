import java.util.*;
public class SecurityGate {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        //1. Variable Declaration and Initialization
        System.out.println("Enter Name: ");
        String passengerName = sc.nextLine();
        System.out.println("Enter Age: ");
        int passengerAge = sc.nextInt();
        System.out.println("Enter Baggage Weight: ");
        double passengerBaggageWeight = sc.nextDouble();
        System.out.println("Boarding Pass Available (Trur/False): ");
        boolean passengerHasBoardingPass = sc.nextBoolean();
        System.out.println("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.println("Processing Passenger: " + passengerName);
        System.out.println("Checking Baggage Weight: " + passengerBaggageWeight + "kg");

        System.out.println("Passenger: " + passengerName + "is allowed to board the plane: " + passengerHasBoardingPass);


    }
}
