
package Jframe;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        bookDetailsFromDatabase();
    }
    
      private void bookDetailsFromDatabase(){
        try {
            DBMSConnection connect = new DBMSConnection();
            ResultSet resultSet =  connect.statement.executeQuery("SELECT * from IntelliLibrary_book_details");

            while(resultSet.next()){
                String BOOK_ID = resultSet.getString("book_ID");
                String BOOK_NAME = resultSet.getString("Book_Name");
                String AUTHOR = resultSet.getString("Author");
                int QUANTITY = resultSet.getInt("Quantity");

                Object[] obj = {BOOK_ID, BOOK_NAME, AUTHOR, QUANTITY};
                DefaultTableModel model = (DefaultTableModel) book_table_details.getModel();
                model.addRow(obj);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ExitClick = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ViewRecord = new javax.swing.JPanel();
        HomePage2 = new javax.swing.JLabel();
        HomePage = new javax.swing.JPanel();
        HomePage1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LMSDashboard = new javax.swing.JPanel();
        HomePage3 = new javax.swing.JLabel();
        ManageBook = new javax.swing.JPanel();
        HomePage4 = new javax.swing.JLabel();
        ManageStudent = new javax.swing.JPanel();
        HomePage5 = new javax.swing.JLabel();
        IssueBook = new javax.swing.JPanel();
        HomePage6 = new javax.swing.JLabel();
        LogOut = new javax.swing.JPanel();
        HomePage7 = new javax.swing.JLabel();
        ReturnBook = new javax.swing.JPanel();
        HomePage8 = new javax.swing.JLabel();
        ViewIssueBook = new javax.swing.JPanel();
        HomePage9 = new javax.swing.JLabel();
        DefaulterList = new javax.swing.JPanel();
        HomePage10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        book_table_details = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jPanel2.setBackground(new java.awt.Color(0, 213, 172));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 5, 8, 60));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel2.setText("Welcome To Admin Pannel");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 460, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IntelliLibrary");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 240, 30));

        ExitClick.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        ExitClick.setForeground(new java.awt.Color(255, 0, 0));
        ExitClick.setText("X");
        ExitClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitClickMouseClicked(evt);
            }
        });
        jPanel1.add(ExitClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 20, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewRecord.setBackground(new java.awt.Color(0, 0, 0));
        ViewRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage2.setBackground(new java.awt.Color(255, 0, 51));
        HomePage2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage2.setForeground(new java.awt.Color(255, 255, 255));
        HomePage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        HomePage2.setText("View Record");
        ViewRecord.add(HomePage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jPanel3.add(ViewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 280, 40));

        HomePage.setBackground(new java.awt.Color(255, 51, 51));
        HomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage1.setBackground(new java.awt.Color(255, 0, 51));
        HomePage1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage1.setForeground(new java.awt.Color(255, 255, 255));
        HomePage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        HomePage1.setText("Home Page");
        HomePage.add(HomePage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 30));

        jPanel3.add(HomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Features");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        LMSDashboard.setBackground(new java.awt.Color(0, 0, 0));
        LMSDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage3.setBackground(new java.awt.Color(255, 0, 51));
        HomePage3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage3.setForeground(new java.awt.Color(255, 255, 255));
        HomePage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        HomePage3.setText("LMS Dashboard");
        LMSDashboard.add(HomePage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jPanel3.add(LMSDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        ManageBook.setBackground(new java.awt.Color(0, 0, 0));
        ManageBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBookMouseClicked(evt);
            }
        });
        ManageBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage4.setBackground(new java.awt.Color(255, 0, 51));
        HomePage4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage4.setForeground(new java.awt.Color(255, 255, 255));
        HomePage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        HomePage4.setText("Manage Book");
        ManageBook.add(HomePage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jPanel3.add(ManageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 40));

        ManageStudent.setBackground(new java.awt.Color(0, 0, 0));
        ManageStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage5.setBackground(new java.awt.Color(255, 0, 51));
        HomePage5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage5.setForeground(new java.awt.Color(255, 255, 255));
        HomePage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        HomePage5.setText("Manage Student");
        ManageStudent.add(HomePage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jPanel3.add(ManageStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 280, 40));

        IssueBook.setBackground(new java.awt.Color(0, 0, 0));
        IssueBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage6.setBackground(new java.awt.Color(255, 0, 51));
        HomePage6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage6.setForeground(new java.awt.Color(255, 255, 255));
        HomePage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        HomePage6.setText("Issue Book");
        IssueBook.add(HomePage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jPanel3.add(IssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, 40));

        LogOut.setBackground(new java.awt.Color(204, 0, 204));
        LogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage7.setBackground(new java.awt.Color(255, 0, 51));
        HomePage7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage7.setForeground(new java.awt.Color(255, 255, 255));
        HomePage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        HomePage7.setText("LogOut");
        LogOut.add(HomePage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 30));

        jPanel3.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 610, 280, 40));

        ReturnBook.setBackground(new java.awt.Color(0, 0, 0));
        ReturnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage8.setBackground(new java.awt.Color(255, 0, 51));
        HomePage8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage8.setForeground(new java.awt.Color(255, 255, 255));
        HomePage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        HomePage8.setText("Return Book");
        ReturnBook.add(HomePage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jPanel3.add(ReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 280, 40));

        ViewIssueBook.setBackground(new java.awt.Color(0, 0, 0));
        ViewIssueBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage9.setBackground(new java.awt.Color(255, 0, 51));
        HomePage9.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage9.setForeground(new java.awt.Color(255, 255, 255));
        HomePage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        HomePage9.setText("View Issued Book");
        ViewIssueBook.add(HomePage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 220, 30));

        jPanel3.add(ViewIssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 490, 290, 40));

        DefaulterList.setBackground(new java.awt.Color(0, 0, 0));
        DefaulterList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage10.setBackground(new java.awt.Color(255, 0, 51));
        HomePage10.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        HomePage10.setForeground(new java.awt.Color(255, 255, 255));
        HomePage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        HomePage10.setText("Defaulter List");
        DefaulterList.add(HomePage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 30));

        jPanel3.add(DefaulterList, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 550, 280, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 700));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        jLabel5.setText("  10");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 140));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Student Details");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Number of Student");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 0, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_People_50px.png"))); // NOI18N
        jLabel7.setText("  10");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 50));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 260, 140));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Issued Books");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel10.setText("  10");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 50));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 250, 140));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Defaulter List");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, -1, -1));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 0, 204)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        jLabel12.setText("  10");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 50));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 250, 140));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"221-35-831", "Rayhan", "BSc SWE", "DIU"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Course", "Branch"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(204, 0, 204));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(204, 0, 204));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        rSTableMetro1.setRowHeight(30);
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 540, 320));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Number of Books");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Book Details");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 130, 30));

        book_table_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Author", "Quantity"
            }
        ));
        book_table_details.setColorBackgoundHead(new java.awt.Color(0, 153, 153));
        book_table_details.setColorBordeFilas(new java.awt.Color(0, 153, 153));
        book_table_details.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        book_table_details.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        book_table_details.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        book_table_details.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        book_table_details.setFuenteHead(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        book_table_details.setRowHeight(30);
        book_table_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_table_detailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(book_table_details);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 550, 320));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1130, 700));

        setSize(new java.awt.Dimension(1400, 762));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitClickMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitClickMouseClicked

    private void ManageBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBookMouseClicked
        new ManageBook().setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageBookMouseClicked

    private void book_table_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_table_detailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_book_table_detailsMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DefaulterList;
    private javax.swing.JLabel ExitClick;
    private javax.swing.JPanel HomePage;
    private javax.swing.JLabel HomePage1;
    private javax.swing.JLabel HomePage10;
    private javax.swing.JLabel HomePage2;
    private javax.swing.JLabel HomePage3;
    private javax.swing.JLabel HomePage4;
    private javax.swing.JLabel HomePage5;
    private javax.swing.JLabel HomePage6;
    private javax.swing.JLabel HomePage7;
    private javax.swing.JLabel HomePage8;
    private javax.swing.JLabel HomePage9;
    private javax.swing.JPanel IssueBook;
    private javax.swing.JPanel LMSDashboard;
    private javax.swing.JPanel LogOut;
    private javax.swing.JPanel ManageBook;
    private javax.swing.JPanel ManageStudent;
    private javax.swing.JPanel ReturnBook;
    private javax.swing.JPanel ViewIssueBook;
    private javax.swing.JPanel ViewRecord;
    private rojeru_san.complementos.RSTableMetro book_table_details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
