import java.util.Scanner;

public class MensajesServices {
    public static void crearMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeBD(registro);
    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarmensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarmensajeDB(id_mensaje);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el mensaje modificado");
        String mensaje = sc.nextLine();

        System.out.println("Cual es el ID del mensaje a actualizar?");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
