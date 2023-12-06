package com.mycompany.pizzaplanet.View.Tamanhos;

import com.mycompany.pizzaplanet.Controller.TamanhoController;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Tamanho;
import com.mycompany.pizzaplanet.View.DashboardAdm;
import com.mycompany.pizzaplanet.View.Pizzas.GerenciamentoPizza;
import com.mycompany.pizzaplanet.View.Produtos.GerenciamentoProduto;
import com.mycompany.pizzaplanet.View.Ingredientes.GerenciamentoIngrediente;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GerenciamentoTamanho extends javax.swing.JFrame {

    /**
     * Creates new form GerenciamentoIngredietne
     */
    public GerenciamentoTamanho() {
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
        ListTamanho = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtITamanho = new javax.swing.JTextField();
        btnEditTamanho = new javax.swing.JButton();
        btnDelTamanho = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIQuantPedaco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIValorTamanho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnViewTamanho = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListTamanho.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        ListTamanho.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ListTamanhoComponentAdded(evt);
            }
        });
        ListTamanho.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListTamanhoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListTamanho.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListTamanhoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListTamanho);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jLabel2.setText("Nome:");

        btnEditTamanho.setText("Editar Tamanho");
        btnEditTamanho.setEnabled(false);
        btnEditTamanho.setSelected(true);
        btnEditTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTamanhoActionPerformed(evt);
            }
        });

        btnDelTamanho.setText("Deletar Tamanho");
        btnDelTamanho.setEnabled(false);
        btnDelTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelTamanhoActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade de Pedaços:");

        jLabel4.setText("Valor do Tamanho:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditTamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelTamanho))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtITamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtIQuantPedaco, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtIValorTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtITamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIQuantPedaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIValorTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Tamanhos");

        btnViewTamanho.setText("Adicionar Tamanho");
        btnViewTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTamanhoActionPerformed(evt);
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

        jMenuItem4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jMenuItem4.setText("Gerenciador Pizzas");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
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
                .addComponent(btnViewTamanho)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(btnViewTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoPizza indexP = new GerenciamentoPizza();
        indexP.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnViewTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTamanhoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdicionaTamanho addV = new AdicionaTamanho();
        addV.setVisible(true);
    }//GEN-LAST:event_btnViewTamanhoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        DashboardAdm dashAdm = new DashboardAdm();
        dashAdm.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void ListTamanhoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ListTamanhoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ListTamanhoComponentAdded

    private void ListTamanhoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListTamanhoAncestorAdded
        // TODO add your handling code here:
        try {
            BancoDeDados.leBDTamanho(BancoDeDados.getBancoTamanho());
            DefaultListModel listaTamanhoModelo = new DefaultListModel();
            for(Tamanho tam : Tamanho.getListaTamanhos()) {
                listaTamanhoModelo.addElement(tam.getNome());
            }
            ListTamanho.setModel(listaTamanhoModelo);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_ListTamanhoAncestorAdded

    private void ListTamanhoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListTamanhoValueChanged
        // TODO add your handling code here:
        if(ListTamanho.getSelectedValue() != null) {
            txtITamanho.setText(ListTamanho.getSelectedValue().toString());
            btnDelTamanho.setEnabled(true);
            btnEditTamanho.setEnabled(true);
            for (Tamanho tam : Tamanho.getListaTamanhos()) {
                if (ListTamanho.getSelectedValue().toString().equals(tam.getNome())) {
                    txtIQuantPedaco.setText(String.valueOf(tam.getQuantidadePecas()));
                    txtIValorTamanho.setText(String.valueOf(tam.getValor()));
                }
            }
        }
    }//GEN-LAST:event_ListTamanhoValueChanged

    private void btnEditTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTamanhoActionPerformed
        // TODO add your handling code here:
        try {
            Tamanho.validaCampoVazioCadastro(txtITamanho.getText().trim(), txtIQuantPedaco.getText().trim(), txtIValorTamanho.getText().trim());
            Tamanho.validaCampoNumerico(txtIQuantPedaco.getText().trim(), txtIValorTamanho.getText().trim());
            TamanhoController.edita(ListTamanho.getSelectedValue(), txtITamanho.getText().trim(), Integer.parseInt(txtIQuantPedaco.getText().trim()), Double.parseDouble(txtIValorTamanho.getText().trim()));
            JOptionPane.showMessageDialog(null, "Tamanho editado com sucesso");
            this.dispose();
            GerenciamentoTamanho novoJ = new GerenciamentoTamanho();
            novoJ.setVisible(true);
        } catch (CampoVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o tamanho");
        } catch (ErroValorNumerico e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEditTamanhoActionPerformed

    private void btnDelTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTamanhoActionPerformed
        // TODO add your handling code here:
        try {
            TamanhoController.deleta(txtITamanho.getText());
            JOptionPane.showMessageDialog(null, "Tamanho deletado com sucesso");
            this.dispose();
            GerenciamentoTamanho novoJ = new GerenciamentoTamanho();
            novoJ.setVisible(true);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar tamanho");
        }
    }//GEN-LAST:event_btnDelTamanhoActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoProduto indexT = new GerenciamentoProduto();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        // TODO add your handling code here:
//        this.dispose();
//        GerenciamentoPizza indexP = new GerenciamentoPizza();
//        indexP.setVisible(true);
    }//GEN-LAST:event_jMenuItem4MouseClicked

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
            java.util.logging.Logger.getLogger(GerenciamentoTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoTamanho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListTamanho;
    private javax.swing.JButton btnDelTamanho;
    private javax.swing.JButton btnEditTamanho;
    private javax.swing.JButton btnViewTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField txtIQuantPedaco;
    private javax.swing.JTextField txtITamanho;
    private javax.swing.JTextField txtIValorTamanho;
    // End of variables declaration//GEN-END:variables
}
