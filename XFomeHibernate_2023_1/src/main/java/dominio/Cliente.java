/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author 1547816
 */
public class Cliente {
    
    private int idCliente;
    private String nome;
    private String cpf;
    private Date dtNasc;   
    private char sexo;     
    private String cep;
    private String endereco;
    private String bairro;
    private int num;
    private String complemento;
    private String referencia;
    private String telFixo;
    private String celular;    
    private String email;
    private byte[] foto;
    private Cidade cidade;

    public Cliente(String nome, String cpf, Date dtNasc, char sexo, String cep, String endereco, String bairro, int num, String complemento, String referencia, String telFixo, String celular, String email, byte[] foto, Cidade cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.num = num;
        this.complemento = complemento;
        this.referencia = referencia;
        this.telFixo = telFixo;
        this.celular = celular;
        this.email = email;
        this.foto = foto;
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }


    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    

    
}
