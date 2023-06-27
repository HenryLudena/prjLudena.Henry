package LudenaPoliRetos;

import LudenaUtility.Utility;
public class CadenaCaracteres {
    /**
     * Conjunto de métodos que imprimen una cadena según lo ingresado por el usuario
     * @param cd Variable que llama a los métodos de la clase CadenaCaracteres
     */
    public void LudenaSerieCadenaCaracteres(CadenaCaracteres cd) {
        System.out.println("\n Series Cadena de Caracteres: ");
        String texto;
        String vocal;
        String letra;
        char caracterAObtener;
        
        //C01)    Pedir una frase y contador las vocales. 
        cd.LudenaSerieCadena01();
        //C02)    Pedir una frase y contador las letras.
        cd.LudenaSerieCadena02();
        //C03)    Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.
        cd.LudenaSerieCadena03();
        //C04)    Pedir una frase y una letra, eliminar la letra ingresada de la frase.
        cd.LudenaSerieCadena04();
        //C05)    Pedir una frase y presentarla invertida con las vocales en mayusculas.
        cd.LudenaSerieCadena05();
        //C06)    Pedir una frase y presentarla invertida con las letras en mayusculas.
        cd.LudenaSerieCadena06();
        //C07)    Pedir una frase y presentarla en mayusculas y sin la J
        cd.LudenaSerieCadena07();
        //C08)    Anagramas de palabras
        cd.LudenaSerieCadena08();
        //C09)   Ingresa una frase y convertir una leta a mayusculas y otra a minisculas
        cd.LudenaSerieCadena09();
    }
    /**
     * C01)    Pedir una frase y contador las vocales.
     */
    public void LudenaSerieCadena01() {
        String texto;
        char caracterAObtener;
        System.out.println("Cadena 1");
        texto = Utility.getTextoString("Ingrese una palabra ");
        texto = texto.toLowerCase();
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            caracterAObtener=texto.charAt(i);
            if((caracterAObtener==97)||(caracterAObtener==101)||(caracterAObtener==105)||(caracterAObtener==111)||(caracterAObtener==117))
            x++;
        }
        System.out.println("Su palabra tiene "+x+" vocales");
        System.out.println("\n");
    }
    /*
     * C02)    Pedir una frase y contador las letras.
     */
    public void LudenaSerieCadena02() {
        String texto;
        char caracterAObtener;
        System.out.println("Cadena 2");
        texto = Utility.getTextoString("Ingrese una palabra ");
        texto = texto.toLowerCase();
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            caracterAObtener=texto.charAt(i);
            if((caracterAObtener!=97)&&(caracterAObtener!=101)&&(caracterAObtener!=105)&&(caracterAObtener!=111)&&(caracterAObtener!=117)&&(caracterAObtener>=97)&&(caracterAObtener<=122))
            x++;
        }
        System.out.println("Su palabra tiene "+x+" letras");
        System.out.println("\n");
    }
    /*
     * C03)    Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.
     */
    public void LudenaSerieCadena03() {
        String texto;
        String vocal;
        char caracterAObtener;
        System.out.println("Cadena 3");
        texto = Utility.getTextoString("Ingrese una palabra ");
        vocal = Utility.getVocalString("Ingrese una vocal a eliminar en la palabra ");
        texto = texto.toLowerCase();
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            caracterAObtener=texto.charAt(i);
            if(caracterAObtener==vocal.charAt(0))
            caracterAObtener=' ';
            System.out.print(caracterAObtener);
        }
        System.out.println("\n");
    }
    /*
     * C04)    Pedir una frase y una letra, eliminar la letra ingresada de la frase.
     */
    public void LudenaSerieCadena04() {
        String texto;
        String letra;
        char caracterAObtener;
        System.out.println("Cadena 4");
        texto = Utility.getTextoString("Ingrese una palabra ");
        letra = Utility.getLetraString("Ingrese una letra a eliminar en la palabra ");
        texto = texto.toLowerCase();
        int x = 0;
        for (int i = 0; i < texto.length(); i++) {
            caracterAObtener=texto.charAt(i);
            if(caracterAObtener==letra.charAt(0))
            caracterAObtener=' ';
            System.out.print(caracterAObtener);
            
        }
        System.out.println("\n");
    }
    /*
     * C05)    Pedir una frase y presentarla inverida con las vocales en mayusculas
     */
    public void LudenaSerieCadena05() {
        String texto;
        char caracterAObtener;
        System.out.println("Cadena 5");
        texto = Utility.getTextoString("Ingrese una palabra ");
        texto = texto.toLowerCase();
        int x = 0;
        for (int i = texto.length()-1; i >=0; i--) {
            caracterAObtener=texto.charAt(i);
            if((caracterAObtener==97)||(caracterAObtener==101)||(caracterAObtener==105)||(caracterAObtener==111)||(caracterAObtener==117))
            caracterAObtener=texto.toUpperCase().charAt(i);
            System.out.print(caracterAObtener);
        }
        System.out.println("\n");
    }
    /*
     * C06)    Pedir una frase y presentarla invertida con las letras en mayusculas
     */
    public void LudenaSerieCadena06() {
        String texto;
        char caracterAObtener;
        System.out.println("Cadena 6");
        texto = Utility.getTextoString("Ingrese una palabra ");
        texto = texto.toLowerCase();
        int x = 0;
        for (int i = texto.length()-1; i >=0; i--) {
            caracterAObtener=texto.charAt(i);
            if((caracterAObtener!=97)&&(caracterAObtener!=101)&&(caracterAObtener!=105)&&(caracterAObtener!=111)&&(caracterAObtener!=117)&&(caracterAObtener>=97)&&(caracterAObtener<=122))
            caracterAObtener=texto.toUpperCase().charAt(i);
            System.out.print(caracterAObtener);
        }
        System.out.println("\n");
    }
    /*
     * C07)    Pedir una frase y presentarla en mayusculas y sin la J
     */
    public void LudenaSerieCadena07() {
        String texto;
        char caracterAObtener;
        System.out.println("Cadena 7");
        texto = Utility.getTextoString("Ingrese una palabra ");
        texto = texto.toUpperCase();
        int x = 0;
        for (int i = 0; i <texto.length(); i++) {
            caracterAObtener=texto.charAt(i);
            if(caracterAObtener!=74)
            System.out.print(caracterAObtener);
        }
        System.out.println("\n");
    }
    /*
     * C08)    Anagramas de palabras
     */
    public void LudenaSerieCadena08() {
        String texto;
        System.out.println("Cadena 8");
        String[] anagrama = {"delira", "Ballena", "Alondra", "España", "Enrique"};
        String[] solucion = {"lidera", "llenaba", "ladrona", "apañes", "quieren"};
        int numeroAnagrama = (int) (Math.random()*5);
        boolean bandera = true;
        int x = 1;
        do {
            texto = Utility.getTextoString("Ingrese el anagrama de "+anagrama[numeroAnagrama]+" ");
            if (texto.toLowerCase().equals(solucion[numeroAnagrama])) {
                System.out.println("Respuesta correcta");
                bandera=false;
            }else if((x>=3)){
            System.out.println("Intentos acabados, la respuesta era "+solucion[numeroAnagrama]);
            bandera=false;
            }else
            System.out.println("Respuesta incorrecta"); 
            x++;
        } while (bandera==true);
        System.out.println("\n");
    }
    /*
     * C09)   Ingresa una frase y convertir una leta a mayusculas y otra a minisculas
     */
     public void LudenaSerieCadena09() {
        String texto;
        System.out.println("Cadena 9");
        texto = Utility.getTextoString("Ingrese una frase ");
        String newTexto = texto.toLowerCase().replaceAll(" ", "");
        char[] arregloChar = newTexto.toCharArray();
        char[] textoImprimir = texto.toLowerCase().toCharArray();
        for (int i = 0; i < newTexto.length(); i++) {
            if(i%2==0)
            arregloChar[i]=newTexto.toUpperCase().charAt(i);
        }
        String charTexto = new String(arregloChar);
        for (int i = 0; i < textoImprimir.length; i++) {
            for (int j = 0; j < charTexto.length(); j++) {
            if(textoImprimir[i]==charTexto.toLowerCase().charAt(j))
            textoImprimir[i]=charTexto.charAt(j);
        }
        }
        String impresion = new String(textoImprimir);
        System.out.println(impresion);
    }
}
