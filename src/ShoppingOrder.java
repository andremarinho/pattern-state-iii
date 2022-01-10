public class ShoppingOrder {
    private ShoppingOrderState state;


    public ShoppingOrderState getState() {
        return state;
    }

    public void setState(ShoppingOrderState state) {
        this.state = state;
    }

    public String getName(){
        return this.state.getName();
    }

    public void paymentApprove(){
        this.state.approvePayment(this);
    }

    public void paymentReject(){
        this.state.rejectPayment(this);
    }

    public void paymentWait(){
        this.state.waitPayment(this);
    }

    public void ship(){
        this.state.shipOrder(this);
    }
}
