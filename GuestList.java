import java.util.Scanner;

public class GuestList {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guests[0] = "patryk";
        guests[1] = "marta";
        guests[2] = "tomek";
        guests[3] = "piotr";
        guests[4] = "kasia";
        guests[5] = "monika";
        guests[6] = "robert";
        guests[7] = "magda";
        guests[8] = "artur";
        guests[9] = "paulina";



        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print ("Name: ");
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
        for (int i = 0; i < guests.length; i++) {
            System.out.print(i+1 + ". ");
            System.out.println(guests[i] == null ? "--" : guests[i]);
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
}
