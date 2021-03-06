/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pousada.View;

import br.com.pousada.Controller.ReservaController;
import br.com.pousada.Model.Reserva;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabiano
 */
public class ReservaListaLocacao extends javax.swing.JFrame {
    
    private JTable tabela;  
    private DefaultTableModel modelo = new DefaultTableModel();    

    /**
     * Creates new form FuncionarioLista
     */
    public ReservaListaLocacao() {
        initComponents();
        criaJTable();
        painelRolagem.setViewportView(tabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPesquisar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        painelRolagem = new javax.swing.JScrollPane();
        painelLogin = new javax.swing.JPanel();
        ImagemLogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        txPesquisar = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btMenuPrincipal = new javax.swing.JButton();

        btPesquisar1.setForeground(new java.awt.Color(102, 102, 102));
        btPesquisar1.setText("Pesquisar");
        btPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 589));

        painelRolagem.setBackground(new java.awt.Color(255, 255, 255));
        painelRolagem.setBorder(null);

        painelLogin.setBackground(new java.awt.Color(204, 204, 204));
        painelLogin.setPreferredSize(new java.awt.Dimension(650, 155));

        ImagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pousada/Imagens/logo.png"))); // NOI18N
        ImagemLogo.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("pESquiSAr RESerVa");

        btPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        btPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        txPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        txPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisarActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(204, 204, 204));
        btEditar.setForeground(new java.awt.Color(102, 102, 102));
        btEditar.setText("Adicionar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btEliminar.setForeground(new java.awt.Color(102, 102, 102));
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Pesquisar por Nome.:");

        btMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        btMenuPrincipal.setForeground(new java.awt.Color(102, 102, 102));
        btMenuPrincipal.setText("Cadastro de Locações");
        btMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addComponent(ImagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txPesquisar)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addComponent(ImagemLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar)
                    .addComponent(btEditar)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idReserva = (int) tabela.getValueAt(linhaSelecionada, 0);
            ReservaController hc = new ReservaController();
            if (hc.remove(idReserva)) {
                modelo.removeRow(linhaSelecionada);
                JOptionPane.showMessageDialog(null, "Removido com Sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma Linha Selecionada");
            }
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //        TODO add your handling code here:
         int linhaSelecionada1 = -1;
        linhaSelecionada1 = tabela.getSelectedRow();
        if (linhaSelecionada1 >= 0) {
            int idLocacao = (int) tabela.getValueAt(linhaSelecionada1, 0);

            LocacaoCadastro h1 = new LocacaoCadastro(idLocacao);
            h1.setLocationRelativeTo(null);
            h1.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha Selecionada");

        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisarActionPerformed
        // TODO add your handling code here:
        String nome = txPesquisar.getText();
        ReservaController hc = new ReservaController();
        hc.listByNome(nome);
        //metodo para limpar tabela
        modelo.setNumRows(0);
        for (Reserva fo : hc.listByNome(nome)) {
            modelo.addRow(new Object[]{
                fo.getId(),
                fo.getHabitacao(),
                fo.getCliente(),
                fo.getFuncionario(),
                fo.getQuantidadereserva(),
                fo.getDataEntrada(),
                fo.getDataSaida(),
                fo.getValorReserva(),
                fo.getNumeroPessoas()
            });
        }       
    }//GEN-LAST:event_txPesquisarActionPerformed

    private void btPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisar1ActionPerformed

    private void btMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuPrincipalActionPerformed
        // TODO add your handling code here:
        LocacaoCadastro ja = new LocacaoCadastro();
        ja.setLocationRelativeTo(null);
        ja.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMenuPrincipalActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemLogo;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btMenuPrincipal;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JScrollPane painelRolagem;
    private javax.swing.JTextField txPesquisar;
    // End of variables declaration//GEN-END:variables


    private void criaJTable() {

        tabela = new JTable(modelo);
        modelo.addColumn("Código");                
        modelo.addColumn("Numero Pessoas");
        modelo.addColumn("Valor da Reserva");                
        preencherJTable();
    }
    
    private void preencherJTable() {

        ReservaController uc = new ReservaController();
        for (Reserva fo : uc.listAll()) {
            modelo.addRow(new Object[]{
                fo.getId(),
                fo.getNumeroPessoas(),                
                fo.getValorReserva()                                
            });
        }
    }
}