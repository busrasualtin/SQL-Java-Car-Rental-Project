/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentcarproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author busra
 */

public class AddNewVehicle extends javax.swing.JFrame {

    /**
     * Creates new form AddNewVehicle
     */
    public AddNewVehicle() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_brand = new javax.swing.JLabel();
        jTextField_brand = new javax.swing.JTextField();
        jLabel_modelvehicle = new javax.swing.JLabel();
        jTextField_modelvehicle = new javax.swing.JTextField();
        jLabel_typevehicle = new javax.swing.JLabel();
        jLabel_prodyear = new javax.swing.JLabel();
        jLabel_transType = new javax.swing.JLabel();
        jComboBox_transType = new javax.swing.JComboBox<>();
        jLabel_fuelType = new javax.swing.JLabel();
        jComboBox_fuelType = new javax.swing.JComboBox<>();
        jLabel_color = new javax.swing.JLabel();
        jTextField_color = new javax.swing.JTextField();
        jLabel_trafins = new javax.swing.JLabel();
        jLabel_motorins = new javax.swing.JLabel();
        jTextField_trafins = new javax.swing.JTextField();
        jTextField_motorins = new javax.swing.JTextField();
        jComboBox_typevehicle = new javax.swing.JComboBox<>();
        jButton_listvehicles = new javax.swing.JButton();
        jButton_addvehicle = new javax.swing.JButton();
        jPanel_listvehicles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_vehicles = new javax.swing.JTable();
        jTextField_prodyear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setText("New Vehicle Registration Form");

        jLabel_close.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_close.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setOpaque(true);
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel_brand.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_brand.setText("Brand :");

        jLabel_modelvehicle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_modelvehicle.setText("Model :");

        jLabel_typevehicle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_typevehicle.setText("Type :");

        jLabel_prodyear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_prodyear.setText("Production Year :");

        jLabel_transType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_transType.setText("Transmission Type :");

        jComboBox_transType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic", "Semi-Automatic" }));
        jComboBox_transType.setSelectedIndex(-1);

        jLabel_fuelType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fuelType.setText("Fuel Type :");

        jComboBox_fuelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel", "Gasoline", "Gasoline & LPG" }));
        jComboBox_fuelType.setSelectedIndex(-1);

        jLabel_color.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_color.setText("Color :");

        jLabel_trafins.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_trafins.setText("Traffic Insurance :");

        jLabel_motorins.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_motorins.setText("Motor Insurance :");

        jComboBox_typevehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Hatchback", "SUV", "MUV", "Crossover", "Coupe", "Convertibles", "Pickup Trucks" }));
        jComboBox_typevehicle.setSelectedIndex(-1);

        jButton_listvehicles.setBackground(new java.awt.Color(0, 153, 102));
        jButton_listvehicles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_listvehicles.setForeground(new java.awt.Color(255, 255, 255));
        jButton_listvehicles.setText("List Vehicles");
        jButton_listvehicles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_listvehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listvehiclesActionPerformed(evt);
            }
        });

        jButton_addvehicle.setBackground(new java.awt.Color(0, 153, 102));
        jButton_addvehicle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_addvehicle.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addvehicle.setText("Add Vehicle");
        jButton_addvehicle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addvehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addvehicleActionPerformed(evt);
            }
        });

        jPanel_listvehicles.setBackground(new java.awt.Color(204, 204, 204));

        jTable_vehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Brand", "Model", "Type", "Prod Year", "Transmission", "Fuel Type", "Color", "Traffic Ins", "Motor Ins"
            }
        ));
        jScrollPane1.setViewportView(jTable_vehicles);
        if (jTable_vehicles.getColumnModel().getColumnCount() > 0) {
            jTable_vehicles.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable_vehicles.getColumnModel().getColumn(1).setHeaderValue("Brand");
            jTable_vehicles.getColumnModel().getColumn(2).setHeaderValue("Model");
            jTable_vehicles.getColumnModel().getColumn(3).setHeaderValue("Type");
            jTable_vehicles.getColumnModel().getColumn(4).setHeaderValue("Prod Year");
            jTable_vehicles.getColumnModel().getColumn(5).setHeaderValue("Transmission");
            jTable_vehicles.getColumnModel().getColumn(6).setHeaderValue("Fuel Type");
            jTable_vehicles.getColumnModel().getColumn(7).setHeaderValue("Color");
            jTable_vehicles.getColumnModel().getColumn(8).setHeaderValue("Traffic Ins");
            jTable_vehicles.getColumnModel().getColumn(9).setHeaderValue("Motor Ins");
        }

        javax.swing.GroupLayout jPanel_listvehiclesLayout = new javax.swing.GroupLayout(jPanel_listvehicles);
        jPanel_listvehicles.setLayout(jPanel_listvehiclesLayout);
        jPanel_listvehiclesLayout.setHorizontalGroup(
            jPanel_listvehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_listvehiclesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_listvehiclesLayout.setVerticalGroup(
            jPanel_listvehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_listvehiclesLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Format: YYYY-MM-DD");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("Format: YYYY-MM-DD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_brand)
                    .addComponent(jLabel_modelvehicle)
                    .addComponent(jLabel_typevehicle)
                    .addComponent(jLabel_prodyear)
                    .addComponent(jLabel_transType)
                    .addComponent(jLabel_fuelType)
                    .addComponent(jLabel_color)
                    .addComponent(jLabel_trafins)
                    .addComponent(jLabel_motorins))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox_transType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_fuelType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_color)
                    .addComponent(jTextField_trafins)
                    .addComponent(jTextField_motorins)
                    .addComponent(jTextField_modelvehicle)
                    .addComponent(jTextField_brand, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jComboBox_typevehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_prodyear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_listvehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_addvehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(373, 373, 373))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(373, 373, 373)))
                .addComponent(jPanel_listvehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_brand)
                            .addComponent(jTextField_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_modelvehicle)
                            .addComponent(jTextField_modelvehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_typevehicle)
                            .addComponent(jComboBox_typevehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_prodyear)
                            .addComponent(jTextField_prodyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_transType)
                            .addComponent(jComboBox_transType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_fuelType)
                            .addComponent(jComboBox_fuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_color)
                            .addComponent(jTextField_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_trafins)
                            .addComponent(jTextField_trafins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_motorins)
                            .addComponent(jTextField_motorins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_addvehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_listvehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel_listvehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked
        
    
    private void getResult(JTable t, ResultSet s) throws SQLException {

        // first need to get number of columns in the result.
        int rowNum = s.getMetaData().getColumnCount();

        // get the name of each column within the result.
        ArrayList<String> columnNames = new ArrayList<>();
        for (int i = 1; i <= rowNum; i++) {
            columnNames.add(s.getMetaData().getColumnName(i));
        }
        // get the entire results table into an an arraylist of String arrays.
        List<List<String>> rec = new ArrayList<>();
        while (s.next()) {
            List<String> record = new ArrayList<>();
            for (java.lang.String columnName : columnNames) {
                String nextValue = s.getString(columnName);
                record.add(nextValue);
            }
            rec.add(record);
        }
        var columnArray = columnNames.toArray(new String[0]);
        DefaultTableModel model = new DefaultTableModel(columnArray,10);
        t.setEnabled(false);
        t.setModel(model);
        model.setRowCount(0);
        for (int i = 0; i < rec.size(); i++) {
            String [] record = rec.get(i).toArray(new String[0]);
            model.addRow(record);
        }
   }
    
    
    private void jButton_listvehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listvehiclesActionPerformed
        // TODO add your handling code here:
        //List Vehicles
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
        "root",
        "12345678");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select *from Vehicle");
            getResult(jTable_vehicles,rs);
            }catch(SQLException e){
            System.out.print(e);
            }
    }//GEN-LAST:event_jButton_listvehiclesActionPerformed

    private void jButton_addvehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addvehicleActionPerformed
        // TODO add your handling code here:
        //Add Vehicle
        String vehicleBrand = jTextField_brand.getText();
        String vehicleModel = jTextField_modelvehicle.getText();
        String vehicleType = jComboBox_typevehicle.getActionCommand();
        String prodYearVehicle = jTextField_prodyear.getText();
        String transTypeVehicle = jComboBox_transType.getToolTipText();
        String fuelTypeVehicle = jComboBox_fuelType.getActionCommand();
        String colorVehicle = jTextField_color.getText();
        String trafInsVehicle = jTextField_trafins.getText();
        String motorInsVehicle = jTextField_motorins.getText();
        
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
        "root",
        "12345678");
            Statement stmt = con.createStatement();
           stmt.executeUpdate("INSERT INTO `mydb`.`Vehicle` (`brandVehicle`, `modelVehicle`, `typeVehicle`, `prodYearVehicle`, `transmissionTypeVehicle`, `fuelTypeVehicle`, `colorVehicle`, `trafficInsuranceVehicle`, `motorInsuranceVehicle`)" + "VALUES ('"+vehicleBrand+"', '"+vehicleModel+"', '"+vehicleType+"', '"+prodYearVehicle+"', '"+transTypeVehicle+"', '"+fuelTypeVehicle+"', '"+colorVehicle+"', '"+trafInsVehicle+"', '"+motorInsVehicle+"')");

            Statement stmt2 = con.createStatement();
            ResultSet rs2 = stmt2.executeQuery("select * from Vehicle");
            getResult(jTable_vehicles,rs2);
            }catch(SQLException e){
            System.out.print(e);
            }
    }//GEN-LAST:event_jButton_addvehicleActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddNewVehicle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addvehicle;
    private javax.swing.JButton jButton_listvehicles;
    private javax.swing.JComboBox<String> jComboBox_fuelType;
    private javax.swing.JComboBox<String> jComboBox_transType;
    private javax.swing.JComboBox<String> jComboBox_typevehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_brand;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_color;
    private javax.swing.JLabel jLabel_fuelType;
    private javax.swing.JLabel jLabel_modelvehicle;
    private javax.swing.JLabel jLabel_motorins;
    private javax.swing.JLabel jLabel_prodyear;
    private javax.swing.JLabel jLabel_trafins;
    private javax.swing.JLabel jLabel_transType;
    private javax.swing.JLabel jLabel_typevehicle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_listvehicles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_vehicles;
    private javax.swing.JTextField jTextField_brand;
    private javax.swing.JTextField jTextField_color;
    private javax.swing.JTextField jTextField_modelvehicle;
    private javax.swing.JTextField jTextField_motorins;
    private javax.swing.JTextField jTextField_prodyear;
    private javax.swing.JTextField jTextField_trafins;
    // End of variables declaration//GEN-END:variables
}
