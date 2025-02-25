package sb.zone_fit_sb.service;

import sb.zone_fit_sb.model.Client;

import java.util.List;

public interface IClientService {
    public List<Client> findAllClient();
    public Client findClientById(Integer idClient);
    public void updateOrSaveClient(Client client);
    public void deleteClient(Client client);
}
