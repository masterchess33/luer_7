package Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivo {
   
    private List<String> pares = new ArrayList();

    /** toma el array de metodo leerArchivoParComplemeto
     *  y lo comvierte en un string
     * @return
     */
    public String leerArchivoPar(String ruta){
        List lista=leerArchivoParComplemeto(ruta);
        String texto="";
        for(int i=0;i<lista.size();i++){
            if(i%2!=0){
            texto=texto+lista.get(i)+"\n";
            }
        }
        return texto;
    }
    /**
     * lee solo las lineas pares de un archivo.
     *
     * @param ruta
     * @return
     */
    public List leerArchivoParComplemeto(String ruta) {

        try (BufferedReader brPar = new BufferedReader(new FileReader(ruta))) {
            pares = brPar.lines().collect(Collectors.toList());
        } catch (IOException e) {

        }
        return pares;
    }
    
    /** lee un archivo y quita los saltos de linea.
     *
     * @param ruta
     * @return
     */
    public String leerArchivoSinSaltos(String ruta){
        
        Path archivo = Paths.get(ruta);
        String texto= "";
        try{
            texto= new String(Files.readAllBytes(archivo));
            
        }catch(IOException e){
            System.out.println("El archivo no pudo ser leido");
        }
        
        return texto.replaceAll("\n", "");
    }
    public String leerArchivo(String ruta){
        
        Path archivo = Paths.get(ruta);
        String texto= "";
        try{
            texto= new String(Files.readAllBytes(archivo));
            
        }catch(IOException e){
            System.out.println("El archivo no pudo ser leido");
        }
        return texto;
    }

    

    public List<String> getPares() {
        return pares;
    }
    
}
