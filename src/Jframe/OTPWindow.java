
package Jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class OTPWindow extends javax.swing.JFrame {

    private static final int TIMER_DELAY = 1000;
    private static final int TIMER_DURATION = 60;
    private static final SignupPage SignupPage = null;
    private static Timer timer;
    private static int remainingTime;
    private static String otpvalue;

    private static String names;
    private static String emails;
    private static String phone;
    private static String username;
    private static String password;
    private SignupPage sign;

    public OTPWindow() {
        initComponents();
        initTimer();
    }

    public OTPWindow(SignupPage signupPage) {
    initComponents();
    initTimer();
    this.sign = signupPage;

}

    public OTPWindow(String name, String email) {
        OTPWindow.names = name;
        OTPWindow.emails = email;
    }

    public OTPWindow(String name, String email, String phones, String usernames, String passwoeds) {
        OTPWindow.names = name;
        OTPWindow.emails = email;
        OTPWindow.phone = phones;
        OTPWindow.username = usernames;
        OTPWindow.password = passwoeds;
    }

    public static int generateOTP() {
        Random random = new Random();
        int min = 100000; // Minimum value for a 6-digit OTP
        int max = 999999; // Maximum value for a 6-digit OTP

        return random.nextInt(max - min + 1) + min;
    }

    public void sendMailToUser() {
        otpvalue = "" + generateOTP();
        System.out.println(otpvalue);

        try {
            System.out.println(otpvalue);
            MailSystem.sendMail(names, emails, otpvalue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validationChech() {
        String otptextvalue = OTPtext.getText();
        if (otptextvalue.equals("")) {
            return false;
        }
        return true;
    }

    public boolean chechOTPvarification() {
        String userOtp = OTPtext.getText();
        if (userOtp.equals(otpvalue)) {
            return true;
        }
        return false;
    }

    private void initTimer() {
        remainingTime = TIMER_DURATION;
         jLabelTimer.setText(Integer.toString(remainingTime));

        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(TIMER_DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (remainingTime > 0) {
                    remainingTime--;
                    jLabelTimer.setText(Integer.toString(remainingTime));
                } else {
                    timer.stop();
                    dispose();
                }
            }
        });
        timer.start();
    }

    public void insertToDatabase() {// This method for save user data into database

        try {

            DBMSConnection connect = new DBMSConnection();
            String query = "insert into IntelliLibrary_UserDetails values('" + names + "', '" + emails + "', '" + phone
                    + "', '" + username + "', '" + password + "')";
            connect.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Successfully Registered!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OTPtext = new app.bolivia.swing.JCTextField();
        ResendButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabelTimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter OTP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 121, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("We sent OTP in your valid mail");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, -1));

        OTPtext.setBackground(new java.awt.Color(102, 102, 255));
        OTPtext.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        OTPtext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OTPtext.setPlaceholder("Enter OTP Here");
        OTPtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                OTPtextFocusLost(evt);
            }
        });
        jPanel1.add(OTPtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        ResendButton.setBackground(new java.awt.Color(51, 255, 255));
        ResendButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ResendButton.setForeground(new java.awt.Color(0, 0, 0));
        ResendButton.setText("RESEND");
        ResendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 40));

        submitButton.setBackground(new java.awt.Color(51, 255, 255));
        submitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 0, 0));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 120, 40));

        jLabelTimer.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTimer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTimer.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTimer.setText("60");
        jPanel1.add(jLabelTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 280));

        setSize(new java.awt.Dimension(359, 279));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sendMailToUser();
        initTimer();
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (validationChech() == true) {
            if (chechOTPvarification() == true) {
                insertToDatabase();
                sign.clearTextfield();
                dispose();
              
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid OTP!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Enter OTP!");
        }
    }

    private void OTPtextFocusLost(java.awt.event.FocusEvent evt) {

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new OTPWindow().setVisible(true);
                new OTPWindow(SignupPage).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField OTPtext;
    private javax.swing.JButton ResendButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
