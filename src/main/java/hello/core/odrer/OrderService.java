package hello.core.odrer;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
