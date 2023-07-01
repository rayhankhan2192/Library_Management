
package Jframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ManageBook extends javax.swing.JFrame {

    private int Book_id;
    private String BookName;
    private String Author;
    private int quantity;
    DefaultTableModel model;

    //This 4 variable for bookDetailsFromDatabase() method to set read data
    private String BOOK_ID;
    private String BOOK_NAME;
    private String AUTHOR;
    private int QUANTITY;

    int BooNum = 5, qunt = 5;
    String Bonam = "Java swing", Auth = "Oracle press";

    public ManageBook() {
        initComponents();
        bookDetailsFromDatabase();
    }

    private void bookDetailsFromDatabase(){
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql:///IntelliLibrary", "root", "");
            Statement statement = connect.createStatement();
            ResultSet resultSet =  statement.executeQuery("SELECT * from IntelliLibrary_book_details");

            while(resultSet.next()){
                BOOK_ID = resultSet.getString("book_ID");
                BOOK_NAME = resultSet.getString("Book_Name");
                AUTHOR = resultSet.getString("Author");
                QUANTITY = resultSet.getInt("Quantity");

                Object[] obj = {BOOK_ID, BOOK_NAME, AUTHOR, QUANTITY};
                model = (DefaultTableModel) book_table_details.getModel();
                model.addRow(obj);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    private boolean insert_book_details_ToDatabase(){

        boolean isAdded = false;
        Book_id = Integer.parseInt(BookID_textfield2.getText());
        BookName = Bookname_textfield1.getText();
        Author = Authorname_textfield.getText();
        quantity = Integer.parseInt(Quantity_textfield1.getText());
        
        try {
            DBMSConnection connect = new DBMSConnection();
            String query = "insert into IntelliLibrary_book_details values('" + Book_id + "', '" + BookName + "', '" + Author+ "', '" + quantity + "')";
            int x = connect.statement.executeUpdate(query);

            if(x>0){
                isAdded = true;
            }else{
                isAdded = false;
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
        return isAdded;
    }

    private void clearTable(){
        DefaultTableModel model = (DefaultTableModel) book_table_details.getModel();
        model.setRowCount(0);
    }
    private void clearTextfield(){
        BookID_textfield2.setText("");
        Bookname_textfield1.setText("");
        Authorname_textfield.setText("");
        Quantity_textfield1.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        DeleteButton = new rojerusan.RSMaterialButtonRectangle();
        UpdateButton1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Authorname_textfield = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        Bookname_textfield1 = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        BookID_textfield2 = new app.bolivia.swing.JCTextField();
        Quantity_textfield1 = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        clearButton = new rojerusan.RSMaterialButtonRectangle();
        addButton = new rojerusan.RSMaterialButtonRectangle();
        exitButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ExitClick = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        book_table_details = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel2.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 130, 50));

        UpdateButton1.setText("Update");
        UpdateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 40, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 40, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 40, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 40, 50));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 2, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jLabel3.setText(" IntelliLibrary");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 320, 30));

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Author name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 130, 30));

        Authorname_textfield.setBackground(new java.awt.Color(102, 102, 255));
        Authorname_textfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Authorname_textfield.setForeground(new java.awt.Color(0, 0, 0));
        Authorname_textfield.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Authorname_textfield.setPlaceholder("Enter Author Name");
        Authorname_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Authorname_textfieldFocusLost(evt);
            }
        });
        Authorname_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Authorname_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Authorname_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 290, -1));

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Book name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 130, 30));

        Bookname_textfield1.setBackground(new java.awt.Color(102, 102, 255));
        Bookname_textfield1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Bookname_textfield1.setForeground(new java.awt.Color(0, 0, 0));
        Bookname_textfield1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Bookname_textfield1.setPlaceholder("Enter Book Name");
        Bookname_textfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Bookname_textfield1FocusLost(evt);
            }
        });
        Bookname_textfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bookname_textfield1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bookname_textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 290, -1));

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Book ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 130, 30));

        BookID_textfield2.setBackground(new java.awt.Color(102, 102, 255));
        BookID_textfield2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        BookID_textfield2.setForeground(new java.awt.Color(0, 0, 0));
        BookID_textfield2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BookID_textfield2.setPlaceholder("Enter Book ID");
        BookID_textfield2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BookID_textfield2FocusLost(evt);
            }
        });
        BookID_textfield2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookID_textfield2MouseClicked(evt);
            }
        });
        BookID_textfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookID_textfield2ActionPerformed(evt);
            }
        });
        jPanel1.add(BookID_textfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 290, -1));

        Quantity_textfield1.setBackground(new java.awt.Color(102, 102, 255));
        Quantity_textfield1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Quantity_textfield1.setForeground(new java.awt.Color(0, 0, 0));
        Quantity_textfield1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Quantity_textfield1.setPlaceholder("Enter Quantity");
        Quantity_textfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Quantity_textfield1FocusLost(evt);
            }
        });
        Quantity_textfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quantity_textfield1ActionPerformed(evt);
            }
        });
        jPanel1.add(Quantity_textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 290, -1));

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 130, 30));

        clearButton.setText("clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, -1, -1));

        addButton.setText("add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 770));

        exitButton.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 51, 51));
        exitButton.setText("X");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jLabel7.setText("Manage Book");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 280, 40));

        ExitClick.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        ExitClick.setForeground(new java.awt.Color(255, 0, 0));
        ExitClick.setText("X");
        ExitClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitClickMouseClicked(evt);
            }
        });
        jPanel5.add(ExitClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 20, 30, 20));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1400, 70));

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 770, 460));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 1010, 790));

        setSize(new java.awt.Dimension(1400, 762));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Authorname_textfieldFocusLost(java.awt.event.FocusEvent evt) {}
    private void Authorname_textfieldActionPerformed(java.awt.event.ActionEvent evt) {}
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {}
    private void UpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void Bookname_textfield1FocusLost(java.awt.event.FocusEvent evt) {}
    private void Bookname_textfield1ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void BookID_textfield2FocusLost(java.awt.event.FocusEvent evt) {}
    private void BookID_textfield2ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void Quantity_textfield1FocusLost(java.awt.event.FocusEvent evt) {}
    private void Quantity_textfield1ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void BookID_textfield2MouseClicked(java.awt.event.MouseEvent evt) {}

    private void ExitClickMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
    
      private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {
         if(insert_book_details_ToDatabase() == true){
            JOptionPane.showMessageDialog(this, "Successfully Inserted!");
            clearTextfield();
            clearTable();
            bookDetailsFromDatabase();
        }else{
            JOptionPane.showMessageDialog(this, "Something Went Wrong!");
        }
    }

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        clearTextfield();
    }
    
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {
       System.exit(0);
    }

    private void book_table_detailsMouseClicked(java.awt.event.MouseEvent evt) {
        int rowNumber = book_table_details.getSelectedRow();
        TableModel tableModel = book_table_details.getModel();
       BookID_textfield2.setText(tableModel.getValueAt(rowNumber, 0).toString());
       Bookname_textfield1.setText(tableModel.getValueAt(rowNumber, 1).toString());
       Authorname_textfield.setText(tableModel.getValueAt(rowNumber, 2).toString());
       Quantity_textfield1.setText(tableModel.getValueAt(rowNumber, 3).toString());

    }
    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        new HomePage().setVisible(true);
        dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField Authorname_textfield;
    private javax.swing.JLabel BackButton;
    private app.bolivia.swing.JCTextField BookID_textfield2;
    private app.bolivia.swing.JCTextField Bookname_textfield1;
    private rojerusan.RSMaterialButtonRectangle DeleteButton;
    private javax.swing.JLabel ExitClick;
    private app.bolivia.swing.JCTextField Quantity_textfield1;
    private rojerusan.RSMaterialButtonRectangle UpdateButton1;
    private rojerusan.RSMaterialButtonRectangle addButton;
    private rojeru_san.complementos.RSTableMetro book_table_details;
    private rojerusan.RSMaterialButtonRectangle clearButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
