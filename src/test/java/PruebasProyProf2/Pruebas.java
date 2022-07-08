package PruebasProyProf2;

import fabrica.GeneradorFabricas;
import proveedor.FormularioProveedor;
import material.FormularioMaterial;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import utilerias.ConexionBD;
import fabrica.Fabrica;
import java.util.List;
import java.util.Map;

public class Pruebas {

    public Pruebas() {
    }

    @Test
    public void CP1() {

        String entrada = "materiales";

        Fabrica iFabrica = GeneradorFabricas.obtenerFabrica(entrada);
        FormularioMaterial vistaMaterial = (FormularioMaterial) iFabrica.crearVista();

        assertNotNull(vistaMaterial);
    }

    @Test
    public void CP2() {

        String entrada = "proveedores";

        Fabrica iFabrica = GeneradorFabricas.obtenerFabrica(entrada);
        FormularioProveedor vistaProveedor = (FormularioProveedor) iFabrica.crearVista();

        assertNotNull(vistaProveedor);
    }

    @Test
    public void CP3() {

        FormularioProveedor formulario1 = new FormularioProveedor();
        formulario1.iniciar();
        int clave1 = Integer.parseInt(formulario1.campoClaveProveedor.getText());
        formulario1.campoNombre.setText("Proveedor Prueba");
        formulario1.campoFolioId.setText("00000000");
        formulario1.guardar();
        formulario1.dispose();

        FormularioProveedor formulario2 = new FormularioProveedor();
        formulario2.iniciar();
        int clave2 = Integer.parseInt(formulario2.campoClaveProveedor.getText());

        assertTrue((clave1 + 1) == clave2);

    }

    @Test
    public void CP4() {

        FormularioMaterial formulario1 = new FormularioMaterial();
        formulario1.iniciar();
        int clave1 = Integer.parseInt(formulario1.campoClaveMaterial.getText());
        formulario1.campoDescripcion.setText("Material Prueba");
        formulario1.campoPrecio.setText("0.00");
        //formulario1.guardar();        
        formulario1.dispose();

        FormularioMaterial formulario2 = new FormularioMaterial();
        formulario2.iniciar();
        int clave2 = Integer.parseInt(formulario2.campoClaveMaterial.getText());

        assertTrue((clave1 + 1) == clave2);

    }

    @Test
    public void CP5() {

        FormularioProveedor formulario1 = new FormularioProveedor();
        formulario1.iniciar();
        int clave = Integer.parseInt(formulario1.campoClaveProveedor.getText());
        formulario1.campoNombre.setText("Proveedor Prueba");
        formulario1.campoFolioId.setText("00000000");
        formulario1.guardar();
        formulario1.dispose();

        String consultaSql = "SELECT * FROM PROVEEDORES WHERE CLAVEPROVEEDOR=" + clave;
        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);
        
        int claveBD = Integer.parseInt(consulta.get(0).get("CLAVE_PROVEEDOR").toString());
        assertTrue(clave == claveBD);

        String nombre = consulta.get(0).get("NOMBRE").toString();
        assertTrue(formulario1.campoNombre.getText() == nombre);

        String numId = consulta.get(0).get("NUMERO_IDENTIFICACION").toString();
        assertTrue(formulario1.campoFolioId.getText() == numId);
    }

}
