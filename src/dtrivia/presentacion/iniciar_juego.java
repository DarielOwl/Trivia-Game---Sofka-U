package dtrivia.presentacion;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.Fabrica;
import dtrivia.logica.entidades.Jugador;
import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;
import dtrivia.logica.entidades.Ronda;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dariel de Sosa
 */
public class iniciar_juego extends javax.swing.JFrame {

    private final Fabrica fabrica = new Fabrica(); //Instanciamos Fabrica
    public Boolean flagCorrecto = false;

    public String lvlRonda = "facil"; //dificultad de la ronda
    public Integer contLVL = 1; //Numero de la ronda
    public Integer premio = 0; //Monto
    public String nombreJugador;

    public iniciar_juego() {
        initComponents();
        this.setLocationRelativeTo(null); //Centrar al medio

        nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del Jugador: ");
        try {

            cargarDatos();
        } catch (BaseDeDatosException ex) {
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        pregunta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numeroRonda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_a = new javax.swing.JButton();
        button_b = new javax.swing.JButton();
        button_c = new javax.swing.JButton();
        button_d = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setText("¿Pregunta?");

        jLabel3.setText("Monto $ ");

        puntos.setText("1.000.000");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setText("Trivia Game");

        numeroRonda.setText("0");

        jLabel2.setText("Ronda");

        button_a.setText("a)");
        button_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_aActionPerformed(evt);
            }
        });

        button_b.setText("b)");
        button_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bActionPerformed(evt);
            }
        });

        button_c.setText("c)");
        button_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cActionPerformed(evt);
            }
        });

        button_d.setText("d)");
        button_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntos)
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_a, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(button_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroRonda)
                                .addGap(225, 225, 225)
                                .addComponent(jLabel1)))
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(puntos)
                            .addComponent(numeroRonda)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(47, 47, 47)
                .addComponent(pregunta)
                .addGap(98, 98, 98)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_a, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_b, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_d)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Configurar para salir al menu de inicio
        menu m = new menu();
        m.show();
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void button_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_aActionPerformed
        flagCorrecto = true;
        verificarJuego(flagCorrecto); //Verifica si es correcto
    }//GEN-LAST:event_button_aActionPerformed

    private void button_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bActionPerformed
        flagCorrecto = false;
        verificarJuego(flagCorrecto); //Verifica si es correcto
    }//GEN-LAST:event_button_bActionPerformed

    private void button_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cActionPerformed
        flagCorrecto = false;
        verificarJuego(flagCorrecto); //Verifica si es correcto
    }//GEN-LAST:event_button_cActionPerformed

    private void button_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dActionPerformed
        flagCorrecto = false;
        verificarJuego(flagCorrecto); //Verifica si es correcto
    }//GEN-LAST:event_button_dActionPerformed

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
            java.util.logging.Logger.getLogger(iniciar_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciar_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciar_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciar_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciar_juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_a;
    private javax.swing.JButton button_b;
    private javax.swing.JButton button_c;
    private javax.swing.JButton button_d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel numeroRonda;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel puntos;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        //Cargar las etiquetas
        numeroRonda.setText(contLVL.toString());
        puntos.setText(premio.toString());

        //Cargar pregunta dependiendo del nivel
        Pregunta preg = fabrica.getFAQControlador().buscarPregunta(lvlRonda);
        pregunta.setText(preg.getPregunta());

        //Obtenemos el id de la Pregunta a responder
        Long IDpreg = preg.getId(); //Obtenemos la pregunta
        Respuesta resp = fabrica.getFAQControlador().buscarRespuesta(IDpreg);
        this.button_a.setText(resp.getRespuestaBien());
        this.button_b.setText(resp.getRespuestaMal1());
        this.button_c.setText(resp.getRespuestaMal2());
        this.button_d.setText(resp.getRespuestaMal3());
    }

    private void verificarJuego(Boolean falgRespuesta) {

        //Si selecciona la respuesta correcta:
        if (falgRespuesta == true) {
            contLVL++; //Aumento un nivel

            //Determinar la dificultad
            switch (contLVL) {
                case 1:
                    lvlRonda = "facil";
                    break;
                case 2:
                    lvlRonda = "medio";
                    premio = 200000;
                    break;
                case 3:
                    lvlRonda = "medio";
                    premio = 500000;
                    break;
                case 4:
                    lvlRonda = "dificil";
                    premio = 750000;
                    break;
                case 5:
                    //lvlRonda = "dificil";
                    premio = 10000000;
                    break;
            }

            if (contLVL == 5) { //Si ya llego a la ronda final, guarda
                Jugador winPlayer = new Jugador(nombreJugador,premio,contLVL);
                fabrica.getJugadorControlador().altaJugador(winPlayer);
                JOptionPane.showMessageDialog(null, "FELICIDADES HAS GANADO!!!");
                
                //Configurar para salir al menu de inicio
                menu m = new menu();
                m.show();
                dispose();
            }

            cargarDatos(); //Cargar todos los datos de nuevo
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta Incorrecta!!!");
            Jugador losePlayer = new Jugador(nombreJugador,premio,contLVL);
            fabrica.getJugadorControlador().altaJugador(losePlayer);
            
            //Configurar para salir al menu de inicio
            menu m = new menu();
            m.show();
            dispose();
        }

    }

}
