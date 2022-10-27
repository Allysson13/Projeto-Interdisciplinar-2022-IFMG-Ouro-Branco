package telas;

public class Opções extends javax.swing.JFrame {
    
    private int opcao;

    public Opções() {
        
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoCadastroUsuario = new javax.swing.JRadioButton();
        botaoCriarPerfil = new javax.swing.JRadioButton();
        botaoLogin = new javax.swing.JRadioButton();
        botaoAgendamento = new javax.swing.JRadioButton();
        botaoConfirmar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Bem-vindo, escolha uma das opções: ");

        botaoCadastroUsuario.setForeground(new java.awt.Color(0, 255, 255));
        botaoCadastroUsuario.setText("Cadastro de Usuário");
        botaoCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroUsuarioActionPerformed(evt);
            }
        });

        botaoCriarPerfil.setForeground(new java.awt.Color(0, 255, 255));
        botaoCriarPerfil.setText("Criar Perfil");
        botaoCriarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarPerfilActionPerformed(evt);
            }
        });

        botaoLogin.setForeground(new java.awt.Color(0, 255, 255));
        botaoLogin.setText("Login");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        botaoAgendamento.setForeground(new java.awt.Color(0, 255, 255));
        botaoAgendamento.setText("Agendamento");
        botaoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendamentoActionPerformed(evt);
            }
        });

        botaoConfirmar.setBackground(new java.awt.Color(0, 0, 204));
        botaoConfirmar.setForeground(new java.awt.Color(0, 255, 255));
        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        botaoCancelar.setBackground(new java.awt.Color(0, 0, 204));
        botaoCancelar.setForeground(new java.awt.Color(0, 255, 255));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Opções");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(botaoCadastroUsuario)
                            .addComponent(botaoCriarPerfil)
                            .addComponent(botaoLogin)
                            .addComponent(botaoAgendamento))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastroUsuario)
                .addGap(18, 18, 18)
                .addComponent(botaoCriarPerfil)
                .addGap(18, 18, 18)
                .addComponent(botaoLogin)
                .addGap(18, 18, 18)
                .addComponent(botaoAgendamento)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroUsuarioActionPerformed
        this.opcao = 1;
    }//GEN-LAST:event_botaoCadastroUsuarioActionPerformed

    private void botaoCriarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarPerfilActionPerformed
        this.opcao = 2;
    }//GEN-LAST:event_botaoCriarPerfilActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        this.opcao = 3;
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendamentoActionPerformed
        this.opcao = 4;
    }//GEN-LAST:event_botaoAgendamentoActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        
        switch(opcao){
            
            case 1:
                
                CadastroUsuario.main();
                //fecha frame
                
                break;
            
            case 2:
                
                CriarPerfil.main();
                //fecha frame
                
                break;
                
            case 3:
                
                Login.main();
                //fecha frame
                
                break;
                
            default:
                
                Agendamento.main();
                //fecha frame
                
                break;
            
        }
        
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        
        //fecha frame
        
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Opções.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opções.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opções.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opções.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opções().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoAgendamento;
    private javax.swing.JRadioButton botaoCadastroUsuario;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JRadioButton botaoCriarPerfil;
    private javax.swing.JRadioButton botaoLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
