/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen2labp2_juanoliva_10741313;

import java.awt.Point;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author jr_02
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        poblarDatos();
        setModeloArbol();
        cargarPlanetasPublicos();
        cargarCientificos();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPopupMenu();
        menuP1 = new javax.swing.JMenuItem();
        menuP2 = new javax.swing.JMenuItem();
        barra = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        tf_Planeta1 = new javax.swing.JTextField();
        tf_Planeta2 = new javax.swing.JTextField();
        bt_Colision = new javax.swing.JButton();
        cb_Cientifico = new javax.swing.JComboBox<>();
        tf_NombreCientificoAgregar = new javax.swing.JTextField();
        bt_AgregarCientifico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_Reset = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();

        menuP1.setText("Planeta 1");
        menuP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuP1ActionPerformed(evt);
            }
        });
        pop.add(menuP1);

        menuP2.setText("Planeta 2");
        pop.add(menuP2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.setComponentPopupMenu(pop);
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbol);

        bt_Colision.setText("Colisionar Planetas");

        cb_Cientifico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_CientificoItemStateChanged(evt);
            }
        });

        bt_AgregarCientifico.setText("Agregar Cientifico");
        bt_AgregarCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarCientificoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Cientifico");

        jLabel2.setText("Cientifico");

        jLabel3.setText("Planeta 1");

        jLabel4.setText("Planeta 2");

        bt_Reset.setText("Reset Planetas");

        checkBox.setSelected(true);
        checkBox.setText("Planetas Plublicos");
        checkBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_Planeta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_Planeta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bt_Colision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bt_Reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt_AgregarCientifico)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_NombreCientificoAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_Cientifico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Colision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Planeta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Cientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_NombreCientificoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_AgregarCientifico)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
        
    }//GEN-LAST:event_arbolMouseClicked

    private void bt_AgregarCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarCientificoActionPerformed
        agregarCientificoCombo();
    }//GEN-LAST:event_bt_AgregarCientificoActionPerformed

    private void checkBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxItemStateChanged
        if (checkBox.isSelected()) {
            cargarPlanetasPublicos();
        }else{
            if (cientificos.size()>0) {
                int seleccionCientifico = cb_Cientifico.getSelectedIndex();
                if (seleccionCientifico != -1) {
                    cargarPlanetasCientifico(cientificos.get(seleccionCientifico));
                }
            }else{
                raiz.removeAllChildren();
                modeloArbol.setRoot(raiz);
                arbol.setModel(modeloArbol);
            }
        }
    }//GEN-LAST:event_checkBoxItemStateChanged

    private void cb_CientificoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_CientificoItemStateChanged
        int seleccionCientifico = cb_Cientifico.getSelectedIndex();
        if (seleccionCientifico != -1) {
            cargarPlanetasCientifico(cientificos.get(seleccionCientifico));
            checkBox.setSelected(false);
        }else{
            checkBox.setSelected(true);
            cargarPlanetasPublicos();
        }
    }//GEN-LAST:event_cb_CientificoItemStateChanged

    private void menuP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuP1ActionPerformed
        
    }//GEN-LAST:event_menuP1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton bt_AgregarCientifico;
    private javax.swing.JButton bt_Colision;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JComboBox<String> cb_Cientifico;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuP1;
    private javax.swing.JMenuItem menuP2;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JTextField tf_NombreCientificoAgregar;
    private javax.swing.JTextField tf_Planeta1;
    private javax.swing.JTextField tf_Planeta2;
    // End of variables declaration//GEN-END:variables
    
    DB db = new DB();
    ArrayList<Planeta> planetasPlublicos = new ArrayList<>();
    ArrayList<Cientifico> cientificos = new ArrayList<>();
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Planetas");
    DefaultTreeModel modeloArbol = new DefaultTreeModel(raiz);
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    Planeta planeta1 = null;
    Planeta planeta2 = null;
    
    
    
    
    public void poblarDatos(){
        planetasPlublicos.add(new Terrestre("Mercurio",5000,13000,400,3000));
        planetasPlublicos.add(new Terrestre("Venus",100000,15000,640,260));
        planetasPlublicos.add(new Terrestre("Tierra",140000,17000,760,570));
        planetasPlublicos.add(new Terrestre("Marte",90000,12000,360,360));
        planetasPlublicos.add(new Gaseoso("Jupiter",400000,40000,340,310));
        planetasPlublicos.add(new Gaseoso("Saturno",300000,30000,560,450));
        planetasPlublicos.add(new Gaseoso("Urano",200000,20000,670,690));
        planetasPlublicos.add(new Gaseoso("Neptuno",200000,20000,840,900));
    }
    
    public double distancia(){
        double d = 0;
        if (planeta1 != null && planeta2 != null) {
            int x1, x2, y1, y2;
            x1 = planeta1.getCx();
            x2 = planeta2.getCx();
            y1 = planeta1.getCy();
            y2 = planeta2.getCy();
            d = Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
        }
        return d;
    }

    public void cargarCientificos() {
        db.cargarArchivo();
        cientificos = db.getListaCientificos();
        cargarCientificosCombo();
        cb_Cientifico.setModel(modeloCombo);
    }
    
    public void guardarDatos(){
        db.guardarArchivo(cientificos);
    }
    
    public void cargarCientificosCombo(){
        modeloCombo.removeAllElements();
        modeloCombo.addAll(cientificos);
    }
    
    public void cargarPlanetasCientifico(Cientifico c){
        DefaultMutableTreeNode cientifico = new DefaultMutableTreeNode("Planetas de " + c.toString());
        for (Planeta p : c.getPlanetas()) {
            DefaultMutableTreeNode planeta = new DefaultMutableTreeNode(p);
            cientifico.add(planeta);
        }
        modeloArbol.setRoot(cientifico);
        arbol.setModel(modeloArbol);
    }
    
    public void cargarPlanetasPublicos(){
        setModeloArbol();
        raiz.removeAllChildren();
        for (Planeta p : planetasPlublicos) {
            DefaultMutableTreeNode planeta = new DefaultMutableTreeNode(p);
            raiz.add(planeta);
        }
        modeloArbol.setRoot(raiz);
        arbol.setModel(modeloArbol);
    }
    
    public void seleccionPlaneta1(Planeta p, int numeroPlaneta){
        if (numeroPlaneta == 1) {
            tf_Planeta1.setText(p.getNombrePlaneta());
            planeta1 = p;
        }else{
            tf_Planeta2.setText(p.getNombrePlaneta());
            planeta2 = p;
        }
    }
    
    public void colision(){
        if (tf_Planeta1.getText().isBlank() || tf_Planeta2.getText().isBlank()) {
            return;
        }
        if (planeta1 != null && planeta2 != null) {
            AmdBarra ab = new AmdBarra(barra, distancia());
            Object x = planeta1.colision(planeta2);
            if (x instanceof Terrestre) {
                if (cb_Cientifico.getSelectedIndex() != -1) {
                    cientificos.get(cb_Cientifico.getSelectedIndex()).getPlanetas().add((Terrestre)x);
                }
                return;
            }
            if (x instanceof Gaseoso) {
                if (cb_Cientifico.getSelectedIndex() != -1) {
                    cientificos.get(cb_Cientifico.getSelectedIndex()).getPlanetas().add((Gaseoso)x);
                }
                return;
            }
            planetasPlublicos.add((Planeta)x);
        }else{
            JOptionPane.showMessageDialog(this, "Favor seleccion los planetas a colisionar");
        }
    }
    
    public void reset(){
        planeta1 = null;
        planeta2 = null;
        tf_Planeta1.setText("");
        tf_Planeta2.setText("");
    }

    public void agregarCientificoCombo(){
        String nombreCientifico = tf_NombreCientificoAgregar.getText();
        Cientifico c = new Cientifico(nombreCientifico);
        cientificos.add(c);
        modeloCombo.addElement(c);
        cb_Cientifico.setModel(modeloCombo);
        guardarDatos();
        tf_NombreCientificoAgregar.setText("");
        JOptionPane.showMessageDialog(this, "Cientifico agregado Exitosamente");
    }
    
    public void setModeloArbol(){
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Planetas");
        arbol.setModel(modeloArbol);
    }
}
