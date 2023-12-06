package panes;
import controllers.Cbuy;
import models.Conection;
import models.Buy;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
/**
 *
 * @author Javier Yévenes
 */
public class Ventas extends javax.swing.JPanel {
    Conection cn = new Conection();
    Connection con = cn.Conection();
    
    double precio = 0;
    int cantidad = 0;
    
    public Ventas() {
        initComponents();
        setSize(780,720);
        cargarCombo(ComboDesc);
        mathprice();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        TxtPrecioUn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtBarcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CheckBoleta = new javax.swing.JCheckBox();
        CheckFactura = new javax.swing.JCheckBox();
        Txtrutcl = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtNomClient = new javax.swing.JTextField();
        ComboDesc = new javax.swing.JComboBox<>();
        BtnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Spcant = new javax.swing.JSpinner();

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "X", "Descripción", "Cantidad", "Precio Un", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(20);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(400);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(20);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(40);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jLabel1.setText("Descripción:");

        jLabel2.setText("Código Barras:");

        jLabel4.setText("Cant.");

        jLabel5.setText("Total:");

        CheckBoleta.setText("Boleta");

        CheckFactura.setText("Factura");

        Txtrutcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtrutclActionPerformed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel6.setText("Cód. Vendedor:");

        jLabel7.setText("Precio Un.");

        ComboDesc.setEditable(true);
        ComboDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDescActionPerformed(evt);
            }
        });

        BtnDelete.setText("Quitar");

        jButton1.setText("Agregar");

        jLabel8.setText("Total:");

        jButton2.setText("Imprimir");

        Spcant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Spcant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpcantStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Spcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtPrecioUn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CheckFactura)
                                        .addGap(42, 42, 42)
                                        .addComponent(Txtrutcl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(CheckBoleta)
                                        .addGap(417, 417, 417)))))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoleta)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckFactura)
                    .addComponent(Txtrutcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecioUn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(Spcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDelete)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jButton2)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtrutclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtrutclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtrutclActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char keyPress = evt.getKeyChar();
        String codEmp = jTextField2.getText();
        if(keyPress == KeyEvent.VK_ENTER){
            try{
                Statement st = cn.createStatement();
                ResultSet res = st.executeQuery("SELECT Nombre, Apellido FROM empleados WHERE id='"+ codEmp +"'");
                if(res.next()){
                    String nom = res.getString("Nombre");
                    String apell = res.getString("Apellido");
                    jTextField3.setText(nom + " " + apell);
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no Encotrado. \n \n Verifique que el código ingresado sea el correcto.");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Oh no.. \n \n Ha ocurrido un error inesperado. \n \n Vuelva a intentarlo.");
            }
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void SpcantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpcantStateChanged
        mathprice();
    }//GEN-LAST:event_SpcantStateChanged

    private void ComboDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDescActionPerformed
        mathprice();
    }//GEN-LAST:event_ComboDescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JCheckBox CheckBoleta;
    private javax.swing.JCheckBox CheckFactura;
    private javax.swing.JComboBox<String> ComboDesc;
    private javax.swing.JSpinner Spcant;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtBarcode;
    private javax.swing.JTextField TxtNomClient;
    private javax.swing.JTextField TxtPrecioUn;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField Txtrutcl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(JComboBox<String> comboBox) {
    DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
    comboBox.setModel(comboModel);
    Cbuy cb = new Cbuy();

    try {
        String query = "SELECT Descripcion FROM productos";

        try (Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                Buy buy = new Buy();
                buy.setDesc(rs.getString("Descripcion"));
                cb.AddProducts(buy);
                comboModel.addElement(buy.getDesc());
            }
        }

        AutoCompleteDecorator.decorate(comboBox, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleComboBoxSelection(comboBox);
            }
        });

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error en la selección: " + e.getMessage());
    }
}

    private void handleComboBoxSelection(JComboBox<String> comboBox) {
        String desc = comboBox.getSelectedItem().toString();
        String cliente = Txtrutcl.getText();

        try {
            String query = "SELECT Cod_barra, Precio_sin_iva, Precio_con_iva FROM productos WHERE Descripcion = ?";

            try (PreparedStatement ps = cn.prepareStatement(query)) {
                ps.setString(1, desc);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        int barcode = rs.getInt("Cod_barra");
                        double siniva = rs.getDouble("Precio_sin_iva");
                        double coniva = rs.getDouble("Precio_con_iva");

                        if (CheckBoleta.isSelected()) {
                            TxtBarcode.setText(Integer.toString(barcode));
                            TxtPrecioUn.setText("$ " + coniva);
                        }

                        if (CheckFactura.isSelected()) {
                            handleFacturaOption(barcode, siniva);
                        }
                    }
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
        }
    }

    private void handleFacturaOption(int barcode, double siniva) {
        TxtBarcode.setText(Integer.toString(barcode));
        TxtPrecioUn.setText("$" + siniva);
    }
    
    private void mathprice(){
        String stprecio = TxtPrecioUn.getText();
        
        try{
            precio = Double.parseDouble(stprecio);
            cantidad = Integer.parseInt(Spcant.getValue().toString());
            TxtTotal.setText(aMoney(precio*cantidad));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos del sistema. \n \n Vuelva a intentarlo.");
        }
    }
    
    public String aMoney(double precio){
        return "$"+Math.round(precio*100)/100;
    }
}
