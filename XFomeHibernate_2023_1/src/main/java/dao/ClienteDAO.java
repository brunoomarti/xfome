/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cidade;
import dominio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author 1547816
 */
public class ClienteDAO {
    
    
    public int inserir(Cliente cli) throws ClassNotFoundException, SQLException {        
        
        String sql = "INSERT INTO Cliente (nome, cpf, dtNasc, sexo, cep, ender, "
                + "numero, complemento, bairro, referencia, telefone, celular, "
                + "email, foto, idCidade) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
        
        PreparedStatement pstmt = ConexaoMySQL.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS );
        
        int ind = 1;
        pstmt.setString(ind++, cli.getNome() );
        pstmt.setString(ind++, cli.getCpf() );
        pstmt.setDate(ind++, new java.sql.Date ( cli.getDtNasc().getTime() ) );       
        pstmt.setString(ind++, String.valueOf( cli.getSexo() ) );
        pstmt.setString(ind++, cli.getCep() );
        pstmt.setString(ind++, cli.getEndereco() );
        pstmt.setInt(ind++, cli.getNum() );
        pstmt.setString(ind++, cli.getComplemento() );
        pstmt.setString(ind++, cli.getBairro() );
        pstmt.setString(ind++, cli.getReferencia() );
        pstmt.setString(ind++, cli.getTelFixo() );
        pstmt.setString(ind++, cli.getCelular() );
        pstmt.setString(ind++, cli.getEmail() );
        pstmt.setBytes(ind++, cli.getFoto() );
        pstmt.setInt(ind++, cli.getCidade().getIdCidade() );
        
        pstmt.execute();
        
        int id = -1;
        ResultSet rs = pstmt.getGeneratedKeys();
        if ( rs.next() ) {
            id = rs.getInt(1);
        }
        
        return id;        
    }
    
    
    public void alterar(Cliente cli) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE Cliente SET nome=?, cpf=?, dtNasc=?, sexo=?, "
                + "cep=?, ender=?, numero=?, complemento=?, bairro=?, "
                + "referencia=?, telefone=?, celular=?, email=?, "
                + "foto=?, idCidade=? WHERE idCliente = " + cli.getIdCliente();
        
        PreparedStatement pstmt = ConexaoMySQL.obterConexao().prepareStatement(sql);
        
        int ind = 1;
        pstmt.setString(ind++, cli.getNome() );
        pstmt.setString(ind++, cli.getCpf() );
        pstmt.setDate(ind++, new java.sql.Date ( cli.getDtNasc().getTime() ) );       
        pstmt.setString(ind++, String.valueOf( cli.getSexo() ) );
        pstmt.setString(ind++, cli.getCep() );
        pstmt.setString(ind++, cli.getEndereco());
        pstmt.setInt(ind++, cli.getNum() );
        pstmt.setString(ind++, cli.getComplemento() );
        pstmt.setString(ind++, cli.getBairro() );
        pstmt.setString(ind++, cli.getReferencia() );
        pstmt.setString(ind++, cli.getTelFixo() );
        pstmt.setString(ind++, cli.getCelular() );
        pstmt.setString(ind++, cli.getEmail() );
        pstmt.setBytes(ind++, cli.getFoto() );
        pstmt.setInt(ind++, cli.getCidade().getIdCidade() );
        
        pstmt.execute();  
    }
    
    public void excluir(Cliente cli) throws ClassNotFoundException, SQLException {
        Statement stmt = ConexaoMySQL.obterConexao().createStatement();
        String sql = "DELETE FROM Cliente WHERE idCliente = " + cli.getIdCliente();
        stmt.execute(sql); 
    }
        
    
    private List<Cliente> pesquisar(String pesq, int tipo) throws ClassNotFoundException, SQLException {
        List<Cliente> lista = new ArrayList();
        
        Statement stmt = ConexaoMySQL.obterConexao().createStatement();
        String sql = "SELECT * FROM Cliente as cli, Cidade as cid WHERE cli.idCidade = cid.idCidade ";
        
        switch (tipo) {
            case 0:
                sql = sql + "AND cli.nome LIKE '" + pesq + "%' "; break;

            case 1:
                sql = sql + "AND cli.bairro LIKE '" + pesq + "%' "; break;

            case 2:
                sql = sql + "AND MONTH(dtNasc) = " + pesq ; break;
            case 3:
                sql = sql + "AND cpf LIKE '" + pesq + "'"; break;
        }
        
        ResultSet rs = stmt.executeQuery(sql);
        
        // Registros em Objetos
        while ( rs.next() ) {
            
            Cidade cid = new Cidade(rs.getInt("idCidade") , rs.getString("cid.nome"));
                       
            Cliente cli = new Cliente( rs.getString("cli.nome"), rs.getString("cpf"), 
                rs.getDate("dtNasc"), rs.getString("sexo").charAt(0), rs.getString("cep"),
                rs.getString("ender"), rs.getString("bairro"), rs.getInt("numero"), rs.getString("complemento"),
                 rs.getString("referencia"), rs.getString("telefone"),
                rs.getString("celular"), rs.getString("email"), rs.getBytes("foto"),
                cid);
            
            cli.setIdCliente( rs.getInt("idCliente") );
            lista.add(cli);
           
        }
        
        return lista;
    }
    
    public List<Cliente> listar() throws ClassNotFoundException, SQLException {
        return pesquisar("",-1);
    }
        
    public List<Cliente> pesquisarNome(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq,0);
    }
    
    
    public List<Cliente> pesquisarBairro(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq,1);
    }
    
    public List<Cliente> pesquisarMes(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq,2);
    }
    
    public List<Cliente> pesquisarCPF(String pesq) throws ClassNotFoundException, SQLException {
        return pesquisar(pesq,3);
    }
}
