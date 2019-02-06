package Structural.Facade;

public class OrderFulfillmentControllerTest {

    public static void main(String[] args) {
        testOrderProduct();
    }

    private static void testOrderProduct() {
        OrderFulfillmentController controller=new OrderFulfillmentController();
        controller.facade=new OrderServiceFacadeImpl();
        controller.orderProduct(9);
    }
}
