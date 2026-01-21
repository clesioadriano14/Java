/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0082957
 */
public class Conexao {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/dblogin";
    private static final String USER = "root";
    private static final String PWD = "root";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PWD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro: Driver JDBC não encontrado. " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexao com banco de dados: " + e.getMessage());
        }

    }

    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
        if (conn != null) {
            try {
                conn.close();
                stmt.close();
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException("Não foi possível fechar a conexão", e);
            }
        }
    }
}
