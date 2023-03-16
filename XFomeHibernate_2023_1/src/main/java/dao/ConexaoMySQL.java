/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1547816
 */
public class ConexaoMySQL {
    
    private static Connection conexao;
    
    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
        
            String servidor = "127.0.0.1:3306";
            String login = "root";
            String senha = "";
            String nomeBanco = "jeanxfome";
            String url = "jdbc:mysql://" + servidor + "/" + nomeBanco;
            
            // Definição do Driver do banco
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection( url , login, senha);
            return conexao;        
        
    }
    
    
}
