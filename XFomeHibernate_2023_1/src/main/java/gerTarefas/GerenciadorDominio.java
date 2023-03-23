/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerTarefas;

import dao.CidadeDAO;
import dao.ClienteDAO;
import dao.ConexaoMySQL;
import dominio.Cidade;
import dominio.Cliente;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 1547816
 */
public class GerenciadorDominio {

    ClienteDAO cliDao = null;
    CidadeDAO cidDao = null;
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // TESTE
        ConexaoMySQL.obterConexao();
        
        cidDao = new CidadeDAO();
        cliDao = new ClienteDAO();
    }
    
    public List<Cidade> listarCidades() throws ClassNotFoundException, SQLException {
        
        return cidDao.listar();
        
    }
    
    public int inserirCliente (String nome, String cpf, Date dtNasc, char sexo, String cep, String ender, String bairro, int num, String complemento, String referencia, String telFixo, String celular, String email, byte[] foto, Cidade cidade) throws ClassNotFoundException, SQLException {
        Cliente cli = new Cliente(nome, cpf, dtNasc, sexo, cep, ender,  bairro, num, complemento, referencia, telFixo, celular, email, foto, cidade);
        int id = cliDao.inserir(cli);
        return id;
    }
    
    
    
}
