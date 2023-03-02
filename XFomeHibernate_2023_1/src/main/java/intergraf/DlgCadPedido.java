package intergraf;

import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1547816
 */
public class DlgCadPedido extends javax.swing.JDialog {
    
    public DlgCadPedido(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpEntrega = new javax.swing.ButtonGroup();
        mnuPedido = new javax.swing.JPopupMenu();
        mnuInserir = new javax.swing.JMenuItem();
        mnuExcluir = new javax.swing.JMenuItem();
        mnuTeste = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblLanche = new javax.swing.JLabel();
        cmbLanche = new javax.swing.JComboBox();
        txtNome = new javax.swing.JTextField();
        btnPesqCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstIngredientes = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        chkBife = new javax.swing.JCheckBox();
        spnBife = new javax.swing.JSpinner();
        chkQueijo = new javax.swing.JCheckBox();
        spnQueijo = new javax.swing.JSpinner();
        chkPresunto = new javax.swing.JCheckBox();
        spnPresunto = new javax.swing.JSpinner();
        chkOvo = new javax.swing.JCheckBox();
        spnOvo = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        rdbSim = new javax.swing.JRadioButton();
        rdbNao = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnAddLanche = new javax.swing.JButton();
        spnQtde = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        mnuInserir.setText("Inserir");
        mnuInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLancheActionPerformed(evt);
            }
        });
        mnuPedido.add(mnuInserir);

        mnuExcluir.setText("Excluir");
        mnuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExcluirActionPerformed(evt);
            }
        });
        mnuPedido.add(mnuExcluir);

        jMenuItem1.setText("jMenuItem1");
        mnuTeste.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        mnuTeste.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        mnuTeste.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pedidos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Cadastro de Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.setComponentPopupMenu(mnuTeste);

        lblNome.setText("Nome");

        lblLanche.setText("Lanche");

        cmbLanche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hamburguer", "X-Egg", "X-Bacon", "Xtudo" }));

        btnPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/search.png"))); // NOI18N

        lstIngredientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Banana", "Queijo cheddar", "Catupiry", "Batata palha", "Maionese", "Milho verde" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstIngredientes.setComponentPopupMenu(mnuTeste);
        lstIngredientes.setSelectedIndices(new int[] {-1});
        jScrollPane1.setViewportView(lstIngredientes);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("++ Mais ++"));
        jPanel3.setComponentPopupMenu(mnuTeste);
        jPanel3.setLayout(new java.awt.GridLayout(4, 2));

        chkBife.setText("Bife");
        chkBife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBifeActionPerformed(evt);
            }
        });
        jPanel3.add(chkBife);

        spnBife.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnBife.setEnabled(false);
        jPanel3.add(spnBife);

        chkQueijo.setText("Queijo");
        chkQueijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkQueijoActionPerformed(evt);
            }
        });
        jPanel3.add(chkQueijo);

        spnQueijo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnQueijo.setEnabled(false);
        jPanel3.add(spnQueijo);

        chkPresunto.setText("Presunto");
        chkPresunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPresuntoActionPerformed(evt);
            }
        });
        jPanel3.add(chkPresunto);

        spnPresunto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnPresunto.setEnabled(false);
        jPanel3.add(spnPresunto);

        chkOvo.setText("Ovo");
        chkOvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOvoActionPerformed(evt);
            }
        });
        jPanel3.add(chkOvo);

        spnOvo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnOvo.setEnabled(false);
        jPanel3.add(spnOvo);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega"));
        jPanel4.setComponentPopupMenu(mnuTeste);
        jPanel4.setLayout(new java.awt.BorderLayout());

        grpEntrega.add(rdbSim);
        rdbSim.setMnemonic('S');
        rdbSim.setText("Sim");
        jPanel4.add(rdbSim, java.awt.BorderLayout.CENTER);

        grpEntrega.add(rdbNao);
        rdbNao.setMnemonic('N');
        rdbNao.setSelected(true);
        rdbNao.setText("Não");
        jPanel4.add(rdbNao, java.awt.BorderLayout.PAGE_START);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("R$");

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(102, 102, 255));
        lblValor.setText("0.0");

        btnAddLanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/add.png"))); // NOI18N
        btnAddLanche.setText(" Lanche");
        btnAddLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLancheActionPerformed(evt);
            }
        });

        spnQtde.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10, 1));

        jLabel2.setText("Qtde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddLanche)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(4, 4, 4)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLanche)
                                        .addGap(7, 7, 7)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValor))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPesqCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLanche)
                            .addComponent(cmbLanche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblValor))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddLanche)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/accept.png"))); // NOI18N
        btnNovo.setText("Novo");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Pedidos"));
        jPanel5.setLayout(new java.awt.BorderLayout());

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Lanche", "Qtde", "Bife", "Queijo", "Presunto", "Ovo", "Ingredientes", "Entregar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.setComponentPopupMenu(mnuPedido);
        jScrollPane2.setViewportView(tblPedidos);

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnNovo)
                .addGap(67, 67, 67)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkBifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBifeActionPerformed
        habilitarSpinner(chkBife, spnBife);
    }//GEN-LAST:event_chkBifeActionPerformed

    private void chkQueijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQueijoActionPerformed
        habilitarSpinner(chkQueijo, spnQueijo);
    }//GEN-LAST:event_chkQueijoActionPerformed

    private void chkPresuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPresuntoActionPerformed
        habilitarSpinner(chkPresunto, spnPresunto);
    }//GEN-LAST:event_chkPresuntoActionPerformed

    private void chkOvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOvoActionPerformed
        habilitarSpinner(chkOvo, spnOvo);
    }//GEN-LAST:event_chkOvoActionPerformed

    private void btnAddLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLancheActionPerformed
        // PEGAR OS CAMPOS
        
        String nome = txtNome.getText();
        String lanche = cmbLanche.getSelectedItem().toString();
        
        List lista = lstIngredientes.getSelectedValuesList();
        int bife =  Integer.parseInt(  spnBife.getValue().toString() );
        int queijo =  Integer.parseInt(  spnQueijo.getValue().toString() );
        int presunto =  Integer.parseInt(  spnPresunto.getValue().toString() );
        int ovo =  Integer.parseInt(  spnOvo.getValue().toString() );
        int qtde =  Integer.parseInt(  spnQtde.getValue().toString() );
        
        char entrega = (char) grpEntrega.getSelection().getMnemonic();
        
        adicionarTabela(nome, lanche, lista, bife, queijo, presunto, ovo, qtde, entrega);
        
        
    }//GEN-LAST:event_btnAddLancheActionPerformed

    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
        int linha = tblPedidos.getSelectedRow();
        if ( linha >=0 ) {
            
            if ( JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?", "Título", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION  ) {
                // EXCLUIR LINHA NA TABELA        
                ( (DefaultTableModel) tblPedidos.getModel() ).removeRow( linha );
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Título",
                            JOptionPane.ERROR_MESSAGE   );
        }            
        
    }//GEN-LAST:event_mnuExcluirActionPerformed

    
    private void habilitarSpinner(JCheckBox chk, JSpinner spn ) {
        if ( chk.isSelected()  ) {
            spn.setEnabled(true);
        }else {
            spn.setEnabled(false);        
            spn.setValue(0);
        }
        
    }
    
    
    private void adicionarTabela(String nome, String lanche, List lista, int bife, 
            int queijo, int presunto, int ovo, int qtde, char entrega){
        
        // ADICIONAR LINHA NA TABELA        
        ( (DefaultTableModel) tblPedidos.getModel() ).addRow( new Object[9] );
        
        int linha = tblPedidos.getRowCount() - 1;
        int col = 0;
        tblPedidos.setValueAt(nome, linha , col++);
        tblPedidos.setValueAt(lanche, linha , col++);
        tblPedidos.setValueAt(qtde, linha , col++);
        tblPedidos.setValueAt(bife, linha , col++);
        tblPedidos.setValueAt(queijo, linha , col++);
        tblPedidos.setValueAt(presunto, linha , col++);
        tblPedidos.setValueAt(ovo, linha , col++);
        tblPedidos.setValueAt(lista, linha , col++);
        tblPedidos.setValueAt(entrega, linha , col++);
        
                
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLanche;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JCheckBox chkBife;
    private javax.swing.JCheckBox chkOvo;
    private javax.swing.JCheckBox chkPresunto;
    private javax.swing.JCheckBox chkQueijo;
    private javax.swing.JComboBox cmbLanche;
    private javax.swing.ButtonGroup grpEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLanche;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValor;
    private javax.swing.JList lstIngredientes;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JMenuItem mnuInserir;
    private javax.swing.JPopupMenu mnuPedido;
    private javax.swing.JPopupMenu mnuTeste;
    private javax.swing.JRadioButton rdbNao;
    private javax.swing.JRadioButton rdbSim;
    private javax.swing.JSpinner spnBife;
    private javax.swing.JSpinner spnOvo;
    private javax.swing.JSpinner spnPresunto;
    private javax.swing.JSpinner spnQtde;
    private javax.swing.JSpinner spnQueijo;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
