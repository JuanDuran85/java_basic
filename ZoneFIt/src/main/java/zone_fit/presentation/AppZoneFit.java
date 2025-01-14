package zone_fit.presentation;

import zone_fit.data.ClientDAO;
import zone_fit.domain.Client;

import java.util.List;
import java.util.Scanner;

public class AppZoneFit {

    public static void main(String[] args) {
        System.out.println("*** Welcome to ZoneFit! ***");
        menuZoneFit();
    }

    private static void menuZoneFit() {
        System.out.println(" --- Options Menu ---");
        boolean exit = false;
        Scanner console = new Scanner(System.in);
        ClientDAO clienteDaoObject = new ClientDAO();

        while (!exit) {
            try {
                int option = showMenu(console);
                exit = menuOptionExecution(option, console, clienteDaoObject);
            } catch (Exception e) {
                System.out.println("Invalid option. Please try again.");
            } finally {
                System.out.println();
            }
        }
    }

    private static boolean menuOptionExecution(int option, Scanner console, ClientDAO clienteDaoObject) {
        boolean exitMenu = false;
        switch (option) {
            case 1 -> showAllClients(clienteDaoObject);
//            case 2: -> addClient(clienteDaoObject, console);
//            case 3: -> updateClient(clienteDaoObject, console);
//            case 4: -> deleteClient(clienteDaoObject, console);
//            case 5: -> getClientById(clienteDaoObject, console);
            case 6 -> {
                System.out.println("Good bye!");
                return true;
            }
            default -> System.out.println("Invalid option. Please try again.");
        }
    return exitMenu;
    }

    private static void showAllClients(ClientDAO clienteDaoObject) {
        System.out.println(" All Clients Available ");
        List<Client> resultListClients = clienteDaoObject.listClients();
        resultListClients.forEach(System.out::println);

    }

    private static int showMenu(Scanner console) {
        System.out.print("""
                1. Show Clients
                2. Add Client
                3. Update Client
                4. Delete Client
                5. Get Client by ID
                6. Exit
                Choose an option:\s""");
        return Integer.parseInt(console.nextLine());
    }
}
