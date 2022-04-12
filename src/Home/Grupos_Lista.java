package Home;

import Conexion.Crud;
import Conexion.Lista;
import Controlador.ControladorExcel3;
import Modelo.ModeloExcel;
import Objetos.Grupos;
import Objetos.InscripcionCompleto;
import Objetos.Inscripciones;
import Objetos.ListaAlumnos;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grupos_Lista extends javax.swing.JFrame {

    //inicializacion de los objetos
    Crud crud1 = new Crud();
    ArrayList<Grupos> grupos = new ArrayList<>();  
    ArrayList<ListaAlumnos> listaTabla = new ArrayList<>();
    Object[][] filas;
    Object[] costo;
    
    //Metodo constructor
    public Grupos_Lista() {
        Date fechaActual = new Date();
        initComponents();
        String fecha1 = fechaActual.getDate() + "/" + ((Integer) fechaActual.getMonth() + 1) + "/" + (fechaActual.getYear() - 100);
        fecha.setText(fecha1);
        this.setLocationRelativeTo(null);

        //Cargar los comboBox
        CargarComboBox();

    }

    private void CargarComboBox() {
        ArrayList<Object> semestres = new ArrayList<>();
        semestres = crud1.getGrados();
        for (Object s : semestres) {
            semestre.addItem((String) s);
        }
    }

    private void ConstruirTabla() {
        this.filas = new Object[10][4];
        
        this.ObtenerLista();
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel modelo = new DefaultTableModel(
                //DAtos de las filas esto es un dato de tipo Object
                this.filas,
                //Creacion de los titulos de las filas en la tabla
                new Object[]{"Nombre", "Apellidos", "Telefono", "Grupo"}
        ) {
            //Metodo el cual permite bloquear la edicion del texto de los elementos de las celdas
            public boolean isCellEditable(int row, int colum) {
                //No editable
                return false;
            }
        };
        tabla.setModel(modelo);
    }


    private void ObtenerLista() {
        int contador = 0;
        //inscripciones = crud1.getNameInscripciones(buscador.getText());
        if (listaTabla.size() <= 0) {
            JOptionPane.showMessageDialog(null, "El grupo no contiene Alumnos", "No encontrado", JOptionPane.ERROR_MESSAGE);
        } else {
            //Recorridos de los grupos
            for (ListaAlumnos i : listaTabla) {
                this.filas[contador][0]=i.getNombre();
                this.filas[contador][1]=i.getApellidos();
                this.filas[contador][2]=i.getTelefono();
                this.filas[contador][3]=i.getGrupo();
                contador++; //incremento de la lista en las posiciones de las filas de la tabla
            }
        }
    }


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
        jPanel3 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAlumnos7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        exportar = new javax.swing.JButton();
        cuota = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        semestre = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(185, 187, 189));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnos.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnAlumnos.setForeground(new java.awt.Color(57, 176, 253));
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
        btnAlumnos2.setForeground(new java.awt.Color(185, 187, 189));
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
                    .addComponent(btnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnos4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnAlumnos4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
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

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setFont(new java.awt.Font("Malayalam MN", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Title 3"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setRowHeight(27);
        tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel-2.png"))); // NOI18N
        exportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exportar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cuota.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cuota.setForeground(new java.awt.Color(204, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Lista Alumnos");

        jLabel7.setText("Seleccione el grupo");

        semestre.setBackground(new java.awt.Color(255, 255, 255));
        semestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                semestreMouseReleased(evt);
            }
        });

        jLabel9.setText("Selecione el año");

        year.setBackground(new java.awt.Color(255, 255, 255));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        Buscar.setBackground(new java.awt.Color(42, 187, 237));
        Buscar.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorderPainted(false);
        Buscar.setContentAreaFilled(false);
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setOpaque(true);
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarSalirEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarSalirExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Buscarprecionar(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Buscarsoltar(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 730, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter

    }//GEN-LAST:event_enter

    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit

    }//GEN-LAST:event_exit

    private void btnAlumnos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos2ActionPerformed
        // TODO add your handling code here:
        Inscripciones_Menu menu = new Inscripciones_Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btnAlumnos2ActionPerformed

    private void enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter2
        btnAlumnos2.setForeground(new Color(57, 176, 253));
        puntero1.setForeground(new Color(57, 176, 253));
    }//GEN-LAST:event_enter2

    private void exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2
        btnAlumnos2.setForeground(new Color(185, 187, 189));
        puntero1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exit2

    private void btnAlumnos3enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos3enter2
        // TODO add your handling code here:
        btnAlumnos3.setForeground(new Color(57, 176, 253));
    }//GEN-LAST:event_btnAlumnos3enter2

    private void btnAlumnos3exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos3exit2
        // TODO add your handling code here:
        btnAlumnos3.setForeground(new Color(185, 187, 189));
    }//GEN-LAST:event_btnAlumnos3exit2

    private void btnAlumnos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos3ActionPerformed
        // TODO add your handling code here:
        Grupos_Menu g = new Grupos_Menu();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnos3ActionPerformed

    private void btnAlumnos4enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos4enter2
        // TODO add your handling code here:
        btnAlumnos4.setForeground(new Color(57, 176, 253));
    }//GEN-LAST:event_btnAlumnos4enter2

    private void btnAlumnos4exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos4exit2
        // TODO add your handling code here:
        btnAlumnos4.setForeground(new Color(185, 187, 189));
    }//GEN-LAST:event_btnAlumnos4exit2

    private void btnAlumnos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnos4ActionPerformed
        // TODO add your handling code here:
        Costos_Menu c = new Costos_Menu();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlumnos4ActionPerformed

    private void btnAlumnos5enter2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos5enter2
        btnAlumnos5.setForeground(new Color(57, 176, 253));
    }//GEN-LAST:event_btnAlumnos5enter2

    private void btnAlumnos5exit2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnos5exit2
        // TODO add your handling code here:
        btnAlumnos5.setForeground(new Color(185, 187, 189));

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
        salir.setForeground(new Color(250, 41, 41));
    }//GEN-LAST:event_SalirEnter

    private void SalirExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirExit
        // TODO add your handling code here:
        salir.setForeground(new Color(185, 187, 189));
    }//GEN-LAST:event_SalirExit

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
        ModeloExcel modeloE = new ModeloExcel();
        ControladorExcel3 contraControladorExcel = new ControladorExcel3(this, modeloE);
    }//GEN-LAST:event_exportarActionPerformed

    private void BuscarSalirEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarSalirEnter
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarSalirEnter

    private void BuscarSalirExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarSalirExit
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarSalirExit

    private void Buscarprecionar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscarprecionar
        // TODO add your handling code here:
        Buscar.setBackground(new Color(10, 162, 255));
    }//GEN-LAST:event_Buscarprecionar

    private void Buscarsoltar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscarsoltar
        // TODO add your handling code here:
        Buscar.setBackground(new Color(42, 187, 237));
    }//GEN-LAST:event_Buscarsoltar

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        //Realizamos una consulta a la tabla de Alumnos donde esten inscritos
        String grupoSelect=(String)semestre.getSelectedItem();
        String[] Grupo=grupoSelect.split(" ");//dividimos el texto en semestre y grupo en un arreglo de dos posiciones
        int idGrupo=crud1.getGrupo(Integer.parseInt(Grupo[0]),Grupo[1]); //Obtenemos el id del Grupo Selecionado
        
        //Creamos el objeto para realizar la consulta
        Lista lista=new Lista();
        this.listaTabla=lista.getLista(idGrupo,Integer.parseInt((String)year.getSelectedItem()));
        //Mandamos a llamar al metodo para la construccion de la tabla
        this.ConstruirTabla();
    }//GEN-LAST:event_BuscarActionPerformed

    private void semestreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestreMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_semestreMouseReleased

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
            java.util.logging.Logger.getLogger(Grupos_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grupos_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grupos_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grupos_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grupos_Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnAlumnos2;
    private javax.swing.JButton btnAlumnos3;
    private javax.swing.JButton btnAlumnos4;
    private javax.swing.JButton btnAlumnos5;
    private javax.swing.JButton btnAlumnos7;
    private javax.swing.JLabel cuota;
    public javax.swing.JButton exportar;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JLabel puntero1;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> semestre;
    public javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
