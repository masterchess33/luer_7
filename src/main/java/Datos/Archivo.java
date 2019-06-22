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
    String texto1="Kanye Omari West is an American rapper, singer, songwriter, record producer, \n" +
"entrepreneur, and fashion designer. His musical career has been marked by dramatic \n" +
"changes in styles, incorporating an eclectic range of influences including soul, \n" +
"baroque pop, electro, indie rock, synth-pop, industrial, and gospel. Over the \n" +
"course of his career, West has been responsible for cultural movements and \n" +
"progressions within mainstream hip hop and popular music at large.\n" +
"\n" +
"Born in Atlanta and raised in Chicago, West first became known as a producer for \n" +
"Roc-A-Fella Records in the early 2000s, producing singles for recording artists \n" +
"such as Jay-Z, Ludacris and Alicia Keys. Intent on pursuing a solo career as a \n" +
"rapper, West released his debut album The College Dropout in 2004 to widespread \n" +
"critical and commercial success, and founded the record label GOOD Music. He went \n" +
"on to experiment with a variety of musical genres on subsequent acclaimed studio \n" +
"albums, including Late Registration (2005), Graduation (2007), and the polarizing \n" +
"but influential 808s & Heartbreak (2008). He released his fifth album My Beautiful \n" +
"Dark Twisted Fantasy in 2010 to further rave reviews, and has since succeeded it \n" +
"with Yeezus (2013), The Life of Pablo (2016) and Ye (2018), as well as full-length \n" +
"collaborations Watch the Throne (2011) and Kids See Ghosts (2018) with Jay-Z and \n" +
"Kid Cudi respectively.\n" +
"\n" +
"West's outspoken views and life outside of music have received significant media \n" +
"attention. He has been a frequent source of controversy for his conduct at award \n" +
"shows, on social media, and in other public settings, as well as his comments on \n" +
"the music and fashion industries, U.S. politics, and race. His marriage to \n" +
"television personality Kim Kardashian has also been a source of substantial media \n" +
"attention. As a fashion designer, he has collaborated with Nike, Louis Vuitton, and \n" +
"A.P.C. on both clothing and footwear, and have most prominently resulted in the \n" +
"Yeezy collaboration with Adidas beginning in 2013. He is the founder and head of \n" +
"the creative content company DONDA.\n" +
"\n" +
"West is among the most critically acclaimed musicians of the 21st century and one \n" +
"of the best-selling music artists of all time with over 135 million records sold \n" +
"worldwide.[3] He has won a total of 21 Grammy Awards, making him one of the most \n" +
"awarded artists of all time and the most Grammy-awarded artist of his \n" +
"generation.[4] Three of his albums have been included and ranked on Rolling Stone's \n" +
"2012 update of the \"500 Greatest Albums of All Time\" list and he ties with Bob \n" +
"Dylan for having topped the annual Pazz & Jop critic poll the most number of times \n" +
"ever, with four number-one albums each. Time magazine named him one of the 100 most \n" +
"influential people in the world in 2005 and 2015.";
    String texto2="Shawn Corey Carter (born December 4, 1969),[6] known professionally as Jay-Z,[a] is \n" +
"an American rapper, songwriter, producer, entrepreneur, and record \n" +
"executive.[9][10] He is considered among the best rappers of all \n" +
"time.[11][12][13][14]\n" +
"\n" +
"Born and raised in New York City, Jay-Z first began his musical career after \n" +
"founding the record label Roc-A-Fella Records in 1995, and subsequently released \n" +
"his debut studio album Reasonable Doubt in 1996. The album was released to \n" +
"widespread critical success, and solidified his standing in the music industry. He \n" +
"has gone onto release twelve additional albums, which have all attained generally \n" +
"positive critical reception and universal commercial success, with The Blueprint \n" +
"(2001) and The Black Album (2003) albums later being heralded as modern musical \n" +
"classics.[15][16] He has also released the full-length collaborative albums Watch \n" +
"the Throne (2011) and Everything Is Love (2018) with Kanye West and wife Beyoncé, \n" +
"respectively.[17]\n" +
"\n" +
"Outside of his musical career, Jay-Z has also attained significant success and \n" +
"media attention for his career as a businessman. In 1999, he founded the clothing \n" +
"retailer Rocawear,[18] and in 2003, he founded the luxury sports bar chain 40/40 \n" +
"Club. Both businesses have grown to become multi-million dollar corporations, and \n" +
"allowed Jay-Z to fund the start-up for the entertainment company Roc Nation, which \n" +
"was founded in 2008. In 2015, he acquired the tech company Aspiro, and took charge \n" +
"of their media streaming service Tidal, which has since become the world's \n" +
"third-largest online streaming company.[19] His marriage to musician Beyoncé has \n" +
"also been a source of substantial media attention.[20]\n" +
"\n" +
"Jay-Z is among the most critically acclaimed musicians and one of the best-selling \n" +
"music artists of all time, with over 100 million records sold worldwide.[21] He has \n" +
"won a total of 22 Grammy Awards, the most by a rapper, and holds the record for the \n" +
"most number-one albums by a solo artist on the Billboard 200, with 13.[22] He has \n" +
"been ranked by Billboard and fellow music publication Rolling Stone as one of the \n" +
"100 greatest artists of all time.[23][24] In 2017, he became the first rapper to be \n" +
"honored into the Songwriters Hall of Fame,[25] and in 2018, received the \n" +
"commemorative \"Salute to Industry Icons\" award at the 60th Grammy Awards.[26]";
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

    public String getTexto1() {
        return texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public List<String> getPares() {
        return pares;
    }
    
}
