package ems;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Voting extends javax.swing.JFrame {

    
    public Voting() {
        initComponents();
        DisplayCandidates();
    }
    int VotingId,VoterElectid;
    public Voting(int VoterId,int VoterElectID)
    {
        initComponents();
        DisplayCandidates();
        VotingId = VoterId;
        VoterElectid = VoterElectID;
        //JOptionPane.showMessageDialog(this, VoterElectID);
    }
    Connection con = null;
    PreparedStatement pst = null;
    java.sql.ResultSet Ru = null;
    Statement St = null;
     private void DisplayCandidates()
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        WelcomeLebel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        VoteBtn = new javax.swing.JButton();
        CandidatePhoto = new javax.swing.JLabel();
        CandName = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 138, 62));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Election Management System");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        WelcomeLebel.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        WelcomeLebel.setForeground(new java.awt.Color(0, 138, 62));
        WelcomeLebel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLebel.setText("Welcome to voting system");
        WelcomeLebel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WelcomeLebel.setOpaque(true);

        CandidateTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        CandidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "C_ID", "C_Name", "C_Age", "C_Party", "C_Photo", "C_Election"
            }
        ));
        CandidateTable.setRowHeight(25);
        CandidateTable.setSelectionBackground(new java.awt.Color(35, 35, 35));
        CandidateTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CandidateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTable);

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 138, 62));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("your candidate");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);

        VoteBtn.setBackground(new java.awt.Color(0, 138, 62));
        VoteBtn.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        VoteBtn.setForeground(new java.awt.Color(238, 22, 31));
        VoteBtn.setText("Vote");
        VoteBtn.setOpaque(true);
        VoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoteBtnMouseClicked(evt);
            }
        });
        VoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteBtnActionPerformed(evt);
            }
        });

        CandidatePhoto.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        CandidatePhoto.setForeground(new java.awt.Color(0, 138, 62));
        CandidatePhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CandidatePhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CandidatePhoto.setOpaque(true);

        CandName.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        CandName.setForeground(new java.awt.Color(0, 138, 62));
        CandName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CandName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CandName.setOpaque(true);

        jButton5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(238, 22, 31));
        jButton5.setText("Back");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 138, 62));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Candidate list");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(286, 286, 286))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CandidatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CandName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(278, 278, 278)
                                .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(WelcomeLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WelcomeLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CandidatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(CandName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoteBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    private ImageIcon ResizePhoto(String ImagePath,byte[] pic)
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
        Image newImg = img.getScaledInstance(CandidatePhoto.getWidth(),CandidatePhoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
            
    }
    private void FetchPhoto()
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
                CandidatePhoto.setIcon(ResizePhoto(null,Rs.getBytes("CPhoto")));
            }
        }
       catch(Exception e)
        {
                    
         }
      }
    int Key = -1;
    int ElectId;
    private void CandidateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CandidateTable.getModel();
        int MyIndex = CandidateTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CandName.setText(model.getValueAt(MyIndex, 1).toString());
        ElectId = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
        FetchPhoto();
    }//GEN-LAST:event_CandidateTableMouseClicked
    int Vid;
    Statement st1 = null;
    java.sql.ResultSet rs1 = null;
   private void VCount() {
    try {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
        }
        st1 = con.createStatement();
        rs1 =  st1.executeQuery("select max(VoteID) from votestbl");
        rs1.next();
        Vid = rs1.getInt(1);
        if (rs1.wasNull()) {
            Vid = 1; // Start from 1 if table is empty
        } else {
            Vid += 1;
        }
    } catch (Exception Ex) {
        JOptionPane.showMessageDialog(this, "Error in ElecCount(): " + Ex.getMessage());
        Ex.printStackTrace();
    }
}
   int VNumber;
   private void VCheck()
   {
       try
       {
           St = con.createStatement();
           Ru = St.executeQuery("select count(*) from votestbl where VoterID=" + VotingId + " and ElectID=" + ElectId);
                           
           if(Ru.next())
           {
               VNumber = Ru.getInt(1);
           }
           else 
           {
               VNumber = 0;
           }
       }
       catch(Exception e)
       {
           
       }
   }
    private void VoteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoteBtnMouseClicked
       VCheck();
        if(VoterElectid != ElectId)
        {
            //JOptionPane.showMessageDialog(this,"VoterElectid: "+VoterElectid+" ElectId: "+ElectId );
            JOptionPane.showMessageDialog(this,"You are not Registerd Voters for this Elections" );

        }
        else if(Key == -1)
        {
            JOptionPane.showMessageDialog(this,"Select your Candidate" );
        }
    else if(VNumber > 0)
    {
        JOptionPane.showMessageDialog(this, "You have already voted in this Elections!!!");
    }
    else
        {
             
            try{
                VCount();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
                PreparedStatement Add = con.prepareStatement("Insert into votestbl values(?,?,?,?)");
                Add.setInt(1, Vid);
                // VoterID will be added after login 
                Add.setInt(2, VotingId);
                Add.setInt(3, ElectId);
                Add.setInt(4, Key);
                int row = Add.executeUpdate();
                DisplayCandidates();
                VoteBtn.setVisible(false);
                WelcomeLebel.setText("Vote is Counted!!! BRAVO");
                Key = -1;
                con.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e );
            }
        }   
    }//GEN-LAST:event_VoteBtnMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CandName;
    private javax.swing.JLabel CandidatePhoto;
    private javax.swing.JTable CandidateTable;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JLabel WelcomeLebel;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
