import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("스케줄링 정책을 선택해주세요.");

            String key = scanner.nextLine();

            if (key.equals("F")) {

                System.out.println("FIFO 스케줄링");
                PrintSchedule.print(new FIFO().createQueue());

            }

            if (key.equals("S")) {

                System.out.println("SJF 스케줄링");
                PrintSchedule.print(new SJF().createQueue());

            }

            if (key.equals("Q")) {
                System.out.println("종료");
                break;
            }
        }
    }
}
