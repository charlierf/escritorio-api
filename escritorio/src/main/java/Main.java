import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String jdbcUrl = "jdbc:postgresql://database-1.crxdlwnqbyhu.us-east-1.rds.amazonaws.com/postgres?currentSchema=escritorio";
        String username = "charlie";
        String password = "teste123";

        try {
            Class.forName("org.postgresql.Driver"); // Carrega o driver do PostgreSQL
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Inserção (POST) de um usuário
            postPessoa(connection, "123456789", "Rua dos Bobos, nº 0", "7894561230", "baby@shark.com", "João", "da Silva");

            // Consulta (GET) de usuários
            getUsers(connection);

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void postPessoa(Connection connection, String cpfCnpj, String endereco, String telefone, String email, String nome, String sobrenome) throws SQLException {
        String query = "INSERT INTO escritorio.pessoa (cpf_cnpj, endereco, telefone, email, nome, sobrenome) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, cpfCnpj);
        preparedStatement.setString(2, endereco);
        preparedStatement.setString(3, telefone);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, nome);
        preparedStatement.setString(6, sobrenome);
        preparedStatement.executeUpdate();
        System.out.println("Pessoa inserida com sucesso.");
    }

    private static void getUsers(Connection connection) throws SQLException {
        String query = "SELECT * FROM escritorio.pessoa";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String cpfCnpj = resultSet.getString("cpf_cnpj");
            String endereco = resultSet.getString("endereco");
            String telefone = resultSet.getString("telefone");
            String email = resultSet.getString("email");
            String nome = resultSet.getString("nome");
            String sobrenome = resultSet.getString("sobrenome");
            System.out.println("CPF/CNPJ: " + cpfCnpj + ", Endereço: " + endereco + ", Telefone(s): " + telefone + ", E-mail(s): " + email + ", Nome: " + nome + ", Sobrenome: " + sobrenome);
        }

        resultSet.close();
        statement.close();
    }
}
