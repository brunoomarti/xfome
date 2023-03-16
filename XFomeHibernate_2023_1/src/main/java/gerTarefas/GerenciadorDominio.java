/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerTarefas;

import dao.CidadeDAO;
import dao.ConexaoMySQL;
import dominio.Cidade;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 1547816
 */
public class GerenciadorDominio {

    //ClienteDAO cliDao = null;
    CidadeDAO cidDao = null;
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        ConexaoMySQL.obterConexao();
        
        cidDao = new CidadeDAO();
        //cliDao = new ClienteDAO();
    }
    
    public List<Cidade> listarCidades() throws ClassNotFoundException, SQLException {
        
        return cidDao.listar();
        
    }
    
    
}
