package usuarios;

import java.util.List;
import java.util.Map;
import utilerias.ConexionBD;

public class UsuarioBO {
    
    
    public static void nuevoUsuario(String usuario, String nombre, String password) {
        System.out.println("Metodo no implementado");
    }

    public static void cambiarContrasenia(String usuario) {
        System.out.println("Metodo no implementado");
    }

    public static boolean validarUsuario(String usuario) {

        String consultaSql = "SELECT USUARIO FROM USUARIOS WHERE USUARIO = " + "'" + usuario + "'";

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);

        if (consulta.size() == 0) {
            System.out.println("El usuario no existe");
            return false;
        }

        if (usuario.equals(consulta.get(0).get("USUARIO").toString())) {
            System.out.println("Si son iguales el usuario ingresado y el de la base de datos");
        }
        return usuario.equals(consulta.get(0).get("USUARIO").toString());

    }

    public static boolean validarContrasenia(String usuario, String password) {

        String consultaSql = "SELECT PASSWORD FROM USUARIOS WHERE USUARIO = " + "'" + usuario + "'";

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);

        if (consulta.size() == 0) {
            System.out.println("La contraseña NO existe");
            return false;
        }

            System.out.println(usuario);
            System.out.println(password);
            System.out.println(consulta.get(0).get("PASSWORD").toString());

            return password.equals(consulta.get(0).get("PASSWORD").toString());

        }

    }
