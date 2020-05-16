

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITV;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Programa extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    
    //creamos variables pàra eliminar
    String Marca="";
    String Modelo="";
    String Matricula="";
    String Cilindrada="";
    String Potencia="";
    String Hora_llegada="";
    String Fecha_de_matriculacion="";
    
    //creamos un ArrayList
    ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();
    
    
    public Programa() {
        initComponents();
        
        tablaVehiculo.addMouseListener(new MouseAdapter(){
            DefaultTableModel model = new DefaultTableModel();
            
            public void mouseClicked(MouseEvent e){
                int i =tablaVehiculo.getSelectedRow();
                  Marca= (tablaVehiculo.getValueAt(i,0).toString());
                  Modelo= (tablaVehiculo.getValueAt(i,1).toString());
                  Matricula= (tablaVehiculo.getValueAt(i,2).toString());
                  Cilindrada= (tablaVehiculo.getValueAt(i,3).toString());
                  Potencia= (tablaVehiculo.getValueAt(i,4).toString());
                  Hora_llegada= (tablaVehiculo.getValueAt(i,5).toString());
                  Fecha_de_matriculacion= (tablaVehiculo.getValueAt(i,6).toString());
            
        }});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        marc = new javax.swing.JLabel();
        mod = new javax.swing.JLabel();
        mat = new javax.swing.JLabel();
        cil = new javax.swing.JLabel();
        pot = new javax.swing.JLabel();
        fm = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        textMarc = new javax.swing.JTextField();
        textMod = new javax.swing.JTextField();
        textMat = new javax.swing.JTextField();
        textCil = new javax.swing.JTextField();
        textPot = new javax.swing.JTextField();
        textTime = new javax.swing.JTextField();
        textFm = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        imagen = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marc.setText("Marca:");

        mod.setText("Modelo:");

        mat.setText("Matricula:");

        cil.setText("Cilindrada:");

        pot.setText("Potencia:");

        fm.setText("Fecha de Matriculacion:");

        time.setText("Hora de llegada:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Matricula", "Cilindrada", "Potencia", "Hora de llegada", "Matriculación"
            }
        ));
        tablaVehiculo.setRowHeight(30);
        jScrollPane1.setViewportView(tablaVehiculo);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\FP\\Progamacion\\Sin título-1.png")); // NOI18N
        jScrollPane2.setViewportView(imagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(marc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))
                                    .addComponent(time)
                                    .addComponent(pot)
                                    .addComponent(cil)
                                    .addComponent(mat)
                                    .addComponent(mod))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textTime, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPot)
                                    .addComponent(textCil)
                                    .addComponent(textMat)
                                    .addComponent(textMod)
                                    .addComponent(textMarc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fm)
                                .addGap(18, 18, 18)
                                .addComponent(textFm, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(40, 40, 40)
                                .addComponent(btnEliminar)
                                .addGap(38, 38, 38)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marc)
                            .addComponent(textMarc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mod)
                            .addComponent(textMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mat)
                            .addComponent(textMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cil)
                            .addComponent(textCil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pot)
                            .addComponent(textPot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fm))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        //llamamos a la funcion
        Vehiculo vehiculo=new Vehiculo(textMarc.getText(), textMod.getText(), textMat.getText(), textCil.getText(), textPot.getText(), textFm.getText(), textTime.getText());
        listaVehiculos.add(vehiculo);
        
        //mostramos la matriz
        mostrar();
        //esto nos permite volver a iniciar las entradas de texto
        textMarc.setText("");
        textMod.setText("");
        textMat.setText("");
        textCil.setText("");
        textPot.setText("");
        textFm.setText("");
        textTime.setText("");
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        for( int i=0; i<listaVehiculos.size(); i++){
            
            if(Marca==listaVehiculos.get(i).getMarca()){
                listaVehiculos.remove(i);
            }
        }
        //actualizamos la tabla
        String matriz [][]=new String[listaVehiculos.size()][7];
        
        for (int i = 0; i < listaVehiculos.size(); i++){
            
            matriz [i][0]=listaVehiculos.get(i).getMarca();
            matriz [i][1]=listaVehiculos.get(i).getModelo();
            matriz [i][2]=listaVehiculos.get(i).getMatricula();
            matriz [i][3]=listaVehiculos.get(i).getCilindrada();
            matriz [i][4]=listaVehiculos.get(i).getPotencia();
            matriz [i][5]=listaVehiculos.get(i).getHora_de_llegada();
            matriz [i][6]=listaVehiculos.get(i).getFecha_de_matriculacion();
        }
        //introducimos la tabla
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "Marca", "Modelo", "Matricula", "Cilindrada", "Potencia", "Hora de llegada", "Matriculación"
            }
        ));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    //creamos la variable mostrar
    public void mostrar(){
        //creamos una matriz
        String matriz [][]=new String[listaVehiculos.size()][7];
        
        for (int i = 0; i < listaVehiculos.size(); i++){
            
            matriz [i][0]=listaVehiculos.get(i).getMarca();
            matriz [i][1]=listaVehiculos.get(i).getModelo();
            matriz [i][2]=listaVehiculos.get(i).getMatricula();
            matriz [i][3]=listaVehiculos.get(i).getCilindrada();
            matriz [i][4]=listaVehiculos.get(i).getPotencia();
            matriz [i][5]=listaVehiculos.get(i).getHora_de_llegada();
            matriz [i][6]=listaVehiculos.get(i).getFecha_de_matriculacion();
        }
        //introducimos la tabla
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "Marca", "Modelo", "Matricula", "Cilindrada", "Potencia", "Hora de llegada", "Matriculación"
            }
        ));
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel cil;
    private javax.swing.JLabel fm;
    private javax.swing.JLabel imagen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel marc;
    private javax.swing.JLabel mat;
    private javax.swing.JLabel mod;
    private javax.swing.JLabel pot;
    private javax.swing.JTable tablaVehiculo;
    private javax.swing.JTextField textCil;
    private javax.swing.JTextField textFm;
    private javax.swing.JTextField textMarc;
    private javax.swing.JTextField textMat;
    private javax.swing.JTextField textMod;
    private javax.swing.JTextField textPot;
    private javax.swing.JTextField textTime;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
