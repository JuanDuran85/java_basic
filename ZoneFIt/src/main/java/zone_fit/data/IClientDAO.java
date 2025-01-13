package zone_fit.data;

import java.util.List;

import zone_fit.domain.Client;

public interface IClientDAO {

    public List<Client> listClients();

    public boolean getClientById(Client client);

    public boolean addClient(Client client);

    public boolean updateClient(Client client);

    public boolean deleteClient(Client client);
}
