import entities.Gato;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExemplo {
    private static final String DATA_BASE_URL = "jdbc:mysql://127.0.0.1:3306/db_PET";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root1234";

    private static final String SELECT_GATOS = "SELECT * FROM tb_gatos";

    private static final String INSERT_GATO = "INSERT INTO TB_GATOS (NOME, DATANASCIMENTO, DONO) VALUES (?, ?, ?)";

    public static void main (String[] args){

        List<Gato> gatos = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(DATA_BASE_URL, USER_NAME, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_GATOS);
            ResultSet rs = preparedStatement.executeQuery();

            preparedStatement = conn.prepareStatement(INSERT_GATO);
            preparedStatement.setString(1, "Cookie");
            preparedStatement.setDate(2, java.sql.Date.valueOf("2020-04-23"));
            preparedStatement.setString(3, "Maria");

            int row = preparedStatement.executeUpdate();

            System.out.println(row);

            while (rs.next()){
                Gato gato = new Gato();
                gato.setId(rs.getLong("ID"));
                gato.setNome(rs.getString("NOME"));
               //gato.setIdDono(rs.getString("DONO"));
                gato.setDatanascimento(rs.getDate("DATANASCIMENTO"));
                gatos.add(gato);
            }

//            gatos.forEach(System.out::println);
//
//            var teste = gatos.stream().filter(var -> var.getNome().equals("yuki")).findFirst().get().getId();
//            System.out.println("O ID da yuki é: " + teste);

        } catch (Exception e) {
            System.out.println("Deu ruim.");
            e.printStackTrace();
        }
    }
}
