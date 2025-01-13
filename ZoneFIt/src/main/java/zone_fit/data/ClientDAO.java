package zone_fit.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zone_fit.connection.Connection.getConexion;
import zone_fit.domain.Client;

public class ClientDAO implements IClientDAO {

    @Override
    public List<Client> listClients() {
        List<Client> clients = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = getConexion();
        String sql = "SELECT * FROM clients ORDER BY id";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setLastName(rs.getString("last_name"));
                client.setMembershipId(rs.getInt("membership"));
                clients.add(client);
            }
        } catch (Exception e) {
            System.out.println("List Client Error: " + e.getMessage());
        } finally {
            try {
                connection.close();

            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }

        return clients;
    }

    @Override
    public boolean getClientById(Client client) {
        PreparedStatement ps;
        ResultSet rs;

        Connection connection = getConexion();
        String sql = "SELECT * FROM clients WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                client.setName(rs.getString("name"));
                client.setLastName(rs.getString("last_name"));
                client.setMembershipId(rs.getInt("membership"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Get Client Error: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection Error: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean addClient(Client client) {
        PreparedStatement ps;

        Connection connection = getConexion();
        String sql = "INSERT INTO clients (name, last_name, membership) VALUES (?, ?, ?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastName());
            ps.setInt(3, client.getMembershipId());
            ps.execute();

            return true;
        } catch (Exception e) {
            System.out.println("Add Client Error: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection Error: " + e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        PreparedStatement ps;
        Connection connection = getConexion();
        String sql = "UPDATE clients SET name = ?, last_name = ?, membership = ? WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastName());
            ps.setInt(3, client.getMembershipId());
            ps.setInt(4, client.getId());
            ps.execute();

            return true;
        } catch (Exception e) {
            System.out.println("Update Client Error: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection Error: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        PreparedStatement ps;
        Connection connection = getConexion();
        String sql = "DELETE FROM clients WHERE id = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Delete Client Error: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection Error: " + e.getMessage());
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Client List ---");
        IClientDAO clientDAO = new ClientDAO();
        clientDAO.listClients().forEach(System.out::println);

        Client clientOne = new Client(1);
        System.out.println("--- Get Client by ID: ---" + clientOne);
        boolean clientFound = clientDAO.getClientById(clientOne);
        if (clientFound) {
            System.out.println(clientOne);
        } else {
            System.out.println("Client not found");
        }

        Client clientTwo = new Client("Juan", "Perez", 134);
        System.out.println("--- Add Client ---" + clientTwo);
        boolean addingClient = clientDAO.addClient(clientTwo);
        if (addingClient) {
            System.out.println("Client added");
        } else {
            System.out.println("Client not added");
        }

        System.out.println("--- Client List ---");
        IClientDAO clientDAONew = new ClientDAO();
        clientDAONew.listClients().forEach(System.out::println);

        System.out.println("--- Update Client ---");
        Client updateClient = new Client(2, "Maria", "Medina", 150);
        boolean result = clientDAO.updateClient(updateClient);
        if (result) {
            System.out.println("Client updated");
        } else {
            System.out.println("Client not updated");
        }

        System.out.println("--- Client List ---");
        IClientDAO clientDAO3 = new ClientDAO();
        clientDAO3.listClients().forEach(System.out::println);
    }
}
