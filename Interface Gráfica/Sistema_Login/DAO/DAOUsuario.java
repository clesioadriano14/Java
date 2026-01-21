/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0082957
 */
public class DAOUsuario {
    
    public boolean verificarLogin(String email, String senha){
        
        Connection conn = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean verificacao = false;
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM USUARIO WHERE EMAIL_USUARIO = ? AND SENHA_USUARIO = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                verificacao = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro de busca", e);
        } finally {
            Conexao.closeConnection(conn, stmt, rs);
        }
        return verificacao;
    }
}
