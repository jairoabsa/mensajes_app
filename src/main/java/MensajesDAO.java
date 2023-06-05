import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
    public static void crearMensajeBD(Mensajes mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps=null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje Creado");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajesDB(){

    }
    public static void borrarmensajeDB(int id_mensaje){

    }
    public static void actualizarMensajeDB(Mensajes mensajes){

    }
}
