public class OrderPending implements ShoppingOrderState{

    private String name = "State Pending";
    private ShoppingOrder order;

    public OrderPending(ShoppingOrder order){
        this.order = order;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void approvePayment(ShoppingOrder order) {
        order.setState(new OrderApproved(order));
    }

    @Override
    public void rejectPayment(ShoppingOrder order) {

    }

    @Override
    public void waitPayment(ShoppingOrder order) {
        System.out.println("O pedido já esta no estado de pagamento pendente");
    }

    @Override
    public void shipOrder(ShoppingOrder order) {

    }
}
