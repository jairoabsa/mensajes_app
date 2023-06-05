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

    }
    public static void borrarmensaje(){

    }
    public static void editarMensaje(){

    }
}
