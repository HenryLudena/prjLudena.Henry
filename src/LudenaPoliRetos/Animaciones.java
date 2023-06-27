package LudenaPoliRetos;

import LudenaUtility.Utility;

public class Animaciones {
    private static final int delay = 100; 
    /**
     * Conjunto de métodos aplicados para la realización de animaciones 
     * @param am VAriable que llama a los métodos de la clase Animaciones
     * @throws InterruptedException Variable llamada para el funcionamiento de Thread 
     */
    public void LudenaSerieAnimaciones(Animaciones am) throws InterruptedException {
        System.out.println("\n Serie Animaciones");
        
        //a) Desplazar a la derecha la "o" en la misma linea el numero de espacios queingrese el usuario
        am.LudenaSerieAnimaciones01();
        //e) Desplazar a la Izquierda la "o" en la misma linea el numero de espacios queingrese el usuario
        am.LudenaSerieAnimaciones02();
        //i) usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta100% 
        am.LudenaSerieAnimaciones03();
        //o) Cargar su nombre completo letra a letra en la misma linea 0% hasta 100%considerando la tamaño de su nombre.
        am.LudenaSerieAnimaciones04();
        //u) Desplazar la figura a la derecha 
        am.LudenaSerieAnimaciones05();

    }
    /*
     * a) Desplazar a la derecha la "o" en la misma linea el numero de espacios queingrese el usuario
     */
    public void LudenaSerieAnimaciones01() throws InterruptedException {
        String texto;
        System.out.println("Animación 1");
        texto = Utility.getTextoString("Ingrese los espacios para realizar la animación, no se contara cualquier otro caracter ");
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)==' ')
            x++;
        }
        int z = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(" ");
            }
            System.out.print("o");
            z++;
            Thread.sleep(delay);
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
    }
    /*
     * e) Desplazar a la Izquierda la "o" en la misma linea el numero de espacios queingrese el usuario
     */
     public void LudenaSerieAnimaciones02() throws InterruptedException {
        String texto;
        System.out.println("Animación 2");
        texto = Utility.getTextoString("Ingrese los espacios para realizar la animación, no se contara cualquier otro caracter ");
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)==' ')
            x++;
        }
        int z = x;
        for (int i = 0; i < x; i++) {
            z=z-1;;
            for (int j = z; j >0; j--) {
                System.out.print(" ");
            }
            System.out.print("o");
            
            Thread.sleep(delay);
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
    }
    /*
     * i) usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta100% 
     */
    public void LudenaSerieAnimaciones03() throws InterruptedException {
        System.out.println("Animación 3");
        String strCaracter = "\\|/-"; 
        for (int i = 0; i <= 100; i++) {
            System.out.print(String.format("\r %s %3d %% ",strCaracter.charAt(i % strCaracter.length()),i));
            Thread.sleep(delay);
        }
        System.out.println("\n");
    }
    /*
     * o) Cargar su nombre completo letra a letra en la misma linea 0% hasta 100%considerando la tamaño de su nombre.
     */
    public void LudenaSerieAnimaciones04() throws InterruptedException {
        String texto;
        System.out.println("Animación 4");
        texto = Utility.getTextoString("Ingrese su nombre ");
        char[] barra = texto.toCharArray();
        char[] nombre = new char[texto.length()];
        float pocentaje = (float)100/(float)texto.length();
        int x = 0;
        for(int i = 0; i <= texto.length(); i++) {
            if(i!=texto.length())
            nombre[i]=barra[i];
            String impresion = new String(nombre);
            System.out.print(String.format("\r[%s] %3.0f %%", impresion, i*pocentaje));
            Thread.sleep(delay);
            
        }
        System.out.println("\n");
    }
    /*
     * u) Desplazar la figura a la derecha 
     */
    public void LudenaSerieAnimaciones05() throws InterruptedException {
        String texto;
        System.out.println("Animación 5");
        texto = Utility.getTextoString("Ingrese los espacios para realizar la animación, no se contara cualquier otro caracter ");
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)==' ')
            x++;
        }
        int z = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(" ");
            }
            System.out.println("   \\|||/");
            for (int j = 0; j < z; j++) {
                System.out.print(" ");
            }
            System.out.println("   (> <)");
            for (int j = 0; j < z; j++) {
                System.out.print(" ");
            }
            System.out.println("ooO-(_)-Ooo");
            z++;
            Thread.sleep(delay);
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
    }
}
