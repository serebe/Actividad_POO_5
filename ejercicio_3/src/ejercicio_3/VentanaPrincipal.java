
package ejercicio_3;

import static ejercicio_3.VentanaCilindro.MostrarCilindro;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class VentanaPrincipal extends javax.swing.JFrame {

    
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    
    Dimension tamaño = tk.getScreenSize();
    
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);   //centrar panel en la pantalla
        
        System.out.println("X:" + tamaño.getWidth()+ "y: "+tamaño.getHeight());
        
    }
    
    int xMouse, yMouse;
    public static boolean MostrarVentanaEsfera = false, MostrarPiramide = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_Title_cilindro = new javax.swing.JLabel();
        panel_cilindro = new javax.swing.JPanel();
        lbl_cilindro = new javax.swing.JLabel();
        panel_esfera = new javax.swing.JPanel();
        lbl_esfera = new javax.swing.JLabel();
        panel_piramide = new javax.swing.JPanel();
        lbl_piramide = new javax.swing.JLabel();
        lbl_bourder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(211, 208, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraUP.setBackground(new java.awt.Color(142, 57, 70));
        barraUP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraUPMouseDragged(evt);
            }
        });
        barraUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraUPMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(142, 57, 70));

        lbl_exit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_Title_cilindro.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_Title_cilindro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title_cilindro.setText("Ejercicio 3");

        javax.swing.GroupLayout barraUPLayout = new javax.swing.GroupLayout(barraUP);
        barraUP.setLayout(barraUPLayout);
        barraUPLayout.setHorizontalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title_cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_Title_cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        panel_cilindro.setBackground(new java.awt.Color(142, 57, 70));
        panel_cilindro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_cilindroMouseEntered(evt);
            }
        });

        lbl_cilindro.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbl_cilindro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cilindro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cilindro.setText("Cilindro");
        lbl_cilindro.setToolTipText("");
        lbl_cilindro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cilindro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cilindroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cilindroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cilindroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_cilindroLayout = new javax.swing.GroupLayout(panel_cilindro);
        panel_cilindro.setLayout(panel_cilindroLayout);
        panel_cilindroLayout.setHorizontalGroup(
            panel_cilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_cilindroLayout.setVerticalGroup(
            panel_cilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panel_cilindro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 50));

        panel_esfera.setBackground(new java.awt.Color(142, 57, 70));
        panel_esfera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_esferaMouseEntered(evt);
            }
        });

        lbl_esfera.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbl_esfera.setForeground(new java.awt.Color(255, 255, 255));
        lbl_esfera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_esfera.setText("Esfera");
        lbl_esfera.setToolTipText("");
        lbl_esfera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_esfera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_esferaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_esferaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_esferaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_esferaLayout = new javax.swing.GroupLayout(panel_esfera);
        panel_esfera.setLayout(panel_esferaLayout);
        panel_esferaLayout.setHorizontalGroup(
            panel_esferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_esfera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_esferaLayout.setVerticalGroup(
            panel_esferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_esfera, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panel_esfera, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, 50));

        panel_piramide.setBackground(new java.awt.Color(142, 57, 70));
        panel_piramide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_piramideMouseEntered(evt);
            }
        });

        lbl_piramide.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbl_piramide.setForeground(new java.awt.Color(255, 255, 255));
        lbl_piramide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_piramide.setText("Pirámide");
        lbl_piramide.setToolTipText("");
        lbl_piramide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_piramide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_piramideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_piramideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_piramideMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_piramideLayout = new javax.swing.GroupLayout(panel_piramide);
        panel_piramide.setLayout(panel_piramideLayout);
        panel_piramideLayout.setHorizontalGroup(
            panel_piramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_piramide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_piramideLayout.setVerticalGroup(
            panel_piramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_piramide, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panel_piramide, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 130, 50));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 3));
        jPanel1.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142, 57, 70));
       
    }//GEN-LAST:event_lbl_exitMouseExited

    private void barraUPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraUPMouseDragged

    private void barraUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_barraUPMousePressed

    private void lbl_cilindroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cilindroMouseClicked

         VentanaCilindro cili = new VentanaCilindro();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
        if(MostrarCilindro == false){
             MostrarCilindro = true;
            cili.setVisible(MostrarCilindro);
           
        }

    }//GEN-LAST:event_lbl_cilindroMouseClicked

    private void lbl_cilindroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cilindroMouseEntered
        panel_cilindro.setBackground(new Color(111,45,54));

    }//GEN-LAST:event_lbl_cilindroMouseEntered

    private void lbl_cilindroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cilindroMouseExited
        panel_cilindro.setBackground(new Color(142, 57, 70));

    }//GEN-LAST:event_lbl_cilindroMouseExited

    private void panel_cilindroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cilindroMouseEntered
        // panel_part1.setBackground(new Color(100,42, 50));
    }//GEN-LAST:event_panel_cilindroMouseEntered

    private void lbl_esferaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_esferaMouseClicked
        VentanaEsfera esfe = new VentanaEsfera();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra vez
        if(MostrarVentanaEsfera == false){
            MostrarVentanaEsfera = true;
            esfe.setVisible(MostrarVentanaEsfera);
            

        }
    }//GEN-LAST:event_lbl_esferaMouseClicked

    private void lbl_esferaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_esferaMouseEntered
        panel_esfera.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_esferaMouseEntered

    private void lbl_esferaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_esferaMouseExited

        panel_esfera.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_esferaMouseExited

    private void panel_esferaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_esferaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_esferaMouseEntered

    private void lbl_piramideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_piramideMouseClicked
        VentanaPiramide pira = new VentanaPiramide();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra vez
        if(MostrarPiramide == false){
            MostrarPiramide = true;
            pira.setVisible(MostrarPiramide);

        }
    }//GEN-LAST:event_lbl_piramideMouseClicked

    private void lbl_piramideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_piramideMouseEntered
        panel_piramide.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_piramideMouseEntered

    private void lbl_piramideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_piramideMouseExited

        panel_piramide.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_piramideMouseExited

    private void panel_piramideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_piramideMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_piramideMouseEntered

    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Title_cilindro;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_cilindro;
    private javax.swing.JLabel lbl_esfera;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_piramide;
    private javax.swing.JPanel panel_cilindro;
    private javax.swing.JPanel panel_esfera;
    private javax.swing.JPanel panel_piramide;
    // End of variables declaration//GEN-END:variables
}
