/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergraf;

import gerTarefas.GerInterGrafica;

/**
 *
 * @author 1547816
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private GerInterGrafica gerIG;
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(GerInterGrafica gerIG) {
        initComponents();
        this.gerIG = gerIG;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpMenuFerramentas = new javax.swing.ButtonGroup();
        grpTeste = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuCliente = new javax.swing.JMenuItem();
        mnuLanche = new javax.swing.JMenuItem();
        mnuCadPedido = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuFerramentas = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XFomeHibernate vs. 1.0");

        mnuCadastro.setMnemonic('C');
        mnuCadastro.setText("Cadastro");

        mnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/add.png"))); // NOI18N
        mnuCliente.setMnemonic('C');
        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCliente);

        mnuLanche.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuLanche.setMnemonic('L');
        mnuLanche.setText("Lanche");
        mnuCadastro.add(mnuLanche);

        mnuCadPedido.setMnemonic('P');
        mnuCadPedido.setText("Pedido");
        mnuCadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadPedidoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadPedido);
        mnuCadastro.add(jSeparator1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/remove.png"))); // NOI18N
        jMenuItem4.setMnemonic('S');
        jMenuItem4.setText("Sair");
        mnuCadastro.add(jMenuItem4);

        jMenuBar1.add(mnuCadastro);

        mnuConsultas.setMnemonic('N');
        mnuConsultas.setText("Consultas");

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/search.png"))); // NOI18N
        jMenu5.setText("Pedido");

        jMenuItem5.setText("Bairro");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Data");
        jMenu5.add(jMenuItem6);

        mnuConsultas.add(jMenu5);

        jMenuBar1.add(mnuConsultas);

        mnuFerramentas.setMnemonic('F');
        mnuFerramentas.setText("Ferramentas");

        jMenu6.setText("RadioMenu");

        grpMenuFerramentas.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jRadioButtonMenuItem1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jMenu6.add(jRadioButtonMenuItem1);

        grpMenuFerramentas.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");
        jRadioButtonMenuItem2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jMenu6.add(jRadioButtonMenuItem2);

        grpMenuFerramentas.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");
        jRadioButtonMenuItem3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jMenu6.add(jRadioButtonMenuItem3);

        mnuFerramentas.add(jMenu6);

        jMenu7.setText("Check");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rb.gif"))); // NOI18N
        jCheckBoxMenuItem1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jMenu7.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");
        jCheckBoxMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rb.gif"))); // NOI18N
        jCheckBoxMenuItem2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jMenu7.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");
        jCheckBoxMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rb.gif"))); // NOI18N
        jCheckBoxMenuItem3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/rbs.gif"))); // NOI18N
        jMenu7.add(jCheckBoxMenuItem3);

        mnuFerramentas.add(jMenu7);

        jMenuBar1.add(mnuFerramentas);

        jMenu4.setMnemonic('A');
        jMenu4.setText("Ajuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
        // INSTANCIAÇÃO
        gerIG.janelaCadCliente();
        
        
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuCadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadPedidoActionPerformed
        gerIG.janelaCadPedido();
    }//GEN-LAST:event_mnuCadPedidoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grpMenuFerramentas;
    private javax.swing.ButtonGroup grpTeste;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCadPedido;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuFerramentas;
    private javax.swing.JMenuItem mnuLanche;
    // End of variables declaration//GEN-END:variables
}
