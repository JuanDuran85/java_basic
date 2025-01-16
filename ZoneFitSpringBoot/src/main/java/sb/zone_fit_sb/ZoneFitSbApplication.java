package sb.zone_fit_sb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sb.zone_fit_sb.service.IClientService;

@SpringBootApplication
public class ZoneFitSbApplication implements CommandLineRunner {

	@Autowired
	private IClientService clientService;

	private static final Logger logger = LoggerFactory.getLogger(ZoneFitSbApplication.class);

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
	}
}
