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

@SpringBootApplication
public class ZoneFitSbApplication implements CommandLineRunner {

	@Autowired
	private IClientService clientService;

	private static final Logger logger = LoggerFactory.getLogger(ZoneFitSbApplication.class);
	private final String Nl = System.lineSeparator();

	public static void main(String[] args) {
		// spring boot application started
		logger.info("------- ZoneFitSbApplication started successfully.");
		// Start the Spring Boot application, which will run the application
		SpringApplication.run(ZoneFitSbApplication.class, args);
		logger.info("------- ZoneFitSbApplication ended successfully.");
	}

	@Override
	public void run(String... args) throws Exception {
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
				logger.info("{}", Nl);
			} catch (Exception e) {
				logger.error("Error: ", e);
			} finally {
				logger.info("{}", Nl);
			}
		}
	}

	private boolean menuOptionExecution(int option, Scanner console) {
		boolean exitMenu = false;
		switch (option) {
			case 1 -> showAllClients();
			case 6 -> {
				logger.info("Exit the application...");
				return true;
			}
			default -> logger.warn("Invalid option, please try again.");
		}
		return exitMenu;
	}

	private void showAllClients() {
		logger.info("\nList of Clients:\n");
		List<Client> resultClientList = clientService.findAllClient();
		resultClientList.forEach(client -> logger.info(client.toString()));
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
}
