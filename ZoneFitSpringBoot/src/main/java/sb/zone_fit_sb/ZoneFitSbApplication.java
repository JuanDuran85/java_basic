package sb.zone_fit_sb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sb.zone_fit_sb.model.Client;
import sb.zone_fit_sb.service.IClientService;

import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class ZoneFitSbApplication implements CommandLineRunner {

	@Autowired
	private IClientService clientService;

	private static final Logger logger = LoggerFactory.getLogger(ZoneFitSbApplication.class);
	private final String nL = System.lineSeparator();

	public ZoneFitSbApplication(IClientService clientService) {
		this.clientService = clientService;
	}

	public static void main(String[] args) {
		// spring boot application started
		logger.info("------- ZoneFitSbApplication started successfully.");
		// Start the Spring Boot application, which will run the application
		SpringApplication.run(ZoneFitSbApplication.class, args);
		logger.info("------- ZoneFitSbApplication ended successfully.");
	}

	@Override
	public void run(String... args) {
		logger.info("---------// ZoneFitSbApplication //---------.");
		zoneFitSb();
	}

	private void zoneFitSb() {
		boolean exit = false;
		Scanner console = new Scanner(System.in);

		while (!exit){
			try {
				int option = showMenu(console);
				exit = menuOptionExecution(option, console);
				logger.info("{}", nL);
			} catch (Exception e) {
				logger.error("Error: ", e);
			} finally {
				logger.info("{}", nL);
			}
		}
	}

	private boolean menuOptionExecution(int option, Scanner console) {
		boolean exitMenu = false;
		switch (option) {
			case 1 -> showAllClients();
			case 2 -> addClient(console);
			case 3 -> updateClient(console);
			case 4 -> deleteClient(console);
			case 5 -> getClientById(console);
			case 6 -> {
				logger.info("Exit the application...");
				return true;
			}
			default -> logger.warn("Invalid option, please try again.");
		}
		return exitMenu;
	}

	private void deleteClient(Scanner console) {
		logger.info("\n-------Delete one Client-------\n");
        logger.info("Enter the ID of the client to delete: ");
        Integer idClient = Integer.parseInt(console.next());
        Client clientFound = clientService.findClientById(idClient);

        if(clientFound!= null) {
            clientService.deleteClient(clientFound);
            logger.info("Client deleted: {}", clientFound);
        } else {
            logger.info("Client not found with ID, cannot be deleted: {}", idClient);
        }
	}

	private void updateClient(Scanner console) {
		logger.info("\n-------Update one Client-------\n");
		logger.info("Enter the ID of the client to find: ");
		Integer idClient = Integer.parseInt(console.next());
		Client clientFound = clientService.findClientById(idClient);

		if(clientFound != null) {
			logger.info("Enter the new name of the client: ");
			String name = console.next();
			logger.info("Enter the new last name of the client: ");
			String lastName = console.next();
			logger.info("Enter the new membership ID of the client: ");
			Integer membershipId = Integer.parseInt(console.next());
			Client client = new Client();
			client.setId(idClient);
			client.setName(name);
			client.setLastName(lastName);
			client.setMembershipId(membershipId);
			clientService.updateOrSaveClient(client);
			logger.info("Client updated: {}", client);
		} else {
			logger.info("Client not found with ID: {}", idClient);
		}
	}

	private int showMenu(Scanner console) {
		logger.info("\nOptions Menu: \n");
		logger.info("""
		1. Show Clients
		2. Add Client
		3. Update Client
		4. Delete Client
		5. Get Client by ID
		6. Exit
		Choose an option:\s""");
		return Integer.parseInt(console.next());
	}

	private void showAllClients() {
		logger.info("\n-------List of Clients-------\n");
		List<Client> resultClientList = clientService.findAllClient();
		resultClientList.forEach(client -> logger.info("{}\n",client));
	}

	private void addClient(Scanner console) {
		logger.info("\n-------Add one Client-------\n");
		logger.info("Enter the name of the client: ");
		String name = console.next();
		logger.info("Enter the last name of the client: ");
		String lastName = console.next();
		logger.info("Enter the membership ID of the client: ");
		Integer membershipId = Integer.parseInt(console.next());
		Client client = new Client();
		client.setName(name);
		client.setLastName(lastName);
		client.setMembershipId(membershipId);
		clientService.updateOrSaveClient(client);
		logger.info("Client added: {}", client);
	}

	private void getClientById(Scanner console) {
		logger.info("\n-------Get Client by ID-------\n");
		logger.info("Enter the ID of the client: ");
		Integer idClient = Integer.parseInt(console.next());
		Client client = clientService.findClientById(idClient);
		logger.info("Client found: {}", client);
	}
}
