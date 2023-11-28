import java.util.PriorityQueue;

public interface SchedulerPolicy {
    PriorityQueue<Customer> createQueue();
}
