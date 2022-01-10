public class OrderApproved implements ShoppingOrderState{

    private String name = "State Approve";
    private ShoppingOrder order;

    public OrderApproved(ShoppingOrder order){
        this.order = order;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void approvePayment(ShoppingOrder order) {
        System.out.println("O tentativa de aprovar o pagamento, mas o mesmo já estava aprovado");
    }

    @Override
    public void rejectPayment(ShoppingOrder order) {
        order.setState(new OrderRejected(order));
    }

    @Override
    public void waitPayment(ShoppingOrder order) {
        order.setState(new OrderPending(order));
    }

    @Override
    public void shipOrder(ShoppingOrder order) {

    }
}
