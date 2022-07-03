package utilerias;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {

    
    private static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    private static LocalDateTime hoy = LocalDateTime.now();
    private static String fecha;

    public static String obtenerFechaHoy() {
        fecha = formatoFecha.format(hoy).toString();
        return fecha;
    }

}
