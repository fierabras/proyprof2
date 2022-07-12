package reportes;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import utilerias.ConexionBD;

public class Reporte {

    public static void reporteCompraMateriales() {

        // descarga dentro del mismo proyecto
        /*JasperPrint jasperPrint = JasperFillManager.fillReport("reportes/ReporteCompraMateriales.jasper", null,ConexionBD.getConexion());
        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("ReporteAlumnos.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();*/

        // se muestra en una ventana aparte para su descarga
        JasperPrint jasperPrintWindow = null;
        try {
            jasperPrintWindow = JasperFillManager.fillReport("E:\\CODIGO\\Netbeans\\proyProf2\\src\\main\\java\\reportes\\ReporteCompraMateriales.jasper", null,ConexionBD.getConexion());
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
        jasperViewer.setVisible(true);
    }
}


