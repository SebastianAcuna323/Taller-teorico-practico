
package calculadoraa;

import java.util.logging.Level;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class calculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(calculadora.class.getName());

    ScriptEngineManager calculo = new ScriptEngineManager();
  ScriptEngine calcular = calculo.getEngineByName("JavaScript");
  
    public calculadora() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        multiplicacion = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        borrarUltimo = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        division = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        punto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 242, 242));

        txtResultado.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(63, 69, 76));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtOperacion.setFont(new java.awt.Font("Arial Narrow", 1, 19)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(63, 69, 76));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        multiplicacion.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        multiplicacion.setText("X");
        multiplicacion.setFocusPainted(false);
        multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicacion.setPreferredSize(new java.awt.Dimension(50, 50));
        multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 50));

        mas.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        mas.setText("+");
        mas.setFocusPainted(false);
        mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mas.setPreferredSize(new java.awt.Dimension(50, 50));
        mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });
        jPanel2.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 50, 50));

        ocho.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        ocho.setText("8");
        ocho.setFocusPainted(false);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ocho.setPreferredSize(new java.awt.Dimension(50, 50));
        ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        nueve.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        nueve.setText("9");
        nueve.setFocusPainted(false);
        nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve.setPreferredSize(new java.awt.Dimension(50, 50));
        nueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

        borrar.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        borrar.setText("C");
        borrar.setFocusPainted(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setPreferredSize(new java.awt.Dimension(50, 50));
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        borrar.setSelected(true);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel2.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        borrarUltimo.setFont(new java.awt.Font("Arial Narrow", 0, 15)); // NOI18N
        borrarUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        borrarUltimo.setText("<--");
        borrarUltimo.setFocusPainted(false);
        borrarUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrarUltimo.setPreferredSize(new java.awt.Dimension(50, 50));
        borrarUltimo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        borrarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarUltimoActionPerformed(evt);
            }
        });
        jPanel2.add(borrarUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 50));

        porcentaje.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        porcentaje.setText("%");
        porcentaje.setFocusPainted(false);
        porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        porcentaje.setPreferredSize(new java.awt.Dimension(50, 50));
        porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        division.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        division.setText("/");
        division.setFocusPainted(false);
        division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        division.setPreferredSize(new java.awt.Dimension(50, 50));
        division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        jPanel2.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        siete.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        siete.setText("7");
        siete.setFocusPainted(false);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siete.setPreferredSize(new java.awt.Dimension(50, 50));
        siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        cuatro.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        cuatro.setText("4");
        cuatro.setFocusPainted(false);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuatro.setPreferredSize(new java.awt.Dimension(50, 50));
        cuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 50));

        cinco.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        cinco.setText("5");
        cinco.setFocusPainted(false);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinco.setPreferredSize(new java.awt.Dimension(50, 50));
        cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 50));

        seis.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        seis.setText("6");
        seis.setFocusPainted(false);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seis.setPreferredSize(new java.awt.Dimension(50, 50));
        seis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 50, 50));

        menos.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        menos.setText("-");
        menos.setFocusPainted(false);
        menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menos.setPreferredSize(new java.awt.Dimension(50, 50));
        menos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });
        jPanel2.add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 50));

        dos.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        dos.setText("2");
        dos.setFocusPainted(false);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dos.setPreferredSize(new java.awt.Dimension(50, 50));
        dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 50, 50));

        uno.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        uno.setText("1");
        uno.setFocusPainted(false);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uno.setPreferredSize(new java.awt.Dimension(50, 50));
        uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 50, 50));

        tres.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        tres.setText("3");
        tres.setFocusPainted(false);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tres.setPreferredSize(new java.awt.Dimension(50, 50));
        tres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 50, 50));

        cero.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        cero.setText("0");
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setPreferredSize(new java.awt.Dimension(50, 50));
        cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel2.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 50));

        igual.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        igual.setText("=");
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setPreferredSize(new java.awt.Dimension(50, 50));
        igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel2.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 50, 50));

        punto1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo (1).jpg"))); // NOI18N
        punto1.setText(".");
        punto1.setFocusPainted(false);
        punto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto1.setPreferredSize(new java.awt.Dimension(50, 50));
        punto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proyecto nuevo.jpg"))); // NOI18N
        punto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punto1ActionPerformed(evt);
            }
        });
        jPanel2.add(punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        agregarNumero("*");
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        agregarNumero("+");
    }//GEN-LAST:event_masActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        agregarNumero("8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        agregarNumero("9");
    }//GEN-LAST:event_nueveActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");

    }//GEN-LAST:event_borrarActionPerformed

    private void borrarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarUltimoActionPerformed

        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        

    }//GEN-LAST:event_borrarUltimoActionPerformed

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
        agregarNumero("%");

    }//GEN-LAST:event_porcentajeActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        agregarNumero("/");

    }//GEN-LAST:event_divisionActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        agregarNumero("7");
        
    }//GEN-LAST:event_sieteActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        agregarNumero("4");
        
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        agregarNumero("5");
        
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        agregarNumero("6");
      
    }//GEN-LAST:event_seisActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        agregarNumero("-");

    }//GEN-LAST:event_menosActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        agregarNumero("2");
       
    }//GEN-LAST:event_dosActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        agregarNumero("1");
        
    }//GEN-LAST:event_unoActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        agregarNumero("3");
        
    }//GEN-LAST:event_tresActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        agregarNumero("0");
        
    }//GEN-LAST:event_ceroActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        try {
        String operacion = txtOperacion.getText();
        String resultado = calcular.eval(operacion).toString();
        txtResultado.setText(resultado);
    } catch (ScriptException ex) {
        logger.log(Level.SEVERE, "Error en la operaci\u00f3n: {0}", ex.getMessage());
        txtResultado.setText("");
    }
    }//GEN-LAST:event_igualActionPerformed

    private void punto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punto1ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new calculadora().setVisible(true));
    }
    
    
    public void agregarNumero(String digito){
    
    txtOperacion.setText(txtOperacion.getText()+ digito);
    
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrarUltimo;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton punto1;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
