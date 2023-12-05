package com.mycompany.pizzaplanet.View.Ingredientes;

import com.mycompany.pizzaplanet.Controller.IngredienteController;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Ingrediente;
import com.mycompany.pizzaplanet.View.DashboardAdm;
import com.mycompany.pizzaplanet.View.Produtos.GerenciamentoProduto;
import com.mycompany.pizzaplanet.View.Tamanhos.GerenciamentoTamanho;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GerenciamentoIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form GerenciamentoIngredietne
     */
    public GerenciamentoIngrediente() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListIngrediente = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngrediente = new javax.swing.JTextField();
        btnEditIngre = new javax.swing.JButton();
        btnDellIngre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewAdd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListIngrediente.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        ListIngrediente.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ListIngredienteComponentAdded(evt);
            }
        });
        ListIngrediente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListIngredienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListIngrediente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListIngredienteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListIngrediente);

        jSplitPane1.setLeftComponent(jScrollPane1);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditIngre)
                        .addGap(103, 103, 103)
                        .addComponent(btnDellIngre))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDellIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Ingredientes");

        btnViewAdd.setText("Adicionar Ingrediente");
        btnViewAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAddActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        jMenu1.setText("Dashboard");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pizzas");

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
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem3.setText("Pizzas Doces");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem4.setText("Pizzas Salgadas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewAdd)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(btnViewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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

    private void ListIngredienteComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ListIngredienteComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ListIngredienteComponentAdded

    private void ListIngredienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListIngredienteAncestorAdded
        // TODO add your handling code here:
        try {
            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());
            DefaultListModel listaIngredientesModelo = new DefaultListModel();
            for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
                listaIngredientesModelo.addElement(ingre.getNome());
            }
            ListIngrediente.setModel(listaIngredientesModelo);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_ListIngredienteAncestorAdded

    private void ListIngredienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListIngredienteValueChanged
        // TODO add your handling code here:
        if(ListIngrediente.getSelectedValue() != null) {
            txtIngrediente.setText(ListIngrediente.getSelectedValue().toString());
            btnDellIngre.setEnabled(true);
            btnEditIngre.setEnabled(true);
        }
    }//GEN-LAST:event_ListIngredienteValueChanged

    private void btnEditIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditIngreActionPerformed
        // TODO add your handling code here:
        try {
            IngredienteController.edita(ListIngrediente.getSelectedValue(), txtIngrediente.getText().trim());
            JOptionPane.showMessageDialog(null, "ingrediente editado com sucesso");
            this.dispose();
            GerenciamentoIngrediente novoJ = new GerenciamentoIngrediente();
            novoJ.setVisible(true);
        } catch (CampoVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o ingrediente");
        }
    }//GEN-LAST:event_btnEditIngreActionPerformed

    private void btnDellIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDellIngreActionPerformed
        // TODO add your handling code here:
        try {
            IngredienteController.deleta(txtIngrediente.getText());
            JOptionPane.showMessageDialog(null, "ingrediente deletado com sucesso");
            this.dispose();
            GerenciamentoIngrediente novoJ = new GerenciamentoIngrediente();
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
            java.util.logging.Logger.getLogger(GerenciamentoIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListIngrediente;
    private javax.swing.JButton btnDellIngre;
    private javax.swing.JButton btnEditIngre;
    private javax.swing.JButton btnViewAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField txtIngrediente;
    // End of variables declaration//GEN-END:variables
}
