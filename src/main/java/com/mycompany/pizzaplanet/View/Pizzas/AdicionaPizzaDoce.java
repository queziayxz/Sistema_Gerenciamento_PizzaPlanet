
package com.mycompany.pizzaplanet.View.Pizzas;

import com.mycompany.pizzaplanet.Controller.PizzaController;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Ingrediente;
import com.mycompany.pizzaplanet.Model.PizzaDoce;
import com.mycompany.pizzaplanet.View.DashboardAdm;
import com.mycompany.pizzaplanet.View.Ingredientes.GerenciamentoIngrediente;
import com.mycompany.pizzaplanet.View.Produtos.GerenciamentoProduto;
import com.mycompany.pizzaplanet.View.Tamanhos.GerenciamentoTamanho;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author quezi
 */
public class AdicionaPizzaDoce extends javax.swing.JFrame {

    /**
     * Creates new form AdicionaPizzaDoce
     */
    public AdicionaPizzaDoce() {
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

        btnVoltarPizzaDoce = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomePizzaDoce = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIngreAddPizzaDoce = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1Doce = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarPizzaDoce.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        btnVoltarPizzaDoce.setText("<---");
        btnVoltarPizzaDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPizzaDoceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Adicionando Pizza Doce");

        txtNomePizzaDoce.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtNomePizzaDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePizzaDoceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setText("Sabor:");

        tableIngreAddPizzaDoce.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        tableIngreAddPizzaDoce.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
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
        tableIngreAddPizzaDoce.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableIngreAddPizzaDoceAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tableIngreAddPizzaDoce);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setText("Ingredientes:");

        jButton1Doce.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1Doce.setText("Adicionar Pizza");
        jButton1Doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DoceActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVoltarPizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtNomePizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1Doce)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnVoltarPizzaDoce)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomePizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        DashboardAdm dashAdm = new DashboardAdm();
        dashAdm.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoIngrediente indexT = new GerenciamentoIngrediente();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoTamanho indexI = new GerenciamentoTamanho();
        indexI.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoTamanho indexT = new GerenciamentoTamanho();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoPizza indexP = new GerenciamentoPizza();
        indexP.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoProduto indexT = new GerenciamentoProduto();
        indexT.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnVoltarPizzaDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPizzaDoceActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GerenciamentoPizza indexP = new GerenciamentoPizza();
        indexP.setVisible(true);
    }//GEN-LAST:event_btnVoltarPizzaDoceActionPerformed

    private void tableIngreAddPizzaDoceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableIngreAddPizzaDoceAncestorAdded
        // TODO add your handling code here:
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());
            DefaultTableModel model = (DefaultTableModel)tableIngreAddPizzaDoce.getModel();
            model.setNumRows(0);
            for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
                if("Doce".equals(ingre.getCategoria())) {
                    System.out.println(Ingrediente.getlistaIngrediente().size());
                    model.addRow(new Object[]{false,ingre.getNome()});
                }
            }
        } catch (IOException e) {
            System.out.println("erro");
        }
    }//GEN-LAST:event_tableIngreAddPizzaDoceAncestorAdded

    private void txtNomePizzaDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePizzaDoceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePizzaDoceActionPerformed

    private void jButton1DoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DoceActionPerformed
        // TODO add your handling code here:
        
        try {
            int linhasSelecionadas = tableIngreAddPizzaDoce.getRowCount();
            List<Ingrediente> ingredientesPizza = new ArrayList<>();
            for(int i = 0; i < linhasSelecionadas; i++) {
                if(Boolean.TRUE.equals(tableIngreAddPizzaDoce.getModel().getValueAt(i,0))) {
                    Ingrediente ingre = new Ingrediente(tableIngreAddPizzaDoce.getModel().getValueAt(i,1).toString(),"Doce");
                    ingredientesPizza.add(ingre);
                }
            }
            PizzaDoce pizza = new PizzaDoce(txtNomePizzaDoce.getText().trim(), ingredientesPizza);
            PizzaDoce.validaCampoVazioAdiciona(pizza);
            PizzaController.adicionaPizzaDoce(pizza);
            JOptionPane.showMessageDialog(null, "Pizza cadastrada com sucesso!!");
            txtNomePizzaDoce.setText("");
            for(int i = 0; i < linhasSelecionadas; i++) {
                tableIngreAddPizzaDoce.getModel().setValueAt(Boolean.FALSE, i, 0);
            }
        } catch(CampoVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton1DoceActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionaPizzaDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionaPizzaDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionaPizzaDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionaPizzaDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionaPizzaDoce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarPizzaDoce;
    private javax.swing.JButton jButton1Doce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableIngreAddPizzaDoce;
    private javax.swing.JTextField txtNomePizzaDoce;
    // End of variables declaration//GEN-END:variables
}
