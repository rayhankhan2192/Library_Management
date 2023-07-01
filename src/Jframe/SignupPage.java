package Jframe;

import java.sql.*;
import javax.swing.JOptionPane;

public class SignupPage extends javax.swing.JFrame {

    private static String name;
    private String email;
    private String phone;
    private String username;
    private String password;

    public SignupPage() {
        initComponents();
    }

    public void clearTextfield() {
        name_textfield.setText("");
        email_textfield.setText("");
        phone_textfield.setText("");
        username_textfield.setText("");
        password_textfield.setText("");
        reEnterPass_textfield.setText("");
    }

    public boolean validationSignup() {
        name = name_textfield.getText();
        email = email_textfield.getText();
        phone = phone_textfield.getText();
        username = username_textfield.getText();
        password = password_textfield.getText();
        String reEnterPass = reEnterPass_textfield.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is required");
            return false;
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Email is required");
            return false;
        } else if (phone.equals("")) {
            JOptionPane.showMessageDialog(this, "Number is required");
            return false;
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(this, "UserName is required");
            return false;
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(this, "Create password");
            return false;
        } else if (!password.equals(reEnterPass)) {
            JOptionPane.showMessageDialog(this, "Password doesn't matched!");
            return false;
        }

        return true;
    }

    public boolean Check_duplicate_User() {
        String userName = username_textfield.getText();
        boolean isExist = false;

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql:///IntelliLibrary", "root", "");
            PreparedStatement pre = connect.prepareStatement("SELECT * FROM intellilibrary_userdetails WHERE userName = ?");
            pre.setString(1, userName);
            ResultSet resultSet = pre.executeQuery();

            if (resultSet.next()) {
                isExist = true;
            } else {
                isExist = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonMetroBeanInfo1 = new rojerusan.RSButtonMetroBeanInfo();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        exit_button_textfield = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name_textfield = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        email_textfield = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        phone_textfield = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        username_textfield = new app.bolivia.swing.JCTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        password_textfield = new app.bolivia.swing.JCTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCTextField6 = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jCTextField7 = new app.bolivia.swing.JCTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jCTextField8 = new app.bolivia.swing.JCTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jCTextField9 = new app.bolivia.swing.JCTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCTextField10 = new app.bolivia.swing.JCTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jCTextField11 = new app.bolivia.swing.JCTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jCTextField12 = new app.bolivia.swing.JCTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jCTextField13 = new app.bolivia.swing.JCTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jCTextField14 = new app.bolivia.swing.JCTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jCTextField15 = new app.bolivia.swing.JCTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jCTextField16 = new app.bolivia.swing.JCTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jCTextField17 = new app.bolivia.swing.JCTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jCTextField18 = new app.bolivia.swing.JCTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jCTextField19 = new app.bolivia.swing.JCTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jCTextField20 = new app.bolivia.swing.JCTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        reEnterPass_textfield = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        signup_Action_Performed = new rojerusan.RSMaterialButtonCircle();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, -1));

        jLabel5.setBackground(new java.awt.Color(51, 0, 51));
        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("IntelliLibrary");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 160, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/signup-library-icon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 810, 670));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Welcome To");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 820, 830));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 40));

        exit_button_textfield.setBackground(new java.awt.Color(255, 0, 0));
        exit_button_textfield.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        exit_button_textfield.setForeground(new java.awt.Color(255, 0, 51));
        exit_button_textfield.setText("X");
        exit_button_textfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_button_textfieldMouseClicked(evt);
            }
        });
        jPanel1.add(exit_button_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 40, 30));

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create New Account Here");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, 30));

        name_textfield.setBackground(new java.awt.Color(102, 102, 255));
        name_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        name_textfield.setForeground(new java.awt.Color(0, 0, 0));
        name_textfield.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name_textfield.setPlaceholder("Enter Name");
        name_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_textfieldFocusLost(evt);
            }
        });
        name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 290, -1));

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, 30));

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 30));

        email_textfield.setBackground(new java.awt.Color(102, 102, 255));
        email_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        email_textfield.setForeground(new java.awt.Color(0, 0, 0));
        email_textfield.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        email_textfield.setPlaceholder("Enter Email");
        email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(email_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 290, -1));

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 130, 30));

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 130, 30));

        jLabel15.setBackground(new java.awt.Color(0, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 40));

        phone_textfield.setBackground(new java.awt.Color(102, 102, 255));
        phone_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        phone_textfield.setForeground(new java.awt.Color(0, 0, 0));
        phone_textfield.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        phone_textfield.setPlaceholder("Enter Phone");
        phone_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(phone_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 290, -1));

        jLabel16.setBackground(new java.awt.Color(0, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Create Username");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 170, 30));

        jLabel17.setBackground(new java.awt.Color(0, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 50, 40));

        username_textfield.setBackground(new java.awt.Color(102, 102, 255));
        username_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        username_textfield.setForeground(new java.awt.Color(0, 0, 0));
        username_textfield.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        username_textfield.setPlaceholder("Enter User Name");
        username_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_textfieldFocusLost(evt);
            }
        });
        username_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(username_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 290, -1));

        jLabel18.setBackground(new java.awt.Color(0, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 50, 40));

        jLabel19.setBackground(new java.awt.Color(0, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Create Password");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 160, 30));

        password_textfield.setBackground(new java.awt.Color(102, 102, 255));
        password_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        password_textfield.setForeground(new java.awt.Color(0, 0, 0));
        password_textfield.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        password_textfield.setPlaceholder("Enter Password");
        password_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(password_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 290, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setForeground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel21.setBackground(new java.awt.Color(0, 255, 255));
        jLabel21.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Signup Page");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, 30));

        jLabel22.setBackground(new java.awt.Color(0, 255, 255));
        jLabel22.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Create New Account Here");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 30));

        jCTextField6.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField6.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField6.setText("Enter name");
        jCTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField6.setPlaceholder("Enter User Name");
        jCTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Name");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        jLabel24.setBackground(new java.awt.Color(0, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel25.setBackground(new java.awt.Color(0, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 40));

        jCTextField7.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField7.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField7.setText("Enter Email");
        jCTextField7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField7.setPlaceholder("Enter User Name");
        jCTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel26.setBackground(new java.awt.Color(0, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Email");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 130, 30));

        jLabel27.setBackground(new java.awt.Color(0, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Phone");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, 30));

        jLabel28.setBackground(new java.awt.Color(0, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 40));

        jCTextField8.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField8.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField8.setText("Enter phone");
        jCTextField8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField8.setPlaceholder("Enter User Name");
        jCTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel29.setBackground(new java.awt.Color(0, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Create Username");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, 30));

        jLabel30.setBackground(new java.awt.Color(0, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 50, 40));

        jCTextField9.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField9.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField9.setText("Enter username");
        jCTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField9.setPlaceholder("Enter User Name");
        jCTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel31.setBackground(new java.awt.Color(0, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 50, 40));

        jLabel32.setBackground(new java.awt.Color(0, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Username");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 130, 30));

        jCTextField10.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField10.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField10.setText("Enter username");
        jCTextField10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField10.setPlaceholder("Enter User Name");
        jCTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 410, 860));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setForeground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(0, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel34.setBackground(new java.awt.Color(0, 255, 255));
        jLabel34.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Signup Page");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, 30));

        jLabel35.setBackground(new java.awt.Color(0, 255, 255));
        jLabel35.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Create New Account Here");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 30));

        jCTextField11.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField11.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField11.setText("Enter name");
        jCTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField11.setPlaceholder("Enter User Name");
        jCTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField11ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel36.setBackground(new java.awt.Color(0, 255, 255));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Name");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        jLabel37.setBackground(new java.awt.Color(0, 255, 255));
        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel38.setBackground(new java.awt.Color(0, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 40));

        jCTextField12.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField12.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField12.setText("Enter Email");
        jCTextField12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField12.setPlaceholder("Enter User Name");
        jCTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField12ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel39.setBackground(new java.awt.Color(0, 255, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Email");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 130, 30));

        jLabel40.setBackground(new java.awt.Color(0, 255, 255));
        jLabel40.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Phone");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, 30));

        jLabel41.setBackground(new java.awt.Color(0, 255, 255));
        jLabel41.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 40));

        jCTextField13.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField13.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField13.setText("Enter phone");
        jCTextField13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField13.setPlaceholder("Enter User Name");
        jCTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField13ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel42.setBackground(new java.awt.Color(0, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Create Username");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, 30));

        jLabel43.setBackground(new java.awt.Color(0, 255, 255));
        jLabel43.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 50, 40));

        jCTextField14.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField14.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField14.setText("Enter username");
        jCTextField14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField14.setPlaceholder("Enter User Name");
        jCTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField14ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel44.setBackground(new java.awt.Color(0, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 50, 40));

        jLabel45.setBackground(new java.awt.Color(0, 255, 255));
        jLabel45.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Username");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 130, 30));

        jCTextField15.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField15.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField15.setText("Enter username");
        jCTextField15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField15.setPlaceholder("Enter User Name");
        jCTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField15ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setForeground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setBackground(new java.awt.Color(0, 255, 255));
        jLabel46.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel47.setBackground(new java.awt.Color(0, 255, 255));
        jLabel47.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Signup Page");
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, 30));

        jLabel48.setBackground(new java.awt.Color(0, 255, 255));
        jLabel48.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Create New Account Here");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 30));

        jCTextField16.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField16.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField16.setText("Enter name");
        jCTextField16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField16.setPlaceholder("Enter User Name");
        jCTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField16ActionPerformed(evt);
            }
        });
        jPanel5.add(jCTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel49.setBackground(new java.awt.Color(0, 255, 255));
        jLabel49.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Name");
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        jLabel50.setBackground(new java.awt.Color(0, 255, 255));
        jLabel50.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel51.setBackground(new java.awt.Color(0, 255, 255));
        jLabel51.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 40));

        jCTextField17.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField17.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField17.setText("Enter Email");
        jCTextField17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField17.setPlaceholder("Enter User Name");
        jCTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField17ActionPerformed(evt);
            }
        });
        jPanel5.add(jCTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel52.setBackground(new java.awt.Color(0, 255, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Email");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 130, 30));

        jLabel53.setBackground(new java.awt.Color(0, 255, 255));
        jLabel53.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Phone");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, 30));

        jLabel54.setBackground(new java.awt.Color(0, 255, 255));
        jLabel54.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 40));

        jCTextField18.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField18.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField18.setText("Enter phone");
        jCTextField18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField18.setPlaceholder("Enter User Name");
        jCTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField18ActionPerformed(evt);
            }
        });
        jPanel5.add(jCTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel55.setBackground(new java.awt.Color(0, 255, 255));
        jLabel55.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Create Username");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, 30));

        jLabel56.setBackground(new java.awt.Color(0, 255, 255));
        jLabel56.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 50, 40));

        jCTextField19.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField19.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField19.setText("Enter username");
        jCTextField19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField19.setPlaceholder("Enter User Name");
        jCTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField19ActionPerformed(evt);
            }
        });
        jPanel5.add(jCTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel57.setBackground(new java.awt.Color(0, 255, 255));
        jLabel57.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 50, 40));

        jLabel58.setBackground(new java.awt.Color(0, 255, 255));
        jLabel58.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Username");
        jPanel5.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 130, 30));

        jCTextField20.setBackground(new java.awt.Color(102, 102, 255));
        jCTextField20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField20.setForeground(new java.awt.Color(51, 51, 0));
        jCTextField20.setText("Enter username");
        jCTextField20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCTextField20.setPlaceholder("Enter User Name");
        jCTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField20ActionPerformed(evt);
            }
        });
        jPanel5.add(jCTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 410, 860));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 410, 860));

        jLabel59.setBackground(new java.awt.Color(0, 255, 255));
        jLabel59.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 50, 40));

        jLabel60.setBackground(new java.awt.Color(0, 255, 255));
        jLabel60.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Re-enter password");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 180, 30));

        reEnterPass_textfield.setBackground(new java.awt.Color(102, 102, 255));
        reEnterPass_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        reEnterPass_textfield.setForeground(new java.awt.Color(0, 0, 0));
        reEnterPass_textfield.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        reEnterPass_textfield.setPlaceholder("ReEnter Password");
        reEnterPass_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reEnterPass_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(reEnterPass_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 290, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 204, 204));
        rSMaterialButtonCircle1.setText("Login");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 720, 310, 50));

        signup_Action_Performed.setBackground(new java.awt.Color(255, 0, 204));
        signup_Action_Performed.setText("SignUp");
        signup_Action_Performed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_Action_PerformedActionPerformed(evt);
            }
        });
        jPanel1.add(signup_Action_Performed, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 310, 50));

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Signup Page");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, -40, 410, 860));

        setSize(new java.awt.Dimension(1224, 762));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void phone_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void username_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void password_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField6ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField7ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField8ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField9ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField10ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField11ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField12ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField13ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField14ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField15ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField16ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField17ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField18ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField19ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jCTextField20ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void reEnterPass_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void exit_button_textfieldMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void name_textfieldFocusLost(java.awt.event.FocusEvent evt) {

    }

    private void username_textfieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_username_textfieldFocusLost
        if (Check_duplicate_User() == true) {
            JOptionPane.showMessageDialog(this, "UserName alredy Exist");
        }
    }// GEN-LAST:event_username_textfieldFocusLost

    private void signup_Action_PerformedActionPerformed(java.awt.event.ActionEvent evt) {
        if (validationSignup() == true) {
            if (Check_duplicate_User() == false) {
                name = name_textfield.getText();
                email = email_textfield.getText();
                phone = phone_textfield.getText();
                username = username_textfield.getText();
                password = password_textfield.getText();
                OTPWindow otp2 = new OTPWindow(name, email);
                OTPWindow otp3 = new OTPWindow(name, email, phone, username, password);
                OTPWindow otpWindow = new OTPWindow(this);
                otpWindow.setVisible(true);
                otp2.sendMailToUser();

            } else {
                JOptionPane.showMessageDialog(this, "UserName alredy Exist");
            }
        }
    }

    // Signin button Action performed
    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField email_textfield;
    private javax.swing.JLabel exit_button_textfield;
    private app.bolivia.swing.JCTextField jCTextField10;
    private app.bolivia.swing.JCTextField jCTextField11;
    private app.bolivia.swing.JCTextField jCTextField12;
    private app.bolivia.swing.JCTextField jCTextField13;
    private app.bolivia.swing.JCTextField jCTextField14;
    private app.bolivia.swing.JCTextField jCTextField15;
    private app.bolivia.swing.JCTextField jCTextField16;
    private app.bolivia.swing.JCTextField jCTextField17;
    private app.bolivia.swing.JCTextField jCTextField18;
    private app.bolivia.swing.JCTextField jCTextField19;
    private app.bolivia.swing.JCTextField jCTextField20;
    private app.bolivia.swing.JCTextField jCTextField6;
    private app.bolivia.swing.JCTextField jCTextField7;
    private app.bolivia.swing.JCTextField jCTextField8;
    private app.bolivia.swing.JCTextField jCTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private app.bolivia.swing.JCTextField name_textfield;
    private app.bolivia.swing.JCTextField password_textfield;
    private app.bolivia.swing.JCTextField phone_textfield;
    private rojerusan.RSButtonMetroBeanInfo rSButtonMetroBeanInfo1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private app.bolivia.swing.JCTextField reEnterPass_textfield;
    private rojerusan.RSMaterialButtonCircle signup_Action_Performed;
    private app.bolivia.swing.JCTextField username_textfield;
    // End of variables declaration//GEN-END:variables
}
