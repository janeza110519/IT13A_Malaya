
package FINAL_TERM;

public class LOGIN_GUI extends javax.swing.JFrame {

    public LOGIN_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        BRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(50, 205, 50));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EcoWise");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO2 (1).jpg"))); // NOI18N
        jLabel3.setText("logo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        Tusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TusernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Username");

        loginbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        BRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BRegister.setText("Register");
        BRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(Tusername)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tusername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String decryptCaesar(String input, int shift) {
    StringBuilder result = new StringBuilder();
    for (char c : input.toCharArray()) {
        if (Character.isLetter(c)) {
            char base = Character.isLowerCase(c) ? 'a' : 'A';
            c = (char) ((c - base - shift + 26) % 26 + base);
        }
        result.append(c);
    }
    return result.toString();
}

    private void TusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TusernameActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
       
         String user = Tusername.getText().trim();
    String pass = new String(Password.getPassword()).trim();

    if (user.isEmpty() || pass.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Username and password must be filled!", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        java.io.File userDir = new java.io.File("C:\\eco", user);
        java.io.File credentialsFile = new java.io.File(userDir, "credentials.txt");

        if (!userDir.exists() || !credentialsFile.exists()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Username not found!", "Login Failed", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        java.util.Scanner scanner = new java.util.Scanner(credentialsFile);
        String storedUsername = "";
        String storedEncryptedPass = "";

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("Username: ")) {
                storedUsername = line.substring(10).trim();
            } else if (line.startsWith("Password: ")) {
                storedEncryptedPass = line.substring(10).trim();
            }
        }
        scanner.close();

        String decryptedPass = decryptCaesar(storedEncryptedPass, 3);

        if (user.equals(storedUsername) && pass.equals(decryptedPass)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Login Successful!");
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Dashboard(user).setVisible(true);

                }
            });
            dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid username or password!", "Login Failed", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void BRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegisterActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER_GUI().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_BRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRegister;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Tusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton loginbutton;
    // End of variables declaration//GEN-END:variables
}
