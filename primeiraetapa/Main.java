import java.sql.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String jdbcUrl = "jdbc:postgresql://database-1.crxdlwnqbyhu.us-east-1.rds.amazonaws.com/teste";
        String username = "charlie";
        String password = "teste123";

        try {
            Class.forName("org.postgresql.Driver"); // Carrega o driver do PostgreSQL
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Inserção (POST) de um usuário
            insertUser(connection, 123456789, "João da Silva", new Date(1990, 5, 15));

            // Consulta (GET) de usuários
            getUsers(connection);

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void insertUser(Connection connection, int cpf, String nome, Date dataNascimento) throws SQLException {
        String query = "INSERT INTO teste.usuario (cpf, nome, data_nascimento) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, cpf);
        preparedStatement.setString(2, nome);
        preparedStatement.setDate(3, new java.sql.Date(dataNascimento.getTime()));
        preparedStatement.executeUpdate();
        System.out.println("Usuário inserido com sucesso.");
    }

    private static void getUsers(Connection connection) throws SQLException {
        String query = "SELECT * FROM teste.usuario";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int cpf = resultSet.getInt("cpf");
            String nome = resultSet.getString("nome");
            Date dataNascimento = resultSet.getDate("data_nascimento");
            System.out.println("CPF: " + cpf + ", Nome: " + nome + ", Data de Nascimento: " + dataNascimento);
        }

        resultSet.close();
        statement.close();
    }
}
