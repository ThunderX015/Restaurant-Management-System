
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIRUDH
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        customerIDTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        checkInTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTxtArea = new javax.swing.JTextArea();
        checkOutTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1171, 684));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jLabel1.setText("Customer Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 30, 200, 32);

        jLabel2.setText("Customer_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 100, 16);

        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 150, 70, 16);

        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 90, 16);

        jLabel5.setText("Mobile_No");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(750, 90, 90, 16);

        jLabel6.setText("Email_ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(750, 140, 90, 16);

        jLabel7.setText("CheckIN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(750, 180, 80, 16);

        customerTable.setAutoCreateRowSorter(true);
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Address", "Moblie No", "Email Id", "Check In", "Check Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 400, 1114, 209);

        customerIDTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerIDTxtMouseClicked(evt);
            }
        });
        customerIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTxtActionPerformed(evt);
            }
        });
        getContentPane().add(customerIDTxt);
        customerIDTxt.setBounds(170, 90, 130, 22);
        getContentPane().add(nameTxt);
        nameTxt.setBounds(170, 140, 130, 22);
        getContentPane().add(mobileTxt);
        mobileTxt.setBounds(870, 90, 143, 22);

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailTxt);
        emailTxt.setBounds(870, 130, 143, 22);
        getContentPane().add(checkInTxt);
        checkInTxt.setBounds(870, 180, 143, 22);

        addressTxtArea.setColumns(20);
        addressTxtArea.setRows(5);
        jScrollPane2.setViewportView(addressTxtArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(170, 200, 171, 96);
        getContentPane().add(checkOutTxt);
        checkOutTxt.setBounds(870, 230, 143, 22);

        jLabel8.setText("CheckOut");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(750, 230, 90, 20);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(80, 340, 70, 25);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn);
        updateBtn.setBounds(340, 350, 90, 25);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(580, 350, 110, 25);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(760, 350, 80, 25);

        jButton1.setText("Room Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(900, 350, 130, 25);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void LoadUsersIntoGrid () {
     Connection conn = null;

          try {
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "admin");
              Statement st = conn.createStatement();

              String viewUsers ="Select * From customer_details";
              ResultSet rs = st.executeQuery(viewUsers);
              DefaultTableModel uTable = (DefaultTableModel)customerTable.getModel();   
              uTable.setRowCount(0);
              
              while( rs.next() ) {
                  //System.out.println(rs.getInt("UserId"));
                  
                  Object table[] = {rs.getString("Customer_ID"), rs.getString("Customer_name"),rs.getString("Address"),rs.getString("Mobile_No"),rs.getString("Email_ID"),rs.getString("Arrival"),rs.getString("Checkout")};
                   
                  
                  uTable.addRow(table);
              }
             
          } 
          catch (Exception e)

          {
              System.out.println(e);
            


          }
}
private void clear()
{
    customerIDTxt.setText("");
nameTxt.setText("");
addressTxtArea.setText("");
mobileTxt.setText("");
emailTxt.setText("");
checkInTxt.setText("");
checkOutTxt.setText("");

}
    
        
        
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
//this is to Insert or Add customer details into table. This enters in both jTable and SQL table.
try{
     Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","admin"); 
        Statement st =conn.createStatement();
        ResultSet rs1=st.executeQuery("Select*from customer_details");
        String email="";
        
        while(rs1.next())
        email=rs1.getString("Email_ID");

//code to prevent duplicate email ids
        if(emailTxt.getText().equals(email)==false){
if(mobileTxt.getText().length()>5&&mobileTxt.getText().length()<=10){//To prevent invalid mobile numbers, the number should be greater than 5 digits and less than 10 digits
            
        String CustomerID = customerIDTxt.getText();
        String Name1 = nameTxt.getText();
        String Address1 = addressTxtArea.getText();
        String MobileNo = mobileTxt.getText();
        String emailid= emailTxt.getText();
        String checkin=checkInTxt.getText();
        String checkout=checkOutTxt.getText();
        String insert = "INSERT INTO restaurant.Customer_Details (Customer_ID, Customer_name,Address,Mobile_No,Email_ID,Arrival,CheckOut)  VALUES ('"+CustomerID+"', '"+Name1+"', '"+Address1+"', '"+MobileNo+"','"+emailid+"','"+checkin+"','"+checkout+"')";
        int a= st.executeUpdate(insert);
        if(a>0)
        {
        JOptionPane.showMessageDialog(null, "Succesfully Inserted The user's Data");
        Object o[]= {CustomerID,Name1,Address1,MobileNo,emailid,checkin,checkout};
        DefaultTableModel dmodel= (DefaultTableModel) customerTable.getModel();
        dmodel.addRow(o);
        LoadUsersIntoGrid();
        clear();
        }else 
            JOptionPane.showMessageDialog(null,"Error Inserting record");
  
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid Mobile number");
}
else 
    JOptionPane.showMessageDialog(null,"Email Already exists");

}  catch(Exception e)
{
    System.out.println("Error"+e);
            
}
      // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
//to clear jTextfields instead of manually hitting backspace..cuz you know..
        
customerIDTxt.setText("");
nameTxt.setText("");
addressTxtArea.setText("");
mobileTxt.setText("");
emailTxt.setText("");
checkInTxt.setText("");
checkOutTxt.setText("");



    }//GEN-LAST:event_clearBtnActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
// Gets all the values from the table to jtextFields to make it easier to edit
// Editing meaning (add, update, delete and uhh thats all...)
        
 int b = customerTable.getSelectedRow();
DefaultTableModel dmodel = (DefaultTableModel) customerTable.getModel();
customerIDTxt.setText(dmodel.getValueAt(b,0).toString());
nameTxt.setText(dmodel.getValueAt(b,1).toString());
addressTxtArea.setText(dmodel.getValueAt(b,2).toString());
mobileTxt.setText(dmodel.getValueAt(b,3).toString());
emailTxt.setText(dmodel.getValueAt(b,4).toString());
checkInTxt.setText(dmodel.getValueAt(b,5).toString());
checkOutTxt.setText(dmodel.getValueAt(b,6).toString());

    }//GEN-LAST:event_customerTableMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.getContentPane().setBackground(Color.white);
        LoadUsersIntoGrid();
    }//GEN-LAST:event_formWindowActivated

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       //code for updating the details 
       try{
     Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","admin"); 
        Statement st =conn.createStatement();
        ResultSet rs1=st.executeQuery("Select*from customer_details");
        String email="";
        
        while(rs1.next())
        email=rs1.getString("Email_ID");
        //code to prevent duplicate email ids

        
       if(mobileTxt.getText().length()>5&&mobileTxt.getText().length()<=10){
                        String updateCustomers = "UPDATE restaurant.Customer_Details SET "
                      + "Email_ID ='"+emailTxt.getText()+"', Customer_name = '" +nameTxt.getText()+
                      "', Address ='" +addressTxtArea.getText()+
                      "',Mobile_No='"+mobileTxt.getText()+"',Arrival='"+checkInTxt.getText()+"',CheckOut='"+checkOutTxt.getText()+"' WHERE Customer_ID = '"+customerIDTxt.getText()+"'";
                     int a=   st.executeUpdate(updateCustomers);
          if(a>0)
          {
              LoadUsersIntoGrid();
             JOptionPane.showMessageDialog(null,"Record Updated Succesfully");
             clear();//this method clears all the textfields automatically instead of manually pressing clear button #laziness
                       
          }
          else
              JOptionPane.showMessageDialog(null,"Error");
       }
         
       else 
           JOptionPane.showMessageDialog(null,"Invalid mobile number");
        }
           
       catch (Exception e)

          {
              System.out.println(e);
            


          }
       
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
          try {
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "admin");
              Statement st = conn.createStatement();

              String deleteCustomer = "DELETE from restaurant.Customer_Details where Customer_ID='"+customerIDTxt.getText()+"'";
              int a= st.executeUpdate(deleteCustomer);
          if(a>0)
          {
              LoadUsersIntoGrid();
           JOptionPane.showMessageDialog(null,"Record deleted Successfully");  
           clear();
             
          }
          else
              JOptionPane.showMessageDialog(null,"Error deleting record");
          }
          catch (Exception e)

          {
              System.out.println(e);
            


          }
         
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void customerIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void customerIDTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerIDTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTxtMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Room ob= new Room();
ob.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea addressTxtArea;
    private javax.swing.JTextField checkInTxt;
    private javax.swing.JTextField checkOutTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField customerIDTxt;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}