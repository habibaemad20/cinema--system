
import java.awt.Color;
import javax.swing.JButton;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Frame5 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cinema_system.class.getName());
private String currentUser;  
    /**
     * Creates new form Cinema_system
     */
    public Frame5() {
        initComponents();
        setPreferredSize(new java.awt.Dimension(650,380));
        setSize(650,380);
        setLocationRelativeTo(null);
         currentUser = Frame3.selectedUser; 
          loadSeats();
    }
    private void seatClicked(java.awt.event.ActionEvent evt){
        JButton btn=(JButton) evt.getSource();
        Color selectedColor=Color.GREEN;
        Color normalColor=Color.LIGHT_GRAY;
        if(!btn.getBackground().equals(selectedColor)){
            btn.setBackground(selectedColor);}
        else{
            btn.setBackground(normalColor);
        }
    }
    private void saveSeats() {
        String selectedSeats = ""; 

        
        JButton[] seats = {jButton9, jButton14, jButton4, jButton5, jButton21, jButton10,
                           jButton12, jButton11, jButton13, jButton15, jButton16, jButton17,
                           jButton18, jButton19, jButton8, jButton20};

        for (JButton seat : seats) {
            if (seat.getBackground().equals(Color.GREEN)) {  
                selectedSeats += seat.getText() + ",";
            }
        }

        if (!selectedSeats.isEmpty()) {
            selectedSeats = selectedSeats.substring(0, selectedSeats.length() - 1); 
        }

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinema_system", "root", "181960hobyou#00#p18");

            String sql = "UPDATE booking_details SET Seats=? WHERE Name=?"; 
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, selectedSeats);
            pst.setString(2, currentUser);

            int updated = pst.executeUpdate();
            if (updated < 0) {
              
                JOptionPane.showMessageDialog(this, "No booking found for this user!");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error saving seats: " + ex.getMessage());
        }
    }
 private void loadSeats() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinema_system", "root", "181960hobyou#00#p18");
            String sql = "SELECT Seats FROM booking_details WHERE Name=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, currentUser);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String seatsStr = rs.getString("Seats"); 
                if (seatsStr != null && !seatsStr.isEmpty()) {
                    String[] seatsArray = seatsStr.split(",");
                    for (String seat : seatsArray) {
                        switch(seat) {
                            case "A1": jButton9.setBackground(Color.GREEN); break;
                            case "A2": jButton14.setBackground(Color.GREEN); break;
                            case "A3": jButton4.setBackground(Color.GREEN); break;
                            case "A4": jButton5.setBackground(Color.GREEN); break;
                            case "B1": jButton21.setBackground(Color.GREEN); break;
                            case "B2": jButton10.setBackground(Color.GREEN); break;
                            case "B3": jButton12.setBackground(Color.GREEN); break;
                            case "B4": jButton11.setBackground(Color.GREEN); break;
                            case "C1": jButton13.setBackground(Color.GREEN); break;
                            case "C2": jButton15.setBackground(Color.GREEN); break;
                            case "C3": jButton16.setBackground(Color.GREEN); break;
                            case "C4": jButton17.setBackground(Color.GREEN); break;
                            case "D1": jButton18.setBackground(Color.GREEN); break;
                            case "D2": jButton19.setBackground(Color.GREEN); break;
                            case "D3": jButton8.setBackground(Color.GREEN); break;
                            case "D4": jButton20.setBackground(Color.GREEN); break;
                        }
                    }
                }
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error loading seats: " + ex.getMessage());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("<-Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 320, 80, 27);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Next->");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 320, 78, 27);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Booking Details");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 30, 240, 32);

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("The Screen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 90, 120, 16);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("A3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 120, 50, 40);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("A4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(400, 120, 50, 40);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("D3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(330, 270, 50, 40);

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setText("A2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(250, 120, 50, 40);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setText("A1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(180, 120, 50, 40);

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setText("B2");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(250, 170, 50, 40);

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setText("B3");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(330, 170, 50, 40);

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setText("B4");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(400, 170, 50, 40);

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setText("C1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(180, 220, 50, 40);

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setText("C2");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(250, 220, 50, 40);

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setText("C3");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(330, 220, 50, 40);

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setText("C4");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(400, 220, 50, 40);

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setText("D1");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(180, 270, 50, 40);

        jButton19.setBackground(new java.awt.Color(204, 204, 204));
        jButton19.setText("D2");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(250, 270, 50, 40);

        jButton20.setBackground(new java.awt.Color(204, 204, 204));
        jButton20.setText("D4");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(400, 270, 50, 40);

        jButton21.setBackground(new java.awt.Color(204, 204, 204));
        jButton21.setText("B1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(180, 170, 50, 40);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Frame4 frame4=new Frame4();
     frame4.setVisible(true);
     dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 saveSeats(); 
        Frame6 frame6=new Frame6();
     frame6.setVisible(true); 
     // TODO add your handling code here:
     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     seatClicked(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
     seatClicked(evt);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      seatClicked(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     seatClicked(evt);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       seatClicked(evt);// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     seatClicked(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      seatClicked(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      seatClicked(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      seatClicked(evt);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
seatClicked(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
seatClicked(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
seatClicked(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
seatClicked(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
seatClicked(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
seatClicked(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Cinema_system().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
