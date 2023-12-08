package com.mycompany.pizzaplanet.View;

import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Ingrediente;
import com.mycompany.pizzaplanet.Model.PizzaDoce;
import com.mycompany.pizzaplanet.Model.PizzaSalgada;
import com.mycompany.pizzaplanet.Model.Tamanho;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

public class DashboardCliente extends javax.swing.JFrame {

    public Font fonteCabecalho = new Font("Monospaced", Font.BOLD, 14);
    public Font fonteCorpo = new Font("Monospaced", Font.PLAIN, 12);
    /**
     * Creates new form DashboardCliente
     */
    public DashboardCliente() {
        initComponents();
        buttonGroup1 = new ButtonGroup();
        //inicializa o painel dos tamanhos
        panelTamanhos.setLayout(new FlowLayout());
        panelTamanhos.setPreferredSize(new Dimension(300, 200));
        //inicializa o painel das pizzas salgadas
        SPPizzaSalgada.setLayout(new ScrollPaneLayout());
        SPPizzaSalgada.setPreferredSize(new Dimension(300, 200));
        panelPizzaSalgada.setLayout(new BoxLayout(panelPizzaSalgada, BoxLayout.Y_AXIS));
        panelPizzaSalgada.setPreferredSize(new Dimension(600, 200));
        panelPizzaDoce.setLayout(new BoxLayout(panelPizzaDoce, BoxLayout.Y_AXIS));
        panelPizzaDoce.setPreferredSize(new Dimension(600, 200));
        //adiciona os paineis no jfreme
        this.add(panelTamanhos);
        this.add(SPPizzaSalgada);
         // Substitua por sua fonte desejada
        JTableHeader cabecalho = tableTamanho.getTableHeader();
        cabecalho.setFont(fonteCabecalho);
//        CBPizzasSalgadas = new javax.swing.JComboBox<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTamanho = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        SPPizzaSalgada = new javax.swing.JScrollPane();
        panelTamanhos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelPizzaDoce = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelPizzaSalgada = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("Conheça nossos tamanhos para pizza!");

        tableTamanho.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tableTamanho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tamanho", "Quant. Pedaços", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTamanho.setRowSelectionAllowed(false);
        tableTamanho.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableTamanhoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tableTamanho);
        if (tableTamanho.getColumnModel().getColumnCount() > 0) {
            tableTamanho.getColumnModel().getColumn(0).setResizable(false);
            tableTamanho.getColumnModel().getColumn(1).setResizable(false);
            tableTamanho.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("Conheça nossas Pizzas!!");

        SPPizzaSalgada.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SPPizzaSalgadaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        panelTamanhos.setBackground(new java.awt.Color(153, 153, 153));
        panelTamanhos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelTamanhosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelTamanhosLayout = new javax.swing.GroupLayout(panelTamanhos);
        panelTamanhos.setLayout(panelTamanhosLayout);
        panelTamanhosLayout.setHorizontalGroup(
            panelTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        panelTamanhosLayout.setVerticalGroup(
            panelTamanhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Bem Vindo!");

        panelPizzaDoce.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelPizzaDoceAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelPizzaDoceLayout = new javax.swing.GroupLayout(panelPizzaDoce);
        panelPizzaDoce.setLayout(panelPizzaDoceLayout);
        panelPizzaDoceLayout.setHorizontalGroup(
            panelPizzaDoceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        panelPizzaDoceLayout.setVerticalGroup(
            panelPizzaDoceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("Pizzas Salgadas");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("Pizzas Doces");

        panelPizzaSalgada.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelPizzaSalgadaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelPizzaSalgadaLayout = new javax.swing.GroupLayout(panelPizzaSalgada);
        panelPizzaSalgada.setLayout(panelPizzaSalgadaLayout);
        panelPizzaSalgadaLayout.setHorizontalGroup(
            panelPizzaSalgadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        panelPizzaSalgadaLayout.setVerticalGroup(
            panelPizzaSalgadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SPPizzaSalgada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel2))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(panelTamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(panelPizzaSalgada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelPizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(SPPizzaSalgada, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(361, 361, 361)
                                .addComponent(panelTamanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelPizzaSalgada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPizzaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        jMenu1.setText("Dashboard");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelTamanhosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelTamanhosAncestorAdded
        // TODO add your handling code here:
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDTamanho(BancoDeDados.getBancoTamanho());
            for(Tamanho tam : Tamanho.getListaTamanhos()) {
                int optionNumber = buttonGroup1.getButtonCount() + 1;
                JRadioButton radioButton = new JRadioButton(tam.getNome()+" - "+tam.getQuantidadePecas()+" pedaços - R$"+tam.getValor());
//                System.out.println(radioButton.getText());
                buttonGroup1.add(radioButton);
                panelTamanhos.add(radioButton);
                radioButton.setVisible(true);
                panelTamanhos.revalidate();
                panelTamanhos.repaint();
                radioButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Selecionado: ");
                }   
                });
            }
            
        } catch (IOException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_panelTamanhosAncestorAdded

    
    
    private void tableTamanhoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableTamanhoAncestorAdded
        // TODO add your handling code here:
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDTamanho(BancoDeDados.getBancoTamanho());
            DefaultTableModel model = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Torna todas as células não editáveis
                    return false;
                }
            };
            //adiciona as colunas na tabela
            model.addColumn("Tamanho");
            model.addColumn("Quant. Pedaços");
            model.addColumn("Preço");
            model.setNumRows(0);
            //adiciona as linhas na tabela
            for(Tamanho tamanho : Tamanho.getListaTamanhos()) {
                model.addRow(new Object[]{tamanho.getNome(), tamanho.getQuantidadePecas(), tamanho.getValor()});
            }
            tableTamanho.setModel(model);
        } catch (IOException e) {
            System.out.println("error");
        }
        
    }//GEN-LAST:event_tableTamanhoAncestorAdded

    private void SPPizzaSalgadaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SPPizzaSalgadaAncestorAdded
        // TODO add your handling code here:
        System.out.println("entrou");
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPizzaSalgada(BancoDeDados.getBancoPizzaSalgada());
            for(PizzaSalgada pizza : PizzaSalgada.getListaPizzasSalgadas()) {
                JPanel panel = new JPanel();
                JLabel nome = new JLabel(pizza.getNome());
                
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setSize(200, 50);
                
                nome.setSize(200, 50);
                nome.setHorizontalAlignment(nome.RIGHT);
                
                panel.add(nome);
                nome.setVisible(true);
//                System.out.println(nome.getText());
                SPPizzaSalgada.add(panel);
                SPPizzaSalgada.revalidate();
                SPPizzaSalgada.repaint();
                
                
                
                pack();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_SPPizzaSalgadaAncestorAdded

    private void panelPizzaDoceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelPizzaDoceAncestorAdded
        // TODO add your handling code here:
        try {
//            System.out.println("entrou");
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPizzaDoce(BancoDeDados.getBancoPizzaDoce());
            for(PizzaDoce pizza : PizzaDoce.getListaPizzasDoces()) {
                JLabel nome = new JLabel(pizza.getNome());
                JTextPane ingredientes = new JTextPane();
                
                nome.setFont(fonteCabecalho);
                nome.setHorizontalAlignment(nome.LEFT);
                ingredientes.setFont(fonteCorpo);
                
                int aux = 0;
                for(Ingrediente ingre : pizza.getListaIngredientes()) {
                    if(aux == 0) {
                        ingredientes.setText(ingre.getNome());
                        aux++;
                    } else {
                        ingredientes.setText(ingredientes.getText()+", "+ingre.getNome());
                    }
                }
                
                panelPizzaDoce.add(nome);
                panelPizzaDoce.add(ingredientes);
//                SPPizzaSalgada.revalidate();
//                SPPizzaSalgada.repaint();
                
                
                
                pack();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_panelPizzaDoceAncestorAdded

    private void panelPizzaSalgadaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelPizzaSalgadaAncestorAdded
        // TODO add your handling code here:
         try {
//            System.out.println("entrou");
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPizzaSalgada(BancoDeDados.getBancoPizzaSalgada());
            for(PizzaSalgada pizza : PizzaSalgada.getListaPizzasSalgadas()) {
                JLabel nome = new JLabel(pizza.getNome());
                JTextPane ingredientes = new JTextPane();
                
                nome.setFont(fonteCabecalho);
                nome.setHorizontalAlignment(nome.LEFT);
                ingredientes.setFont(fonteCorpo);
                
                int aux = 0;
                for(Ingrediente ingre : pizza.getListaIngredientes()) {
                    if(aux == 0) {
                        ingredientes.setText(ingre.getNome());
                        aux++;
                    } else {
                        ingredientes.setText(ingredientes.getText()+", "+ingre.getNome());
                    }
                }
//                
                panelPizzaSalgada.add(nome);
                panelPizzaSalgada.add(ingredientes);
//                SPPizzaSalgada.revalidate();
//                SPPizzaSalgada.repaint();
                
                
                
                pack();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_panelPizzaSalgadaAncestorAdded

    
    private void addRadioButton(String label) {

//        // Adiciona um ActionListener para lidar com eventos de seleção
//        radioButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Selecionado: " + label);
//            }
//        });
    }
    
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
            java.util.logging.Logger.getLogger(DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SPPizzaSalgada;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelPizzaDoce;
    private javax.swing.JPanel panelPizzaSalgada;
    private javax.swing.JPanel panelTamanhos;
    private javax.swing.JTable tableTamanho;
    // End of variables declaration//GEN-END:variables
}
