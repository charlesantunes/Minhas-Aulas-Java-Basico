package com.capgemini.interfacegrafica;

import javax.swing.JOptionPane;

public class Tela01 extends javax.swing.JPanel {
    public static void main(String[] args) {
        
    }
    public Tela01() {
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

        jPanel3 = new javax.swing.JPanel();
        LabelUsuario = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        TextLogin = new javax.swing.JTextField();
        TextSenha = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 102));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelUsuario.setText("Usuário");

        LabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelSenha.setText("Senha");

        TextLogin.setToolTipText("Digite seu login");
        TextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextLoginActionPerformed(evt);
            }
        });

        TextSenha.setToolTipText("Digite sua senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUsuario)
                    .addComponent(LabelSenha)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TextSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(TextLogin, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(LabelUsuario)
                .addGap(7, 7, 7)
                .addComponent(TextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelSenha)
                .addGap(9, 9, 9)
                .addComponent(TextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JTextField TextLogin;
    private javax.swing.JTextField TextSenha;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
