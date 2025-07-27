package ems;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class DashBoard extends javax.swing.JFrame {

    
    public DashBoard() {
        initComponents();
        DisplayElection();
    }
     Connection con = null;
    PreparedStatement pst = null;
    java.sql.ResultSet Ru = null;
    Statement St = null;
    private void DisplayElection()
   {
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
           St = con.createStatement();
           Ru = St.executeQuery("select *from ElectionTbl ");
           DashElections.setModel(DbUtils.resultSetToTableModel(Ru));
       }
       catch(Exception e){
           
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DashElections = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        WinnerPhotoLbl = new javax.swing.JLabel();
        WinnerName = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        VotesLbl = new javax.swing.JLabel();
        PercentLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel5.setText("dashboard");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);

        DashElections.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        DashElections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        DashElections.setRowHeight(25);
        DashElections.setSelectionBackground(new java.awt.Color(35, 35, 35));
        DashElections.setSelectionForeground(new java.awt.Color(255, 255, 255));
        DashElections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashElectionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DashElections);

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 138, 62));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Winner");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);

        WinnerPhotoLbl.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        WinnerPhotoLbl.setForeground(new java.awt.Color(0, 138, 62));
        WinnerPhotoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinnerPhotoLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WinnerPhotoLbl.setOpaque(true);

        WinnerName.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        WinnerName.setForeground(new java.awt.Color(0, 138, 62));
        WinnerName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        WinnerName.setText("Name");
        WinnerName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WinnerName.setOpaque(true);

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
        jLabel13.setText("Election List");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);

        VotesLbl.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        VotesLbl.setForeground(new java.awt.Color(0, 138, 62));
        VotesLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VotesLbl.setText("Votes");
        VotesLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VotesLbl.setOpaque(true);

        PercentLbl.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        PercentLbl.setForeground(new java.awt.Color(0, 138, 62));
        PercentLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PercentLbl.setText("Percentage: ");
        PercentLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PercentLbl.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(WinnerPhotoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PercentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(196, 196, 196))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WinnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VotesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(WinnerPhotoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WinnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VotesLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PercentLbl)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int WinnerId,percentage,votes;
    private void getWinner()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St = con.createStatement();
            String Query = "SELECT CandidateID, COUNT(CandidateID) FROM votestbl WHERE ElectId=" + Key + " GROUP BY CandidateID ORDER BY COUNT(CandidateID) DESC LIMIT 1";
            Ru = St.executeQuery(Query);
            while(Ru.next())
            {
                WinnerId = Ru.getInt(1);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }
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
        Image newImg = img.getScaledInstance(WinnerPhotoLbl.getWidth(),WinnerPhotoLbl.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
            
    }
    private void GetWinnerdata()
    {
        String Query = "select CPhoto,CName from CandidateTbl where CId="+WinnerId;
        Statement St;
        java.sql.ResultSet Rs;
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb", "root", "");
            St = con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                WinnerPhotoLbl.setIcon(ResizePhoto(null,Rs.getBytes("CPhoto")));
                WinnerName.setText(Rs.getString("CName"));
            }
        }
       catch(Exception e)
        {
                    
         }
    }
     private void GetVotes()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St = con.createStatement();
            String Query = "SELECT COUNT(*) FROM votestbl WHERE CandidateId=" + WinnerId+" and ElectID="+Key+"";
            Ru = St.executeQuery(Query);
            while(Ru.next())
            {
                votes = Ru.getInt(1);
                VotesLbl.setText(votes+" Votes");
                //JOptionPane.showMessageDialog(this,""+votes+" "+WinnerId);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }
     int totalVotes;
     double WinPercent;
      private void GetPercentages()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St = con.createStatement();
            String Query = "SELECT COUNT(*) FROM votestbl WHERE ElectId=" + Key;
            Ru = St.executeQuery(Query);
            while(Ru.next())
            {
                totalVotes = Ru.getInt(1);
                //JOptionPane.showMessageDialog(this,votes+" "+totalVotes);
                if(totalVotes > 0)
                {
                    WinPercent = (1.0*votes/totalVotes)*100;
                    PercentLbl.setText("Percentage: "+WinPercent+"%");
                }
                else
                {
                     JOptionPane.showMessageDialog(this, "No one vote in this election");
                     PercentLbl.setText("Percentage: 0.0%");
                }
                
                   
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "An error ouccured!");
        }
    }
    int Key = -1;
    private void DashElectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashElectionsMouseClicked
        DefaultTableModel model = (DefaultTableModel) DashElections.getModel();
        int MyIndex = DashElections.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        getWinner();
        GetWinnerdata();
        GetVotes();
        GetPercentages();
//FetchPhoto();
    }//GEN-LAST:event_DashElectionsMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DashElections;
    private javax.swing.JLabel PercentLbl;
    private javax.swing.JLabel VotesLbl;
    private javax.swing.JLabel WinnerName;
    private javax.swing.JLabel WinnerPhotoLbl;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
