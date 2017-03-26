package com.tpfinal.vistas.venta;

import com.tpfinal.DAO.ArticuloDAO;
import com.tpfinal.modelo.Articulo;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class AltaVenta extends javax.swing.JFrame {

    int total = 0;
    Date a = new Date();

    public AltaVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTB_TablaDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldcodProd = new javax.swing.JTextField();
        jTextFieldcantidad = new javax.swing.JTextField();
        jButtonAddCart = new javax.swing.JButton();
        jButtoncalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTB_TablaDetalle3 = new javax.swing.JTable();
        JLB_TotalaPagar = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jTextFieldcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cancelar2 = new javax.swing.JButton();

        JTB_TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUC", "NOMBRE", "CANTIDAD", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(JTB_TablaDetalle);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo del Producto:");

        jLabel2.setText("Cantidad:");

        jTextFieldcantidad.setText("1");
        jTextFieldcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcantidadActionPerformed(evt);
            }
        });

        jButtonAddCart.setText("Añadir al Carrito");
        jButtonAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCartActionPerformed(evt);
            }
        });

        jButtoncalcular.setText("Calcular Total");
        jButtoncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncalcularActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema de Ventas");

        JTB_TablaDetalle3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUC", "NOMBRE", "PRECIO", "Stock del Producto", "Cantidad", "Precio Total"
            }
        ));
        jScrollPane2.setViewportView(JTB_TablaDetalle3);

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSave.setText("Concretar Venta");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI del Cliente:");

        Cancelar2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cancelar2.setText("Cancelar Venta");
        Cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldcodProd)
                            .addComponent(jTextFieldcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSave)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Cancelar2)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtoncalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLB_TotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldcodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButtoncalcular)
                            .addComponent(JLB_TotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddCart))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCartActionPerformed

        try {
            ArticuloDAO artDAO = new ArticuloDAO();
            Articulo art = artDAO.obtenArticulo(jTextFieldcodProd.getText());
            int cant = Integer.parseInt(jTextFieldcantidad.getText());
            if(cant <= art.getStock()){ 
                art.setStock(art.getStock() - cant);
                artDAO.actualizaArticulo(art);
                float totProd = art.getPrecio() * cant;
                
                DefaultTableModel model = (DefaultTableModel) JTB_TablaDetalle3.getModel();
                Object[] rows = new Object[6];
                rows[0] = art.getIdArticulo();
                rows[1] = art.getNombre();
                rows[2] = art.getPrecio();
                rows[3] = art.getStock();
                rows[4] = cant;
                rows[5] = totProd;
                model.addRow(rows);
                total += totProd;
                JLB_TotalaPagar.setText(Integer.toString(total));
            }else{
                JOptionPane.showMessageDialog(null, "Cantidad supera al Stock actual");
            }
        } catch (Error e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonAddCartActionPerformed

    private void jButtoncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncalcularActionPerformed
        JLB_TotalaPagar.setText(Integer.toString(total));
    }//GEN-LAST:event_jButtoncalcularActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        String elid = null;
        /// Seleccina el id   
//        try {
//             
//            ArrayList<Object[]> data = new ArrayList<>();
//            while (r.next()) {
//                elid = (r.getString(1));
//
//                Object[] rows = new Object[rsm.getColumnCount()];
//                for (int i = 0; i < rows.length; i++) {
//                    rows[i] = r.getObject(i + 1);
//                }
//                data.add(rows);
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }
//
//        for (int i = 0; i < JTB_TablaDetalle3.getRowCount(); i++) {
//
//            String elstock = "";
//            int elstock2 = 0;
//
//            String codpro = JTB_TablaDetalle3.getValueAt(i, 0).toString();
//            String prod = JTB_TablaDetalle3.getValueAt(i, 1).toString();
//            String cant = JTB_TablaDetalle3.getValueAt(i, 2).toString();
//            String car = jTextFieldcliente.getText();
//
//            try {
//
//                s = con.prepareStatement("select Stock from Producto WHERE id_producto = " + codpro + "");
//                
//                ArrayList<Object[]> data = new ArrayList<>();
//                while (r.next()) {
//
//                    Object[] rows = new Object[rsm.getColumnCount()];
//                    for (int m = 0; m < rows.length; m++) {
//                        rows[m] = r.getObject(m + 1);
//                        elstock = (r.getString(1));
//                        elstock2 = Integer.parseInt(elstock);
//                    }
//                    data.add(rows);
//
//                }
//            } catch (ClassNotFoundException | SQLException e) {
//                JOptionPane.showMessageDialog(rootPane, e.getMessage());
//            }
//
//            if (elstock2 >= 1) {
//                {
//                    try {                   
//                        s = con.prepareStatement("UPDATE Producto SET Stock=(?) Where id_producto = " + codpro + "");
//                        elstock2 = elstock2 - 1;
//                        elstock = Integer.toString(elstock2);
//                        s.setString(1, elstock);
//                        s.executeUpdate();
//
//                    } catch (Exception e) {
//                        JOptionPane.showMessageDialog(null, e);
//                    }
//                    Venta v = new Venta();
//                    //v.Venta(codpro, prod, cant, car, elid);
//                }
//            }
///// refresca el id
//        }
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, user, clave);
//            s = con.prepareStatement("UPDATE id SET id =(?)");
//
//            int elidn;
//            elidn = Integer.parseInt(elid);
//            elidn = elidn + 1;
//            elid = Integer.toString(elidn);
//            s.setString(1, elid);
//
//            s.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Venta Almacenada ");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void Cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar2ActionPerformed
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_Cancelar2ActionPerformed

    private void jTextFieldcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcantidadActionPerformed
        int cantidad = Integer.parseInt(jTextFieldcantidad.getText());
        
    }//GEN-LAST:event_jTextFieldcantidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaVenta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar2;
    private javax.swing.JTextField JLB_TotalaPagar;
    public static javax.swing.JTable JTB_TablaDetalle;
    public static javax.swing.JTable JTB_TablaDetalle3;
    private javax.swing.JButton jButtonAddCart;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtoncalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldcantidad;
    private javax.swing.JTextField jTextFieldcliente;
    private javax.swing.JTextField jTextFieldcodProd;
    // End of variables declaration//GEN-END:variables
}
