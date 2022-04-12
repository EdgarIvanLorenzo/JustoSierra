package Home;



import Hora.Hora;
import java.awt.Color;
import java.util.Date;

public class Inscripciones_Menu extends javax.swing.JFrame {

    //Metodo constructor
    public Inscripciones_Menu() {
        Date fechaActual=new Date();
        initComponents();
        String fecha1=fechaActual.getDate()+"/"+fechaActual.getMonth()+1+"/"+(fechaActual.getYear()-100);
        fecha.setText(fecha1);
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

        jPanel1 = new javax.swing.JPanel();
        btnAlumnos = new javax.swing.JButton();
        puntero1 = new javax.swing.JLabel();
        btnAlumnos2 = new javax.swing.JButton();
        btnAlumnos3 = new javax.swing.JButton();
        btnAlumnos4 = new javax.swing.JButton();
        btnAlumnos5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        btnAlumnos6 = new javax.swing.JButton();
        btnAlumnos8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAlumnos7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        lista = new javax.swing.JButton();
        pendientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(185, 187, 189));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/user-2.png")); // NOI18N
        btnAlumnos.setText("Alumnos");
        btnAlumnos.setBorderPainted(false);
        btnAlumnos.setContentAreaFilled(false);
        btnAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit(evt);
            }
        });
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });

        puntero1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        puntero1.setForeground(new java.awt.Color(255, 255, 255));

        btnAlumnos2.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos2.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos2.setForeground(new java.awt.Color(57, 176, 253));
        btnAlumnos2.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/inscripcion.png")); // NOI18N
        btnAlumnos2.setText("Inscripciones");
        btnAlumnos2.setBorderPainted(false);
        btnAlumnos2.setContentAreaFilled(false);
        btnAlumnos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit2(evt);
            }
        });
        btnAlumnos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos2ActionPerformed(evt);
            }
        });

        btnAlumnos3.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos3.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos3.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos3.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/multitud.png")); // NOI18N
        btnAlumnos3.setText("Grupos");
        btnAlumnos3.setBorderPainted(false);
        btnAlumnos3.setContentAreaFilled(false);
        btnAlumnos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnos3enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnos3exit2(evt);
            }
        });
        btnAlumnos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos3ActionPerformed(evt);
            }
        });

        btnAlumnos4.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos4.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos4.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos4.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/dar-dinero.png")); // NOI18N
        btnAlumnos4.setText("Cuotas");
        btnAlumnos4.setBorderPainted(false);
        btnAlumnos4.setContentAreaFilled(false);
        btnAlumnos4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnos4enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnos4exit2(evt);
            }
        });
        btnAlumnos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos4ActionPerformed(evt);
            }
        });

        btnAlumnos5.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos5.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos5.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos5.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/conocimiento.png")); // NOI18N
        btnAlumnos5.setText(" Colegiatura");
        btnAlumnos5.setBorderPainted(false);
        btnAlumnos5.setContentAreaFilled(false);
        btnAlumnos5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnos5enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnos5exit2(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlumnos5MousePressed(evt);
            }
        });
        btnAlumnos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setText("Menu");

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(185, 187, 189));
        salir.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/button.png")); // NOI18N
        salir.setText("Salir");
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirExit(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        btnAlumnos6.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos6.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos6.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos6.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/configuraciones.png")); // NOI18N
        btnAlumnos6.setText("Configuracion");
        btnAlumnos6.setBorderPainted(false);
        btnAlumnos6.setContentAreaFilled(false);
        btnAlumnos6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnos6enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnos6exit2(evt);
            }
        });
        btnAlumnos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos6ActionPerformed(evt);
            }
        });

        btnAlumnos8.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos8.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos8.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/educacion-en-linea-2.png"))); // NOI18N
        btnAlumnos8.setText("Reinscripcion");
        btnAlumnos8.setBorderPainted(false);
        btnAlumnos8.setContentAreaFilled(false);
        btnAlumnos8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnos8enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnos8exit2(evt);
            }
        });
        btnAlumnos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(puntero1)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlumnos2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnAlumnos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntero1)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 611));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        fecha.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/calendar.png")); // NOI18N
        fecha.setText("31/02/22");

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel2.setText("Bienvenido Angel Garcia");

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel3.setText("Director");

        jLabel4.setFont(new java.awt.Font("Raanana", 1, 24)); // NOI18N
        jLabel4.setText("Preparatoria Justo Sierra");

        btnAlumnos7.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos7.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos7.setForeground(new java.awt.Color(185, 187, 189));
        btnAlumnos7.setBorderPainted(false);
        btnAlumnos7.setContentAreaFilled(false);
        btnAlumnos7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlumnos7enter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlumnos7exit2(evt);
            }
        });
        btnAlumnos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnos7ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/check.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(165, 165, 165)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlumnos7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlumnos7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 730, 120));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));

        nuevo.setBackground(new java.awt.Color(255, 255, 255));
        nuevo.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        nuevo.setForeground(new java.awt.Color(185, 187, 189));
        nuevo.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/desktop-computer-3.png")); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setBorderPainted(false);
        nuevo.setContentAreaFilled(false);
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.setOpaque(true);
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoenter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoexit2(evt);
            }
        });
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        lista.setBackground(new java.awt.Color(255, 255, 255));
        lista.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        lista.setForeground(new java.awt.Color(185, 187, 189));
        lista.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/lista-de-verificacion.png")); // NOI18N
        lista.setText("Pagados");
        lista.setBorderPainted(false);
        lista.setContentAreaFilled(false);
        lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lista.setOpaque(true);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaenter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaexit2(evt);
            }
        });
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        pendientes.setBackground(new java.awt.Color(255, 255, 255));
        pendientes.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        pendientes.setForeground(new java.awt.Color(185, 187, 189));
        pendientes.setIcon(new javax.swing.ImageIcon("/Users/edgarivanlorenzovillalobos/NetBeansProjects/Justo_Sierra/src/Imagenes/gestion-del-tiempo.png")); // NOI18N
        pendientes.setText("Pendientes");
        pendientes.setBorderPainted(false);
        pendientes.setContentAreaFilled(false);
        pendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pendientes.setOpaque(true);
        pendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendientesenter2(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendientesexit2(evt);
            }
        });
        pendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(pendientes)
                .addGap(75, 75, 75)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 730, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter
        btnAlumnos.setForeground(new Color(57, 176, 253  ));
        puntero1.setForeground(new Color(57, 176, 253));
    }//GEN-LAST:event_enter

    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit
        btnAlumnos.setForeground(new Color(185,187,189 ));
        puntero1.setForeground(new Color(255, 255, 255   ));
    }//GEN-LAST:event_exit

    private void btnAlumnos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnos2ActionPerformed

    private void enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter2
        btnAlumnos2.setForeground(new Color(57, 176, 253  ));
      
    }//GEN-LAST:event_enter2

    private void exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2
        
    }//GEN-LAST:event_exit2

    private void btnAlumnos3enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos3enter2
        // TODO add your handling code here:
        btnAlumnos3.setForeground(new Color(57, 176, 253 ));
    }//GEN-LAST:event_btnAlumnos3enter2

    private void btnAlumnos3exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos3exit2
        // TODO add your handling code here:
        btnAlumnos3.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_btnAlumnos3exit2

    private void btnAlumnos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos3ActionPerformed
        // TODO add your handling code here:
        Grupos_Menu menu=new Grupos_Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btnAlumnos3ActionPerformed

    private void btnAlumnos4enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos4enter2
        // TODO add your handling code here:
        btnAlumnos4.setForeground(new Color(57, 176, 253 ));
    }//GEN-LAST:event_btnAlumnos4enter2

    private void btnAlumnos4exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos4exit2
        // TODO add your handling code here:
        btnAlumnos4.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_btnAlumnos4exit2

    private void btnAlumnos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos4ActionPerformed
        // TODO add your handling code here:
        Costos_Menu c=new Costos_Menu();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnos4ActionPerformed

    private void btnAlumnos5enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos5enter2
        btnAlumnos5.setForeground(new Color(57, 176, 253 ));
    }//GEN-LAST:event_btnAlumnos5enter2

    private void btnAlumnos5exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos5exit2
        // TODO add your handling code here:
        btnAlumnos5.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_btnAlumnos5exit2

    private void btnAlumnos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnos5ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnAlumnos7enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos7enter2
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnos7enter2

    private void btnAlumnos7exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos7exit2
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnos7exit2

    private void btnAlumnos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnos7ActionPerformed

    private void SalirEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirEnter
        // TODO add your handling code here:
        salir.setForeground(new Color(250, 41, 41  ));
    }//GEN-LAST:event_SalirEnter

    private void SalirExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirExit
        // TODO add your handling code here:
        salir.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_SalirExit

    private void pendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendientesActionPerformed
        // TODO add your handling code here:
        Inscripciones_Pendientes p=new Inscripciones_Pendientes();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pendientesActionPerformed

    private void pendientesexit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendientesexit2
        // TODO add your handling code here:
        pendientes.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_pendientesexit2

    private void pendientesenter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendientesenter2
        // TODO add your handling code here:
        pendientes.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_pendientesenter2

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
        Inscripciones_Pagados p=new Inscripciones_Pagados();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listaActionPerformed

    private void listaexit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaexit2
        // TODO add your handling code here:
        lista.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_listaexit2

    private void listaenter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaenter2
        // TODO add your handling code here:
        lista.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_listaenter2

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        Inscripciones_Nuevo nuevo=new Inscripciones_Nuevo();
        this.setVisible(false);
        nuevo.setVisible(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void nuevoexit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoexit2
        // TODO add your handling code here:
        nuevo.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_nuevoexit2

    private void nuevoenter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoenter2
        // TODO add your handling code here:
        nuevo.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_nuevoenter2

    private void btnAlumnos6enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos6enter2
        // TODO add your handling code here:
        btnAlumnos6.setForeground(new Color(57, 176, 253 ));
    }//GEN-LAST:event_btnAlumnos6enter2

    private void btnAlumnos6exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos6exit2
        // TODO add your handling code here:
        btnAlumnos6.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_btnAlumnos6exit2

    private void btnAlumnos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnos6ActionPerformed

    private void btnAlumnos5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos5MousePressed
        // TODO add your handling code here:
        Colegiatura_Menu n=new Colegiatura_Menu();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnos5MousePressed

    private void btnAlumnos8enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos8enter2
        // TODO add your handling code here:
        btnAlumnos8.setForeground(new Color(57, 176, 253 ));
    }//GEN-LAST:event_btnAlumnos8enter2

    private void btnAlumnos8exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos8exit2
        // TODO add your handling code here:
        btnAlumnos8.setForeground(new Color(185,187,189));
    }//GEN-LAST:event_btnAlumnos8exit2

    private void btnAlumnos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos8ActionPerformed
        // TODO add your handling code here:
        Reinscripciones_Menu reinscripciones=new Reinscripciones_Menu();
        reinscripciones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnos8ActionPerformed

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
            java.util.logging.Logger.getLogger(Inscripciones_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscripciones_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscripciones_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscripciones_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscripciones_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnAlumnos2;
    private javax.swing.JButton btnAlumnos3;
    private javax.swing.JButton btnAlumnos4;
    private javax.swing.JButton btnAlumnos5;
    private javax.swing.JButton btnAlumnos6;
    private javax.swing.JButton btnAlumnos7;
    private javax.swing.JButton btnAlumnos8;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton lista;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton pendientes;
    private javax.swing.JLabel puntero1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
