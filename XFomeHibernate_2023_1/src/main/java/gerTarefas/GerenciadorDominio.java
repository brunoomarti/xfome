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
import javax.swing.Icon;

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
    
   
    public void alterarCliente(Cliente cli, String nome, String cpf, Date dtNasc, char sexo, String cep, String ender, String bairro, int num, String complemento, String referencia, String telFixo, String celular, String email, byte[] foto, Cidade cidade) throws ClassNotFoundException, SQLException   {

            cli.setNome(nome);
            cli.setCpf(cpf);
            cli.setDtNasc(dtNasc);
            cli.setSexo(sexo);
            cli.setCep(cep);
            cli.setEndereco(ender);
            cli.setNum(num);
            cli.setComplemento(complemento);
            cli.setBairro(bairro);
            cli.setReferencia(referencia);
            cli.setTelFixo(telFixo);
            cli.setCelular(celular);
            cli.setEmail(email);
            cli.setFoto( foto );
            cli.setCidade(cidade);
            
            cliDao.alterar(cli);        
    }
    
    
    public List<Cliente> pesquisarCliente (String pesq, int tipo) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = null;
        switch (tipo) {
            case 0: lista = cliDao.pesquisarNome(pesq); break;

            case 1: lista = cliDao.pesquisarBairro(pesq); break;

            case 2: lista = cliDao.pesquisarMes(pesq); break;
            
            case 3: lista = cliDao.pesquisarCPF(pesq); break;
        }
        return lista;
        
    }
    
    public void excluirCliente (Cliente cli) throws ClassNotFoundException, SQLException {
        cliDao.excluir(cli);
    }
    
    
}
