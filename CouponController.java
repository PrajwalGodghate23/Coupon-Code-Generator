// CouponController.java
public class CouponController {
    private CouponModel model;
    private CouponView view;

    public CouponController(CouponModel model, CouponView view) {
        this.model = model;
        this.view = view;
    }

    public void generateCouponForUser() {
        String userType = view.getUserType();
        int discount = model.getDiscountPercentage(userType);
        String couponCode = model.generateCouponCode();
        view.displayCoupon(couponCode, discount);
    }
}