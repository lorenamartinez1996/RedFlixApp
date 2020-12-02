/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.vista;

import java.awt.Component;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author USER
 */
public class VentanaApp extends javax.swing.JFrame {

    /**
     * Creates new form VentanaApp
     */
    public VentanaApp() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
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

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JFormattedTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jLabelFechaN = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JFormattedTextField();
        jTextFieldFechaN = new javax.swing.JFormattedTextField();
        jLabelAlias = new javax.swing.JLabel();
        jTextFieldAlias = new javax.swing.JFormattedTextField();
        jLabelContrasenia = new javax.swing.JLabel();
        jTextFieldContrasenia = new javax.swing.JFormattedTextField();
        jPanelPelicula = new javax.swing.JPanel();
        jLabelTituloP = new javax.swing.JLabel();
        jLabelResumen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneResumen = new javax.swing.JTextPane();
        jTextFieldTituloP = new javax.swing.JFormattedTextField();
        jLabelAnio = new javax.swing.JLabel();
        jTextFieldAnio = new javax.swing.JFormattedTextField();
        jLabelDirector = new javax.swing.JLabel();
        jTextFieldDirector = new javax.swing.JFormattedTextField();
        jPanelSerie = new javax.swing.JPanel();
        jLabelTituloS = new javax.swing.JLabel();
        jTextFieldTituloS = new javax.swing.JFormattedTextField();
        jLabelNTemporadas = new javax.swing.JLabel();
        jTextFieldTemporadas = new javax.swing.JFormattedTextField();
        jLabelNEpisodios = new javax.swing.JLabel();
        jTextFieldEpisodios = new javax.swing.JFormattedTextField();
        cmbAccion = new javax.swing.JComboBox<>();
        jButtonEjecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RedFlix App");
        setLocation(new java.awt.Point(0, 0));

        jLabelNombre.setText("Nombre");

        jLabelApellido.setText("Apellido");

        jLabelEmail.setText("E-mail");

        jLabelCelular.setText("Celular");

        jLabelFechaN.setText("Fecha de Nacimiento");

        jTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jTextFieldFechaN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jTextFieldFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaNActionPerformed(evt);
            }
        });

        jLabelAlias.setText("Alias");

        jLabelContrasenia.setText("Contraseña");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelFechaN)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFechaN))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(jTextFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabelContrasenia)
                                    .addGap(188, 188, 188))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabelApellido)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelCelular)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAlias)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlias)
                    .addComponent(jTextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaN)
                    .addComponent(jTextFieldFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasenia)
                    .addComponent(jTextFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabelNombre.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane.addTab("Usuario", jPanelUsuario);

        jLabelTituloP.setText("Titulo");

        jLabelResumen.setText("Resumen:");

        jScrollPane1.setViewportView(jTextPaneResumen);

        jLabelAnio.setText("Año");

        jTextFieldAnio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabelDirector.setText("Director");

        javax.swing.GroupLayout jPanelPeliculaLayout = new javax.swing.GroupLayout(jPanelPelicula);
        jPanelPelicula.setLayout(jPanelPeliculaLayout);
        jPanelPeliculaLayout.setHorizontalGroup(
            jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeliculaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResumen)
                    .addGroup(jPanelPeliculaLayout.createSequentialGroup()
                        .addGroup(jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloP)
                            .addComponent(jLabelAnio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTituloP)
                            .addGroup(jPanelPeliculaLayout.createSequentialGroup()
                                .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabelDirector)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDirector)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelPeliculaLayout.setVerticalGroup(
            jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeliculaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloP)
                    .addComponent(jTextFieldTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAnio)
                    .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDirector)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelResumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Pelicula", jPanelPelicula);

        jLabelTituloS.setText("Titulo");

        jLabelNTemporadas.setText("Numero de temporadas");

        jTextFieldTemporadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTemporadasActionPerformed(evt);
            }
        });

        jLabelNEpisodios.setText("Numero de episodios");

        javax.swing.GroupLayout jPanelSerieLayout = new javax.swing.GroupLayout(jPanelSerie);
        jPanelSerie.setLayout(jPanelSerieLayout);
        jPanelSerieLayout.setHorizontalGroup(
            jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSerieLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieLayout.createSequentialGroup()
                        .addComponent(jLabelTituloS)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTituloS, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanelSerieLayout.createSequentialGroup()
                        .addGroup(jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNTemporadas)
                            .addComponent(jLabelNEpisodios))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelSerieLayout.setVerticalGroup(
            jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSerieLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloS)
                    .addComponent(jTextFieldTituloS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNTemporadas)
                    .addComponent(jTextFieldTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNEpisodios)
                    .addComponent(jTextFieldEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Serie", jPanelSerie);

        cmbAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una acción", "Agregar", "Buscar", "Actualizar", "Borrar" }));
        cmbAccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAccionItemStateChanged(evt);
            }
        });
        cmbAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccionActionPerformed(evt);
            }
        });

        jButtonEjecutar.setText("Ejecutar");
        jButtonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEjecutar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaNActionPerformed

    private void jTextFieldTemporadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTemporadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTemporadasActionPerformed

    private void cmbAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccionActionPerformed

    private void cmbAccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAccionItemStateChanged
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
            return;
        }
        String opcionSeleccionada = evt.getItem().toString();
        //System.out.println(evt.getItem());
        switch (opcionSeleccionada) {
            case "Agregar":
                preparacionAgregar();
                break;
            case "Buscar":
                break;
            case "Actualizar":
                break;
            case "Borrar":
                break;
        }
    }//GEN-LAST:event_cmbAccionItemStateChanged

    private void jButtonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutarActionPerformed
        switch (cmbAccion.getSelectedItem().toString()) {
            case "Agregar":
                System.out.println("A");
                break;
            case "Buscar":
                System.out.println("B");
                break;
            case "Actualizar":
                System.out.println("C");
                break;
            case "Borrar":
                System.out.println("D");
                break;
        }
    }//GEN-LAST:event_jButtonEjecutarActionPerformed

    private void preparacionAgregar() {
        javax.swing.JPanel panelActual = (javax.swing.JPanel) jTabbedPane.getSelectedComponent();
        for (Component c : panelActual.getComponents()) {
            //System.out.println(c.getClass().getSimpleName());
            if (c.getClass().getSimpleName().equalsIgnoreCase("JFormattedTextField")) {
                c.setEnabled(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAccion;
    private javax.swing.JButton jButtonEjecutar;
    private javax.swing.JLabel jLabelAlias;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelContrasenia;
    private javax.swing.JLabel jLabelDirector;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFechaN;
    private javax.swing.JLabel jLabelNEpisodios;
    private javax.swing.JLabel jLabelNTemporadas;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelResumen;
    private javax.swing.JLabel jLabelTituloP;
    private javax.swing.JLabel jLabelTituloS;
    private javax.swing.JPanel jPanelPelicula;
    private javax.swing.JPanel jPanelSerie;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JFormattedTextField jTextFieldAlias;
    private javax.swing.JFormattedTextField jTextFieldAnio;
    private javax.swing.JFormattedTextField jTextFieldApellido;
    private javax.swing.JFormattedTextField jTextFieldCelular;
    private javax.swing.JFormattedTextField jTextFieldContrasenia;
    private javax.swing.JFormattedTextField jTextFieldDirector;
    private javax.swing.JFormattedTextField jTextFieldEmail;
    private javax.swing.JFormattedTextField jTextFieldEpisodios;
    private javax.swing.JFormattedTextField jTextFieldFechaN;
    private javax.swing.JFormattedTextField jTextFieldNombre;
    private javax.swing.JFormattedTextField jTextFieldTemporadas;
    private javax.swing.JFormattedTextField jTextFieldTituloP;
    private javax.swing.JFormattedTextField jTextFieldTituloS;
    private javax.swing.JTextPane jTextPaneResumen;
    // End of variables declaration//GEN-END:variables
}
