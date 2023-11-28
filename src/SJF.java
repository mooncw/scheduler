import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SJF implements Comparator<Customer>, SchedulerPolicy {
    @Override
    public int compare(Customer c1, Customer c2) {
        if (c1.getRepairTime().equals(c2.getRepairTime())) {
            // 첫 번째 우선순위가 같다면 두 번째 우선순위인 repairTime으로 비교
            if (c1.getArrivalTime() > c2.getArrivalTime()) {
                return 1;
            } else if (c1.getArrivalTime() < c2.getArrivalTime()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            // 첫 번째 우선순위인 arrivalTime으로 비교
            if (c1.getRepairTime() > c2.getRepairTime()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public PriorityQueue<Customer> createQueue() {
        PriorityQueue<Customer> queue = new PriorityQueue<>(new SJF());

        List<Customer> customers = CustomerList.getCustomerList();

        for (Customer customer : customers) {
            queue.add(customer);
        }

        return queue;
    }
}
