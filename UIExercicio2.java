/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exercicio2Pack;

/**
 *
 * @author Daniel
 */
public class UIExercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form UIExercicio2
     */
    public UIExercicio2() {
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

        InputPanel = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        LbName = new javax.swing.JLabel();
        LbWeight = new javax.swing.JLabel();
        LbHeight = new javax.swing.JLabel();
        TxName = new javax.swing.JTextField();
        TxWeight = new javax.swing.JTextField();
        TxHeight = new javax.swing.JTextField();
        BtClear = new javax.swing.JButton();
        BtCalc = new javax.swing.JButton();
        OutPanel = new javax.swing.JPanel();
        LbResp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Welcome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        Welcome.setText("Bem-vindo, informe os dados abaixo para conhecer sua dieta ideal");

        LbName.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        LbName.setText("Nome");

        LbWeight.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        LbWeight.setText("Peso (kg)");

        LbHeight.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        LbHeight.setText("Altura (cm)");

        TxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNameActionPerformed(evt);
            }
        });

        BtClear.setText("Limpar");
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });

        BtCalc.setText("Calcular");
        BtCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Welcome)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(LbHeight)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtCalc))
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(TxHeight))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addComponent(LbWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addComponent(LbName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxName, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(TxWeight))))
                .addGap(15, 15, 15))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbWeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbHeight)
                    .addComponent(TxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCalc)
                    .addComponent(BtClear))
                .addContainerGap())
        );

        OutPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LbResp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LbResp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(LbResp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcActionPerformed
        // TODO add your handling code here:
        calc();
    }//GEN-LAST:event_BtCalcActionPerformed

    // M�todo para limpar os campos
    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        // TODO add your handling code here:
        TxName.setText("");
        TxWeight.setText("");
        TxHeight.setText("");
        LbResp.setText("");
    }//GEN-LAST:event_BtClearActionPerformed

    private void TxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNameActionPerformed

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
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIExercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalc;
    private javax.swing.JButton BtClear;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JLabel LbHeight;
    private javax.swing.JLabel LbName;
    private javax.swing.JLabel LbResp;
    private javax.swing.JLabel LbWeight;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JTextField TxHeight;
    private javax.swing.JTextField TxName;
    private javax.swing.JTextField TxWeight;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables

    public void calc() {
        //Vari�veis
        Double Altura;
        Double Peso;
        Double Imc;
        String mensagem = null;

        //Capturando o que o usu�rio digitou
        String nome = TxName.getText();
        Peso = Double.parseDouble(TxWeight.getText());
        Altura = Double.parseDouble(TxHeight.getText());

        // C�lculo
        Imc = Peso / (Altura / 100 * Altura / 100);

        // Gravando a Mensagem
        if (Imc < 18.5) {
            mensagem = "Voc� est� muito magro. Precisa de uma dieta para engordar.";
        } else if (Imc < 24.9) {
            mensagem = "Voc� est� com peso ideal. N�o precisa de dieta.";
        } else if (Imc < 29.9) {
            mensagem = "Voc� est� com sobrepeso. Precisa de uma dieta para emagrecer.";
        } else if (Imc < 30) {
            mensagem = "Voc� est� com obesidade. Precisa de uma dieta, exerc�cios e uma mudan�a de vida.";
        } else {
            mensagem = "Voc� est� com obesidade grave. Precisa procurar um m�dico.";
        }

        // Mostrando a mensagem para o usu�rio
        LbResp.setText("<html>Ol� " + nome + ", seu IMC � " + Imc + ".<br> " + mensagem + "</html>");
    }
}
