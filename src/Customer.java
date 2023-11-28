public class Customer {
    String name;
    Long arrivalTime;
    Long repairTime;

    public Customer(String name, Long arrivalTime, Long repairTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.repairTime = repairTime;
    }

    public String getName() {
        return name;
    }

    public Long getArrivalTime() {
        return arrivalTime;
    }

    public Long getRepairTime() {
        return repairTime;
    }
}
