// CouponModel.java
import java.util.HashMap;
import java.util.Random;

public class CouponModel {
    private HashMap<String, Integer> userDiscounts;

    public CouponModel() {
        userDiscounts = new HashMap<>();
        userDiscounts.put("Daily Customer", 10);
        userDiscounts.put("New User", 15);
        userDiscounts.put("Special User", 20);
    }

    public int getDiscountPercentage(String userType) {
        return userDiscounts.getOrDefault(userType, 0);
    }

    public String generateCouponCode() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder coupon = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            coupon.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return coupon.toString();
    }
}