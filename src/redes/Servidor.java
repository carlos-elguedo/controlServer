
package redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.VentanaServidor;

/**
 *
 * @author JohnArrietaMac - Carlos Elguedo - Rafael Castellar
 */
public class Servidor extends Thread{
    // PROPIEDADES
    
    private static List<HiloAtiendeCliente> listaClientesConectados;// instancia para guardar los clientes que se van conectado
    private static List<HiloAtiendeCliente> listaClientesBloqueados;//Para guardar los clientes que estan bloqueados
    // variable entera para guardar el numero del puerto de conexion
    private int puerto;
    // variable falsa o verdadera para indica el estado (Iniciado o Detenido) del serividor
    private boolean estado;
    // intanacia de la VentanaPrincipal, util para poder notificar los mensajes y sucesos
    private VentanaServidor ventana;
    // Intancia de la clase ServerSocket, es la clase que permite actuar como Servicio de Red
    private ServerSocket conexionServidor;

    // CONSTRUCTOR
    public Servidor(int puerto, VentanaServidor ventana) {
        this.puerto = puerto;
        this.ventana = ventana;
        listaClientesConectados = new ArrayList<HiloAtiendeCliente>();
        listaClientesBloqueados = new ArrayList<HiloAtiendeCliente>();
    }
    
    /**
     * Metodo para iniciar el proceso de escucha y aceptacion de conerroriones
     */
    public void iniciarServidor() {
        try {
            // creamos una instancia de ServerSocket indicando el puerto a utilizar
            // debemos capturar la excepcion que se puede lanzar en caso de que no se
            // pueda abrir el puerto de red
            conexionServidor = new ServerSocket(puerto);
            // MOSTRAMOS UN MESAJE DE OK
            ventana.mostrarMensajes("SERVIDOR INICIADO");
        } catch (IOException error) {
            // MOSTRAMOS UN MESAJE DE ERROR
            ventana.mostrarMensajes("ERROR: No se puedo iniciar el servidor\nMensaje Original: "+error.getMessage());
        }
    }

     /**
     * Metodo para escuchar y aceptar conexiones de clientes
     */
    public void escucharAceptarConexiones() {
        // mientras el estado sea verdadero (iniciado), se aceptan conexiones
        while (estado == true) {
            try {
                // escuchamos las conexiones entrantes desde clientes y las aceptamos
                Socket conexionCliente = conexionServidor.accept();
                // creamos una instancia de HiloAtiendeCliente
                HiloAtiendeCliente hiloCliente = new HiloAtiendeCliente(conexionCliente, ventana);
                // agregamos el cliente en la lista de clientes conectados
                listaClientesConectados.add(hiloCliente);
                listaClientesBloqueados.add(hiloCliente);
                ventana.actualizarClientesConectados();
                // iniciamos el subproceso que atiende al cliente conectado
                hiloCliente.start();
                ventana.meterEnTabla();
            }catch (IOException ex) {
                ventana.mostrarMensajes("Error de entrada Input o Salida Output " + ex.getMessage());
            }
        }
    }
    
    /**
     * Metodo RUN heredado de la clase Thread, es el metodo que contiene el
     * codigo que sera ejecutado de forma paralela, concurrente, en segundo
     * plano o como subproceso
     */
    @Override
    public void run() {
        super.run(); 
        // iniciamos el servidor como un subproces
         iniciarServidor();
         // escuchamos las conexiones en el mismo subproceso
        escucharAceptarConexiones();
    }

     /**
     * Metodo para detener el servidor y suspender o terminar la ejecucion del
     * subproceso
     */
    public void detenerServicio() {
        //if(listaClientesConectados.size()>0){
        try {
            // aqui debemos cerrar todas las conexiones de los clientes conectados.
            for (HiloAtiendeCliente cliente : listaClientesConectados) {
                cliente.getConexionCliente().close();
                ventana.mostrarMensajes("FUE DESCONECTADO EL CLIENTE: "+listaClientesConectados.indexOf(cliente)+1);
            }
            listaClientesConectados.clear();
            ventana.vaciarTabla();
            // recordemos que si el estado es falso el while que acepta las conexiones se termian
            // cerrar la conexion del servidor y liberamos el puerto.
            conexionServidor.close();
            ventana.mostrarMensajes("Servidor Detenido");
        } catch (IOException ex) {
            conexionServidor = null;
            ventana.mostrarMensajes("ERROR: No se pudo detener el Servidor, fue forzado a detenerse");
        }
        //}
    }
    
       

    public void bloquear(int ind){
        listaClientesConectados.get(ind).notificarCliente(3);
        listaClientesBloqueados.add(listaClientesConectados.get(ind));
    }
    public void desBloquear(int ind){
        listaClientesConectados.get(ind).notificarCliente(5);
        listaClientesBloqueados.remove(listaClientesConectados.get(ind));
    }
    public void bloquearEn(int ind, int segundos){
        listaClientesConectados.get(ind).notificarCliente(segundos);
        listaClientesBloqueados.add(listaClientesConectados.get(ind));
    }
    public void apagar(int ind){
        listaClientesConectados.get(ind).notificarCliente(1);
    }
    public void reiniciar(int ind){
        listaClientesConectados.get(ind).notificarCliente(2);
    }
    
    // SET Y GET

    public List<HiloAtiendeCliente> getClientesConectados(){
        return Servidor.listaClientesConectados;
    }
    
    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public VentanaServidor getVentana() {
        return ventana;
    }
    

    public void setVentana(VentanaServidor ventana) {
        this.ventana = ventana;
    }

    public ServerSocket getConexionServidor() {
        return conexionServidor;
    }

    public void setConexionServidor(ServerSocket conexionServidor) {
        this.conexionServidor = conexionServidor;
    }
    public static List<HiloAtiendeCliente> getListaClientesConectados() {
        return listaClientesConectados;
    }
    public static void setListaClientesConectados(List<HiloAtiendeCliente> aListaClientesConectados) {
        listaClientesConectados = aListaClientesConectados;
    }
    public static List<HiloAtiendeCliente> getListaClientesBloqueados() {
        return listaClientesBloqueados;
    }
    public static void setListaClientesBloqueados(List<HiloAtiendeCliente> aListaClientesBloq) {
        listaClientesConectados = aListaClientesBloq;
    }
    
}
