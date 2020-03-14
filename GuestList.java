import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("----------------------------");
            System.out.println("- Guests -");
            System.out.println();
            for (int i = 0; i < guests.length; i++) {
                System.out.println(guests[i] == null ? "--" : guests[i]);
            }
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("- Menu -");
            System.out.println();
            System.out.println("1 - Add Guest");
            System.out.println("2 - Remove Guest");
            System.out.println("3 - Exit");
            System.out.print("Option:");
            int option = scanner.nextInt();
            System.out.println();




            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out. print ("Name: ");
                        String name = scanner.next();
                        guests [i] = name;
                        break;
                    }
                }
            }
            else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if (option == 3) {
                break;
            }
        } while (true);

        System.out.println("Exiting...");

    }
}
