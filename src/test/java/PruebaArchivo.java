/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Datos.Archivo;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author envergador
 */
public class PruebaArchivo {
   
    @Test(expected = NullPointerException.class)
    public void PruebaLeerArchivoPar() {
        Archivo j=new Archivo();
        
        String textoOriginal=j.leerArchivoPar(null);
        
    }
    
    @Test(expected = NullPointerException.class)
    public void PruebaLeerArchivoSinSaltos() {
        Archivo j=new Archivo();
        
        String textoOriginal=j.leerArchivoSinSaltos(null);
        
    }
    
}
