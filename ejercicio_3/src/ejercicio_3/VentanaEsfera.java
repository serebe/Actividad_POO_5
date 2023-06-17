package ejercicio_3;

import MetodosFiguras.Esfera;
import static ejercicio_3.VentanaPrincipal.MostrarVentanaEsfera;
import java.awt.Color;
import java.text.DecimalFormat;

public class VentanaEsfera extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    DecimalFormat Fdeci =new DecimalFormat("#.00");       
  
    
    public VentanaEsfera() {
        initComponents();
          this.setLocation(500,500);   //ubicar panel al lado izq de la pantalla
          
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_Title_esfera = new javax.swing.JLabel();
        lbl_radio = new javax.swing.JLabel();
        txt_radio = new javax.swing.JTextField();
        panel_calcular = new javax.swing.JPanel();
        lbl_calcular = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        lbl_volumen = new javax.swing.JLabel();
        lbl_Resultvolumen = new javax.swing.JLabel();
        lbl_Superficie = new javax.swing.JLabel();
        lbl_Resultsuperf = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
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

        lbl_Title_esfera.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_Title_esfera.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title_esfera.setText("Esfera");

        javax.swing.GroupLayout barraUPLayout = new javax.swing.GroupLayout(barraUP);
        barraUP.setLayout(barraUPLayout);
        barraUPLayout.setHorizontalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title_esfera, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraUPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Title_esfera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        lbl_radio.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lbl_radio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_radio.setText("Radio (cm):");
        jPanel1.add(lbl_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 30));

        txt_radio.setBackground(new java.awt.Color(211, 208, 201));
        txt_radio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txt_radio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txt_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, 30));

        panel_calcular.setBackground(new java.awt.Color(142, 57, 70));
        panel_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_calcularMouseEntered(evt);
            }
        });

        lbl_calcular.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_calcular.setForeground(new java.awt.Color(255, 255, 255));
        lbl_calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_calcular.setText("Calcular");
        lbl_calcular.setToolTipText("");
        lbl_calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_calcularLayout = new javax.swing.GroupLayout(panel_calcular);
        panel_calcular.setLayout(panel_calcularLayout);
        panel_calcularLayout.setHorizontalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_calcularLayout.setVerticalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 40));

        img.setForeground(new java.awt.Color(0, 0, 0));
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esfera3d.jpg"))); // NOI18N
        img.setText("img");
        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 180, 150));

        lbl_volumen.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lbl_volumen.setForeground(new java.awt.Color(0, 0, 0));
        lbl_volumen.setText("Volumen (cm3):");
        jPanel1.add(lbl_volumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 90, 30));

        lbl_Resultvolumen.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbl_Resultvolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 70, 30));

        lbl_Superficie.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lbl_Superficie.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Superficie.setText("Superficie (cm3):");
        jPanel1.add(lbl_Superficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 30));

        lbl_Resultsuperf.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbl_Resultsuperf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 70, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 60, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 60, 10));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 3));
        jPanel1.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 310));

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
        this.dispose();
        MostrarVentanaEsfera = false;
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54));
        
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

    private void lbl_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseClicked
        Esfera Esfera;
        double radio = Double.parseDouble(txt_radio.getText());
        
        
        Esfera = new Esfera(radio);
        double volumen = Esfera.calcularVolumen();
        double superficie = Esfera.calcularSuperficie();
        
        String vol = String.valueOf(Fdeci.format(volumen));
        String supe = String.valueOf(Fdeci.format(superficie));       
        
        
        lbl_Resultvolumen.setText(vol);
        lbl_Resultsuperf.setText(supe);
    }//GEN-LAST:event_lbl_calcularMouseClicked

    private void lbl_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseEntered
        panel_calcular.setBackground(new Color(111,45,54));     // cambio de color cuando el cursor entra del recuadro
    }//GEN-LAST:event_lbl_calcularMouseEntered

    private void lbl_calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseExited
        panel_calcular.setBackground(new Color(142, 57, 70));      // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_calcularMouseExited

    private void panel_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_calcularMouseEntered

    }//GEN-LAST:event_panel_calcularMouseEntered

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEsfera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_Resultsuperf;
    private javax.swing.JLabel lbl_Resultvolumen;
    private javax.swing.JLabel lbl_Superficie;
    private javax.swing.JLabel lbl_Title_esfera;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_calcular;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_radio;
    private javax.swing.JLabel lbl_volumen;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txt_radio;
    // End of variables declaration//GEN-END:variables
}
