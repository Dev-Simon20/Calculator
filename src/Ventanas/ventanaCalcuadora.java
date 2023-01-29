/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

public class ventanaCalcuadora extends javax.swing.JFrame {

    private String cadena = "";
    private double numero1, resultado;
    private String operation = "nula";
    private boolean activado = true;
    private String cadenaAux = "";
    private boolean punt = true;

    public ventanaCalcuadora() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(300, 400);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaMuestra = new javax.swing.JLabel();
        etiquetaNumero = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        division = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        nx = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        nneg = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        npos = new javax.swing.JButton();
        smenmas = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        menuitem1 = new javax.swing.JMenuItem();
        menuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setPreferredSize(new java.awt.Dimension(300, 400));

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaMuestra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(etiquetaMuestra, gridBagConstraints);

        etiquetaNumero.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumero.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(etiquetaNumero, gridBagConstraints);

        clear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(clear, gridBagConstraints);

        raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/raiz.png"))); // NOI18N
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(raiz, gridBagConstraints);

        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/div.png"))); // NOI18N
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(division, gridBagConstraints);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(eliminar, gridBagConstraints);

        n7.setBackground(new java.awt.Color(153, 153, 153));
        n7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n7, gridBagConstraints);

        n8.setBackground(new java.awt.Color(153, 153, 153));
        n8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n8, gridBagConstraints);

        n9.setBackground(new java.awt.Color(153, 153, 153));
        n9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n9, gridBagConstraints);

        nx.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nx.setText("x");
        nx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(nx, gridBagConstraints);

        n4.setBackground(new java.awt.Color(153, 153, 153));
        n4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n4, gridBagConstraints);

        n5.setBackground(new java.awt.Color(153, 153, 153));
        n5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n5, gridBagConstraints);

        n6.setBackground(new java.awt.Color(153, 153, 153));
        n6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n6, gridBagConstraints);

        nneg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nneg.setText("-");
        nneg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nnegActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(nneg, gridBagConstraints);

        n1.setBackground(new java.awt.Color(153, 153, 153));
        n1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n1, gridBagConstraints);

        n2.setBackground(new java.awt.Color(153, 153, 153));
        n2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n2, gridBagConstraints);

        n3.setBackground(new java.awt.Color(153, 153, 153));
        n3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n3, gridBagConstraints);

        npos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        npos.setText("+");
        npos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nposActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(npos, gridBagConstraints);

        smenmas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        smenmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download.png"))); // NOI18N
        smenmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smenmasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(smenmas, gridBagConstraints);

        n0.setBackground(new java.awt.Color(153, 153, 153));
        n0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(n0, gridBagConstraints);

        punto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(punto, gridBagConstraints);

        igual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(igual, gridBagConstraints);

        Menu.setText("Usos");

        menuitem1.setText("Calculadora");
        Menu.add(menuitem1);

        menuItem2.setText("Conversor");
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        Menu.add(menuItem2);
        Menu.add(jSeparator2);

        menuItem3.setText("Salir");
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        Menu.add(menuItem3);

        MenuBar.add(Menu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItem3ActionPerformed

    private void menuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2ActionPerformed
        // TODO add your handling code here:
        ventanaConversor conver = new ventanaConversor();
        conver.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItem2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
        cadena += "3";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n3ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
        cadena += "1";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n1ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        if (cadena != "") {
            cadena += "0";
            etiquetaNumero.setText(cadena);
            activado = true;
        }

    }//GEN-LAST:event_n0ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
        cadena += "2";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n2ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
        cadena += "4";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
        cadena += "5";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
        cadena += "6";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        // TODO add your handling code here:
        cadena += "7";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
        cadena += "8";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        // TODO add your handling code here:
        cadena += "9";
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_n9ActionPerformed

    private void nposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nposActionPerformed
        if (activado == true && cadena != "") {
            numero1 = Double.parseDouble(cadena);
            etiquetaMuestra.setText(cadena + "+");
            cadenaAux = cadena;
            cadena = "";
            operation = "suma";
            activado = false;
            punt = true;
        }

    }//GEN-LAST:event_nposActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        double numero2;

        if (operation.equals("nula") || cadena == "") {
            etiquetaNumero.setText(cadenaAux);
            cadena = cadenaAux;
            operation = "nula";
        } else if (operation.equals("suma")) {
            numero2 = Double.parseDouble(cadena);
            resultado = numero1 + numero2;
            cadenaAux = String.valueOf(resultado);
            etiquetaNumero.setText(String.format("%.2f", resultado));
            cadena = String.valueOf(resultado);
            operation = "nula";
        }else if (operation.equals("resta")) {
            numero2 = Double.parseDouble(cadena);
            resultado = numero1 - numero2;
            cadenaAux = String.valueOf(resultado);
            etiquetaNumero.setText(String.format("%.2f", resultado));
            cadena = String.valueOf(resultado);
            operation = "nula";
        }else if (operation.equals("multiplicacion")) {
            numero2 = Double.parseDouble(cadena);
            resultado = numero1 * numero2;
            cadenaAux = String.valueOf(resultado);
            etiquetaNumero.setText(String.format("%.2f", resultado));
            cadena = String.valueOf(resultado);
            operation = "nula";
        }else if (operation.equals("division")) {
            numero2 = Double.parseDouble(cadena);
            resultado = numero1 / numero2;
            cadenaAux = String.valueOf(resultado);
            etiquetaNumero.setText(String.format("%.2f", resultado));
            cadena = String.valueOf(resultado);
            operation = "nula";
        }
        

        etiquetaMuestra.setText("");
        activado = true;


    }//GEN-LAST:event_igualActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //BORRAR TODO
        cadena = "";
        etiquetaMuestra.setText(cadena);
        etiquetaNumero.setText(cadena);
        punt = true;
        cadenaAux = "";

    }//GEN-LAST:event_clearActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        if (punt == true) {

            if (cadena == "") {
                cadena += "0.";
            } else {
                cadena += ".";
            }
            etiquetaNumero.setText(cadena);
            punt = false;

        }
    }//GEN-LAST:event_puntoActionPerformed

    private void smenmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smenmasActionPerformed
        if (cadena == "") {
            cadena = cadenaAux;
        }
        if (cadena.charAt(0) != '-') {
            cadena = "-" + cadena;
        } else {
            cadena = cadena.substring(1, cadena.length());//recorre el String de la posicion uno hasta el ultimo.

        }
        etiquetaNumero.setText(cadena);
        activado = true;
    }//GEN-LAST:event_smenmasActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       //eliminar carcater por caracter
        int longitud = cadena.length(); //obteniendo el numero de caracteres del String
        if (longitud > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            
        }
        else{
        activado=false;
        cadenaAux="";
        }
        etiquetaNumero.setText(cadena);
        punt = true;
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void nnegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nnegActionPerformed
        //RESTA
        if (activado == true && cadena != "") {
            numero1 = Double.parseDouble(cadena);
            etiquetaMuestra.setText(cadena + "-");
            cadenaAux = cadena;
            cadena = "";
            operation = "resta";
            activado = false;
            punt = true;
        }

    }//GEN-LAST:event_nnegActionPerformed

    private void nxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxActionPerformed
        //Multiplicacion
        if (activado == true && cadena != "") {
            numero1 = Double.parseDouble(cadena);
            etiquetaMuestra.setText(cadena + "x");
            cadenaAux = cadena;
            cadena = "";
            operation = "multiplicacion";
            activado = false;
            punt = true;
        }
    }//GEN-LAST:event_nxActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // Division
        if (activado == true && cadena != "") {
            numero1 = Double.parseDouble(cadena);
            etiquetaMuestra.setText(cadena + "/ ");
            cadenaAux = cadena;
            cadena = "";
            operation = "division";
            activado = false;
            punt = true;
        }
    }//GEN-LAST:event_divisionActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        //Raiz cuadrada
        if (activado == true && cadena != "") {
            numero1 = Double.parseDouble(cadena);
            etiquetaMuestra.setText("sqrt("+cadena+") ");
            resultado=Math.sqrt(numero1);
            etiquetaNumero.setText(String.format("%2f", resultado));
            cadena=String.valueOf(resultado);
            cadenaAux = cadena;
            activado = true;
            punt=false;
        }
    }//GEN-LAST:event_raizActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaCalcuadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCalcuadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCalcuadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCalcuadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCalcuadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton clear;
    private javax.swing.JButton division;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumero;
    private javax.swing.JButton igual;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuitem1;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton nneg;
    private javax.swing.JButton npos;
    private javax.swing.JButton nx;
    private javax.swing.JPanel panel;
    private javax.swing.JButton punto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton smenmas;
    // End of variables declaration//GEN-END:variables
}
