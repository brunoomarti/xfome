package intergraf;

import dominio.Cidade;
import dominio.Cliente;
import gerTarefas.FuncoesUteis;
import dominio.Endereco;
import gerTarefas.BuscaCEP;
import gerTarefas.GerInterGrafica;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1547816
 */
public class DlgCadCliente extends javax.swing.JDialog {
   
    private GerInterGrafica gerIG;
    private Cliente cliSelecionado;
    
    
    public DlgCadCliente(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG ) {
        initComponents();
        this.gerIG = gerIG;
        cliSelecionado = null;
        habilitarBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSexo = new javax.swing.ButtonGroup();
        grpTeste = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel5 = new javax.swing.JPanel();
        lblNum = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lblEnder = new javax.swing.JLabel();
        lblTelFixo = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        cmbCidade = new javax.swing.JComboBox();
        lblComplem = new javax.swing.JLabel();
        txtEnder = new javax.swing.JTextField();
        lblEnder7 = new javax.swing.JLabel();
        lblEnder5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEnder6 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        lblEnder1 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        lblFoto = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rdbFemin = new javax.swing.JRadioButton();
        rdbMasc = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Cadastro de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        lblNum.setText("Nº");

        lblNome.setText("Nome");

        lblEnder.setText("Endereço");

        lblTelFixo.setText("Tel. Fixo");

        lblComplem.setText("Complemento");

        lblEnder7.setText("E-mail");

        lblEnder5.setText("Tel. Cel.");

        lblEnder6.setText("Referência");

        lblCidade.setText("Cidade");

        lblEnder1.setText("Bairro");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/add.png"))); // NOI18N
        btnNovo.setMnemonic('N');
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/search.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF");

        lblDtNasc.setText("Dt. Nasc.");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Foto");
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        lblCEP.setText("CEP");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/repeat.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        grpSexo.add(rdbFemin);
        rdbFemin.setMnemonic('F');
        rdbFemin.setText("Feminino");
        rdbFemin.setActionCommand("Feminino");
        rdbFemin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rb.gif"))); // NOI18N
        rdbFemin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbr.gif"))); // NOI18N
        rdbFemin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbrs.gif"))); // NOI18N
        jPanel2.add(rdbFemin, java.awt.BorderLayout.CENTER);

        grpSexo.add(rdbMasc);
        rdbMasc.setMnemonic('M');
        rdbMasc.setSelected(true);
        rdbMasc.setText("Masculino");
        rdbMasc.setActionCommand("Masculino");
        rdbMasc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rb.gif"))); // NOI18N
        rdbMasc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbp.gif"))); // NOI18N
        rdbMasc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jPanel2.add(rdbMasc, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNum)
                            .addComponent(lblEnder1)
                            .addComponent(lblEnder6)
                            .addComponent(lblCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbCidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRef, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnder)
                            .addComponent(lblCpf))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblComplem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelFixo)
                            .addComponent(lblEnder7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lblEnder5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblDtNasc)
                                .addGap(18, 18, 18)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCEP)
                            .addComponent(lblNome)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(4, 4, 4)
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAlterar)
                .addGap(16, 16, 16)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnCancelar)
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDtNasc)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNome)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCpf)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnder)
                    .addComponent(txtEnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder1)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder6)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelFixo)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnder5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String txtDtNasc = txtData.getText();

        Cidade cidade = (Cidade) cmbCidade.getSelectedItem();

        char sexo = (char) grpSexo.getSelection().getMnemonic();
        String cep = txtCEP.getText();
        String ender = txtEnder.getText();
        String txtNumero = txtNum.getText();
        String complemento = txtComplemento.getText();
        String bairro = txtBairro.getText();
        String referencia = txtRef.getText();
        String telFixo = txtTel.getText();
        String celular = txtCelular.getText();
        String email = txtEmail.getText();
        Icon foto = lblFoto.getIcon();
        
        if ( validarCampos() ) {
            // INSERIR NO BANCO
            try {
                Date dt = FuncoesUteis.strToDate(txtDtNasc);
                byte[] fotoBytes = FuncoesUteis.IconToBytes(foto);
                int num = Integer.parseInt(txtNumero);
                
                if ( cliSelecionado == null) {
                    // INSERIR
                    int id = gerIG.getGerDominio().inserirCliente(nome, cpf, dt, sexo, cep, ender,  bairro, num, complemento, referencia, telFixo, celular, email, fotoBytes, cidade);
                    JOptionPane.showMessageDialog(this, "Cliente " + id + "inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );
                } else {
                    // ALTERAR
                    gerIG.getGerDominio().alterarCliente(cliSelecionado, nome, cpf, dt, sexo, cep, ender,  bairro, num, complemento, referencia, telFixo, celular, email, fotoBytes, cidade);
                    int id = cliSelecionado.getIdCliente();
                    JOptionPane.showMessageDialog(this, "Cliente " + id + "alterado com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );                    
                }
                
            } catch (ParseException | ClassNotFoundException | SQLException  ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            
        
        }
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
    
        JFileChooser janArq = new JFileChooser();
        
        janArq.setAcceptAllFileFilterUsed(false);
        janArq.setFileFilter( new FileNameExtensionFilter("Arquivos de imagem", "jpg", "png", "gif", "bmp") );
        janArq.addChoosableFileFilter( new FileNameExtensionFilter("Arquivos de texto", "txt", "doc", "docx") );
        
        if ( janArq.showOpenDialog(this) == JFileChooser.APPROVE_OPTION  ) {
            File arquivo = janArq.getSelectedFile();
            Icon imagem = new ImageIcon( arquivo.getAbsolutePath() );
            
            mostrarFoto(imagem);
        }
        
        
    }//GEN-LAST:event_lblFotoMouseClicked

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        Endereco ender = BuscaCEP.getEnderecoPorCep( txtCEP.getText() );
        
        if ( ender != null ){
            txtEnder.setText( ender.getLogradouro() );
            txtBairro.setText( ender.getBairro() );
            cmbCidade.setSelectedItem( ender.getCidade() );
        }
        
    }//GEN-LAST:event_txtCEPFocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerIG.carregarComboCidades(cmbCidade);
        habilitarBotoes();
    }//GEN-LAST:event_formComponentShown

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        cliSelecionado = gerIG.janelaPesqCliente();
        try {
            preencherCampos(cliSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private boolean validarCampos() {
        
        String msgErro = "";
        
        lblNome.setForeground(Color.black);
        lblCEP.setForeground(Color.black); 
        lblNum.setForeground(Color.black);
        lblCpf.setForeground(Color.black); 
        lblDtNasc.setForeground(Color.black); 
        
        if ( txtNome.getText().isEmpty() ) {
            msgErro = msgErro + "Digite seu nome.\n";
            lblNome.setForeground(Color.red);            
        }
              
        if ( txtCEP.getText().replace("-", "").trim().isEmpty() ) {
            msgErro = msgErro + "Digite seu CEP.\n";
            lblCEP.setForeground(Color.red);            
        }
        
        if ( FuncoesUteis.isCPF( txtCpf.getText() ) == false  ) {
            msgErro = msgErro + "CPF inválido.\n";
            lblCpf.setForeground(Color.red); 
        }
        try {
            int num = Integer.parseInt(txtNum.getText() );
        }
        catch (NumberFormatException erro) {
            msgErro = msgErro + "Número inválido.\n";
            lblNum.setForeground(Color.red); 
        }
        catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            lblNum.setForeground(Color.red); 
        }
        
        try {
            Date dtNasc = FuncoesUteis.strToDate(txtData.getText() );
        }
        catch (ParseException ex) {
            msgErro = msgErro + "Data inválida.\n";
            lblDtNasc.setForeground(Color.red); 
        }
        catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            lblNum.setForeground(Color.red); 
        }
        
                
        // COLOCAR VALIDAÇÃO DOS OUTROS CAMPOS
        
        if ( msgErro.isEmpty() ) {
            return true;
        } else {            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        
    } 
    
    private void mostrarFoto(Icon ic) {
        
        // Redimensionar
        ImageIcon imagem = (ImageIcon) ic;
        imagem.setImage(imagem.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
        
        lblFoto.setText("");                
        lblFoto.setIcon(imagem);
    } 
    
  
    private void preencherCampos(Cliente cli) throws ParseException {
        if ( cli != null ) {
            txtNome.setText( cli.getNome() );
            txtCpf.setText( cli.getCpf());
            txtData.setText( cli.getDtNascFormatada() );
            txtCEP.setText( cli.getCep() );
            txtEnder.setText( cli.getEndereco() );
            txtNum.setText( String.valueOf( cli.getNum() ) );
            txtComplemento.setText( cli.getComplemento() );
            txtBairro.setText( cli.getBairro() );
            txtRef.setText( cli.getReferencia() );
            cmbCidade.setSelectedItem( cli.getCidade() );
            txtTel.setText( cli.getTelFixo());
            txtCelular.setText( cli.getCelular());
            txtEmail.setText( cli.getEmail() );
            
            if ( cli.getSexo() == 'M' ) {
                rdbMasc.setSelected(true);
            } else {
                rdbFemin.setSelected(true);
            }            
            
            if ( cli.getFoto() != null ) { 
                ImageIcon imagem = new ImageIcon( cli.getFoto() );
                mostrarFoto(imagem);
            } else {
                lblFoto.setText("Foto");
                lblFoto.setIcon(null);
            }
            habilitarBotoes();
        }
    }
     
    private void limparCampos() {           
            txtNome.setText( "" );
            txtCpf.setText( "" );
            txtData.setText( "" );
            txtCEP.setText("");
            txtEnder.setText( "");
            txtNum.setText( "" );
            txtComplemento.setText( "" );
            txtBairro.setText( "" );
            txtRef.setText( "" );
            cmbCidade.setSelectedIndex(0);
            txtTel.setText( "" );
            txtCelular.setText( "");
            txtEmail.setText( "" );
            lblFoto.setText("Foto");
            lblFoto.setIcon(null);
            cliSelecionado = null;
            habilitarBotoes();
    }
    
    
    public void habilitarBotoes() {
        if ( cliSelecionado == null ) {
            btnNovo.setVisible(true);
            btnAlterar.setVisible(false);
        } else {
            btnNovo.setVisible(false);
            btnAlterar.setVisible(true);
        }
        
        
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cmbCidade;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.ButtonGroup grpTeste;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplem;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEnder;
    private javax.swing.JLabel lblEnder1;
    private javax.swing.JLabel lblEnder5;
    private javax.swing.JLabel lblEnder6;
    private javax.swing.JLabel lblEnder7;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JRadioButton rdbFemin;
    private javax.swing.JRadioButton rdbMasc;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnder;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
