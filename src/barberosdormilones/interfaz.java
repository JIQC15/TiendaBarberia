package barberosdormilones;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class interfaz extends javax.swing.JFrame {

    private static int clientesEspera = 0;              // cantidad de sillas en espera ocupadas
    private Crear c = new Crear();                      // Instancia del hilo para crear clientes
    public boolean[] arrayBarberos = new boolean[3];    // Array para verificar los barberos disponibles
    public boolean[] arrayEspera = new boolean[4];      // Array para verificar las sillas disponibles
    public DefaultListModel modelo = new DefaultListModel();

    public interfaz() {
        this.setResizable(false);//El set resizable es para que mi pantalla interfaz se mantenga de un mismo tamaño y esta no se modifique por el usuario.
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelEspera1.setVisible(false);
        jLabelEspera2.setVisible(false);
        jLabelEspera3.setVisible(false);
        jLabelEspera4.setVisible(false);   //Nota: Todos mis labels de la lista de espera son false porque siempre cuando el programa corra, estarán los lugares disponibles.
        c.start(); //El comando .start() sirve para poder comenzar a trabajar con la instancia de hilo que creamos anteriormente.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelBarberoS = new javax.swing.JLabel();
        jLabelBarbero2S = new javax.swing.JLabel();
        jLabelBarbero3S = new javax.swing.JLabel();
        jLabelBarberoA = new javax.swing.JLabel();
        jLabelBarbero2A = new javax.swing.JLabel();
        jLabelBarbero3A = new javax.swing.JLabel();
        jLabelEspera1 = new javax.swing.JLabel();
        jLabelEspera2 = new javax.swing.JLabel();
        jLabelEspera3 = new javax.swing.JLabel();
        jLabelEspera4 = new javax.swing.JLabel();
        jButtonAgregarProceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProcesosFuera = new javax.swing.JList<>();
        jLabelAtencion3 = new javax.swing.JLabel();
        jLabelatencion1 = new javax.swing.JLabel();
        jLabelatencion2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelestado1 = new javax.swing.JLabel();
        jLabelestado2 = new javax.swing.JLabel();
        jLabelestado3 = new javax.swing.JLabel();
        jLabeLacum1 = new javax.swing.JLabel();
        jLabelacum2 = new javax.swing.JLabel();
        jLabelacum3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabelBarberoS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        jPanel1.add(jLabelBarberoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabelBarbero2S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        jPanel1.add(jLabelBarbero2S, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabelBarbero3S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        jPanel1.add(jLabelBarbero3S, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabelBarberoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        jPanel1.add(jLabelBarberoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabelBarbero2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        jPanel1.add(jLabelBarbero2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabelBarbero3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        jPanel1.add(jLabelBarbero3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabelEspera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabelEspera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabelEspera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabelEspera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jButtonAgregarProceso.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButtonAgregarProceso.setText("Agregar Cliente");
        jButtonAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProcesoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregarProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluqueria.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Los Hermanos Carrasco");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 230, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluqueria.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jListProcesosFuera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jListProcesosFuera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 350));

        jLabelAtencion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelAtencion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jLabelatencion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabelatencion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTADO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 60, -1));

        jLabelestado1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabelestado2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabelestado3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabeLacum1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabeLacum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, 20));

        jLabelacum2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 60, 20));

        jLabelacum3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 20));

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 420, 20));

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 20, 220));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 230, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lista de espera");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProcesoActionPerformed
        // TODO add your handling code here:
        c.nuevoProceso();
    }//GEN-LAST:event_jButtonAgregarProcesoActionPerformed

    public int disminuir(int semaforo) {
        semaforo--;//Aqui utilice un semaforo para poder jugar con los lufares
        return semaforo;
    }

    //Crea un proceso(Cliente)
    private class Crear extends Thread {

        public void run() {
            while (true) {
                // Inicio semáforo
                if (!jLabelestado1.getText().equals("Cobrando")) {//Set foreground es para evitar que se encimen los letreros unos con otros.
                    jLabelestado1.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado2.getText().equals("Cobrando")) {
                    jLabelestado2.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado3.getText().equals("Cobrando")) {
                    jLabelestado3.setForeground(new Color(60, 63, 65));
                }
                for (int x = 0; x < arrayBarberos.length; x++) {
                    if (!arrayBarberos[x]) {
                        try {
                            Thread.sleep(2000);//El 2000 se pone, porque cuando se ejecuta el programa se va atendiendo el hilo y estas son las milesimas de segundos.
                        } catch (InterruptedException ex) {
                            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        quitarCliente(x + 1);
                        dormir(x + 1);
                    } else {
                        activar(x + 1);
                    }
                }

                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        desocuparSillaEspera(x + 1);
                        if (!modelo.isEmpty()) {
                            ocuparSilla(indexSillaVacia() + 1);
                            modelo.remove(0);
                            jListProcesosFuera.setModel(modelo);
                            arrayEspera[x] = true;
                        }
                    }
                }
            }
        }

        private void ocuparSilla(int silla) {
            switch (silla) {
                case 1:
                    jLabelEspera1.setVisible(true);
                    break;
                case 2:
                    jLabelEspera2.setVisible(true);
                    break;
                case 3:
                    jLabelEspera3.setVisible(true);
                    break;
                case 4:
                    jLabelEspera4.setVisible(true);
                    break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void nuevoProceso() {//Se generará un nuevo proceso cada que preciones el botón agregar.
            int contador = -1; //El contador -1 lo adjudique de esa manera para que empezara con 0 ya que el 0 es el primer barbero.
            boolean bandera = false;//La bandera la generé para saber el estado del barbero, si estaba despierto o dormido.
            
            for (int x = 0; x < arrayBarberos.length; x++) {
                if (!arrayBarberos[x]) {
                    arrayBarberos[x] = true;
                    contador = x + 1;
                    bandera = true;
                    break;
                }
            }
            if (bandera) {//Si la bandera esta en false entonces...
                despertar(contador);//Se activará la funcion de despertar y el contador hará su función generada.
            } else {
                //Si todos los barberos están ocupados, examina las sillas
                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        arrayEspera[x] = true;
                        contador = x + 1;
                        bandera = true;
                        break;
                    }
                }
                if (bandera) {
                    // Asignar silla
                    ocuparSilla(contador);
                } else {
                    // Colocar en línea de espera "afuera"
                    modelo.addElement("Cliente en espera");
                    jListProcesosFuera.setModel(modelo);
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    public class atenderCliente extends Thread {

        private int contador = -1;

        public void run() {
            int numeroAleatorio = getRandomNumberInRange(10, 15);//Mi contador será random pero tendrá un rango de 10,15.

            try {//Este try catch lo eh considerado ya que puede generarse al hacer los datos aleatorios.
                Thread.sleep(numeroAleatorio * 1000);//El Sleep, lo multiplico por 1000 ya que quiero que me arroje un contador con numeros enteros de 2 cifras.
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clienteSatisfecho();
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void clienteSatisfecho() throws InterruptedException {
            arrayBarberos[contador - 1] = false;
            System.out.println("Adios, te atendio " + contador);

            if (contador == 1) {
                jLabelestado1.setForeground(new Color(29, 184, 29));
                jLabelestado1.setText("Cobrando");
            } else if (contador == 2) {
                jLabelestado2.setForeground(new Color(29, 184, 29));
                jLabelestado2.setText("Cobrando");
            } else {
                jLabelestado3.setForeground(new Color(29, 184, 29));
                jLabelestado3.setText("Cobrando");
            }
            verificarEspera();
        }

        private void verificarEspera() {
            if (arrayEspera[0] == true) {
                if (arrayEspera[1] == true) {
                    if (arrayEspera[2] == true) {
                        if (arrayEspera[3] == true) {
                            arrayEspera[3] = false;
                            desocuparSillaEspera(4);
                        } else {
                            arrayEspera[2] = false;
                            desocuparSillaEspera(3);
                        }
                    } else {
                        arrayEspera[1] = false;
                        desocuparSillaEspera(2);
                    }
                } else {
                    arrayEspera[0] = false;
                    desocuparSillaEspera(1);
                }
                arrayBarberos[contador - 1] = true;
                System.out.println("Hola, te atiende " + contador);
                despertar(contador);
            }
        }
    }

    public boolean sillasEsperaLlenas() {
        // Analiza si las sillas de espera están vacías o llenas
        // Regresa false si están ocupadas, o true si hay alguna vacía
        int contador = 0;
        if (jLabelEspera1.isVisible()) {
            contador++;
        }
        if (jLabelEspera2.isVisible()) {
            contador++;
        }
        if (jLabelEspera3.isVisible()) {
            contador++;
        }
        if (jLabelEspera4.isVisible()) {
            contador++;
        }
        return !(contador == 4);
    }

    public int indexSillaVacia() {
        if (!jLabelEspera1.isVisible()) {
            return 0;
        }
        if (!jLabelEspera2.isVisible()) {
            return 1;
        }
        if (!jLabelEspera3.isVisible()) {
            return 2;
        }
        if (!jLabelEspera4.isVisible()) {
            return 3;
        }

        return -1;
    }

    public void desocuparSillaEspera(int silla) {
        switch (silla) {
            case 1:
                jLabelEspera1.setVisible(false);
                break;
            case 2:
                jLabelEspera2.setVisible(false);
                break;
            case 3:
                jLabelEspera3.setVisible(false);
                break;
            case 4:
                jLabelEspera4.setVisible(false);
                break;
            default:
                break;
        }
    }

    public void activar(int barbero) {//Con esta función solo muestro a mis barberos y cuando llega el cliente se muestra el mensaje atendiendo.
        switch (barbero) {
            case 1: {
                jLabelBarberoA.setVisible(true);
                jLabelatencion1.setVisible(true);
                jLabelestado1.setText("Atendiendo");
                break;
            }
            case 2: {
                jLabelBarbero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                jLabelestado2.setText("Atendiendo");
                break;
            }
            case 3: {
                jLabelBarbero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                jLabelestado3.setText("Atendiendo");
                break;
            }
        }
    }

    public int despertar(int barbero) {//Esta es la función en la que hiremos activando y desactivando los barberos.
        switch (barbero) {
            case 1: {//El caso uno se compone de multiples tareas:
                jLabelBarberoA.setVisible(true);//El barbero se ve.
                jLabelatencion1.setVisible(true);//Esta para atender.
                atenderCliente atender = new atenderCliente();//Cree mi atender para poder jugar con los clientes.
                atender.contador = barbero;//En cuanto un cliente se coloque con un barbero, empezará la funcion de contador y esto se le asginara al barbero.
                atender.start();
                break;
            }//Todo lo primero lo asignaré a cada uno de los siguientes barberos, el 1,2 y 3.
            case 2: {
                jLabelBarbero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = barbero;
                atender.start();
                break;
            }
            case 3: {
                jLabelBarbero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = barbero;
                atender.start();
                break;
            }
        }
        return 1;
    }

    public void quitarCliente(int cliente) {//Esta función simplemente "quita" cada uno de los clientes, aunque en codigo, solo los oculta.
        switch (cliente) {
            case 1:
                jLabelatencion1.setVisible(false);
                break;
            case 2:
                jLabelatencion2.setVisible(false);
                break;
            case 3:
                jLabelAtencion3.setVisible(false);
                break;
            default:
                break;
        }
    }

    public int dormir(int barbero) {//Esta función mostrará a cada uno de los barberos dormidos.
        switch (barbero) {
            case 1:
                jLabelBarberoA.setVisible(false);
                jLabelestado1.setText("Durmiendo");
                break;
            case 2:
                jLabelBarbero2A.setVisible(false);
                jLabelestado2.setText("Durmiendo");
                break;
            default:
                jLabelBarbero3A.setVisible(false);
                jLabelestado3.setText("Durmiendo");
                break;
        }
        return 1;
    }

    private static int getRandomNumberInRange(int min, int max) {//Este es mi contador para cada uno de los clientes que serán atendidos por mis Barberos.
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarProceso;
    private javax.swing.JLabel jLabeLacum1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAtencion3;
    private javax.swing.JLabel jLabelBarbero2A;
    private javax.swing.JLabel jLabelBarbero2S;
    private javax.swing.JLabel jLabelBarbero3A;
    private javax.swing.JLabel jLabelBarbero3S;
    private javax.swing.JLabel jLabelBarberoA;
    private javax.swing.JLabel jLabelBarberoS;
    private javax.swing.JLabel jLabelEspera1;
    private javax.swing.JLabel jLabelEspera2;
    private javax.swing.JLabel jLabelEspera3;
    private javax.swing.JLabel jLabelEspera4;
    private javax.swing.JLabel jLabelacum2;
    private javax.swing.JLabel jLabelacum3;
    private javax.swing.JLabel jLabelatencion1;
    private javax.swing.JLabel jLabelatencion2;
    private javax.swing.JLabel jLabelestado1;
    private javax.swing.JLabel jLabelestado2;
    private javax.swing.JLabel jLabelestado3;
    private javax.swing.JList<String> jListProcesosFuera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
