import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static List<Customer> getCustomerList() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("이영주", 0L, 1L));
        customers.add(new Customer("이종찬", 2L, 12L));
        customers.add(new Customer("장호윤", 5L, 5L));
        customers.add(new Customer("문찬욱", 6L, 6L));
        customers.add(new Customer("김찬규", 7L, 3L));
        customers.add(new Customer("손민우", 9L, 1L));
        customers.add(new Customer("송예진", 10L, 3L));

        return customers;
    }
}
