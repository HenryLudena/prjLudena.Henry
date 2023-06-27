package LudenaPoliRetos;

import LudenaUtility.Utility;

public class SerieCaracteres {
    /**
     * Conjunto de métodos que realizan las series de caracteres propuestas
     * @param sc Variable que llama a los métodos de SerieCaracteres
     */
    public void LudenaSerieCaracteres(SerieCaracteres sc) {
        int nroTermino;
        System.out.println("\n Series Carácteres: ");
        nroTermino = Utility.getNumeroPositivo(" - Ingresar nro Terminos para Serie Carácteres ");
        
        //S1:  + - + - + - + ...      
        sc.LudenaSerieCaracter01(nroTermino);
        //S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
        sc.LudenaSerieCaracter02(nroTermino);
        //S3:  ++  +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
        sc.LudenaSerieCaracter03(nroTermino);
        //S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
        sc.LudenaSerieCaracter04(nroTermino);
        //S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
        sc.LudenaSerieCaracter05(nroTermino);
        //S6:  a  b   c   d   e   f   g   h   ...
        sc.LudenaSerieCaracter06(nroTermino);
        //S7:  a  +   c   -   e   +   g   -   ...
        sc.LudenaSerieCracateres07(nroTermino);
        //S8:  aa   bbbb  cccccc  dddddddd    ...
        sc.LudenaSerieCaracteres08(nroTermino);
        //S9:  a  bbb  ccccc  ddddddd eeeeeeeee...
        sc.LudenaSerieCaracteres09(nroTermino);
        //S10:  a  b  c  dd  eee  fffff  gggggggg ...
        sc.LudenaSerieCaracteres10(nroTermino);
    }
    /**
     * S1: + - + - + - + ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracter01(int nroTermino) {
        System.out.println("\t S1:  + - + - + - + ... ");
        System.out.print("\t      ");
        for (int i = 1; i <= nroTermino; i++) {
            if (i % 2 != 0) 
                System.out.print("+ ");
                else 
                System.out.print("- ");
        }
        System.out.println("\n");
    }
    /**
     * S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracter02(int nroTermino) {
        System.out.println("\t S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ... ");
        System.out.print("\t      ");
        System.out.print("+ ");
        int z = 1, y = 1;
        for (int i = 0; i < nroTermino-1; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            y = z + y;
            z = y - z;
        }
        System.out.println("\n");
    }
    /**
     * S3:  ++ +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracter03(int nroTermino) {
        System.out.println("\t S3:  ++ +++ +++++ +++++++ +++++++++++ +++++++++++++ ... ");
        System.out.print("\t      ");
        System.out.print("++ ");
        for (int i = 3; i < nroTermino*2; i++) {
            if((i%2!=0) &&(i%3!=0)&&(i%5!=0)&&(i%7!=0)){
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
                System.out.print(" ");
        }else if((i==2)||(i==3)||(i==5)||(i==7)){
                for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
                System.out.print(" ");
        }
            
        }
        System.out.println("\n");
    }
    /**
     * S4: + - * / + - * / + - * / ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracter04(int nroTermino) {
        String signos = "+  -  *  /  ";
        System.out.println("\t S4:  +  -  *  /  +  -  *  /  +  -  *  /  ... ");
        System.out.print("\t      ");
        for (int i = 0; i < nroTermino; i++) {
            System.out.print(signos);
        }
        System.out.println("\n");
    }
    /**
     * S5: \ | / - | \ | / - | \ | / - | ....
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracter05(int nroTermino) {
        String caracteres = "\\  |  /    -   |   ";
        System.out.println("\t S5:  \\  |  /    -   |   \\  |  /    -   |   \\  |  /    -   |  .... ");
        System.out.print("\t      ");
        for (int i = 0; i < nroTermino; i++) {
            System.out.print(caracteres);
        }
        System.out.println("\n");
    }
    /**
     * S6: a b c d e f g h ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracter06(int nroTermino) {
        String abecedario = "abcdefghijkmlopqrstuvwxyz";
        System.out.println("\t S6:  a   b   c   d   e   f   g   h   ... ");
        System.out.print("\t      ");
        for (int i = 0; i < nroTermino; i++) {
            System.out.print(String.format("%s   ",abecedario.charAt(i % abecedario.length())));
        }
        System.out.println("\n");
    }
    /**
     * S7:  a   +   c   -   e   +   g   -   ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCracateres07(int nroTermino) {
        System.out.println("\t S7:  a   +   c   -   e   +   g   -   ... ");
        System.out.print("\t      ");
        int z = 97, x = 0;
        for (int i = 0; i < nroTermino; i++) {
            if(i%2==0){
            if((z>=97)&&(z<=122))
            System.out.print((char)z);
            }else {
                if (x==0) {
                    System.out.print("+");
                    x=1;
                } else {
                    System.out.print("-");
                    x=0;
                }
            }
            System.out.print("   ");
            z++;
            if(z>122)
            z=97;
        }
        System.out.println("\n");
    }
    /**
     * S8:  aa   bbbb  cccccc  dddddddd    ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracteres08(int nroTermino) {
        System.out.println("\t S8:  aa  bbbb  cccccc  dddddddd    ... ");
        System.out.print("\t      ");
        int z = 97, x = 1;
        for (int i = 1; i <= nroTermino; i++) {
            x = i*2;
            for (int j = 0; j < x; j++) {
                System.out.print((char)z);
            }
            System.out.print("  ");
            z++;
            if(z>122)
            z=97;
        }
        System.out.println("\n");
    }
    /**
     * S9:  a  bbb  ccccc  ddddddd eeeeeeeee...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracteres09(int nroTermino) {
        System.out.println("\t S9:  a  bbb  ccccc  ddddddd  eeeeeeeee... ");
        System.out.print("\t      ");
        int z = 97, x = 1;
        for (int i = 1; i <= nroTermino; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print((char)z);
            }
            System.out.print("  ");
            x = x + 2;
            z++;
            if(z>122)
            z=97;
        }
        System.out.println("\n");
    }
    /**
     * S10: a  b  c  dd  eee  fffff  gggggggg ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieCaracteres10(int nroTermino) {
        System.out.println("\t S10: a  b  c  dd  eee  fffff  gggggggg ... ");
        System.out.print("\t      ");
        System.out.print("a  b  ");
        int z = 1, y = 1, w = 99, x = 1;
        for (int i = 0; i < nroTermino-1; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print((char)w);
            }
            System.out.print("  ");
            y = z + y;
            z = y - z;
            w++;
            if(w>122)
            w=97;
        }
        System.out.println("\n");
    }
}
