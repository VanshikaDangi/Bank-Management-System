package Bank1;
import java.sql.*;
import java.util.Locale;
import javax.swing.*;

public class DetailsInfo extends javax.swing.JFrame {
   
    public DetailsInfo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonPersonal = new javax.swing.JButton();
        jButtonMoneytransfer = new javax.swing.JButton();
        jButtonAccount1 = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel2.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("WELCOME,");

        jLabelClose.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 250, 250));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jButtonPersonal.setBackground(new java.awt.Color(1, 1, 1));
        jButtonPersonal.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonPersonal.setForeground(new java.awt.Color(253, 251, 251));
        jButtonPersonal.setText("PERSONAL DETAILS");
        jButtonPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPersonalMouseClicked(evt);
            }
        });
        jButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPersonalActionPerformed(evt);
            }
        });

        jButtonMoneytransfer.setBackground(new java.awt.Color(5, 1, 0));
        jButtonMoneytransfer.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonMoneytransfer.setForeground(new java.awt.Color(253, 251, 251));
        jButtonMoneytransfer.setText("MONEY TRANSFER");
        jButtonMoneytransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMoneytransferMouseClicked(evt);
            }
        });
        jButtonMoneytransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoneytransferActionPerformed(evt);
            }
        });

        jButtonAccount1.setBackground(new java.awt.Color(5, 1, 0));
        jButtonAccount1.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonAccount1.setForeground(new java.awt.Color(253, 251, 251));
        jButtonAccount1.setText("ACCOUNT DETAILS");
        jButtonAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAccount1MouseClicked(evt);
            }
        });
        jButtonAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccount1ActionPerformed(evt);
            }
        });

        jButtonLogOut.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonLogOut.setText("LOG OUT");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jButtonAccount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMoneytransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonLogOut)
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButtonPersonal)
                .addGap(38, 38, 38)
                .addComponent(jButtonAccount1)
                .addGap(38, 38, 38)
                .addComponent(jButtonMoneytransfer)
                .addGap(30, 30, 30)
                .addComponent(jButtonLogOut)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPersonalMouseClicked
        
    }//GEN-LAST:event_jButtonPersonalMouseClicked

    private void jButtonMoneytransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMoneytransferMouseClicked

        
    }//GEN-LAST:event_jButtonMoneytransferMouseClicked

    private void jButtonAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAccount1MouseClicked
        
        
    }//GEN-LAST:event_jButtonAccount1MouseClicked
    
    
    public void set(String s)
    {
        jLabelName.setText(s);
    }
    private void jButtonMoneytransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoneytransferActionPerformed
        MoneyTransfer1 mf= new MoneyTransfer1();
        LoginPage l=new LoginPage();
        String u=l.getUsername();
        try
        {
            Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank2?autoReconnect=true","root","root");
            String s1="";
            String y="Select Account_no from Account where Aadhar_no= (select Aadhar_no from Customer where Username='"+u+"' )";
            Statement st=mycon.createStatement();
            PreparedStatement p=mycon.prepareStatement(y);
            ResultSet r=p.executeQuery();
            if(r.next())
            {
                s1=r.getString("Account_no");
            }
            mf.set(s1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonMoneytransferActionPerformed

    private void jButtonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPersonalActionPerformed
        CustomerDetails cd=new CustomerDetails();
        LoginPage lp=new LoginPage();
        String u=lp.getUsername();
        try
        {
            Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank2?autoReconnect=true","root","root");
            String a="",b="",c="",i="",e="",d="",g="",h="",j="",k="",f="";
            String x="select * from Customer where Username='"+u+"'";
            Statement s=mycon.createStatement();
            PreparedStatement ps= mycon.prepareStatement(x);
            ResultSet rs=ps.executeQuery();
            int n=0;
            if(rs.next())
            {
                a=rs.getString("FName");
                b=rs.getString("LName");
                c=rs.getString("Address");
                d=rs.getString("Email");
                e=rs.getString("Phone_no");
                f=rs.getString("DOB");
                g=rs.getString("Gender");  
                h=rs.getString("Username");
                j=rs.getString("Aadhar_no");
            }
            cd.perform(a,b,c,d,e,f,g,h,j);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        cd.setVisible(true);
        cd.pack();
        cd.setLocationRelativeTo(null);
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonPersonalActionPerformed

    private void jButtonAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccount1ActionPerformed
        AccountShow as = new AccountShow();
        LoginPage l=new LoginPage();
        String u=l.getUsername();
        try
        {
            Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank2?autoReconnect=true","root","root");
            String s1="",s2="",s3="";
            String y="Select * from Account where Aadhar_no=(select Aadhar_no from Customer where Username='"+u+"' )";
            Statement st=mycon.createStatement();
            PreparedStatement p=mycon.prepareStatement(y);
            ResultSet r=p.executeQuery();
            if(r.next())
            {
                s1=r.getString("Account_no");
                s2=r.getString("Account_type");
                s3=r.getString("Balance");
            }
            as.setA(s1,s2,s3);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonAccount1ActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        WelcomePage wp = new WelcomePage();
        wp.setVisible(true);
        wp.pack();
        wp.setLocationRelativeTo(null);
        wp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonLogOutActionPerformed


    
    public static void main(String args[]) {
     
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccount1;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonMoneytransfer;
    private javax.swing.JButton jButtonPersonal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
