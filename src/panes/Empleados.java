package panes;

import models.Conection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier Yévenes
 */
public class Empleados extends javax.swing.JPanel {
    Conection cn1 = new Conection();
    Connection con1;
    DefaultTableModel modTable;
    Statement state;
    ResultSet res;
    
    public Empleados() {
        initComponents();
        Rellenar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ComboCargo = new javax.swing.JComboBox<>();
        Txtfono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txtsetid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txtcargoid = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBackground(new java.awt.Color(102, 102, 102));
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Rut", "Fono", "Correo", "Id Cargo", "Nom. Cargo"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro de Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setText("Correo");

        jLabel5.setText("Fono Contacto");

        BtnBuscar.setText("Buscar");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnReg.setText("Registrar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jLabel4.setText("Cargo");

        ComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo", "Administrador/a", "Vendedor/a", "Supervisor/a", "Cajero/a" }));

        jLabel2.setText("Apellidos");

        jLabel1.setText("Nombres");

        jLabel3.setText("Rut");

        Txtsetid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Txtsetid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Id Empleado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addContainerGap(394, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Txtfono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txtapellido, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txtsetid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(Txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(ComboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReg)
                    .addComponent(Txtsetid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtfono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(ComboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        Txtcargoid.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(506, 506, 506)
                    .addComponent(Txtcargoid)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(Txtcargoid)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        int validacion = 0;
        String nombre, apellidos, rut, fono, correo, cargo;
        
        nombre = Txtnombre.getText().trim();
        apellidos = Txtapellido.getText().trim();
        rut = txtRut.getText().trim();
        fono = Txtfono.getText().trim();
        correo = Txtemail.getText().trim();
        cargo = ComboCargo.getName();
        
        if(nombre.equals("")){
            Txtnombre.setBackground(Color.red);
            validacion++;
        }
        if(apellidos.equals("")){
            Txtapellido.setBackground(Color.red);
            validacion++;
        }
        if(rut.equals("")){
            txtRut.setBackground(Color.red);
            validacion++;
        }
        if(fono.equals("")){
            Txtfono.setBackground(Color.red);
            validacion++;
        }
        if(correo.equals("")){
            Txtemail.setBackground(Color.red);
            validacion++;
        }
        
        int idEmpGen = 0;
        
        try{
            Connection con = Conection.Conection();
            PreparedStatement ps = con.prepareStatement("SELECT Rut FROM empleado where Rut = '" + rut + "' ");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                txtRut.setBackground(Color.red);
                JOptionPane.showMessageDialog(null,"Ojo \n \n" + "Ya existe un empleado con este Rut. \n \n" + "Vuelva a revisar bien los datos." );
            }else{
                con.close();
                
                if(validacion == 0){
                    try{
                        Connection cn = Conection.Conection();
                        PreparedStatement psEmp = cn.prepareStatement("INSERT INTO empleado VALUES (?, ?, ?, ?, ?)");
                        psEmp.setInt(1, 0);
                        psEmp.setString(2, nombre);
                        psEmp.setString(3, apellidos);
                        psEmp.setString(4, rut);
                        psEmp.executeUpdate();
                        
                        //Obtener el id generado
                        ResultSet generatedKeys = psEmp.getGeneratedKeys();
                        if(generatedKeys.next()){
                            idEmpGen = generatedKeys.getInt(1);
                        }
                        
                        cn.close();
                    }catch(Exception ex){
                         ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al registrar. \n \n" + "Vuelva a intentarlo");
                    }
                    
                    if(idEmpGen !=0){
                        try{
                        Connection cn = Conection.Conection();
                        PreparedStatement psCrew = cn.prepareStatement("INSERT INTO crew VALUES (?,?)");
                        psCrew.setInt(1,idEmpGen);
                        psCrew.setString(2, correo);
                        psCrew.executeUpdate();
                        cn.close();
                        }catch(Exception ex){
                            System.out.println("Error al registrar en la tabla crew");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Error al Registrar.");
                }
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnRegActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún dato.");
        }else{
            int id = Integer.parseInt((String) Tabla.getValueAt(fila,0) .toString());
            String nom = (String) Tabla.getValueAt(fila, 1);
            String apell = (String) Tabla.getValueAt(fila, 2);
            String rut = (String) Tabla.getValueAt(fila,3);
            int fono =  Integer.parseInt((String) Tabla.getValueAt(fila,4) .toString());
            String email = (String) Tabla.getValueAt(fila,5);
            int cargoId = Integer.parseInt((String) Tabla.getValueAt(fila,6) .toString());
            String cargo = (String) Tabla.getValueAt(fila,7);
            
            Txtsetid.setText(""+id);
            Txtnombre.setText(nom);
            Txtapellido.setText(apell);
            txtRut.setText(rut);
            Txtfono.setText(""+fono);
            Txtemail.setText(email);
            Txtcargoid.setText(""+cargoId);
            ComboCargo.setName(cargo);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Modificar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JComboBox<String> ComboCargo;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Txtapellido;
    private javax.swing.JLabel Txtcargoid;
    private javax.swing.JTextField Txtemail;
    private javax.swing.JTextField Txtfono;
    private javax.swing.JTextField Txtnombre;
    private javax.swing.JLabel Txtsetid;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
    
    void Rellenar(){
        String sql = "SELECT `empleado`.`Id`, `empleado`.`Nombre`, `empleado`.`Apellido`, `empleado`.`Rut`, `empleado`.`Fono`, `crew`.`Email`, `cargo`.`Id`, `cargo`.`Nombre`\n" +
                     "FROM `empleado` \n" +
                     "LEFT JOIN `crew` ON `crew`.`Id_empleado` = `empleado`.`Id` \n" +
                     "LEFT JOIN `cargo` ON `empleado`.`Cargo_id` = `cargo`.`Id`";
        try{
            con1 = cn1.Conection();
            state = con1.createStatement();
            res = state.executeQuery(sql);
            Object[]Empleado = new Object[8];
            modTable = (DefaultTableModel) Tabla.getModel();
            while(res.next()){
                Empleado[0] = res.getInt("Id");
                Empleado[1] = res.getString("Nombre");
                Empleado[2] = res.getString("Apellido");
                Empleado[3] = res.getString("Rut");
                Empleado[4] = res.getInt("Fono");
                Empleado[5] = res.getString("Correo");
                Empleado[6] = res.getInt("Id");
                Empleado[7] = res.getString("Nombre");
                
                modTable.addRow(Empleado);
            }
            Tabla.setModel(modTable);
            con1.close();
        }catch(Exception e){
            
        }
    }
    void Modificar(){
        String nombre, apellidos, rut, correo, cargo;
        int fono, idEmp, idCargo;
        
        idEmp = Integer.parseInt(Txtsetid.getText().trim());
        nombre = Txtnombre.getText().trim();
        apellidos = Txtapellido.getText().trim();
        rut = txtRut.getText().trim();
        fono = Integer.parseInt(Txtfono.getText().trim());
        correo = Txtemail.getText().trim();
        idCargo = Integer.parseInt(Txtcargoid.getText().trim());
        cargo = ComboCargo.getName();
        
        String empleado ="UPDATE empleado SET Nombre='"+nombre+"', Apellido='"+apellidos+"', Rut='"+rut+"', Fono='"+fono+"', Cargo_id='"+idCargo+"' WHERE Id_empleado = '"+idEmp+"'";
        String crew ="UPDATE crew SET Email = '"+correo+"' WHERE Id_empleado = '"+idEmp+"'";
        try{
            con1 = cn1.Conection();
            state = con1.createStatement();
            res = state.executeQuery(empleado);
            con1.close(); 
            try{
                con1 = cn1.Conection();
                state = con1.createStatement();
                res = state.executeQuery(crew);
                con1.close();
                
            }catch(Exception e){
                System.out.println("Error al ingresar los datos en Crew");
            }
        }catch(Exception e){
            System.out.println("Error al ingresar los datos en Empleado");
        }
    }
}
