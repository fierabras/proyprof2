package PruebasProyProf2;

import Ventanas.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import utilerias.ConexionSQL;



public class Pruebas {
    
    public Pruebas() {
    }
    
     @Test
    public void CP1() {
       
       String entrada = "materiales";
       
       InterfazFabrica iFabrica = GeneradorFabricas.getFabrica(entrada);
       FormularioMaterial vistaMaterial = (FormularioMaterial) iFabrica.crearVista();
       
       assertNotNull(vistaMaterial);      
    }
    @Test
    public void CP2() {
       
       String entrada = "proveedores";
       
       InterfazFabrica iFabrica = GeneradorFabricas.getFabrica(entrada);
       FormularioProveedor vistaProveedor = (FormularioProveedor) iFabrica.crearVista();
       
       assertNotNull(vistaProveedor);      
    }
    
    @Test
    public void CP3(){
        
        FormularioProveedor formulario1 = new FormularioProveedor();        
        formulario1.iniciar(formulario1);
        int clave1 = Integer.parseInt(formulario1.txbClaveProveedor.getText());
        formulario1.txbNombre.setText("Proveedor Prueba");
        formulario1.txbfolioId.setText("00000000");
        formulario1.guardar();        
        formulario1.dispose();
                
        FormularioProveedor formulario2 = new FormularioProveedor();     
        formulario2.iniciar(formulario2);
        int clave2 = Integer.parseInt(formulario2.txbClaveProveedor.getText());
        
        assertTrue((clave1+1)==clave2);           
  
    }
    
    @Test
    public void CP4(){
        
        FormularioMaterial formulario1 = new FormularioMaterial();        
        formulario1.iniciar(formulario1);
        int clave1 = Integer.parseInt(formulario1.txbClaveMaterial.getText());
        formulario1.txbDescripcion.setText("Material Prueba");
        formulario1.txbPrecio.setText("0.00");
        formulario1.guardar();        
        formulario1.dispose();
                
        FormularioMaterial formulario2 = new FormularioMaterial();     
        formulario2.iniciar(formulario2);
        int clave2 = Integer.parseInt(formulario2.txbClaveMaterial.getText());
        
        assertTrue((clave1+1)==clave2);           
  
    }
    
    @Test
    public void CP5(){
        
        FormularioProveedor formulario1 = new FormularioProveedor();        
        formulario1.iniciar(formulario1);
        int clave = Integer.parseInt(formulario1.txbClaveProveedor.getText());
        formulario1.txbNombre.setText("Proveedor Prueba");
        formulario1.txbfolioId.setText("00000000");
        formulario1.guardar();        
        formulario1.dispose();
        
        String sentencia = "SELECT * FROM PROVEEDORES WHERE CLAVEPROVEEDOR="+clave;
        ResultSet rs = ConexionSQL.obtenerRegistro(sentencia);
        
   
        
        try {
            int claveBD = rs.getInt(1);
            assertTrue(clave==claveBD);
        } catch (SQLException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String nombre = rs.getString(2);
            assertTrue(formulario1.txbNombre.getText()==nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String numId = rs.getString(4);
            assertTrue(formulario1.txbfolioId.getText()==numId);
        } catch (SQLException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
    }
    
    
    
    
    
    
    
}
