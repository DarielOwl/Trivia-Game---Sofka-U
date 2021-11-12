package dtrivia.presentacion;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.Fabrica;
import dtrivia.logica.entidades.Categoria;
import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dariel de Sosa
 */
public class configuraciones extends javax.swing.JFrame {

    private final Fabrica fabrica = new Fabrica(); //Instanciamos Fabrica
    private Categoria catSeleccionada; //Para almacenar las categorias

    public configuraciones() {
        initComponents();
        this.setLocationRelativeTo(null); //Centrar al medio

        try {

            //Setear las categorias en el combobox
            List<Categoria> categorias = fabrica.getCategoriaControlador().getTodosLasCategorias();
            categorias.forEach(categoria -> categorias_combo.addItem(categoria));
            
        } catch (BaseDeDatosException ex) {
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categorias_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        respuestaIncorrecta1 = new javax.swing.JTextField();
        respuestaCorrecta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        respuestaIncorrecta2 = new javax.swing.JTextField();
        respuestaIncorrecta3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        dificultad_combo = new javax.swing.JComboBox<>();
        textopregunta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Configuraciones");

        jLabel2.setText("Seleccione Categoria: ");

        categorias_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorias_comboActionPerformed(evt);
            }
        });

        jLabel3.setText("Formule la Pregunta: ");

        jLabel4.setText("Crea las posibles respuestas");

        jLabel5.setText("Respuesta Correcta");

        jLabel6.setText("Respuesta Incorrecta 1");

        respuestaIncorrecta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaIncorrecta1ActionPerformed(evt);
            }
        });

        respuestaCorrecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaCorrectaActionPerformed(evt);
            }
        });

        jLabel7.setText("Respuesta Incorrecta 2");

        respuestaIncorrecta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaIncorrecta2ActionPerformed(evt);
            }
        });

        respuestaIncorrecta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaIncorrecta3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Respuesta Incorrecta 3");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");

        jLabel9.setText("Dificultad de la Pregunta: ");

        dificultad_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));

        textopregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textopreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(confirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(categorias_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(3, 3, 3)
                                        .addComponent(dificultad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textopregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(respuestaIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(respuestaIncorrecta1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(respuestaIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(categorias_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textopregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dificultad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(respuestaIncorrecta1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(respuestaIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(respuestaIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(confirmar)
                    .addComponent(cancelar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respuestaIncorrecta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaIncorrecta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaIncorrecta1ActionPerformed

    private void respuestaCorrectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaCorrectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaCorrectaActionPerformed

    private void respuestaIncorrecta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaIncorrecta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaIncorrecta2ActionPerformed

    private void respuestaIncorrecta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaIncorrecta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaIncorrecta3ActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed

        //Obtener los datos de la configuracion
        try {
            //Respuestas
            String resCorrecta = this.respuestaCorrecta.getText();
            String respIncorrecta1 = this.respuestaIncorrecta1.getText();
            String respIncorrecta2 = this.respuestaIncorrecta2.getText();
            String respIncorrecta3 = this.respuestaIncorrecta3.getText();

            //Pregunta
            String pregunta = this.textopregunta.getText();

            //Obtenemos la categoria seleccionada
            Categoria CategoriaID = (Categoria) categorias_combo.getSelectedItem();
            Long idCat = CategoriaID.getId();

            //Guardamos la id del item seleccionado
            String dificultad = dificultad_combo.getSelectedItem().toString();

            //Preguntamos al Usuario antes de ingresar
            int i = JOptionPane.showConfirmDialog(null, "¿Desea Registrar esta Pregunta?", "Confirmar Alta Pregunta", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {

                Pregunta preg = new Pregunta(pregunta, dificultad, idCat); //Creamos el obj pregunta
                fabrica.getFAQControlador().altaPregunta(preg); //Insertamos la pregunta primero

                //Creamos el obj respuesta 
                Pregunta IDpreg = fabrica.getFAQControlador().getIdPregunta(pregunta); //Obtenemos la pregunta
                
                Respuesta resp = new Respuesta(resCorrecta, respIncorrecta1, respIncorrecta2, respIncorrecta3, IDpreg.getId());
                fabrica.getFAQControlador().altaRespuesta(resp);

                JOptionPane.showMessageDialog(null, "Se agrego correctamente la Pregunta");
            } else {
                JOptionPane.showMessageDialog(null, "No agrego la Pregunta");
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(rootPane, String.format("Error argumento inválido [%s]", e.getMessage()));
        } catch (InnovaModelException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, String.format("Error desconocido [%s]", e.getMessage()));
        }


    }//GEN-LAST:event_confirmarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Configurar para salir al menu de inicio
        menu m = new menu();
        m.show();
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void textopreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textopreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textopreguntaActionPerformed

    private void categorias_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorias_comboActionPerformed
        //AL SELECCIONAR UNA CATEGORIA SE ASIGNA ESE VALOR A catSeleccionada
        catSeleccionada = (Categoria) categorias_combo.getSelectedItem();
    }//GEN-LAST:event_categorias_comboActionPerformed

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
            java.util.logging.Logger.getLogger(configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuraciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<Categoria> categorias_combo;
    private javax.swing.JButton confirmar;
    private javax.swing.JComboBox<String> dificultad_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField respuestaCorrecta;
    private javax.swing.JTextField respuestaIncorrecta1;
    private javax.swing.JTextField respuestaIncorrecta2;
    private javax.swing.JTextField respuestaIncorrecta3;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textopregunta;
    // End of variables declaration//GEN-END:variables
}
