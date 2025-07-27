package ems;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Voters extends javax.swing.JFrame {

    
    public Voters() {
        initComponents();
        getElections();
        DisplayVoters();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VNameTb = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VotersTable = new javax.swing.JTable();
        VAgeTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ElectionTb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        VGenTb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        VPassTb = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 138, 62));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage voters");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 138, 62));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Age:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);

        VNameTb.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        VNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNameTbActionPerformed(evt);
            }
        });

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

        VotersTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        VotersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Password", "Gender", "Election ID"
            }
        ));
        VotersTable.setRowHeight(25);
        VotersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VotersTable);

        VAgeTb.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        VAgeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAgeTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 138, 62));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Gender:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);

        ElectionTb.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        ElectionTb.setForeground(new java.awt.Color(238, 22, 31));
        ElectionTb.setPreferredSize(new java.awt.Dimension(80, 22));
        ElectionTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionTbActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 138, 62));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Name:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);

        VGenTb.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        VGenTb.setForeground(new java.awt.Color(238, 22, 31));
        VGenTb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        VGenTb.setPreferredSize(new java.awt.Dimension(80, 22));
        VGenTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VGenTbActionPerformed(evt);
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
        jLabel11.setText("passward:");
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

        VPassTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPassTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(ElectionTb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VPassTb)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BackButton)
                                        .addGap(123, 123, 123))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(EditButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DeleteButton)))))))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(VGenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VGenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(VNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ElectionTb, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(VPassTb))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(EditButton)
                            .addComponent(DeleteButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(BackButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 138, 62));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Election Management System");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
                ElectionTb.addItem(ElectId);
            }
        }
        catch(Exception e)
        {
            
        }
    }
    private void VNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VNameTbActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void VAgeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAgeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VAgeTbActionPerformed

    private void ElectionTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionTbActionPerformed

    private void VGenTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VGenTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VGenTbActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void VPassTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPassTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VPassTbActionPerformed
    private void DisplayVoters()
   {
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
           St = con.createStatement();
           Ru = St.executeQuery("select *from voterstbl ");
           VotersTable.setModel(DbUtils.resultSetToTableModel(Ru));
       }
       catch(Exception e){
           
       }
   }
    int Vid;
    Statement st1 = null;
    java.sql.ResultSet rs1 = null;
    private void VotersCount() {
    try {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
        }
        st1 = con.createStatement();
        rs1 =  st1.executeQuery("select max(VId) from voterstbl");
        rs1.next();
        Vid = rs1.getInt(1);
        if (rs1.wasNull()) {
            Vid = 1; // Start from 1 if table is empty
        } else {
            Vid += 1;
        }
    } catch (Exception Ex) {
        JOptionPane.showMessageDialog(this, "Error in CandCount(): " + Ex.getMessage());
        Ex.printStackTrace();
    }
}
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(VNameTb.getText().isEmpty() || VAgeTb.getText().isEmpty() || VGenTb.getSelectedIndex() == -1 || ElectionTb.getSelectedIndex() == -1)
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else
       {
           try
           {
               VotersCount();
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
               PreparedStatement Add = con.prepareStatement("insert into voterstbl values(?,?,?,?,?,?)");
                Add.setInt(1,Vid);
                Add.setString(2, VNameTb.getText());
                Add.setInt(3,Integer.valueOf(VAgeTb.getText()));
                Add.setString(4, VPassTb.getText());
                Add.setString(5, VGenTb.getSelectedItem().toString());
                Add.setInt(6,Integer.valueOf(ElectionTb.getSelectedItem().toString()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Voters Registered");
                DisplayVoters();
                con.close();
           }   
           catch(Exception ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
           
           
       }
    }//GEN-LAST:event_AddButtonMouseClicked
    
    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
         if(Key == -1)
        {
            JOptionPane.showMessageDialog(this,"Select the Voters to be deleted");
        }
        else
        {
            try
            {
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
                   String Query = "delete from voterstbl where VId ="+Key;
                   Statement Del = con.createStatement();
                   Del.executeUpdate(Query);
                   JOptionPane.showMessageDialog(this, "Voters Deleted Succesfully");
                   Key = -1;
                   //ElecCount();
                   DisplayVoters();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked
    int Key = -1;
    private void VotersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) VotersTable.getModel();
        int MyIndex = VotersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        VNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        VAgeTb.setText(model.getValueAt(MyIndex, 2).toString());
        VPassTb.setText(model.getValueAt(MyIndex, 3).toString());
        VGenTb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        ElectionTb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_VotersTableMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        if(Key == -1 || VNameTb.getText().isEmpty()||VAgeTb.getText().isEmpty()||VGenTb.getSelectedIndex() == -1||ElectionTb.getSelectedIndex() == -1||VPassTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
            
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
                   String Query = "update voterstbl set VName=?,VAge=?,VPass=?,VGen=?,VElection=? where VId=?";
                   PreparedStatement UpdateQuery = con.prepareStatement(Query);
                   UpdateQuery.setString(1,VNameTb.getText());
                   UpdateQuery.setInt(2,Integer.valueOf(VAgeTb.getText()));
                   UpdateQuery.setString(3,VPassTb.getText());
                   UpdateQuery.setString(4,VGenTb.getSelectedItem().toString());
                   UpdateQuery.setInt(5,Integer.valueOf(ElectionTb.getSelectedItem().toString()));
                   UpdateQuery.setInt(6,Key);
                   UpdateQuery.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Voters Information Updated Succesfully");
                   Key = -1;
                   DisplayVoters();
            }
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JComboBox<String> ElectionTb;
    private javax.swing.JTextField VAgeTb;
    private javax.swing.JComboBox<String> VGenTb;
    private javax.swing.JTextField VNameTb;
    private javax.swing.JPasswordField VPassTb;
    private javax.swing.JTable VotersTable;
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
