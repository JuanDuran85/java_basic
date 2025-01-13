package zone_fit.data;

import zone_fit.conexion.Conexion;
import zone_fit.domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zone_fit.conexion.Conexion.getConexion;

public class ClientDAO implements IClientDAO{
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
            while(rs.next()){
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
        return false;
    }

    @Override
    public boolean addClient(Client client) {
        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Client List ---");
        IClientDAO clientDAO = new ClientDAO();
        clientDAO.listClients().forEach(System.out::println);
    }
}
