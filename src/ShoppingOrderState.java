public interface ShoppingOrderState {

    public String getName();
    public void approvePayment(ShoppingOrder order);
    public void rejectPayment(ShoppingOrder order);
    public void waitPayment(ShoppingOrder order);
    public void shipOrder(ShoppingOrder order);
}
