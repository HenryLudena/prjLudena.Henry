import java.net.NoRouteToHostException;

import javax.sql.rowset.spi.SyncResolver;

import LudenaPoliRetos.Animaciones;
import LudenaPoliRetos.CadenaCaracteres;
import LudenaPoliRetos.Figuras;
import LudenaPoliRetos.SerieCaracteres;
import LudenaPoliRetos.SeriesNumericas;
import LudenaUtility.Utility;

public class App {
    public static void main(String[] args) throws Exception {

        int nroTermino=0;
        
        Utility.ClearTerminal();
        System.out.println("Datos: ");
        System.out.println("\t - Nombres: Henry Ludeña");
        System.out.println("\t - Cédula: 1150141487");
        SeriesNumericas sn = new SeriesNumericas();
        //Contención de los métodos aplicables a la serie numérica
        sn.LudenaSerieNumerica(sn);

        SerieCaracteres sc = new SerieCaracteres();
        //Contención de los métodos aplicables a la serie de carácteres
        sc.LudenaSerieCaracteres(sc);  

        Figuras fg = new Figuras();
        //Contención de los métodos aplicables a la impresión de figuras
        fg.LudenaSerieFiguras(fg);
        
        CadenaCaracteres cd = new CadenaCaracteres();
        //Contención de los métodos aplicables para la fromación de cadenas de caracteres
        cd.LudenaSerieCadenaCaracteres(cd);
        
        Animaciones am = new Animaciones();
        //Contención de los métodos aplicables a la impresión de animaciones
        am.LudenaSerieAnimaciones(am);        
}


    
    

    

    

    

    

    

    

   

    

   

    

    

    

    

    

    

    

    

}