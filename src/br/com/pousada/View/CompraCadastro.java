/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pousada.View;

import br.com.pousada.Controller.CompraController;
import br.com.pousada.Controller.FornecedorController;
import br.com.pousada.Controller.FuncionarioController;
import br.com.pousada.Model.Compra;
import br.com.pousada.Model.Fornecedor;
import br.com.pousada.Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class CompraCadastro extends javax.swing.JFrame {

    private JTable tabela;
    private int linhaSelecionada;
    private DefaultTableModel modelo = new DefaultTableModel();

    public CompraCadastro(DefaultTableModel modelo) {
        this.modelo = modelo;
        initComponents();

    }

    public CompraCadastro() {
        initComponents();
        carregarComboFornecedor();
        carregarComboFuncionario();
    }
    
    

    public CompraCadastro(DefaultTableModel modelo, int linhaSelecionada, int idCompra) {

        //***** Recuperar dados para Editar *********************************************************** 
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        initComponents();

        CompraController cc = new CompraController();
        Compra edit = cc.listId(idCompra);

        txCodigo.setText(Integer.toString(edit.getIdCompra()));
        txQuantidade.setText(Integer.toString(edit.getQuantidadeCompra()));

        txProduto.setText(edit.getNome());
        carregarComboFornecedor(edit.getFornecedor());
        carregarComboFuncionario(edit.getFuncionario());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        txMargemLucro4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        ImagemLogo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        btMenuPrincipal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txQuantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txProduto = new javax.swing.JTextField();
        cbFornecedor = new javax.swing.JComboBox();
        cbFuncionario = new javax.swing.JComboBox();

        txMargemLucro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMargemLucro4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 450));

        painelLogin.setBackground(new java.awt.Color(204, 204, 204));
        painelLogin.setPreferredSize(new java.awt.Dimension(650, 150));

        ImagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pousada/Imagens/logo.png"))); // NOI18N
        ImagemLogo.setText("jLabel4");

        jLabel19.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("caDaSTro CoMPras");

        btPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        btPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(204, 204, 204));
        btLimpar.setForeground(new java.awt.Color(102, 102, 102));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        btAdicionar.setForeground(new java.awt.Color(102, 102, 102));
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        btMenuPrincipal.setForeground(new java.awt.Color(102, 102, 102));
        btMenuPrincipal.setText("Menu Produtos");
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
                .addComponent(ImagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelLoginLayout.createSequentialGroup()
                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addComponent(ImagemLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btLimpar)
                    .addComponent(btAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuPrincipal)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(650, 450));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Fornecedor.:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 180, 70, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Código.:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 70, 45, 15);

        txCodigo.setEditable(false);
        txCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(txCodigo);
        txCodigo.setBounds(120, 60, 134, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Produto.:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(50, 100, 52, 15);

        txQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txQuantidadeActionPerformed(evt);
            }
        });
        jPanel3.add(txQuantidade);
        txQuantidade.setBounds(120, 140, 133, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Cadastrar Fornecedor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(304, 11, 336, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Quantidade.:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 140, 71, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Funcionário.:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(30, 220, 69, 15);

        txProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(txProduto);
        txProduto.setBounds(120, 100, 516, 20);

        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbFornecedor);
        cbFornecedor.setBounds(120, 180, 516, 20);

        cbFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbFuncionario);
        cbFuncionario.setBounds(120, 220, 516, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here: 

        //Codigo para Adicionar ao banco os Campos Preenchidos Cadastro 
        Compra co = new Compra();

        if (!(txCodigo.getText().equals("") || (txCodigo.getText() == null))) {
            co.setIdCompra(Integer.parseInt(txCodigo.getText()));            
        }
        co.setNome(txProduto.getText());
        co.setQuantidadeCompra(Integer.parseInt(txQuantidade.getText()));
        co.setFornecedor((Fornecedor) cbFornecedor.getSelectedItem());
        co.setFuncionario((Funcionario) cbFuncionario.getSelectedItem()); 

        CompraController hc = new CompraController();
        if (co.getIdCompra() == 0) {
            int idCompra = hc.save(co);
            if (idCompra > 0) {
                JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso");
            }
        } else {
            int idCompra = hc.save(co);
            if (idCompra > 0) {
                JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso");
            }
        }
        //Construtor limpar campos
        limparDados();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparDados();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        //Estanciar Abertura da Janela Usuario
        CompraLista rl = new CompraLista();
        //Centrar Janela na abertura
        rl.setLocationRelativeTo(null);
        //Tornar Janela Visivel
        rl.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoActionPerformed

    private void btMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuPrincipalActionPerformed
        // TODO add your handling code here:
        JanelaCadastrarProduto ja = new JanelaCadastrarProduto();
        ja.setLocationRelativeTo(null);
        ja.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMenuPrincipalActionPerformed

    private void txQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txQuantidadeActionPerformed

    private void txProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txProdutoActionPerformed

    private void txMargemLucro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMargemLucro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMargemLucro4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FornecedorCadastro cc = new FornecedorCadastro();
        cc.setLocationRelativeTo(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemLogo;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMenuPrincipal;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JComboBox cbFuncionario;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txMargemLucro4;
    private javax.swing.JTextField txProduto;
    private javax.swing.JTextField txQuantidade;
    // End of variables declaration//GEN-END:variables

    private void limparDados() {
        // TODO add your handling code here:

        //Codigo para Limpar Campos de Preenchimento      
        txCodigo.setText("");
        txQuantidade.setText("");
        txProduto.setText("");
        

    }

    private void carregarComboFornecedor() {

        //Declarar uma varialvel
        //combodefaut para poder alterar dados do modelo

        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbFornecedor.getModel();
        cbFornecedor.removeAllItems();

        //Buscar na base de dados os alunos cadastrados
        List<Fornecedor> fornecedores = new ArrayList<>();
        FornecedorController cc = new FornecedorController();
        fornecedores = cc.listAll();

        //Preencger o combo com os alunos que estao na lista

        for (int linha = 0; linha < fornecedores.size(); linha++) {
            Fornecedor c = fornecedores.get(linha);
            
            comboModel.setSelectedItem("  ----Selecione----  ");
            comboModel.addElement(c);
        }
    }

    private void carregarComboFornecedor(Fornecedor fornecedor) {

        //Declarar uma varialvel
        //combodefaut para poder alterar dados do modelo
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbFornecedor.getModel();
        cbFornecedor.removeAllItems();
        //Buscar na base de dados os alunos cadastrados
        List<Fornecedor> fornecedores = new ArrayList<>();
        FornecedorController cc = new FornecedorController();
        fornecedores = cc.listAll();

        //Preencger o combo com os alunos que estao na lista

        for (int linha = 0; linha < fornecedores.size(); linha++) {
            Fornecedor c = fornecedores.get(linha);
            comboModel.addElement(c);
            if (fornecedor.getId() == c.getId()) {                
                comboModel.setSelectedItem(c);
            }
        }
    }

    private void carregarComboFuncionario() {
        //Declarar uma varialvel
        //combodefaut para poder alterar dados do modelo
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbFuncionario.getModel();
        cbFuncionario.removeAllItems();
        //Buscar na base de dados os alunos cadastrados
        List<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioController ff = new FuncionarioController();
        funcionarios = ff.listAll();

        //Preencger o combo com os alunos que estao na lista

        for (int linha = 0; linha < funcionarios.size(); linha++) {
            Funcionario f = funcionarios.get(linha);
            comboModel.setSelectedItem("  ----Selecione----  ");
            comboModel.addElement(f);
        }
    }

    private void carregarComboFuncionario(Funcionario funcionario) {

        //Declarar uma varialvel
        //combodefaut para poder alterar dados do modelo
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbFuncionario.getModel();
        cbFuncionario.removeAllItems();
        //Buscar na base de dados os alunos cadastrados
        List<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioController fc = new FuncionarioController();
        funcionarios = fc.listAll();

        //Preencger o combo com os alunos que estao na lista

        for (int linha = 0; linha < funcionarios.size(); linha++) {
            Funcionario f = funcionarios.get(linha);
            comboModel.addElement(f);
            if (funcionario.getId() == f.getId()) {
                comboModel.setSelectedItem(f);
            }
        }
    }
}
