/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package passwordsafe.ui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author RESEARCH2
 */
public class JPanelViewEntry extends javax.swing.JPanel {
    private char mask;
    /**
     * Creates new form JPanelViewEntry
     */
    public JPanelViewEntry() {
        initComponents();
    }

    public JButton getjButtonDelete_1() {
        return jButtonDelete_1;
    }

    public void setjButtonDelete_1(JButton jButtonDelete_1) {
        this.jButtonDelete_1 = jButtonDelete_1;
    }

    public JButton getjButtonDelete_2() {
        return jButtonDelete_2;
    }

    public void setjButtonDelete_2(JButton jButtonDelete_2) {
        this.jButtonDelete_2 = jButtonDelete_2;
    }

    public JButton getjButtonDelete_3() {
        return jButtonDelete_3;
    }

    public void setjButtonDelete_3(JButton jButtonDelete_3) {
        this.jButtonDelete_3 = jButtonDelete_3;
    }

    public JButton getjButtonHidePass() {
        return jButtonHidePass;
    }

    public void setjButtonHidePass(JButton jButtonHidePass) {
        this.jButtonHidePass = jButtonHidePass;
    }

    public JButton getjButtonSave_1() {
        return jButtonSave_1;
    }

    public void setjButtonSave_1(JButton jButtonSave_1) {
        this.jButtonSave_1 = jButtonSave_1;
    }

    public JButton getjButtonSave_2() {
        return jButtonSave_2;
    }

    public void setjButtonSave_2(JButton jButtonSave_2) {
        this.jButtonSave_2 = jButtonSave_2;
    }

    public JButton getjButtonSave_3() {
        return jButtonSave_3;
    }

    public void setjButtonSave_3(JButton jButtonSave_3) {
        this.jButtonSave_3 = jButtonSave_3;
    }

    public JButton getjButtonShowPass() {
        return jButtonShowPass;
    }

    public void setjButtonShowPass(JButton jButtonShowPass) {
        this.jButtonShowPass = jButtonShowPass;
    }

    public JLabel getjLabelCategory() {
        return jLabelCategory;
    }

    public void setjLabelCategory(JLabel jLabelCategory) {
        this.jLabelCategory = jLabelCategory;
    }

    public JPanel getjPanelCategory() {
        return jPanelCategory;
    }

    public void setjPanelCategory(JPanel jPanelCategory) {
        this.jPanelCategory = jPanelCategory;
    }

    public JPasswordField getjPasswordFieldPassword() {
        return jPasswordFieldPassword;
    }

    public void setjPasswordFieldPassword(JPasswordField jPasswordFieldPassword) {
        this.jPasswordFieldPassword = jPasswordFieldPassword;
    }

    public JTextField getjTextFieldUsername() {
        return jTextFieldUsername;
    }

    public void setjTextFieldUsername(JTextField jTextFieldUsername) {
        this.jTextFieldUsername = jTextFieldUsername;
    }

    public JTextField getjTextFieldWebsite() {
        return jTextFieldWebsite;
    }

    public void setjTextFieldWebsite(JTextField jTextFieldWebsite) {
        this.jTextFieldWebsite = jTextFieldWebsite;
    }
    public void initButtonEvents(ActionListener al)
    {
        jButtonDelete_1.addActionListener(al);
        jButtonDelete_2.addActionListener(al);
        jButtonDelete_3.addActionListener(al);
        jButtonSave_1.addActionListener(al);
        jButtonSave_2.addActionListener(al);
        jButtonSave_3.addActionListener(al);
        jButtonShowPass.addActionListener(al);
        jButtonHidePass.addActionListener(al);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCategory = new javax.swing.JPanel();
        jLabelCategory = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonDelete_1 = new javax.swing.JButton();
        jButtonSave_1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonShowPass = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonHidePass = new javax.swing.JButton();
        jButtonDelete_2 = new javax.swing.JButton();
        jButtonSave_2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldWebsite = new javax.swing.JTextField();
        jButtonSave_3 = new javax.swing.JButton();
        jButtonDelete_3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanelCategory.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelCategory.setBackground(getBackground());
        jLabelCategory.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabelCategory.setForeground(new java.awt.Color(255, 153, 0));
        jLabelCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCategory.setText("Emails");
        jLabelCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelCategory.setIconTextGap(0);
        jLabelCategory.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTextFieldUsername.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldUsername.setText("simonkiruku@gmail.com");

        jButtonDelete_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/delete.png"))); // NOI18N
        jButtonDelete_1.setContentAreaFilled(false);
        jButtonDelete_1.setIconTextGap(0);
        jButtonDelete_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete_1ActionPerformed(evt);
            }
        });

        jButtonSave_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/save.png"))); // NOI18N
        jButtonSave_1.setContentAreaFilled(false);
        jButtonSave_1.setIconTextGap(0);

        jLabel2.setText("Username");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jButtonSave_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jButtonDelete_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButtonShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/show.png"))); // NOI18N
        jButtonShowPass.setContentAreaFilled(false);
        jButtonShowPass.setIconTextGap(0);
        jButtonShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPassActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordFieldPassword.setText("jPasswordField1");

        jButtonHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/hide.png"))); // NOI18N
        jButtonHidePass.setContentAreaFilled(false);
        jButtonHidePass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonHidePass.setIconTextGap(0);
        jButtonHidePass.setMargin(new java.awt.Insets(5, 14, 2, 14));
        jButtonHidePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHidePassActionPerformed(evt);
            }
        });

        jButtonDelete_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/delete.png"))); // NOI18N
        jButtonDelete_2.setContentAreaFilled(false);
        jButtonDelete_2.setIconTextGap(0);
        jButtonDelete_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete_2ActionPerformed(evt);
            }
        });

        jButtonSave_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/save.png"))); // NOI18N
        jButtonSave_2.setContentAreaFilled(false);
        jButtonSave_2.setIconTextGap(0);

        jLabel3.setText("Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHidePass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSave_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jButtonSave_2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete_2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHidePass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTextFieldWebsite.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldWebsite.setText("https://gmail.mail.com");

        jButtonSave_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/save.png"))); // NOI18N
        jButtonSave_3.setContentAreaFilled(false);
        jButtonSave_3.setIconTextGap(0);

        jButtonDelete_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passwordsafe/resources/delete.png"))); // NOI18N
        jButtonDelete_3.setContentAreaFilled(false);
        jButtonDelete_3.setIconTextGap(0);

        jLabel4.setText("Website");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jButtonSave_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButtonSave_3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete_3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowPassActionPerformed
        // TODO add your handling code here:
        mask = jPasswordFieldPassword.getEchoChar();
        jPasswordFieldPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_jButtonShowPassActionPerformed

    private void jButtonHidePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHidePassActionPerformed
        // TODO add your handling code here:
        jPasswordFieldPassword.setEchoChar(mask);
    }//GEN-LAST:event_jButtonHidePassActionPerformed

    private void jButtonDelete_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete_2ActionPerformed
        // TODO add your handling code here:
        //jPasswordFieldPassword.setText(""+textField.getText().substring(0, textField.getText ().length - 1));
    }//GEN-LAST:event_jButtonDelete_2ActionPerformed

    private void jButtonDelete_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete_1ActionPerformed
        // TODO add your handling code here:
        jTextFieldUsername.setText(""+jTextFieldUsername.getText().substring(0, jTextFieldUsername.getText().length() - 1));
    }//GEN-LAST:event_jButtonDelete_1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete_1;
    private javax.swing.JButton jButtonDelete_2;
    private javax.swing.JButton jButtonDelete_3;
    private javax.swing.JButton jButtonHidePass;
    private javax.swing.JButton jButtonSave_1;
    private javax.swing.JButton jButtonSave_2;
    private javax.swing.JButton jButtonSave_3;
    private javax.swing.JButton jButtonShowPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldWebsite;
    // End of variables declaration//GEN-END:variables
}