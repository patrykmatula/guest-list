import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Display All Guests");
        System.out.println("2 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.print("Option:");
        int option = scanner.nextInt();

        if (option == 1) {
            for (int i = 0; i < guests.length; i++) {
                System.out.println(guests[i]);
            }
        }
    }
}
