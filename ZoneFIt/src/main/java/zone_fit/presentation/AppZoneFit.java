package zone_fit.presentation;

import java.util.List;
import java.util.Scanner;

import zone_fit.data.ClientDAO;
import zone_fit.data.IClientDAO;
import zone_fit.domain.Client;

public class AppZoneFit {

    public static void main(String[] args) {
        System.out.println("*** Welcome to ZoneFit! ***");
        menuZoneFit();
    }

    private static void menuZoneFit() {
        System.out.println(" --- Options Menu ---");
        boolean exit = false;
        Scanner console = new Scanner(System.in);
        IClientDAO clientDaoObject = new ClientDAO();

        while (!exit) {
            try {
                int option = showMenu(console);
                exit = menuOptionExecution(option, console, clientDaoObject);
            } catch (Exception e) {
                System.out.println("Invalid option. Please try again.");
            } finally {
                System.out.println();
            }
        }
    }

    private static boolean menuOptionExecution(int option, Scanner console, IClientDAO clientDaoObject) {
        boolean exitMenu = false;
        switch (option) {
            case 1 ->
                showAllClients(clientDaoObject);
            case 2 ->
                addClient(clientDaoObject, console);
            case 3 ->
                updateClient(clientDaoObject, console);
            case 4 ->
                deleteClient(clientDaoObject, console);
            case 5 ->
                getClientById(clientDaoObject, console);
            case 6 -> {
                System.out.println("Good bye!");
                return true;
            }
            default ->
                System.out.println("Invalid option. Please try again.");
        }
        return exitMenu;
    }

    private static void updateClient(IClientDAO clientDaoObject, Scanner console) {
        System.out.println(" --- Update Client --- ");
        System.out.print("Enter the client ID to update: ");
        int idToUpdate = Integer.parseInt(console.next());
        System.out.print("Enter the new name: ");
        String newName = console.next();
        System.out.print("Enter the new last name: ");
        String lastName = console.next();
        System.out.print("Enter the new membership ID: ");
        int newMembershipId = Integer.parseInt(console.next());
        Client clientToUpdate = new Client(idToUpdate, newName, lastName, newMembershipId);
        boolean resultUpdateClient = clientDaoObject.updateClient(clientToUpdate);
        if (resultUpdateClient) {
            System.out.println("Client updated successfully: " + clientToUpdate);
        } else {
            System.out.println("Error updating client: " + clientToUpdate);
        }
    }

    private static void deleteClient(IClientDAO clientDaoObject, Scanner console) {
        System.out.println(" --- Delete Client --- ");
        System.out.print("Enter the client ID to delete: ");
        int idInputToDelte = Integer.parseInt(console.next());
        Client clientToDelete = new Client(idInputToDelte);
        boolean resultDeleteClient = clientDaoObject.deleteClient(clientToDelete);
        if (resultDeleteClient) {
            System.out.println("Client deleted successfully: " + clientToDelete);
        } else {
            System.out.println("Error deleting client: " + clientToDelete);
        }
    }

    private static void getClientById(IClientDAO clientDaoObject, Scanner console) {
        System.out.println(" --- Get Client by ID --- ");
        System.out.print("Enter the client ID: ");
        int id = Integer.parseInt(console.next());
        Client clientToFind = new Client(id);
        boolean clientFound = clientDaoObject.getClientById(clientToFind);
        if (clientFound) {
            System.out.println("Client found: " + clientToFind);
        } else {
            System.out.println("Client not found: " + clientToFind);
        }
    }

    private static void addClient(IClientDAO clientDaoObject, Scanner console) {
        System.out.println(" --- Add Client --- ");
        System.out.print("Enter the name: ");
        String name = console.next();
        System.out.print("Enter the last name: ");
        String lastName = console.next();
        System.out.print("Enter the membership ID: ");
        int memberId = Integer.parseInt(console.next());
        Client clientToAdd = new Client(name, lastName, memberId);
        boolean resultAddClient = clientDaoObject.addClient(clientToAdd);
        if (resultAddClient) {
            System.out.println("Client added successfully: " + clientToAdd);
        } else {
            System.out.println("Error adding client: " + clientToAdd);
        }
    }

    private static void showAllClients(IClientDAO clientDaoObject) {
        System.out.println(" --- All Clients Available --- ");
        List<Client> resultListClients = clientDaoObject.listClients();
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
        return Integer.parseInt(console.next());
    }
}
