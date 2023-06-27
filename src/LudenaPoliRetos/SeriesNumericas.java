package LudenaPoliRetos;

import LudenaUtility.Utility;

public class SeriesNumericas {
    /**
     * Conjunto de métodos que realizan las series numéricas propuestas
     * @param sn Variable que llama a los métodos de SerieNumericas
     */
    public void LudenaSerieNumerica(SeriesNumericas sn) {
        int nroTermino;
        System.out.println("\n Series Numéricas: ");
        nroTermino = Utility.getNumeroPositivo(" - Ingresar nro Terminos para Serie Numérica ");
        //S1:  0 1 1 2 3 5 8 13 ...
        sn.LudenaSerieNumerica01(nroTermino);
        //S2:  1 0 3 0 5 0 7 0 9 ...
        sn.LudenaSerieNumerica02(nroTermino);
        //S3:  0/1  1/3  1/5  2/7  3/9   5/11  8/13  13/15 ...
        sn.LudenaSerieNumerica03(nroTermino);
        //S4:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ...
        sn.LudenaSerieNumerica04(nroTermino);
        //S5:  2  3  5   7  11  13  17  19  23  29  31 ...
        sn.LudenaSerieNumerica05(nroTermino);
        //S6:  1  4   9   16  25  36  49  64 ....
        sn.LudenaSerieNumerica06(nroTermino);
        //S7:  1  4  7  10  13  16  19  22  25  ...
        sn.LudenaSerieNumerica07(nroTermino);
        //S8:  3, 8, 13, 18, 23, 28, 33, 38, ...
        sn.LudenaSerieNumerica08(nroTermino);
        //S9:  2, 4, 8, 16, 32, 64, 128, 256, ...
        sn.LudenaSerieNumerica09(nroTermino);
        //S10: 3, 9, 27, 81, 243, 729, 2187, ...
        sn.LudenaSerieNumerica10(nroTermino);
        //S12: 2  6   12  20  36  42  56  72  ...
        sn.LudenaSerieNumerica12(nroTermino);
    }
    /**
     * S1:  0 1 1 2 3 5 8 13 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica01(int nroTermino) {
        int z = 1, y = 1;
        System.out.println("\t S1:  0 1 1 2 3 5 8 13 ... ");
        System.out.print("\t      ");
        System.out.print("0 "+z+" ");
        for (int i = 2; i < nroTermino; i++) {
            System.out.print(y+" ");
            y = z + y;
            z = y - z;
        }
        System.out.println("\n");
    }
    /**
     * S2: 1 0 3 0 5 0 7 0 9 ...
     * @param nroTermino Termino ingresado por el usuario
     * 
     */
    public void LudenaSerieNumerica02(int nroTermino) {
        System.out.println("\t S2:  1 0 3 0 5 0 7 0 9 ... ");
        System.out.print("\t      ");
           for (int i = 1; i <= nroTermino; i++) {
            if(i%2!=0)
            System.out.print(i);
            else
            System.out.print(" 0 ");
           }
           System.out.println("\n");
    }
   /**
    * S3:  0/1  1/3  1/5  2/7  3/9   5/11  8/13  13/15 ...
    * @param nroTermino Termino ingresado por el usuario
    */
    public void LudenaSerieNumerica03(int nroTermino) {
        int z;
        int y;
           int x = 3;
           z = 1;
           y = 1;
        System.out.println("\t S3:  0/1  1/3  1/5  2/7  3/9  5/11  8/13  13/15 ... ");
        System.out.print("\t      ");
           System.out.print("0/1  "+z+"/"+x+"  ");
            for (int i = 2; i < nroTermino; i++) {
                x = x+2;
                System.out.print(y+"/"+x+"  ");
                y = z + y;
                z = y - z;
                }
        System.out.println("\n");
    }
    /**
     * S4:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica04(int nroTermino) {
        int z;
        int y;
        int x;
        System.out.println("\t S4:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ... ");
        System.out.print("\t      ");
               x = 4;
               z = 1;
               y = 1;
               System.out.print("0/2  "+z+"/"+x+"  ");
                for (int i = 2; i < nroTermino; i++) {
                    x = x+2;
                    System.out.print(y+"/"+x+"  ");
                    y = z + y;
                    z = y - z;
                    }
        System.out.println("\n");
    }
    /**
     * S5:  2  3  5   7  11  13  17  19  23  29  31 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica05(int nroTermino) {
        System.out.println("\t S5:  2  3  5  7  11  13  17  19  23  29  31 ... ");
        System.out.print("\t      ");
           for (int i = 2; i < nroTermino; i++) {
            if((i%2!=0) &&(i%3!=0)&&(i%5!=0)&&(i%7!=0))
                System.out.print(i+"  ");
            else if((i==2)||(i==3)||(i==5)||(i==7))
                System.out.print(i+"  ");
        }
        System.out.println("\n");
    }
    /**
     * S6:  1  4   9   16  25  36  49  64 ....
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica06(int nroTermino) {
        System.out.println("\t S6:  1  4  9  16  25  36  49  64 .... ");
        System.out.print("\t      ");
           for (int i = 1; i < nroTermino; i++) {
            System.out.print((i*i)+"  ");
           }
        System.out.println("\n");
    }
    /**
     * S7: 1 4 7 10 13 16 19 22 25 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica07(int nroTermino) {
        int x=1;
        System.out.println("\t S7:  1  4  7  10  13  16  19  22  25  ... ");
        System.out.print("\t      ");
        for (int i = 1; i <= nroTermino; i++) {
            System.out.print(x + "  ");
                x=x+3;
        }
        System.out.println("\n");
    }
    /**
     * S8: 3 8 13 18 23 28 33 38 ... 
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica08(int nroTermino) {
        int y=3;
        System.out.println("\t S8:  3, 8, 13, 18, 23, 28, 33, 38, ... ");
        System.out.print("\t      ");
        for (int i = 1; i <= nroTermino; i++) {
            System.out.print(y + "  ");
                y=y+5;
        }
        System.out.println("\n");
    }
    /**
     * S9: 2 4 8 16 32 64 128 256 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica09(int nroTermino) {
        int x=2;
        System.out.println("\t S9:  2, 4, 8, 16, 32, 64, 128, 256, ... ");
        System.out.print("\t      ");
        for (int i = 1; i <= nroTermino; i++) {
            System.out.print(x + "  ");
                x=x*2;
        }
        System.out.println("\n");
    }
    /**
     * S10: 3 9 27 81 243 729 2187 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica10(int nroTermino) {
        int y=3;
        System.out.println("\t S10: 3, 9, 27, 81, 243, 729, 2187, ... ");
        System.out.print("\t      ");
        for (int i = 1; i <= nroTermino; i++) {
            System.out.print(y + "  ");
                y=y*3;
        }
        System.out.println("\n");
    }
    /**
     * S12: 2 6 12 20 30 42 56 72 ...
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieNumerica12(int nroTermino) {
        int y=2, n=4;
        System.out.println("\t S12: 2  6  12  20  36  42  56  72  ... ");
        System.out.print("\t      ");
        for (int i = 1; i <= nroTermino; i++) {
            System.out.print(y + "  ");
                y=y+n;
                n=n+2;
        }
        System.out.println("\n");
    }
}
