import java.util.PriorityQueue;

public class PrintSchedule {
    public static void print(PriorityQueue<Customer> queue) {

                Long currentTime = 0L;
                Long totalWaitingTime = 0L;

                while (!queue.isEmpty()) {
                    Customer customer = queue.poll();
                    String name = customer.name;
                    Long arrivalTime = customer.arrivalTime;
                    Long repairTime = customer.repairTime;

                    Long waitingTime = Math.max(0L, currentTime - arrivalTime);
                    totalWaitingTime += waitingTime;
                    if (currentTime < arrivalTime) currentTime = arrivalTime;

                    System.out.println(name+ ", 도착시간: " +arrivalTime+"분, 소요시간: "+repairTime+"분, 서비스 시작시간: "
                                        +currentTime+"분, 기다린 시간: "+waitingTime+"분");

                    currentTime += repairTime;
                }

                System.out.println("총 기다린 시간: " + totalWaitingTime);

            }

            }

