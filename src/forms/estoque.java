/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.functions;
import edit.editar_estoque;
import add.add_estoque;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author i14584i
 */
public class estoque extends javax.swing.JFrame {
functions func = new functions();
String var = "nao";
    /**
     * Creates new form estoque
     */
    public estoque() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        caixa_txt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo para prin.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/barrinhas-divisorias-cute-kawaii-photoscape-shopping-by-thataschultz20110925-scallop_beige.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 870, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jLabel10.setToolTipText("Adicionar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 50));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(102, 51, 0));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 850, 200));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 51, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caixa.png"))); // NOI18N
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit-.png"))); // NOI18N
        jLabel3.setToolTipText("Alterar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 50));

        txt_pesquisar.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        txt_pesquisar.setForeground(new java.awt.Color(204, 204, 204));
        txt_pesquisar.setText("Pesquisar...");
        txt_pesquisar.setToolTipText("");
        txt_pesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(txt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 760, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jLabel4.setToolTipText("Excluir");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jLabel5.setToolTipText("Voltar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 110, 80));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 588, 60, -1));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 100)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Estoque");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 300, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coins.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 130, 140));

        caixa_txt.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        caixa_txt.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(caixa_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bg/Fundo bisque.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        ImageIcon img = new ImageIcon("src//Imagens//edit-selecionado.png");
        jLabel3.setIcon(img);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        ImageIcon img = new ImageIcon("src//Imagens//edit-.png");
        jLabel3.setIcon(img);
    }//GEN-LAST:event_jLabel3MouseExited

    private void txt_pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pesquisarMouseClicked
        txt_pesquisar.setText("");
        txt_pesquisar.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_pesquisarMouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon img = new ImageIcon("src//Imagens//delete-selecionado.png");
        jLabel4.setIcon(img);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        ImageIcon img = new ImageIcon("src//Imagens//delete.png");
        jLabel4.setIcon(img);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        main frm = new main();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel7.setText("Voltar");
        ImageIcon img = new ImageIcon("src//Imagens//back-selecionado.png");
        jLabel5.setIcon(img);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel7.setText("");
        ImageIcon img = new ImageIcon("src//Imagens//back.png");
        jLabel5.setIcon(img);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        caixa_txt.setText("Caixa ");
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
       caixa_txt.setText("");
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        ImageIcon img = new ImageIcon("src//Imagens//add-selecionado.png");
        jLabel10.setIcon(img);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        ImageIcon img = new ImageIcon("src//Imagens//add.png");
        jLabel10.setIcon(img);
    }//GEN-LAST:event_jLabel10MouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        main frm = new main();
        frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        caixa frm = new caixa();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        DefaultTableModel lista = new DefaultTableModel();
        lista.addColumn("Código");
        lista.addColumn("Produto");
        lista.addColumn("Preço");
        lista.addColumn("Quantidade");
        lista.addColumn("Descrição");
        functions func = new functions();
        ResultSet rs = func.execute("SELECT * FROM estoque ORDER BY nome_prod ASC;", "SELECT");
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome_prod");
                String preco = rs.getString("preco_prod");
                int qtd = rs.getInt("qtd_prod");
                String ds = rs.getString("desc_prod");
                String[] dados = {""+id,nome,"R$ "+preco, ""+qtd,ds};
                lista.addRow(dados);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }

        jTable1.setModel(lista);
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int res = pergunta("Deseja excluir este fornecedor?","Excluir");
        int linha = jTable1.getSelectedRow();
        if(res == 0)
        {
            try{
            int cod = Integer.parseInt(jTable1.getValueAt(linha,0).toString());
            func.execute("DELETE FROM estoque WHERE id='"+cod+"';","INSERT");
            JOptionPane.showMessageDialog(this,"Excluído com sucesso!");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       int linha = jTable1.getSelectedRow();
        if(var.equals("sim"))
        {
        int selecionado = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());
        editar_estoque frm = new editar_estoque();
        frm.id = selecionado;
        frm.setVisible(true);
        this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Por favor, selecione um produto para poder editar.");
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        var = "sim";
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        add_estoque frm = new add_estoque();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked
 public int pergunta(String pergunta, String tit) {
        
        int n = JOptionPane.showConfirmDialog(
    null,
    ""+pergunta,
    ""+tit,
    JOptionPane.YES_NO_OPTION);
        return n;
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
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caixa_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
