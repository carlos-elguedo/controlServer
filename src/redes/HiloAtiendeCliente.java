/*
 * Esta clase es la que se atendera a cada cliente en forma de Hilo
 * 
 */
package redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import vista.VentanaServidor;

/**
 *
 * @author JohnArrietaMac - Carlos Elguedo - Rafael Castellar
 */
public class HiloAtiendeCliente extends Thread{
    // Atributos
    
    private Socket conexionCliente;// es el socket de conexion con el cliente
    private VentanaServidor ventana;// es la ventana del servidor
    private boolean escuchador = true;//variable que permanecera escuchando al cliente de este hilo
    private String so;

    // CONTRUCTOR
    // 1). Creamos una instancia del hilo y asignamos la ventana principal del servidor al cliente
    public HiloAtiendeCliente(Socket conexion, VentanaServidor ventana) {
        // asigamos los parameros del constructo a las propiedad
        this.conexionCliente = conexion;
        this.ventana = ventana;
        
        ventana.mostrarMensajes("COMPUTADORA CONECTADA. ip: "+this.conexionCliente.getInetAddress() + "\n\n");
    }
    
    
    /**
     * Metodo que ejecuta un Hilo en segundo plano para escribir al cliente cual
     * fue el numero asignado o el numero ganador
     *
     */
    // 3). notificamos al cliente el numero de boleto o el numero ganador
public void notificarCliente(int tipo) {
        // CREAMOS UNA INSTANCIA DE Thread USANDO UNA CLASE ANONIMA
        Thread hiloDeSalida = new Thread() {
            // sobre escribimos el metodo run
            @Override
            public void run() {
                System.out.println("Entro en donde es");
                
                    try {
                    super.run();
                    // DECLARAMOS UNA INSTANCIA DE FLULO DE DATOS DE SALIDA
                    DataOutputStream flujoSalida = null;
                    // creamos un flujo de salida para enviar datos el cliente
                    flujoSalida = new DataOutputStream(conexionCliente.getOutputStream());
                    // enviamos un dato de tipo Int, en este caso el numero de loteria
                    flujoSalida.writeInt(tipo);
                    // obligamos a que ese dato salga del cache de la tarjeta de red del servidor
                    flujoSalida.flush();
                        System.out.println("Envioooooooooooooooooooooooo");
                } catch (IOException error) {
                    // colocamos un mensaje de error en caso de que ocurra
                    getVentana().mostrarMensajes("Error al Enviar datos al cliente\nMensaje Original: " + error.getMessage());
                    Servidor.getListaClientesConectados().remove(HiloAtiendeCliente.this);
                    ventana.actualizarClientesConectados();
                }

            }//Fin del run

        };
        // iniciamos el subporceso en segundo plano
        hiloDeSalida.start();
    }

    public void capturaSistemaOperativo() {
        DataInputStream flujoEntrada = null;
        try {
            // OBTENEMOS EL FLUJO DE ENTRADA DEL CLIENTE Y CREAMOS CON ESTE UN FLUJO DE ENTRADA DE DATOS
            flujoEntrada = new DataInputStream(conexionCliente.getInputStream());
            // leemos mediante un while hasta que llegue la cedula del cliente
            while (so == null) {
                // CAPTURAMOS el sistema operativo
                so = flujoEntrada.readUTF();
                if(!so.equals("")){
                    ventana.vaciarTabla();
                    ventana.meterEnTabla();
                }
            }
        } catch (IOException ex) {
            // AQUI COLOCAMOS UN MENSAJE DE ERROR EN LA VENTANA.
            ventana.mostrarMensajes("ERROR: Problemas de Entrada y Salida en el cliente IP: " + conexionCliente.getInetAddress().getHostAddress());
        } 
    }

    // SOBRE ESCRIBIR EL METODO RUN PARA EJECUTAR EL METODO capturarCedula como un subproceso
    @Override
    public void run() {
        super.run(); 
        capturaSistemaOperativo();
    }

    // METODOS SET Y GET
    public Socket getConexionCliente() {
        return conexionCliente;
    }

    public void setConexionCliente(Socket conexionCliente) {
        this.conexionCliente = conexionCliente;
    }

    public VentanaServidor getVentana() {
        return ventana;
    }

    public void setVentana(VentanaServidor ventana) {
        this.ventana = ventana;
    }
    public String getSo(){
        return this.so;
    }

    
}
