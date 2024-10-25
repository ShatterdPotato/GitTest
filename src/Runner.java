import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner scan = new Scanner(System.in);
        boolean isFriday;

        System.out.print("What day is it today?: ");
        String answer = scan.nextLine();

        if (answer.toLowerCase().equals("friday")) {
            isFriday = true;
        }   else {
            isFriday = false;
        }

        System.out.println(isFriday);
    }
}
