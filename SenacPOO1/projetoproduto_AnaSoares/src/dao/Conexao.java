package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection conexao;

    private final String URL="jdbc:mysql://localhost:3306/bdproduto";
    private final String USER="root";
    private final String PASSWORD="";

    public Conexao() throws SQLException {
        conexao = DriverManager.getConnection(URL,USER,PASSWORD);
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public String getURL() {
        return URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }


}
