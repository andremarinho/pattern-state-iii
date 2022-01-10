public class OrderRejected implements ShoppingOrderState{

    private String name;
    private ShoppingOrder order;

    public OrderRejected(ShoppingOrder order){
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
        System.out.println("O tentativa de rejeitar o pagamento, mas o mesmo já estava rejeitado");
    }

    @Override
    public void waitPayment(ShoppingOrder order) {
        System.out.println("O tentativa de colocar para o pagamento, mas o mesmo já estava rejeitado");
    }

    @Override
    public void shipOrder(ShoppingOrder order) {
        System.out.println("Não posso enviar um pedido que esta como rejeitado.");
    }
}
