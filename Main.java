// Main.java
public class Main {
    public static void main(String[] args) {
        CouponModel model = new CouponModel();
        CouponView view = new CouponView();
        CouponController controller = new CouponController(model, view);

        controller.generateCouponForUser();
    }
}