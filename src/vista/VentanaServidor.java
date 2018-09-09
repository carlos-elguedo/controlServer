package vista;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import redes.HiloAtiendeCliente;
import redes.Servidor;

/**
 *
 * @author Carlos Elguedo
 */
public class VentanaServidor extends javax.swing.JFrame {

    private Servidor servidor;
    
    
    public VentanaServidor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Control - Carlos Elguedo - Rafael Castellar");
        setIconImage(new ImageIcon(getClass().getResource("/vista/icono.png")).getImage());//Ñadimos el icono para la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabezera = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        labNombre = new javax.swing.JLabel();
        labPuerto = new javax.swing.JLabel();
        campoPuerto = new javax.swing.JTextField();
        botServidor = new javax.swing.JButton();
        pestaniasPanel = new javax.swing.JTabbedPane();
        panelLogs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoLogs = new javax.swing.JTextArea();
        panelOperaciones = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConectados = new javax.swing.JTable();
        labSugerencia = new javax.swing.JLabel();
        tabAcciones = new javax.swing.JTabbedPane();
        panelBloquear = new javax.swing.JPanel();
        botBloquearYa = new javax.swing.JButton();
        labTiempoInfo = new javax.swing.JLabel();
        botBloqueoProgramado = new javax.swing.JButton();
        campMinutos = new javax.swing.JTextField();
        botDebloquear = new javax.swing.JButton();
        panelApagar = new javax.swing.JPanel();
        botApagarYa = new javax.swing.JButton();
        tabpanelReiniciar = new javax.swing.JPanel();
        botReiniciarYa = new javax.swing.JButton();
        panelAcercaDe = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labCreditos1 = new javax.swing.JLabel();
        labCreditos2 = new javax.swing.JLabel();
        labCreditos4 = new javax.swing.JLabel();
        labCreditos5 = new javax.swing.JLabel();
        labCreditos6 = new javax.swing.JLabel();
        labCreditos7 = new javax.swing.JLabel();
        labCreditos8 = new javax.swing.JLabel();
        labCreditos9 = new javax.swing.JLabel();
        labCreditos10 = new javax.swing.JLabel();
        labNumConectados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCabezera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("CONTROL DE COMPUTADORAS");

        labNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labNombre.setText("Carlos Andres Elguedo Padilla - Seminario de actualizaciòn");

        labPuerto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labPuerto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPuerto.setText("Puerto:");

        campoPuerto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        campoPuerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botServidor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botServidor.setText("Iniciar servidor");
        botServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botServidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabezeraLayout = new javax.swing.GroupLayout(panelCabezera);
        panelCabezera.setLayout(panelCabezeraLayout);
        panelCabezeraLayout.setHorizontalGroup(
            panelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezeraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCabezeraLayout.createSequentialGroup()
                        .addComponent(labPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botServidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCabezeraLayout.setVerticalGroup(
            panelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezeraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labPuerto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPuerto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(botServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pestaniasPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pestaniasPanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        campoLogs.setEditable(false);
        campoLogs.setColumns(20);
        campoLogs.setRows(5);
        jScrollPane1.setViewportView(campoLogs);

        javax.swing.GroupLayout panelLogsLayout = new javax.swing.GroupLayout(panelLogs);
        panelLogs.setLayout(panelLogsLayout);
        panelLogsLayout.setHorizontalGroup(
            panelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLogsLayout.setVerticalGroup(
            panelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pestaniasPanel.addTab("Registros", panelLogs);

        tablaConectados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaConectados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SO", "IP", "Puerto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaConectados);
        if (tablaConectados.getColumnModel().getColumnCount() > 0) {
            tablaConectados.getColumnModel().getColumn(0).setResizable(false);
            tablaConectados.getColumnModel().getColumn(1).setResizable(false);
            tablaConectados.getColumnModel().getColumn(2).setResizable(false);
        }

        labSugerencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labSugerencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labSugerencia.setText("Selecciona una computadora para poder realizar una acciòn");

        botBloquearYa.setText("Bloquear ya");
        botBloquearYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBloquearYaActionPerformed(evt);
            }
        });

        labTiempoInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labTiempoInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTiempoInfo.setText("Tiempo en minutos:");

        botBloqueoProgramado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botBloqueoProgramado.setText("Programar");
        botBloqueoProgramado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBloqueoProgramadoActionPerformed(evt);
            }
        });

        campMinutos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campMinutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botDebloquear.setText("Desbloquear");
        botDebloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDebloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBloquearLayout = new javax.swing.GroupLayout(panelBloquear);
        panelBloquear.setLayout(panelBloquearLayout);
        panelBloquearLayout.setHorizontalGroup(
            panelBloquearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBloquearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBloquearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBloquearLayout.createSequentialGroup()
                        .addComponent(labTiempoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addComponent(botBloquearYa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBloquearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botBloqueoProgramado, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(botDebloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBloquearLayout.setVerticalGroup(
            panelBloquearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBloquearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBloquearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botBloquearYa, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botDebloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBloquearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTiempoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botBloqueoProgramado, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(campMinutos))
                .addContainerGap())
        );

        tabAcciones.addTab("Bloquear", panelBloquear);

        botApagarYa.setText("Apagar ya");
        botApagarYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botApagarYaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelApagarLayout = new javax.swing.GroupLayout(panelApagar);
        panelApagar.setLayout(panelApagarLayout);
        panelApagarLayout.setHorizontalGroup(
            panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelApagarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botApagarYa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelApagarLayout.setVerticalGroup(
            panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelApagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botApagarYa, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabAcciones.addTab("Apagar", panelApagar);

        botReiniciarYa.setText("Reiniciar ya");
        botReiniciarYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botReiniciarYaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabpanelReiniciarLayout = new javax.swing.GroupLayout(tabpanelReiniciar);
        tabpanelReiniciar.setLayout(tabpanelReiniciarLayout);
        tabpanelReiniciarLayout.setHorizontalGroup(
            tabpanelReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanelReiniciarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(botReiniciarYa, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        tabpanelReiniciarLayout.setVerticalGroup(
            tabpanelReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabpanelReiniciarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botReiniciarYa, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabAcciones.addTab("Reiniciar", tabpanelReiniciar);

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labSugerencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabAcciones))
        );

        pestaniasPanel.addTab("Operaciones", panelOperaciones);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        labCreditos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labCreditos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos1.setText("UNIVERSIDAD DE CARTAGENA - ING SISTEMAS");

        labCreditos2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labCreditos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos2.setText("Control de Computadoras");

        labCreditos5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labCreditos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos5.setText("JHON CARLOS ARRIETA - Profesor");

        labCreditos6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labCreditos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos6.setText("Carlos Andres Elguedo - Rafael Castellar");

        labCreditos8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labCreditos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos8.setText("Todos los derechos reservados");

        labCreditos9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labCreditos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos9.setText("1ro de septiembre de 2016");

        labCreditos10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labCreditos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreditos10.setText("Cartagena - Colombia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCreditos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labCreditos2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos4, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos5, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos6, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos7, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos8, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos9, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labCreditos10, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCreditos1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labCreditos10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAcercaDeLayout = new javax.swing.GroupLayout(panelAcercaDe);
        panelAcercaDe.setLayout(panelAcercaDeLayout);
        panelAcercaDeLayout.setHorizontalGroup(
            panelAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcercaDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAcercaDeLayout.setVerticalGroup(
            panelAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcercaDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pestaniasPanel.addTab("Acerca de", panelAcercaDe);

        labNumConectados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labNumConectados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labNumConectados.setText("Computadoras conectadas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labNumConectados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pestaniasPanel)
                    .addComponent(panelCabezera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCabezera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pestaniasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labNumConectados, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botServidorActionPerformed
        String puerto = campoPuerto.getText();
        int puertoEntero;
        
        if(!puerto.equals("")){//Si la entrada no esta vacia
            // convetirlo en entero
            try {
                puertoEntero = Integer.parseInt(puerto);
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(this, "Ingresa un numero en el puerto");
                return;
            }
            // verificar si el serivodor ya fue creado como instancia
            if (servidor == null) {
                servidor = new Servidor(puertoEntero, this);// creamos una instancia de Servidor
                servidor.start();// iniciamos el subproceso que hacer que el servidor comiense a escuchar y aceptar conexiones
                botServidor.setText("Parar servidor");// cambiamos el texto del boton
                servidor.setEstado(true);// cambiamos el estado del servidor a conectado
                return;
            } // sino, entonces verificamos si el servidor esta iniciado y lo detenemos
            else if (servidor.getConexionServidor() != null && servidor.getConexionServidor().isClosed() == false) {
            // Detenemos al servidor
            servidor.detenerServicio();
            
            this.mostrarMensajes("El servidor se ha Dentenido");// mostramo un mensajes y cambiamos el texto del boton y el estado del servidor
            
            botServidor.setText("INICIAR");// cambiamos la etiqueta del boton para indicar que ahora el serividor se puede INICIAR
             // cambiamos el estado del servidor a Detenido.
            servidor.setEstado(false);
            servidor = null;
            return;
        }
        }else{//Fin del comprueba si esta vacio
            JOptionPane.showMessageDialog(this, "Escribe algo en el campo de Puerto");
        }
        
    }//GEN-LAST:event_botServidorActionPerformed

    private void botBloquearYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBloquearYaActionPerformed
        int row = tablaConectados.getSelectedRow();//Tomamos la fila seleccionada
        this.mostrarMensajes("" + row);
        boolean yaesta = false;
        //System.out.println("Seleccionada para bloquear: " + row + "- " +servidor.getClientesConectados().size());
        if(row <= servidor.getClientesConectados().size()){
            for(int i = 0; i < servidor.getListaClientesBloqueados().size(); i++){
                if(servidor.getListaClientesConectados().get(row).getConexionCliente().getInetAddress().equals(servidor.getListaClientesBloqueados().get(i).getConexionCliente().getInetAddress())){
                    this.mostrarMensajes("Ya se ha bloqueado este usuario");
                    yaesta = true;
                }
            }
            if(!yaesta){
                servidor.bloquear(row);//Procedemos
            }
            
        }
    }//GEN-LAST:event_botBloquearYaActionPerformed

    private void botApagarYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botApagarYaActionPerformed
        int row = tablaConectados.getSelectedRow();//Tomamos la fila seleccionada
        //System.out.println("Seleccionada para apagar: " + row + "- " +servidor.getClientesConectados().size());
        if(row <= servidor.getClientesConectados().size()){
            servidor.apagar(row);
        }
    }//GEN-LAST:event_botApagarYaActionPerformed

    private void botReiniciarYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botReiniciarYaActionPerformed
        int row = tablaConectados.getSelectedRow();//Tomamos la fila seleccionada
        //System.out.println("Seleccionada para apagar: " + row + "- " +servidor.getClientesConectados().size());
        if(row <= servidor.getClientesConectados().size()){
            servidor.reiniciar(row);
        }
    }//GEN-LAST:event_botReiniciarYaActionPerformed

    private void botBloqueoProgramadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBloqueoProgramadoActionPerformed
        int row = tablaConectados.getSelectedRow();//Tomamos la fila seleccionada
        int minutos = 0, segundos = 0;
        
        boolean yaesta = false;
        //System.out.println("Seleccionada para bloquear: " + row + "- " +servidor.getClientesConectados().size());
        if(row <= servidor.getClientesConectados().size()){
            for(int i = 0; i < servidor.getListaClientesBloqueados().size(); i++){
                if(servidor.getListaClientesConectados().get(row).getConexionCliente().getInetAddress().equals(servidor.getListaClientesBloqueados().get(i).getConexionCliente().getInetAddress())){
                    this.mostrarMensajes("Ya se ha bloqueado este usuario");
                    yaesta = true;
                }
            }
            if(!yaesta){
                if(row <= servidor.getClientesConectados().size()){
                    try{
                    minutos = Integer.parseInt(campMinutos.getText());
                    segundos = minutos*60;//Pasamos los minutos a segundos
                    //mostrarMensajes("Segundos: " + segundos);
                    servidor.bloquearEn(row, segundos);
                    
                }catch(NumberFormatException exc){
                    mostrarMensajes("Ingresa un numero correcto");
                }        
            }//Fin del if que comprueba la lista de conectados
            }
            
        }
        
    }//GEN-LAST:event_botBloqueoProgramadoActionPerformed

    private void botDebloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDebloquearActionPerformed
        int row = tablaConectados.getSelectedRow();//Tomamos la fila seleccionada
        if(row <= servidor.getListaClientesConectados().size()){
            //Creamos un for que recorrera la lista de computadoras bloqueadas
            for(int i = 0; i < servidor.getListaClientesBloqueados().size(); i++){
                if(servidor.getListaClientesConectados().get(row).getConexionCliente().getInetAddress().equals(servidor.getListaClientesBloqueados().get(i).getConexionCliente().getInetAddress())){
                    //System.out.println("Si essss");
                    servidor.desBloquear(row);
                }
                    
            }
            
        }
    }//GEN-LAST:event_botDebloquearActionPerformed

    public void mostrarMensajes(String mensaje) {
        // creamos una instancia para dar formato a la fecha AÑO-MES-DIA HORA:MINUTOS:SEGUNDOS AM/PM
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        String fechaActual = formatoFecha.format(new Date());
        // mostramos la fecha actual
        campoLogs.append("\n" + fechaActual + ":: " + mensaje);
    }
    
    public void actualizarClientesConectados() {
        labNumConectados.setText("Computadoras conectadas:" + Servidor.getListaClientesConectados().size());
    }
    
    public void meterEnTabla(){
        System.err.println("Entro en la llenadora");
        int contador = 0;
        for (int i = 0; i < servidor.getClientesConectados().size(); i++) {    
            HiloAtiendeCliente cliente = servidor.getClientesConectados().get(i);//Con esto llenamos la tabla por los datos en la lista
            tablaConectados.setValueAt(servidor.getClientesConectados().get(i).getSo(), contador, 0);
            tablaConectados.setValueAt(servidor.getClientesConectados().get(i).getConexionCliente().getInetAddress(), contador, 1);
            tablaConectados.setValueAt(servidor.getClientesConectados().get(i).getConexionCliente().getPort(), contador, 2);
            contador++;
            
        }//fin del for
    }
    
    public void vaciarTabla(){
        System.err.println("Entro en la vaciadora");
        int contador = 0;
        for (int i = 0; i < 6; i++) {//Vaciamos la tabla con ""
            tablaConectados.setValueAt("", contador, 0);
            tablaConectados.setValueAt("", contador, 1);
            tablaConectados.setValueAt("", contador, 2);
            contador++;            
        }//fin del for
    }
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botApagarYa;
    private javax.swing.JButton botBloquearYa;
    private javax.swing.JButton botBloqueoProgramado;
    private javax.swing.JButton botDebloquear;
    private javax.swing.JButton botReiniciarYa;
    private javax.swing.JButton botServidor;
    private javax.swing.JTextField campMinutos;
    private javax.swing.JTextArea campoLogs;
    private javax.swing.JTextField campoPuerto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labCreditos1;
    private javax.swing.JLabel labCreditos10;
    private javax.swing.JLabel labCreditos2;
    private javax.swing.JLabel labCreditos4;
    private javax.swing.JLabel labCreditos5;
    private javax.swing.JLabel labCreditos6;
    private javax.swing.JLabel labCreditos7;
    private javax.swing.JLabel labCreditos8;
    private javax.swing.JLabel labCreditos9;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labNumConectados;
    private javax.swing.JLabel labPuerto;
    private javax.swing.JLabel labSugerencia;
    private javax.swing.JLabel labTiempoInfo;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panelAcercaDe;
    private javax.swing.JPanel panelApagar;
    private javax.swing.JPanel panelBloquear;
    private javax.swing.JPanel panelCabezera;
    private javax.swing.JPanel panelLogs;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JTabbedPane pestaniasPanel;
    private javax.swing.JTabbedPane tabAcciones;
    private javax.swing.JTable tablaConectados;
    private javax.swing.JPanel tabpanelReiniciar;
    // End of variables declaration//GEN-END:variables
}
