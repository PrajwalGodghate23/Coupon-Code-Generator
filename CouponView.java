// CouponView.java
import java.util.Scanner;

public class CouponView {
    private Scanner scanner;

    public CouponView() {
        scanner = new Scanner(System.in);
    }

    public String getUserType() {
        System.out.println("Enter your user type:");
        System.out.println("1. Daily Customer");
        System.out.println("2. New User");
        System.out.println("3. Special User");
        System.out.print("Enter choice (1, 2, 3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1: return "Daily Customer";
            case 2: return "New User";
            case 3: return "Special User";
            default:
                System.out.println("Invalid choice. Defaulting to Daily Customer.");
                return "Daily Customer";
        }
    }

    public void displayCoupon(String couponCode, int discount) {
        System.out.println("Generated Coupon Code: " + couponCode);
        System.out.println("Discount Applied: " + discount + "%");
    }
}