
package FINAL_TERM;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.Scanner;

public class Dashboard extends javax.swing.JFrame {
    private String currentUser;
public Dashboard(String username) {
    initComponents();
    this.setLocationRelativeTo(null);
    this.currentUser = username;
//array
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
  model.setColumnIdentifiers(new String[]{"Location", "Day", "Target", "Importance", "Status"});
    loadTasksFromFile(); 
     
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Location = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Days = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Targit = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        setImportant = new javax.swing.JComboBox<>();
        Saveonthetable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPanel = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Donebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        movebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maps");

        Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sankanan", "Tankulan", "Manolo", "Lindaban", "Damilag", "Philips", "Alae", "Mangima" }));
        Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Set Day");

        Days.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        Days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaysActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Targit");

        Targit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "♻️ Recyclable Materials", "🌿 Biodegradable Materials", "🚫 Non-Biodegradable Materials", " " }));
        Targit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TargitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("important");

        setImportant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Priyo", "Non-Priyo", " " }));
        setImportant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setImportantActionPerformed(evt);
            }
        });

        Saveonthetable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Saveonthetable.setText("Set");
        Saveonthetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveonthetableMouseClicked(evt);
            }
        });
        Saveonthetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveonthetableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Targit, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(Days, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Location, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(setImportant, 0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Saveonthetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Targit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setImportant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Saveonthetable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(50, 205, 50));

        jLabel6.setFont(new java.awt.Font("Wide Latin", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Eco Wise");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO2 (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(79, 79, 79)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(47, 47, 47))
        );

        jDesktopPanel.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(47, 93, 128));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location", "Day", "Targit", "Important", "Result"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("List of task");

        Donebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Donebutton.setText("Done");
        Donebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DonebuttonMouseClicked(evt);
            }
        });
        Donebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonebuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
        });
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        movebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        movebutton.setText("Move");
        movebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movebuttonMouseClicked(evt);
            }
        });
        movebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Donebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(movebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Donebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jDesktopPanel.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPanel))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPanel)))
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

private void saveTasksToFile() {
    try {
        //file handling
       
        File file = new File("C:\\eco\\" + currentUser + "\\tasks.txt");
        FileWriter writer = new FileWriter(file, false); // Overwrite
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            String location = model.getValueAt(i, 0).toString();
            String day = model.getValueAt(i, 1).toString();
            String target = model.getValueAt(i, 2).toString();
            String importance = model.getValueAt(i, 3).toString();
            String status = model.getValueAt(i, 4).toString();
            writer.write("Location: " + location + ", Day: " + day + ", Target: " + target + ", Importance: " + importance + ", Status: " + status + "\n");
        }

        writer.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Failed to save tasks: " + e.getMessage());
    }
}

private void loadTasksFromFile() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing data

    try {
        File file = new File("C:\\eco\\" + currentUser + "\\tasks.txt");
        if (!file.exists()) return;

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(", ");
            if (parts.length == 5) {
                String location = parts[0].split(": ")[1];
                String day = parts[1].split(": ")[1];
                String target = parts[2].split(": ")[1];
                String importance = parts[3].split(": ")[1];
                String status = parts[4].split(": ")[1];
                model.addRow(new Object[]{location, day, target, importance, status});
            }
        }
        scanner.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Failed to load tasks: " + e.getMessage());
    }
}


    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        LOGIN_GUI log = new LOGIN_GUI();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_GUI().setVisible(true);
            }
        }); dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void DonebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonebuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DonebuttonMouseClicked

    private void DonebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonebuttonActionPerformed
   int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a row to mark as done.");
        return;
    }
    jTable1.setValueAt("Accomplished", selectedRow, 4);
    saveTasksToFile();
    }//GEN-LAST:event_DonebuttonActionPerformed

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        return;
    }
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    model.removeRow(selectedRow);
    saveTasksToFile();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void movebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movebuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_movebuttonMouseClicked

    private void movebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movebuttonActionPerformed
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a row to move.");
        return;
    }

    String[] options = {"Up", "Down"};
    int direction = javax.swing.JOptionPane.showOptionDialog(
            this, "Move row up or down?", "Move Row",
            javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);

    String input = javax.swing.JOptionPane.showInputDialog(this, "Enter how many rows to move:");
    int positions;
    try {
        positions = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid number.");
        return;
    }

    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    int targetIndex = direction == 0 ? selectedRow - positions : selectedRow + positions;

    if (targetIndex < 0 || targetIndex >= model.getRowCount()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid move. Out of bounds.");
        return;
    }

    Object[] rowData = new Object[model.getColumnCount()];
    for (int i = 0; i < model.getColumnCount(); i++) {
        rowData[i] = model.getValueAt(selectedRow, i);
    }
    model.removeRow(selectedRow);
    model.insertRow(targetIndex, rowData);
    }//GEN-LAST:event_movebuttonActionPerformed

    private void SaveonthetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveonthetableMouseClicked
    String location = (String) Location.getSelectedItem();
    String day = (String) Days.getSelectedItem();
    String target = (String) Targit.getSelectedItem();
    String importance = (String) setImportant.getSelectedItem();
    String status = "Pending";

    if (location == null || day == null || target == null || importance == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select all fields before saving!", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    model.addRow(new Object[]{location, day, target, importance, status});

    saveTasksToFile();    }//GEN-LAST:event_SaveonthetableMouseClicked

    private void SaveonthetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveonthetableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveonthetableActionPerformed

    private void LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationActionPerformed

    private void DaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaysActionPerformed

    private void TargitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TargitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TargitActionPerformed

    private void setImportantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setImportantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setImportantActionPerformed
private void saveAllTasksToFile() {
    try {
        java.io.File file = new java.io.File("C:\\eco\\" + currentUser + "\\tasks.txt");
        java.io.FileWriter writer = new java.io.FileWriter(file, false); // Overwrite
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String location = model.getValueAt(i, 0).toString();
            String day = model.getValueAt(i, 1).toString();
            String target = model.getValueAt(i, 2).toString();
            String importance = model.getValueAt(i, 3).toString();
            writer.write("Location: " + location + ", Day: " + day + ", Target: " + target + ", Importance: " + importance + "\n");
        }
        writer.close();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Failed to save tasks: " + e.getMessage());
    }
}

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Dashboard("testuser").setVisible(true); // For development only
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Days;
    private javax.swing.JButton Donebutton;
    private javax.swing.JComboBox<String> Location;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Saveonthetable;
    private javax.swing.JComboBox<String> Targit;
    private javax.swing.JButton deletebutton;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton movebutton;
    private javax.swing.JComboBox<String> setImportant;
    // End of variables declaration//GEN-END:variables
}
