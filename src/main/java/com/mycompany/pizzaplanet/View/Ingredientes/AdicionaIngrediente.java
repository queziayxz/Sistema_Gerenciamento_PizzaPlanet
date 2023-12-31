/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.View.Ingredientes;

import com.mycompany.pizzaplanet.Controller.IngredienteController;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
import com.mycompany.pizzaplanet.Model.Ingrediente;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AdicionaIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form AdicionaIngrediente
     */
    public AdicionaIngrediente() {
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

        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomeIngre = new javax.swing.JTextField();
        btnAddIngrediente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Adicionando Ingrediente");

        btnVoltar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVoltar.setText("<----");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        txtNomeIngre.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtNomeIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeIngreActionPerformed(evt);
            }
        });

        btnAddIngrediente.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnAddIngrediente.setText("Adicionar Ingrediente");
        btnAddIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngredienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setText("Categoria:");

        CBCategoria.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doce", "Salgado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddIngrediente)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtNomeIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVoltar)
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAddIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoIngrediente indexIngre = new GerenciamentoIngrediente();
        indexIngre.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAddIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIngredienteActionPerformed
        // TODO add your handling code here:
        try {
            Ingrediente.validaCampoVazioCadastro(txtNomeIngre.getText().trim());
            Ingrediente ingredienteCadastro = new Ingrediente(txtNomeIngre.getText().trim(), CBCategoria.getSelectedItem().toString());
            IngredienteController.adiciona(ingredienteCadastro);
            JOptionPane.showMessageDialog(null, "Ingrediente adicionado com sucesso!!");
            txtNomeIngre.setText("");
        } catch (CampoVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ErroValorNumerico e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAddIngredienteActionPerformed

    private void txtNomeIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeIngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeIngreActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionaIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionaIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionaIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionaIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionaIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JButton btnAddIngrediente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNomeIngre;
    // End of variables declaration//GEN-END:variables
}
