package telas;

import repository.UsuarioDAO;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelos.Usuario;

public class Login extends javax.swing.JFrame {
    
    private String email;
    private String senha;
    private String tipoUsuario;
    private static Usuario usuarioLogado;

    public Login() {
        
        initComponents();
        
        this.email = "";
        this.senha = "";
        this.tipoUsuario = "Gerente";
        
    }
    
    public static Usuario retornaUsuarioLogado(){
        
        if(usuarioLogado == null){
            
            main();
            
        }
        
        return usuarioLogado;
        
    }
    
    /*private Vector<Usuario> retornaListaUsuario(Vector<Object> vetObject){
        
        Vector<Usuario> vetUsuario = new Vector<>();
        
        for(Object o : vetObject){
            
            vetUsuario.add((Usuario)o);
            
        }
        
        return vetUsuario;
            
    }*/
    
    private boolean verificaLogin(){
        
        Vector<Usuario> consultaUsuario = UsuarioDAO.consultaUsuario();
        
        for(Usuario u : consultaUsuario){
            
            if(u.getEmail().equalsIgnoreCase(this.email) && u.getSenha().equals(this.senha)){
                
                this.tipoUsuario = u.getTipoUsuario();
                usuarioLogado = u;
                this.tipoUsuario = u.getTipoUsuario();
                return true;
                
            }
            
        }
        
        return false;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        fieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Login");

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Informe o seu e-mail: ");

        fieldEmail.setBackground(new java.awt.Color(0, 0, 204));
        fieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        fieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldEmailKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Informe a sua senha; ");

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

        fieldSenha.setBackground(new java.awt.Color(0, 0, 204));
        fieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSenhaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoConfirmar)
                                .addGap(238, 238, 238)
                                .addComponent(botaoCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(fieldSenha))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void confirmar(){
        
        this.email = fieldEmail.getText();
        this.senha = fieldSenha.getText();
        
        //verifica login
        boolean login = verificaLogin();
        
        if(login){
            
            JOptionPane.showInternalConfirmDialog(this, "Login válido! Prossiga...", "Resultado do Login", HEIGHT);
            
            this.dispose();
            
        }else{
            
            JOptionPane.showInternalConfirmDialog(this, "Login inválido!", "Resultado do Login", ERROR);
            
        }
        
    }
    
    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        
        //confirmar();
        botaoConfirmar.doClick();
        
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void fieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEmailKeyReleased
        
        if(evt.getKeyChar() == '\n'){
            
            confirmar();
            
        }else if(evt.getKeyChar() == 27){
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_fieldEmailKeyReleased

    private void fieldSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSenhaKeyReleased
        
        if(evt.getKeyChar() == '\n'){
            
            confirmar();
            
        }else if(evt.getKeyChar() == 27){
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_fieldSenhaKeyReleased

    public static void main() {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
