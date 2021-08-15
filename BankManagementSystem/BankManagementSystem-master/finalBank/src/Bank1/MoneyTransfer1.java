package Bank1;
import java.sql.*;
import javax.swing.*;
public class MoneyTransfer1 extends javax.swing.JFrame {

    public static String u;
    
    public MoneyTransfer1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void set(String s1)
    {
       jLabelAccount1.setText(s1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelAccountNo = new javax.swing.JLabel();
        jLabelBeneficiaryAccountNo = new javax.swing.JLabel();
        jLabelBeneficiaryAccountType = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jLabelAccount1 = new javax.swing.JLabel();
        jTextFieldBeneficiaryAccountNo = new javax.swing.JTextField();
        jTextFieldBeneficiaryAccountType = new javax.swing.JTextField();
        jTextFieldAmount = new javax.swing.JTextField();
        jButtonProceed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel2.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("MONEY TRANSFER");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabelAccountNo.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAccountNo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAccountNo.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAccountNo.setText("ACCOUNT NUMBER:");

        jLabelBeneficiaryAccountNo.setBackground(new java.awt.Color(236, 240, 241));
        jLabelBeneficiaryAccountNo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelBeneficiaryAccountNo.setForeground(new java.awt.Color(254, 254, 254));
        jLabelBeneficiaryAccountNo.setText("BENEFICIARY ACCOUNT NUMBER:");

        jLabelBeneficiaryAccountType.setBackground(new java.awt.Color(236, 240, 241));
        jLabelBeneficiaryAccountType.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelBeneficiaryAccountType.setForeground(new java.awt.Color(254, 254, 254));
        jLabelBeneficiaryAccountType.setText("BENEFICIARY ACCOUNT TYPE:");

        jLabelAmount.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAmount.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAmount.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAmount.setText("AMOUNT:");

        jLabelAccount1.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        jLabelAccount1.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAccount1MouseClicked(evt);
            }
        });

        jTextFieldBeneficiaryAccountNo.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldBeneficiaryAccountNo.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldBeneficiaryAccountNo.setForeground(new java.awt.Color(228, 241, 254));

        jTextFieldBeneficiaryAccountType.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldBeneficiaryAccountType.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldBeneficiaryAccountType.setForeground(new java.awt.Color(228, 241, 254));

        jTextFieldAmount.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldAmount.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldAmount.setForeground(new java.awt.Color(228, 241, 254));

        jButtonProceed.setBackground(new java.awt.Color(34, 167, 240));
        jButtonProceed.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonProceed.setForeground(new java.awt.Color(254, 254, 254));
        jButtonProceed.setText("PROCEED");
        jButtonProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProceedActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonProceed))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBeneficiaryAccountType)
                            .addComponent(jLabelBeneficiaryAccountNo)
                            .addComponent(jLabelAccountNo)
                            .addComponent(jLabelAmount))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAccount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldBeneficiaryAccountNo)
                            .addComponent(jTextFieldBeneficiaryAccountType, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTextFieldAmount))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAccountNo)
                    .addComponent(jLabelAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBeneficiaryAccountNo)
                    .addComponent(jTextFieldBeneficiaryAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBeneficiaryAccountType)
                    .addComponent(jTextFieldBeneficiaryAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmount)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProceed)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabelAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccount1MouseClicked
        Registration rf=new Registration();
        rf.setVisible(true);
        rf.pack();
        rf.setLocationRelativeTo(null);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelAccount1MouseClicked

    private void jButtonProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProceedActionPerformed
        int Account_no=0,BenificiaryAccount_No=0,Amount=0;
        
         try
        {
            int flag=0;
            try
            {
                 Account_no=Integer.parseInt(jLabelAccount1.getText());
                 BenificiaryAccount_No=Integer.parseInt(jTextFieldBeneficiaryAccountNo.getText());
                 Amount=Integer.parseInt(jTextFieldAmount.getText());
               //  System.out.println("text is accepted and converted");
                // System.out.println("Account_no"+Account_no+"BenificiaryAccountNo"+BenificiaryAccount_No+"Amount"+Amount);
            }catch(NumberFormatException ex)
            {
           
            }
            
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank2","root","root");
            con.setAutoCommit(false);

            Statement stmt;
            stmt=con.createStatement();
            String sql="select * from Account";
            ResultSet rs,rs1,rs2;
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
               int Account;

                if(Account_no==rs.getInt("Account_no") )
                { 
                   flag=1;
                }
            
            }rs.close();
           
            if(flag==1)
            {
              String sql1="insert into Transactions (Account_no, BenificiaryAccount_no, Amount  ) values ('"+Account_no+"','"+BenificiaryAccount_No+"','"+Amount+"')";
              PreparedStatement pst ;
              pst= con.prepareStatement(sql1);
              int r=pst.executeUpdate(sql1);
                              
              String sql2="select Balance from Account where Account_no='"+Account_no+"'";
              rs1=stmt.executeQuery(sql2);
              rs1.next();
              int num1=rs1.getInt("Balance");
              
               String sql3="select Balance from Account where Account_no='"+BenificiaryAccount_No+"'";
               rs2=stmt.executeQuery(sql3);
               rs2.next();
               int  num2=rs2.getInt("Balance");
                 
                   
               int numD=num2+Amount;
               int numW=num1-Amount;
               
               System.out.println(" Numw "+numW+" NumD "+numD);
                
               
               String WA="update Account set Balance="+numW+" where Account_no="+Account_no+"";

                 // PreparedStatement pst1;
               pst=con.prepareStatement(WA);
                pst.executeUpdate(WA);
              // pst1.close();
               
             //  PreparedStatement pst2 ;          
             
                String DA="update Account set Balance="+numD+" where Account_no="+BenificiaryAccount_No+"";
                
               pst=con.prepareStatement(DA);

                pst.executeUpdate(DA);
              
                  pst.close();
                               
                JOptionPane.showMessageDialog(null, "Transactions completed successfully");
                JOptionPane.showMessageDialog(null, "Your balance is "+numW);

                  DetailsInfo df = new DetailsInfo ();
                 df.setVisible(true);
                 df.pack();
                 df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 this.dispose();
               
                       
            } 
                con.commit();
                con.close();
        }
        catch(Exception e)
        {
           // con.rollback();
             

            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonProceedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DetailsInfo di=new DetailsInfo();
        try
                {
                    Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank2?autoReconnect=true","root","root");
                    String s1="";
                    String y=("Select FName from Customer where Username ='"+u+"' ");
                    Statement smt=mycon.createStatement();
                    PreparedStatement ps=mycon.prepareStatement(y);
                    ResultSet r=ps.executeQuery();
                    if(r.next())
                    {
                        s1=r.getString("FName");
                    }
                    di.set(s1);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
        di.setVisible(true);
        di.pack();
        di.setLocationRelativeTo(null);
        di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyTransfer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonProceed;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAccount1;
    private javax.swing.JLabel jLabelAccountNo;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelBeneficiaryAccountNo;
    private javax.swing.JLabel jLabelBeneficiaryAccountType;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBeneficiaryAccountNo;
    private javax.swing.JTextField jTextFieldBeneficiaryAccountType;
    // End of variables declaration//GEN-END:variables
}
