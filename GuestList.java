import java.util.Scanner;

public class GuestList {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addGuest();
            }
            else if (option == 2) {
                removeGuest();
            }
            else if (option == 3) {
                break;
            }
        } while (true);

        System.out.println("Exiting...");

    }
    static void displayGuests() {
        System.out.println("----------------------------");
        System.out.println("- Guests -");
        System.out.println();
        if (guests[0] == null){
            System.out.println("Guest list is empty.");
        }
        for (int i = 0; i < guests.length && guests[i] != null; i++) {
            System.out.print(i+1 + ". ");
            System.out.println(guests[i]);
        }
    }
    static void displayMenu() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("- Menu -");
        System.out.println();
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");

    }

    static int getOption () {
        System.out.print("Option:");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }
    static void addGuest(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print ("Name: ");
                String name = scanner.next();
                guests [i] = name;
                break;
            }
        }
    }
    static void removeGuest(){
        System.out.print("Guest number: ");
        int guestNumber = scanner.nextInt();
        if (guestNumber >= 1 && guestNumber <=10 && guests[guestNumber-1] != null) {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && (i + 1) == guestNumber) {
                guests[i] = null;
                break;
            }
        }
        }
        else {
            System.out.println("\nError: there is no guest with that number.");
        }

        String[] temp = new String [guests.length];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null){
                temp[ti] = guests[i];
                ti++;
            }
        }
        guests = temp;
    }
    static void insertTestNames(){
        guests[0] = "patryk";
        guests[1] = "marta";
        guests[2] = "tomek";
        guests[3] = "piotr";
        guests[4] = "kasia";

    }
}