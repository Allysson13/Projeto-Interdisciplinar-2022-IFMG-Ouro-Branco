package telas;

import repository.AtendimentoDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Atendimento;

public class Agendamento extends javax.swing.JFrame {
    
    private String nome;
    private Date data;
    private String tipoServico;
    private double valor;
    private int opcao;

    public Agendamento() {
        
        initComponents();
        
        this.nome = "";
        this.data = new Date(30, 2, 2023);
        this.tipoServico = "";
        this.valor = 0;
        this.opcao = 1;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        checkBoxCabelo = new javax.swing.JCheckBox();
        checkBoxBarba = new javax.swing.JCheckBox();
        checkBoxSobrancelha = new javax.swing.JCheckBox();
        botaoConfirmar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Agendamento");

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Informe o seu nome: ");

        fieldNome.setBackground(new java.awt.Color(0, 0, 204));
        fieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNomeKeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Informe a data do atendimento: ");

        fieldData.setBackground(new java.awt.Color(0, 0, 204));
        fieldData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldDataKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Informe o tipo do serviço: ");

        checkBoxCabelo.setForeground(new java.awt.Color(0, 255, 255));
        checkBoxCabelo.setText("Cabelo");
        checkBoxCabelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCabeloActionPerformed(evt);
            }
        });

        checkBoxBarba.setForeground(new java.awt.Color(0, 255, 255));
        checkBoxBarba.setText("Barba");
        checkBoxBarba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBarbaActionPerformed(evt);
            }
        });

        checkBoxSobrancelha.setForeground(new java.awt.Color(0, 255, 255));
        checkBoxSobrancelha.setText("Sobrancelha");
        checkBoxSobrancelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSobrancelhaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(fieldData))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(checkBoxBarba))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCancelar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkBoxSobrancelha)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxCabelo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(checkBoxCabelo)
                .addGap(18, 18, 18)
                .addComponent(checkBoxBarba)
                .addGap(18, 18, 18)
                .addComponent(checkBoxSobrancelha)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmar(){
        
        this.nome = fieldNome.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            this.data = (Date) formato.parse(fieldData.getText());
            
        } catch (ParseException ex) {
            
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        Vector<String> vetServicos = new Vector<>();
        
        switch(opcao){
            
            case 1:
                
                vetServicos.add("Cabelo");
                this.valor = 20;
                
                break;
                
            case 2:
                
                vetServicos.add("Barba");
                this.valor = 10;
                
                break;
                
            default:
                
                vetServicos.add("Sobrancelha");
                this.valor = 5;
                
                break;
            
        }
        
        for(String s : vetServicos){
            
            this.tipoServico += s;
            
        }
        
        Atendimento novoAtendimento = new Atendimento(data, tipoServico, valor, nome);
        
        AtendimentoDAO.inserirAtendimento(novoAtendimento);
        
        this.dispose();
        
    }
    
    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        
        confirmar();
        
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void checkBoxSobrancelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSobrancelhaActionPerformed

        opcao = 3;
    }//GEN-LAST:event_checkBoxSobrancelhaActionPerformed

    private void checkBoxBarbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBarbaActionPerformed

        opcao = 2;

    }//GEN-LAST:event_checkBoxBarbaActionPerformed

    private void checkBoxCabeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCabeloActionPerformed

        opcao = 1;

    }//GEN-LAST:event_checkBoxCabeloActionPerformed

    private void fieldDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldDataKeyReleased
        
        if(evt.getKeyChar() == '\n'){
            
            confirmar();
            
        }else if(evt.getKeyChar() == 27){
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_fieldDataKeyReleased

    private void fieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNomeKeyReleased
        
        if(evt.getKeyChar() == '\n'){
            
            confirmar();
            
        }else if(evt.getKeyChar() == 27){
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_fieldNomeKeyReleased

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
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JCheckBox checkBoxBarba;
    private javax.swing.JCheckBox checkBoxCabelo;
    private javax.swing.JCheckBox checkBoxSobrancelha;
    private javax.swing.JTextField fieldData;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
