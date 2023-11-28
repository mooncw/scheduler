import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FIFO implements Comparator<Customer>, SchedulerPolicy {

    @Override
    public int compare(Customer c1, Customer c2) {
        if (c1.getArrivalTime() > c2.getArrivalTime())
            return 1;
        else if (c1.getArrivalTime() < c2.getArrivalTime())
            return -1;
        return 0;
    }

    @Override
    public PriorityQueue<Customer> createQueue() {
        PriorityQueue<Customer> queue = new PriorityQueue<>(new FIFO());

        List<Customer> customers = CustomerList.getCustomerList();

        for (Customer customer : customers) {
            queue.add(customer);
        }

        return queue;
    }

}
