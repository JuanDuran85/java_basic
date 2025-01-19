package sb.zone_fit_sb.controller;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sb.zone_fit_sb.model.Client;
import sb.zone_fit_sb.service.IClientService;
import org.slf4j.Logger;

import java.util.List;

@Component
@Data
@ViewScoped
public class PrincipalController {

    @Autowired
    IClientService clientService;
    private List<Client> client;
    private Client selectedClient;
    private static final Logger logger = LoggerFactory.getLogger(PrincipalController.class);

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    @PostConstruct
    public void init() {
        getData();
    }

    private void getData() {
        try {
            this.client = clientService.findAllClient();
            this.client.forEach(clientOneByOne -> logger.info("Client: {}", clientOneByOne));
        } catch (Exception ex) {
            logger.error("Error: {}", ex.getMessage());
        }
    }

    public void addClient(){
        try {
            this.selectedClient = new Client();
        } catch (Exception ex) {
            logger.error("Error: {}", ex.getMessage());
        }
    }

}
