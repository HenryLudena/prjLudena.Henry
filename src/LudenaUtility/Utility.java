package LudenaUtility;

import java.util.Scanner;

public class Utility {
    
    private static final int delay = 100; 
    static  Scanner sc = new Scanner(System.in);
    /**
     * Obtner un número mayor o igual que cero
     * @param mensage tipo etiqueta 
     * @return el número mayor o igual que cero
     */
    public static int getNumeroPositivo(String mensage) {
        int numero = 0;
        
        boolean bandera = true;
        do {
             try {
                System.out.print(mensage);
            numero = Integer.parseInt(sc.nextLine());
            if (numero<=0) 
            System.out.println("Ingrese un número positivo ");
            else
                bandera=false;
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número válido ");
        }
        } while (bandera==true);
        return numero;
        
    }
    /**
     * Obetner un texto tipo String
     * @param mensage Indicaciones impresas para el usuario
     * @return Variable String a retornar
     */
    public static String getTextoString(String mensage) {
        String texto = "";
        System.out.print(mensage);
        texto=sc.nextLine();
        return texto;
    }
    /**
     * Obtener una vocal mediante el texto ingresado por el usuario
     * @param mensage Indicaciones impresas para el usuario
     * @return Variable String a retornar
     */
    public static String getVocalString(String mensage) {
        String vocal = "";
        boolean bandera = true;
        do {
            System.out.print(mensage);
             vocal=sc.nextLine();
             if((vocal.charAt(0)==97)||(vocal.charAt(0)==101)||(vocal.charAt(0)==105)||(vocal.charAt(0)==111)||(vocal.charAt(0)==117))
             bandera=false;
        } while (bandera==true);
        return vocal;
    }
    /**
     * Obtener únicamente letras mediante el texto ingresado por el usuario
     * @param mensage Indicaciones impresas para el usuario
     * @return Variable String a retornar
     */
    public static String getLetraString(String mensage) {
        String letra = "";
        boolean bandera = true;
        do {
            System.out.print(mensage);
             letra=sc.nextLine();
              if((letra.charAt(0)!=97)&&(letra.charAt(0)!=101)&&(letra.charAt(0)!=105)&&(letra.charAt(0)!=111)&&(letra.charAt(0)!=117)&&(letra.charAt(0)>=97)&&(letra.charAt(0)<=122))
             bandera=false;
        } while (bandera==true);
        return letra;
    }
    /**
     * Limpieza de la terminal
     */
    public static final void ClearTerminal()
    {
        try {
            String operatingSystem = System.getProperty("os.name");     
              
            if(operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    /*
     * Barra de carga mediante animación 
     */
    public static void showloadingBarra(int sizeBarra) throws InterruptedException{
        char[] barra = new char[sizeBarra];
        float pocentaje = (float)100/(float)sizeBarra;
        for(int i = 0; i < sizeBarra; i++)
            barra[i]=' ';

        for(int i = 0; i <= sizeBarra; i++) {
            if(i< (sizeBarra-1))
                barra[i]='#';
            StringBuilder sbBarra = new StringBuilder("").append(barra);
            System.out.print(String.format("\r[%s] %3.0f %%", sbBarra, i*pocentaje));
            Thread.sleep(delay);
        }
        System.out.println("");
    }
    /**
     * Animación de círculo simulando carga 
     */
    public static void ShowLoading() throws InterruptedException {     
        String strCaracter = "\\|/-";  // [ \ | / - | ]
        for (int i = 0; i <= 100; i++) {
            System.out.print(String.format("\r %s %3d %% ",strCaracter.charAt(i % strCaracter.length()),i));
            Thread.sleep(delay);
        }
    }
}
