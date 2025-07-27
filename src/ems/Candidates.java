package ems;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class Candidates extends javax.swing.JFrame {
    public Candidates() {
        initComponents();
        getElections();
        DisplayCandidates();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CandNameTb = new javax.swing.JTextField();
        CandidatePictureLbl = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTable = new javax.swing.JTable();
        CAgeTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ElectionCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CandPartyCb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        BrowseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 138, 62));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Election Management System");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 138, 62));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Candidates");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 138, 62));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Age:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);

        CandNameTb.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CandNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandNameTbActionPerformed(evt);
            }
        });

        CandidatePictureLbl.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(0, 138, 62));
        CandidatePictureLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CandidatePictureLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CandidatePictureLbl.setOpaque(true);

        DeleteButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(238, 22, 31));
        DeleteButton.setText("Delete");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(238, 22, 31));
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        EditButton.setForeground(new java.awt.Color(238, 22, 31));
        EditButton.setText("Edit");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        CandidateTable.setAutoCreateRowSorter(true);
        CandidateTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        CandidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Party", "Photo", "Election"
            }
        ));
        CandidateTable.setRowHeight(25);
        CandidateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTable);

        CAgeTb.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CAgeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAgeTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 138, 62));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("party:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);

        ElectionCb.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        ElectionCb.setForeground(new java.awt.Color(238, 22, 31));
        ElectionCb.setPreferredSize(new java.awt.Dimension(80, 22));
        ElectionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionCbActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 138, 62));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Name:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);

        CandPartyCb.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        CandPartyCb.setForeground(new java.awt.Color(238, 22, 31));
        CandPartyCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh Awami League (BAL)", "Bangladesh Nationalist Party (BNP)", "Jatiya Party (Ershad) (JP)", "Bangladesh Jamaat-e-Islami", "Workers Party of Bangladesh", "Jatiya Samajtantrik Dal (JSD)", " " }));
        CandPartyCb.setPreferredSize(new java.awt.Dimension(80, 22));
        CandPartyCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandPartyCbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 138, 62));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Elections:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 138, 62));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Photos:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        BackButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(238, 22, 31));
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        BrowseButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BrowseButton.setForeground(new java.awt.Color(238, 22, 31));
        BrowseButton.setText("Browse");
        BrowseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseButtonMouseClicked(evt);
            }
        });
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CandNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(CandPartyCb, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(AddButton)
                                                .addComponent(EditButton))
                                            .addComponent(DeleteButton))))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BrowseButton)
                                        .addGap(90, 90, 90)
                                        .addComponent(BackButton))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(91, 91, 91)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel10)
                    .addContainerGap(1031, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BrowseButton)
                                .addComponent(DeleteButton))
                            .addComponent(BackButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CandNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandPartyCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddButton)
                                .addGap(18, 18, 18)
                                .addComponent(EditButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void BrowseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseButtonMouseClicked
        // Fetch candidate photo
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            CandidatePictureLbl.setIcon(ResizePhoto(path,null));
            imgpath = path;
        }
    }//GEN-LAST:event_BrowseButtonMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void CandPartyCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandPartyCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandPartyCbActionPerformed

    private void ElectionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionCbActionPerformed

    private void CAgeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAgeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAgeTbActionPerformed
    
    private void CandidateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CandidateTable.getModel();
        int MyIndex = CandidateTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CandNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        CAgeTb.setText(model.getValueAt(MyIndex, 2).toString());
        CandPartyCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        ElectionCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        FetchPhoto();
    }//GEN-LAST:event_CandidateTableMouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        if(Key == -1 || CandNameTb.getText().isEmpty()||CAgeTb.getText().isEmpty()||ElectionCb.getSelectedIndex() == -1 || CandPartyCb.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");

        }
        else if(imgpath != null)
        {
            try
            {
                InputStream img = new FileInputStream(imgpath);
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
                String Query = "update CandidateTbl set CName=?,CAge=?,CParty=?,CPhoto=?,CElect=? where CId=?";
                PreparedStatement UpdateQuery = con.prepareStatement(Query);
                UpdateQuery.setString(1,CandNameTb.getText());
                UpdateQuery.setInt(2,Integer.valueOf(CAgeTb.getText().toString()));
                UpdateQuery.setString(3,CandPartyCb.getSelectedItem().toString());
                UpdateQuery.setBlob(4,img);
                UpdateQuery.setString(5,ElectionCb.getSelectedItem().toString());
                UpdateQuery.setInt(6,Key);
                //UpdateQuery.executeUpdate();
                //JOptionPane.showMessageDialog(this, "Candidates Updated Succesfully");

                //ElecCount();
                //DisplayCandidates();
                if(UpdateQuery.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Candidates Updated Succesfully");
                    Key = -1;
                    DisplayCandidates();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Select Photo");
            CandidatePictureLbl.setIcon(null);
            CandidatePictureLbl.setText("");
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(CAgeTb.getText().isEmpty() || CandNameTb.getText().isEmpty() || ElectionCb.getSelectedIndex() == -1 || CandPartyCb.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try
            {
                CandCount();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
                PreparedStatement Add = con.prepareStatement("insert into CandidateTbl values(?,?,?,?,?,?)");
                InputStream img = new FileInputStream(imgpath);
                Add.setInt(1, Cid);
                Add.setString(2,CandNameTb.getText());
                Add.setInt(3, Integer.valueOf( CAgeTb.getText()));
                Add.setString(4,CandPartyCb.getSelectedItem().toString());
                Add.setBlob(5,img);
                Add.setInt(6,Integer.valueOf(ElectionCb.getSelectedItem().toString()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Candidate Registered");
                DisplayCandidates();
                con.close();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex);
            }

        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        if(Key == -1)
        {
            JOptionPane.showMessageDialog(this,"Select the Candidates to be deleted");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
                String Query = "delete from CandidateTbl where CId ="+Key;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Candidates Deleted Succesfully");
                Key = -1;
                //ElecCount();
                DisplayCandidates();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void CandNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandNameTbActionPerformed
    Connection con = null;
    PreparedStatement pst = null;
    java.sql.ResultSet Ru = null;
    Statement St = null;
    private void getElections()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
            St = con.createStatement();
            String Query = "select *from ElectionTbl";
            Ru = St.executeQuery(Query);
            while(Ru.next())
            {
                String ElectId = Ru.getString("EId");
                ElectionCb.addItem(ElectId);
            }
        }
        catch(Exception e)
        {
            
        }
    }    private ImageIcon ResizePhoto(String ImagePath,byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
            MyImage = new ImageIcon(ImagePath);
        }
        else
        {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(CandidatePictureLbl.getWidth(),CandidatePictureLbl.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
            
    }
    String imgpath = null;    private void DisplayCandidates()
   {
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
           St = con.createStatement();
           Ru = St.executeQuery("select *from candidatetbl ");
           CandidateTable.setModel(DbUtils.resultSetToTableModel(Ru));
       }
       catch(Exception e){
           
       }
   }
    int Cid;
    Statement st1 = null;
    java.sql.ResultSet rs1 = null;
    private void CandCount() {
    try {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
        }
        st1 = con.createStatement();
        rs1 =  st1.executeQuery("select max(CId) from CandidateTbl");
        rs1.next();
        Cid = rs1.getInt(1);
        if (rs1.wasNull()) {
            Cid = 1; // Start from 1 if table is empty
        } else {
            Cid += 1;
        }
    } catch (Exception Ex) {
        JOptionPane.showMessageDialog(this, "Error in CandCount(): " + Ex.getMessage());
        Ex.printStackTrace();
    }
}    private void FetchPhoto()
    {
        String Query = "select CPhoto from CandidateTbl where CId="+Key;
        Statement St;
        java.sql.ResultSet Rs;
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
            St = con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("CPhoto")));
            }
        }
       catch(Exception e)
        {
                    
         }
      }
    
    int Key = -1;
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BrowseButton;
    private javax.swing.JTextField CAgeTb;
    private javax.swing.JTextField CandNameTb;
    private javax.swing.JComboBox<String> CandPartyCb;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidateTable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JComboBox<String> ElectionCb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
