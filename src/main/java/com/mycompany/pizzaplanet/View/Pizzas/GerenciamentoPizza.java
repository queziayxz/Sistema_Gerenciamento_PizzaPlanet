package com.mycompany.pizzaplanet.View.Pizzas;

import com.mycompany.pizzaplanet.View.Ingredientes.*;
import com.mycompany.pizzaplanet.Controller.IngredienteController;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Ingrediente;
import com.mycompany.pizzaplanet.View.DashboardAdm;
import com.mycompany.pizzaplanet.View.Produtos.GerenciamentoProduto;
import com.mycompany.pizzaplanet.View.Tamanhos.GerenciamentoTamanho;
import java.io.IOException;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoPizza extends javax.swing.JFrame {

    /**
     * Creates new form GerenciamentoIngredietne
     */
    public GerenciamentoPizza() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomePizzaDoce = new javax.swing.JTextField();
        btnEditIngre = new javax.swing.JButton();
        btnDellIngre = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomePizzaDoce1 = new javax.swing.JTextField();
        txtNomePizzaDoce2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomePizzaDoce3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNomePizzaDoce4 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPizzaDoce = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnViewAdd = new javax.swing.JButton();
        btnViewAdd1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nome:");

        btnEditIngre.setText("Editar Ingrediente");
        btnEditIngre.setEnabled(false);
        btnEditIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditIngreActionPerformed(evt);
            }
        });

        btnDellIngre.setText("Deletar Ingrediente");
        btnDellIngre.setEnabled(false);
        btnDellIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDellIngreActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingredientes:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Tamanho:");

        jLabel6.setText("Quantidade de Pedaços:");

        jLabel7.setText("Valor da Pizza:");

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableIngredientes);
        if (tableIngredientes.getColumnModel().getColumnCount() > 0) {
            tableIngredientes.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableIngredientes.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txtNomePizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(468, 468, 468)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePizzaDoce4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomePizzaDoce3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNomePizzaDoce2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditIngre)
                        .addGap(468, 468, 468)
                        .addComponent(btnDellIngre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1171, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(txtNomePizzaDoce1))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePizzaDoce2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePizzaDoce3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePizzaDoce4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDellIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNomePizzaDoce1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        jSplitPane1.setRightComponent(jPanel1);

        listPizzaDoce.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listPizzaDoceAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listPizzaDoce.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPizzaDoceValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listPizzaDoce);

        jSplitPane1.setLeftComponent(jScrollPane2);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("Pizzas");

        btnViewAdd.setText("Adicionar Pizza Doce");
        btnViewAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAddActionPerformed(evt);
            }
        });

        btnViewAdd1.setText("Adicionar Pizza Salgada");
        btnViewAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAdd1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel8.setText("Pizzas Doces:");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel9.setText("Pizzas Salgadas:");

        jMenuBar1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        jMenu1.setText("Dashboard");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pizzas");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem1.setText("Ingredientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem2.setText("Tamanhos");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem3.setText("Gerenciador Pizzas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Produtos");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Pedidos");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(505, 505, 505))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewAdd1))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(438, 438, 438)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoIngrediente indexT = new GerenciamentoIngrediente();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoTamanho indexT = new GerenciamentoTamanho();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnViewAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAddActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdicionaIngrediente addV = new AdicionaIngrediente();
        addV.setVisible(true);
    }//GEN-LAST:event_btnViewAddActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        DashboardAdm dashAdm = new DashboardAdm();
        dashAdm.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btnEditIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditIngreActionPerformed
        // TODO add your handling code here:
//        try {
//            
//            BancoDeDados banco = new BancoDeDados();
//            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());
//            
//            Ingrediente ingreBanco = new Ingrediente();
//            Ingrediente ingreNovo = new Ingrediente(txtNomePizzaDoce.getText().trim(), CBtxtCategoria.getSelectedItem().toString());
//            
//            for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
//                if(ingre.getNome().equals(ListIngrediente.getSelectedValue())) {
//                    ingreBanco = ingre;
//                }
//            }
//            IngredienteController.edita(ingreBanco, ingreNovo);
//            JOptionPane.showMessageDialog(null, "ingrediente editado com sucesso");
//            this.dispose();
//            GerenciamentoPizza novoJ = new GerenciamentoPizza();
//            novoJ.setVisible(true);
//        } catch (CampoVazio e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao editar o ingrediente");
//        }
    }//GEN-LAST:event_btnEditIngreActionPerformed

    private void btnDellIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDellIngreActionPerformed
        // TODO add your handling code here:
        try {
            IngredienteController.deleta(txtNomePizzaDoce.getText());
            JOptionPane.showMessageDialog(null, "ingrediente deletado com sucesso");
            this.dispose();
            GerenciamentoPizza novoJ = new GerenciamentoPizza();
            novoJ.setVisible(true);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar ingrediente");
        }
    }//GEN-LAST:event_btnDellIngreActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoProduto indexT = new GerenciamentoProduto();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnViewAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAdd1ActionPerformed

    Object valorSelecionadoAnterior = null;
    private void listPizzaDoceValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPizzaDoceValueChanged
        // TODO add your handling code here:
        if(listPizzaDoce.getSelectedValue() != null) {
            if(!listPizzaDoce.getSelectedValue().equals(valorSelecionadoAnterior)) {
                for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
                    System.out.println(ingre.getNome());
                }
                valorSelecionadoAnterior = listPizzaDoce.getSelectedValue();
            }
        }
    }//GEN-LAST:event_listPizzaDoceValueChanged

    private void listPizzaDoceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listPizzaDoceAncestorAdded
        // TODO add your handling code here:
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());
            DefaultListModel listaIngredientesModelo = new DefaultListModel();
            for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
                listaIngredientesModelo.addElement(ingre.getNome());
            }
            listPizzaDoce.setModel(listaIngredientesModelo);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_listPizzaDoceAncestorAdded

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
//        this.dispose();
//        GerenciamentoIngrediente indexI = new GerenciamentoIngrediente();
//        indexI.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoTamanho indexI = new GerenciamentoTamanho();
        indexI.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDellIngre;
    private javax.swing.JButton btnEditIngre;
    private javax.swing.JButton btnViewAdd;
    private javax.swing.JButton btnViewAdd1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> listPizzaDoce;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTextField txtNomePizzaDoce;
    private javax.swing.JTextField txtNomePizzaDoce1;
    private javax.swing.JTextField txtNomePizzaDoce2;
    private javax.swing.JTextField txtNomePizzaDoce3;
    private javax.swing.JTextField txtNomePizzaDoce4;
    // End of variables declaration//GEN-END:variables
}