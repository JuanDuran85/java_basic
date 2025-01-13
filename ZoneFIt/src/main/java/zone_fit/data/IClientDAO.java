package zone_fit.data;

import zone_fit.domain.Client;

import java.util.List;

public interface IClientDAO {
    public List<Client> listClients();
    public boolean getClientById(Client client);
    public boolean addClient(Client client);
    public boolean updateClient(Client client);
    public boolean deleteClient(Client client);
}
