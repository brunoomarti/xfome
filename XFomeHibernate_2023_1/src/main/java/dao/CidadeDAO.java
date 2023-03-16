/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cidade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1547816
 */
public class CidadeDAO {
    
    
    public List<Cidade> listar() throws ClassNotFoundException, SQLException {
        
        List<Cidade> lista = new ArrayList();
        Statement stmt = ConexaoMySQL.obterConexao().createStatement();
        String sql = "SELECT * FROM Cidade";
        
        ResultSet res = stmt.executeQuery(sql);
        
        // Registros em Objetos
        while ( res.next() ) {
            int id = res.getInt("idCidade");
            String nome = res.getString("nomeCidade");
            
            Cidade cid = new Cidade(id,nome);
            lista.add(cid);
        }
        
        return lista;
    }
    
    
}
