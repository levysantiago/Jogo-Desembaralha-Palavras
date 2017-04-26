package interface_grafica;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LT
 */
public class GUI_Principal extends javax.swing.JFrame {
    /**
     * Creates new form GUI_Principal
     */
    public GUI_Principal() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null); //INICIAR O JFRAME NO MEIO DA TELA
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int op;
                op = JOptionPane.showConfirmDialog(null, "Deseja finalizar o jogo?");
                if(op == 0){
                    btn_verificar.setSelected(true);
                    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }else{
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lb_tamanho = new javax.swing.JLabel();
        jp_pontos = new javax.swing.JPanel();
        lb_pontos = new javax.swing.JLabel();
        jp_recorde = new javax.swing.JPanel();
        lb_recorde = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_nivel = new javax.swing.JLabel();
        lb_duvida = new javax.swing.JLabel();
        btn_verificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_resposta = new javax.swing.JTextField();
        lb_palavra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_dica = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jp_pontos1 = new javax.swing.JPanel();
        lb_erros = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_jogador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_tamanho.setText("XX");

        jp_pontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos"));
        jp_pontos.setPreferredSize(new java.awt.Dimension(68, 59));

        lb_pontos.setText("00");

        javax.swing.GroupLayout jp_pontosLayout = new javax.swing.GroupLayout(jp_pontos);
        jp_pontos.setLayout(jp_pontosLayout);
        jp_pontosLayout.setHorizontalGroup(
            jp_pontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pontosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lb_pontos)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jp_pontosLayout.setVerticalGroup(
            jp_pontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pontosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_pontos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_recorde.setBorder(javax.swing.BorderFactory.createTitledBorder("Recorde"));

        lb_recorde.setText("00");

        javax.swing.GroupLayout jp_recordeLayout = new javax.swing.GroupLayout(jp_recorde);
        jp_recorde.setLayout(jp_recordeLayout);
        jp_recordeLayout.setHorizontalGroup(
            jp_recordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_recordeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lb_recorde)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jp_recordeLayout.setVerticalGroup(
            jp_recordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_recordeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_recorde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nível"));
        jPanel2.setPreferredSize(new java.awt.Dimension(68, 59));

        lb_nivel.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_nivel)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nivel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_duvida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/duvida.png"))); // NOI18N

        btn_verificar.setText("Verificar");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Resposta:");

        tf_resposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_respostaActionPerformed(evt);
            }
        });

        lb_palavra.setText("XXXXXX");

        jLabel2.setText("Palavra:");

        jLabel3.setText("Dica:");

        lb_dica.setText("XXXXXX");

        jLabel4.setText("Tamanho:");

        jp_pontos1.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros"));
        jp_pontos1.setPreferredSize(new java.awt.Dimension(68, 59));

        lb_erros.setText("00");

        javax.swing.GroupLayout jp_pontos1Layout = new javax.swing.GroupLayout(jp_pontos1);
        jp_pontos1.setLayout(jp_pontos1Layout);
        jp_pontos1Layout.setHorizontalGroup(
            jp_pontos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pontos1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lb_erros)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jp_pontos1Layout.setVerticalGroup(
            jp_pontos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pontos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_erros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Jogador:");

        lb_jogador.setText("jogador1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_duvida)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_tamanho))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_palavra))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_dica))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_verificar))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_jogador)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_pontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_pontos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_recorde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_duvida)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lb_jogador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_palavra)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lb_tamanho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lb_dica))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_verificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jp_pontos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jp_recorde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jp_pontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
        btn_verificar.setSelected(true);
        tf_resposta.requestFocus();
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void tf_respostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_respostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_respostaActionPerformed
     
    public JLabel getLb_jogador() {
        return lb_jogador;
    }
    
    public JLabel getLb_erros() {
        return lb_erros;
    }
    
    public JButton getBtn_verificar() {
        return btn_verificar;
    }
    
    public JLabel getLb_nivel() {
        return lb_nivel;
    }
    
    public JPanel getJp_pontos() {
        return jp_pontos;
    }

    public JPanel getJp_recorde() {
        return jp_recorde;
    }

    public JLabel getLb_dica() {
        return lb_dica;
    }

    public void setLb_dica(String dica) {
        this.lb_dica.setText(dica);
    }

    public JLabel getLb_duvida() {
        return lb_duvida;
    }

    public JLabel getLb_palavra() {
        return lb_palavra;
    }

    public JLabel getLb_pontos() {
        return lb_pontos;
    }

    public JLabel getLb_recorde() {
        return lb_recorde;
    }

    public JLabel getLb_tamanho() {
        return lb_tamanho;
    }

    public JTextField getTf_resposta() {
        return tf_resposta;
    }
    
    public void setTf_resposta(String resposta){
        this.tf_resposta.setText(resposta);
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
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jp_pontos;
    private javax.swing.JPanel jp_pontos1;
    private javax.swing.JPanel jp_recorde;
    private javax.swing.JLabel lb_dica;
    private javax.swing.JLabel lb_duvida;
    private javax.swing.JLabel lb_erros;
    private javax.swing.JLabel lb_jogador;
    private javax.swing.JLabel lb_nivel;
    private javax.swing.JLabel lb_palavra;
    private javax.swing.JLabel lb_pontos;
    private javax.swing.JLabel lb_recorde;
    private javax.swing.JLabel lb_tamanho;
    private javax.swing.JTextField tf_resposta;
    // End of variables declaration//GEN-END:variables
}
