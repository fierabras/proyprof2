package PruebasProyProf2;

import fabricaVentanas.GeneradorFabricas;
import fabricaVentanas.IFabrica;
import fabricaVentanas.VistaMaterial;
import fabricaVentanas.VistaProveedor;
import org.junit.Test;
import static org.junit.Assert.*;


public class Pruebas {
    
    public Pruebas() {
    }
    
     @Test
    public void CP1() {
       
       String entrada = "materiales";
       
       IFabrica iFabrica = GeneradorFabricas.getFabrica(entrada);
       VistaMaterial vistaMaterial = (VistaMaterial) iFabrica.crearVista();
       
       assertNotNull(vistaMaterial);      
    }
    @Test
    public void CP2() {
       
       String entrada = "proveedores";
       
       IFabrica iFabrica = GeneradorFabricas.getFabrica(entrada);
       VistaProveedor vistaProveedor = (VistaProveedor) iFabrica.crearVista();
       
       assertNotNull(vistaProveedor);      
    }
}
