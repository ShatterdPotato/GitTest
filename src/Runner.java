import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner scan = new Scanner(System.in);
        boolean isFriday;
        boolean isWeekend;

        System.out.print("What day is it today?: ");
        String answer = scan.nextLine();

        isFriday = answer.equalsIgnoreCase("friday");

        System.out.println(isFriday);

        if (!isFriday) {
            System.out.print("Is it the weekend?: ");
            String answer2 = scan.nextLine();
            isWeekend = answer2.equalsIgnoreCase("yes");
        }
    }
}
