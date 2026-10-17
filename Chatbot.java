import java.util.Random;
import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand= new Random();
        while (true) {
            System.out.println("\n_____ CAB BOOKING CHATBOT _____");
            System.out.println("1.Book Ride");
            System.out.println("2.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("\nChoose Cab Type:");
                System.out.println("1.Auto");
                System.out.println("2.Sedan");
                System.out.println("3.SUV");
                System.out.print("Enter cab choice: ");
                int cabchoice = sc.nextInt();
                String cabtype = "";
                int rate = 0;
                switch (cabchoice) {
                    case 1:
                        cabtype = "Auto";
                        rate = 12;
                        break;
                    case 2:
                        cabtype = "Sedan";
                        rate = 18;
                        break;
                    case 3:
                        cabtype = "SUV";
                        rate = 25;
                        break;
                    default:
                        System.out.println("Invalid!");
                        continue;
                }
                System.out.println("\nChoose Route:");
                System.out.println("1.Pune Station to Shivajinagar (5 km)");
                System.out.println("2.Swargate to Kothrud (8 km)");
                System.out.println("3.Hinjawadi to Wakad (10 km)");
                System.out.print("Enter route choice: ");
                int routech = sc.nextInt();
                String src = "";
                String dest = "";
                int dist = 0;
                switch (routech) {
                    case 1:
                        src = "Pune Station";
                        dest = "Shivajinagar";
                        dist = 5;
                        break;
                    case 2:
                        src = "Swargate";
                        dest = "Kothrud";
                        dist = 8;
                        break;
                    case 3:
                        src = "Hinjawadi";
                        dest = "Wakad";
                        dist = 10;
                        break;
                    default:
                        System.out.println("Invalid route choice!");
                        continue;
                }
                int total = dist * rate;
                System.out.println("\n===== FARE DETAILS =====");
                System.out.println("Cab Type : " + cabtype);
                System.out.println("Source : " + src);
                System.out.println("Destination : " + dest);
                System.out.println("Distance : " + dist + " km");
                System.out.println("Rate : ₹" + rate + " per km");
                System.out.println("Total : ₹" + total);
                System.out.println("\n1. Confirm & Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter choice: ");
                int confirmchoice = sc.nextInt();
                if (confirmchoice == 2) {
                    System.out.println("Ride cancelled successfully.");
                    continue;
                } else if (confirmchoice == 1) {
                    int otp = 1000 + rand.nextInt(9000);
                    System.out.println("\nBooking Confirmed!");
                    System.out.println("Your OTP is: " + otp);
                    System.out.println("OTP shared successfully.");
                    System.out.println("Cancellation is not allowed after OTP sharing.");
                } else {
                    System.out.println("Invalid choice!");
                }
            } else if (ch == 2) {
                System.out.println("Thank you for using Cab Booking Chatbot!");
                break;
            } else {
                System.out.println("Invalid menu choice! Please try again.");
            }
        }
    }
}