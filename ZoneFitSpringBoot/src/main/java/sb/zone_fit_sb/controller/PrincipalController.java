package sb.zone_fit_sb.controller;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
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

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
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
            logger.error("Error to get: {}", ex.getMessage());
        }
    }

    public void addClient() {
        try {
            this.selectedClient = new Client();
        } catch (Exception ex) {
            logger.error("Error to add: {}", ex.getMessage());
        }
    }

    public void saveClient() {
        try {
            logger.info("Client to save: {}", this.selectedClient);
            // adding client
            if(this.selectedClient.getId() == null) {
                this.clientService.updateOrSaveClient(this.selectedClient);
                this.client.add(this.selectedClient);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Client added successfully"));
            } else {
                this.clientService.updateOrSaveClient(this.selectedClient);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Client updated successfully"));
            }
            // hiding modal window
            PrimeFaces.current().executeScript("PF('modalClientWindow').hide();");
            // partial updating table with ajax
            PrimeFaces.current().ajax().update("client-form:growlMsg", "client-form:table-clients");
            this.selectedClient = null;
        } catch (Exception ex) {
            logger.error("Error to save: {}", ex.getMessage());
        }
    }

    public void deleteClient() {
        logger.info("Client to delete: {}", this.selectedClient);
        this.clientService.deleteClient(this.selectedClient);
        this.client.remove(this.selectedClient);
        this.selectedClient = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Client deleted successfully"));
        PrimeFaces.current().ajax().update("client-form:growlMsg", "client-form:table-clients");
    }
}
