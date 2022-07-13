package reportes;

import java.awt.Frame;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import utilerias.ConexionBD;

public class Reporte {

    public static void reporteCompraMateriales(String fechaInicial, String fechaFinal) {
        
        String rutaLocal = System.getProperty("user.dir"); // se usa para obtener la ruta de trabajo y no depender de una ruta fija

        JasperPrint jasperPrintWindow = null;
        try {
            //usamos una colecion con HashMap para guardar los parametros con un esquema clave-valor donde clave es el nombre del parametros en JasperReports
            HashMap parametros = new HashMap();
            parametros.put("FECHA_INICIAL", fechaInicial);
            parametros.put("FECHA_FINAL", fechaFinal);

            jasperPrintWindow = JasperFillManager.fillReport(rutaLocal + "/reportes/ReporteCompraMateriales.jasper", parametros, ConexionBD.getConexion());

            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow,false);
            jasperViewer.setVisible(true);
            jasperViewer.setExtendedState(Frame.MAXIMIZED_BOTH);

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void emitirTicket(String uuidNota){
        
        String rutaLocal = System.getProperty("user.dir"); // se usa para obtener la ruta de trabajo y no depender de una ruta fija

        JasperPrint jasperPrintWindow = null;
        try {
            //usamos una colecion con HashMap para guardar los parametros con un esquema clave-valor donde clave es el nombre del parametros en JasperReports
            HashMap parametros = new HashMap();
            parametros.put("UUID_NOTA", uuidNota);
            

            jasperPrintWindow = JasperFillManager.fillReport(rutaLocal + "/src/main/java/reportes/TicketColectivoSinDatosFisc.jasper", parametros, ConexionBD.getConexion());

            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow,false);
            jasperViewer.setVisible(true);
            jasperViewer.setExtendedState(Frame.MAXIMIZED_BOTH);
            jasperViewer.requestFocus();
            jasperViewer.toFront();           

        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;      
        
    }
}
