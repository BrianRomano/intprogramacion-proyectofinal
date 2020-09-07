package formularios;

//Librerias utilizadas
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

public class form4 extends javax.swing.JFrame {

    public form4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPuntaje1 = new javax.swing.JLabel();
        lblPuntaje2 = new javax.swing.JLabel();
        btnPiedra = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P P T");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblImg1.setBackground(new java.awt.Color(204, 204, 204));
        lblImg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblImg2.setBackground(new java.awt.Color(204, 204, 204));
        lblImg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lblPuntaje1.setBackground(new java.awt.Color(255, 255, 255));
        lblPuntaje1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lblPuntaje1.setForeground(new java.awt.Color(255, 0, 51));
        lblPuntaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje1.setOpaque(true);

        lblPuntaje2.setBackground(new java.awt.Color(255, 255, 255));
        lblPuntaje2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lblPuntaje2.setForeground(new java.awt.Color(255, 0, 51));
        lblPuntaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPuntaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPuntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPuntaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnPiedra.setBackground(new java.awt.Color(255, 102, 0));
        btnPiedra.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPiedra.setForeground(new java.awt.Color(255, 255, 255));
        btnPiedra.setText("Piedra");
        btnPiedra.setBorder(null);
        btnPiedra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPiedra.setFocusPainted(false);
        btnPiedra.setRequestFocusEnabled(false);
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        btnPapel.setBackground(new java.awt.Color(51, 204, 0));
        btnPapel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPapel.setForeground(new java.awt.Color(255, 255, 255));
        btnPapel.setText("Papel");
        btnPapel.setBorder(null);
        btnPapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPapel.setFocusPainted(false);
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnTijera.setBackground(new java.awt.Color(0, 102, 204));
        btnTijera.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnTijera.setForeground(new java.awt.Color(255, 255, 255));
        btnTijera.setText("Tijera");
        btnTijera.setBorder(null);
        btnTijera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTijera.setFocusPainted(false);
        btnTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijeraActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 51));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setRequestFocusEnabled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 204, 0));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(65, Short.MAX_VALUE)
                        .addComponent(lblImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Variables y Arrays
    int i;
    int cartelUsuario = 0;
    int cartelComputadora = 0;
    int tiro;
    int tiros = 0;
    int[][] puntos = new int[5][2];
    int puntosUsuario = 0;
    int puntosComputadora = 0;
    public static boolean resultado;
    public static boolean empate;
    Random rnd = new Random();

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Icono de la ventana
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
        //Color de fondo de la forma
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //Mostrar el contador vacio
        lblPuntaje1.setText("" + cartelUsuario);
        lblPuntaje2.setText("" + cartelComputadora);
        //Mostrar mensaje
        lblMensaje.setText("¡Al mejor de 3!");
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Salir de la forma y volver a form1 - Menú
        form1 menu = new form1();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        //Contador de tiros
        tiros++;
        //Mostrar imagen de Piedra
        lblImg1.setIcon(new ImageIcon(getClass().getResource("/imagenes/piedra.png")));
        //Generar imagen random - Computadora
        tiro = rnd.nextInt(3) + 1;
        lblImg2.setIcon(new ImageIcon(getClass().getResource("/imagenes/tiro" + tiro + ".png")));
        //Proceso
        switch (tiros) {
            case 1:
                switch (tiro) {
                    case 1:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 2:
                        //Sumar puntos - Computadora
                        puntos[0][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 3:
                        //Sumar puntos - Usuario
                        puntos[0][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                }
                break;
            case 2:
                switch (tiro) {
                    case 1:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 2:
                        //Sumar puntos - Computadora
                        puntos[1][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 3:
                        //Sumar puntos - Usuario
                        puntos[1][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 1; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 1; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verifico si hay un ganador
                if (puntosUsuario == 2) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosComputadora == 2) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                }
                break;
            case 3:
                switch (tiro) {
                    case 1:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 2:
                        //Sumas puntos - Computadora
                        puntos[2][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 3:
                        //Sumar puntos - Usuario
                        puntos[2][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 2; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 2; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verificar si existe un ganador o hay empate
                if (puntosUsuario > puntosComputadora) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario < puntosComputadora) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario == puntosComputadora) {
                    //Mostrar mensaje
                    JOptionPane.showMessageDialog(null, "Se jugará al mejor de 5");
                }
                break;
            case 4:
                switch (tiro) {
                    case 1:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 2:
                        //Sumar puntos - Computadora
                        puntos[3][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 3:
                        //Sumar puntos - Usuario
                        puntos[3][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                }
                break;
            case 5:
                switch (tiro) {
                    case 1:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 2:
                        //Sumar puntos - Computadora
                        puntos[4][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 3:
                        //Sumar puntos - Computadora
                        puntos[4][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 4; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 4; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verificar si existe un ganador o hay empate
                if (puntosUsuario > puntosComputadora) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario < puntosComputadora) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario == puntosComputadora) {
                    empate = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                }
                break;
        }
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        //Contador de tiros
        tiros++;
        //Mostrar imagen de Piedra
        lblImg1.setIcon(new ImageIcon(getClass().getResource("/imagenes/papel.png")));
        //Generar imagen random - Computadora
        tiro = rnd.nextInt(3) + 1;
        lblImg2.setIcon(new ImageIcon(getClass().getResource("/imagenes/tiro" + tiro + ".png")));
        //Proceso
        switch (tiros) {
            case 1:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Usuario
                        puntos[0][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        //Mostrar resultado
                        lblMensaje.setText("Ganaste");
                        break;
                    case 2:
                        lblMensaje.setText("Empate");
                        break;
                    case 3:
                        //Sumar puntos - Computadora
                        puntos[0][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                }
                break;
            case 2:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Usuario
                        puntos[1][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 2:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 3:
                        //Sumar puntos - Computadora
                        puntos[1][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 1; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 1; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verifico si hay un ganador
                if (puntosUsuario == 2) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosComputadora == 2) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                }
                break;
            case 3:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Usuario
                        puntos[2][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 2:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 3:
                        //Sumas puntos - Computadora
                        puntos[2][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 2; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 2; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verificar si existe un ganador o hay empate
                if (puntosUsuario > puntosComputadora) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario < puntosComputadora) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario == puntosComputadora) {
                    //Mostrar mensaje
                    JOptionPane.showMessageDialog(null, "Se jugará al mejor de 5");
                }
                break;
            case 4:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Usuario
                        puntos[3][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 2:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 3:
                        //Sumar puntos - Computadora
                        puntos[3][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                }
                break;
            case 5:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Computadora
                        puntos[4][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 2:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                    case 3:
                        //Sumar puntos - Computadora
                        puntos[4][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 4; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 4; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verificar si existe un ganador o hay empate
                if (puntosUsuario > puntosComputadora) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario < puntosComputadora) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario == puntosComputadora) {
                    empate = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                }
                break;
        }
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijeraActionPerformed
        //Contador de tiros
        tiros++;
        //Mostrar imagen de Piedra
        lblImg1.setIcon(new ImageIcon(getClass().getResource("/imagenes/tijera.png")));
        //Generar imagen random - Computadora
        tiro = rnd.nextInt(3) + 1;
        lblImg2.setIcon(new ImageIcon(getClass().getResource("/imagenes/tiro" + tiro + ".png")));
        //Proceso
        switch (tiros) {
            case 1:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Computadora
                        puntos[0][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 2:
                        //Sumar puntos - Usuario
                        puntos[0][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 3:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                }
                break;
            case 2:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Computadora
                        puntos[1][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 2:
                        //Sumar puntos - Usuario
                        puntos[1][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 3:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 1; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 1; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verifico si hay un ganador
                if (puntosUsuario == 2) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosComputadora == 2) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                }
                break;
            case 3:
                switch (tiro) {
                    case 1:
                        //Sumas puntos - Computadora
                        puntos[2][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 2:
                        //Sumar puntos - Usuario
                        puntos[2][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 3:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 2; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 2; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verificar si existe un ganador o hay empate
                if (puntosUsuario > puntosComputadora) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario < puntosComputadora) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario == puntosComputadora) {
                    //Mostrar mensaje
                    JOptionPane.showMessageDialog(null, "Se jugará al mejor de 5");
                }
                break;
            case 4:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Computadora
                        puntos[3][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 2:
                        //Sumar puntos - Usuario
                        puntos[3][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 3:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                }
                break;
            case 5:
                switch (tiro) {
                    case 1:
                        //Sumar puntos - Computadora
                        puntos[4][1] = 1;
                        //Mostrar resultado
                        lblPuntaje2.setText("" + (cartelComputadora += 1));
                        lblMensaje.setText("Perdiste");
                        break;
                    case 2:
                        //Sumar puntos - Computadora
                        puntos[4][0] = 1;
                        //Mostrar resultado
                        lblPuntaje1.setText("" + (cartelUsuario += 1));
                        lblMensaje.setText("Ganaste");
                        break;
                    case 3:
                        //Mostrar resultado
                        lblMensaje.setText("Empate");
                        break;
                }
                //Recuento puntos - Usuario
                for (i = 0; i <= 4; i++) {
                    puntosUsuario += puntos[i][0];
                }
                //Recuento puntos - Computadora
                for (i = 0; i <= 4; i++) {
                    puntosComputadora += puntos[i][1];
                }
                //Verificar si existe un ganador o hay empate
                if (puntosUsuario > puntosComputadora) {
                    resultado = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario < puntosComputadora) {
                    resultado = false;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                } else if (puntosUsuario == puntosComputadora) {
                    empate = true;
                    form5 fin = new form5();
                    fin.setVisible(true);
                    //Ocultar botones del juego
                    btnPiedra.setVisible(false);
                    btnPapel.setVisible(false);
                    btnTijera.setVisible(false);
                    btnSalir.setVisible(false);
                }
                break;
        }
    }//GEN-LAST:event_btnTijeraActionPerformed

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
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTijera;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPuntaje1;
    private javax.swing.JLabel lblPuntaje2;
    // End of variables declaration//GEN-END:variables

    private String toString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
