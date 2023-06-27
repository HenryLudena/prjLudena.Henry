package LudenaPoliRetos;

import LudenaUtility.Utility;

public class Figuras {
    /**
     * Conjunto de métodos que imprimen las figuras propuestas
     * @param fg Variable que llama a los métodos de la clase Figuras
     */
    public void LudenaSerieFiguras(Figuras fg) {
        int nroTermino;
        System.out.println("\n Series Figuras: ");
        nroTermino = Utility.getNumeroPositivo(" - Ingresar nro de niveles para figuras ");
        
        //Figura 1:
        fg.LudenaSerieFiguras01(nroTermino);
        //Figura 2:
        fg.LudenaSerieFiguras02(nroTermino);
        //Figura 3:
        fg.LudenaSerieFiguras03(nroTermino);
        //Figura 4:
        fg.LudenaSerieFiguras04(nroTermino);
        //Figura 5:
        fg.LudenaSerieFiguras05(nroTermino);
        //Figura 6:
        fg.LudenaSerieFigura06(nroTermino);
        //Figura 7:
        fg.LudenaSerieFiguras07(nroTermino);
        //Figura 8:
        fg.LudenaSerieFiguras08(nroTermino);
        //Figura 9:
        fg.LudenaSerieFiguras09(nroTermino);
        //Figura 10:
        fg.LudenaSerieFiguras10(nroTermino);
        //Figura 11:
        fg.LudenaSerieFiguras11(nroTermino);
        //Figura 12:
        fg.LudenaSerieFiguras12(nroTermino);
        //Figura 13:
        fg.LudenaSerieFiguras13(nroTermino);
        //Figura 14:
        fg.LudenaSerieFiguras14(nroTermino);
        //Figura 15:
        fg.LudenaSerieFiguras15(nroTermino);
        //Figura 16:
        fg.LudenaSerieFiguras16(nroTermino);
        //Figura 17:
        fg.LudenaSerieFiguras17(nroTermino);
        //Figura 18:
        fg.LudenaSerieFiguras18(nroTermino);
        //Figura 19:
        fg.LudenaSerieFiguras19(nroTermino);
    }
    /**
     * Figura 01: Cuadrado
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras01(int nroTermino) {
        System.out.println("Figura 1 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f==1||c==1||f==nroTermino||c==nroTermino) 
                    System.out.print("* ");
                 else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 02: Cuadrado con variación de caracteres
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras02(int nroTermino) {
        System.out.println("Figura 2 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f==1||c==1||f==nroTermino||c==nroTermino){
                    if ((f+c)% 2 != 0) 
                        System.out.print("+ ");
                    else
                        System.out.print("* ");
                }    
                 else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 03: Triangulo Rectangulo
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras03(int nroTermino) {
        System.out.println("Figura 3 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f>=c) 
                    System.out.print("* ");
                 else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 04: Triangulo Rectangulo invertido
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras04(int nroTermino) {
        System.out.println("Figura 4 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if ((f+c)>nroTermino) 
                    System.out.print("* ");
                 else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 05: Triangulo de cabeza
     * @param nroTermino
     */
    public void LudenaSerieFiguras05(int nroTermino) {
        System.out.println("Figura 5 "); 
        int z = nroTermino, x = 1;
        for (int i = 0; i < nroTermino; i++) {
            for (int j = 0; j < x-1; j++) {
                System.out.print(" ");
            }
            for (int j = (z*2)-1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
            x++;
            z--;
        }
    }
    /**
     * Figura 06: Triangulo
     * @param nroTermino
     */
    public void LudenaSerieFigura06(int nroTermino) {
        System.out.println("Figura 6 ");
        int z = 1, x = nroTermino;
        for (int i = 0; i < nroTermino; i++) {
            for (int j = 0; j < x-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (z*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
            x--;
            z++;
        }
    }
    /**
     * Figura 07: Escalera
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras07(int nroTermino) {
        System.out.println("Figura 7 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f==c) 
                    System.out.print("|___");
                 else 
                    System.out.print("    ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 08: Escalera invertida
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras08(int nroTermino) {
        System.out.println("Figura 8 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if ((f+c)==nroTermino+1) 
                    System.out.print("___|");
                 else 
                    System.out.print("    ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 09: Piramide
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras09(int nroTermino) {
        System.out.println("Figura 9 ");
         int z = 0, x = nroTermino;
         for (int i = 0; i < nroTermino; i++) {
            if(i==0){
            for (int j = 0; j < (nroTermino*2)+2; j++) {
                System.out.print(" "); 
            }
            z++;
            System.out.println("_");
            }else{
                for (int j = 0; j < x; j++) {
                    System.out.print("  ");
                }
                    System.out.print("_|");
                for (int j = 0; j < (z*2)-1; j++) {
                    System.out.print(" ");
                }
                    System.out.print("|_");
                    System.out.println();
                    z=z+2;
                    x--;
            }
            
         }
    }
    /**
     * Figura 10: Escalera con variación de + y -
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras10(int nroTermino) {
        System.out.println("Figura 10 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f==c){
                    if (f% 2 != 0) 
                       System.out.print("|_+_"); 
                    else 
                        System.out.print("|_-_");
                } 
                 else 
                    System.out.print("    ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 10: Escalera en aumento
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras11(int nroTermino) {
        System.out.println("Figura 11 "); 
        int x = 0, z = 0, w = 1;
        for (int i = 0; i < nroTermino; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j <= x; j++) {
                System.out.print("_");
            }
            System.out.println();
            x++;
            w++;
            z = z + w;
        }
    }
    /**
     * Figura 12: Triangulo Rectangulo invertido de números del 1 al 9
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras12(int nroTermino) {
        System.out.println("Figura 12 "); 
        int x = 1, z = nroTermino;
        for (int i = 0; i < nroTermino; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(x);
                x++;
                if(x>9)
                x=1;
                
            }
            System.out.println();
            x=1;
            z--;
        }
    }
    /**
     * Figura 13: Triangulo Rectangulo de números del 1 al 9
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras13(int nroTermino) {
        System.out.println("Figura 13 ");
        int x = 1, z = 0;
        for (int i = 0; i < nroTermino; i++) {
            for (int j = 0; j <= z; j++) {
                System.out.print(x);
                x++;
                if(x>9)
                x=1;
                
            }
            System.out.println();
            x=1;
            z++;
        }
    }
    /**
     * Figura 14: Triangulo de Pascal
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras14(int nroTermino) {
        System.out.println("Figura 14 ");
        for (int i = 0; i < nroTermino; i++) {
            int x = 1;
            for (int j = 0; j < nroTermino-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(String.format("%3d ", x));
                x = x*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    /**
     * Figura 15: Triangulo Rectangulo de Pascal
     * @param nroTermino
     */
    public void LudenaSerieFiguras15(int nroTermino) {
        System.out.println("Figura 15 ");
        for (int i = 0; i < nroTermino; i++) {
            int x = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(String.format("%3d ", x));
                x = x*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    /**
     * Figura 16: X con variación de + y -
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras16(int nroTermino) {
        System.out.println("Figura 16 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f==c || (f+c)==nroTermino+1){
                    if (f% 2 != 0) 
                        System.out.print("+ ");
                     else 
                        System.out.print("- ");
                } 
                 else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 17: X con variación de 1 y 0
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras17(int nroTermino) {
        System.out.println("Figura 17 ");  
        for (int f = 1; f <=nroTermino; f++) {
            for (int c = 1; c <=nroTermino; c++) {
                if (f==c || (f+c)==nroTermino+1){
                    if (f% 2 != 0) 
                        System.out.print("1 ");
                     else 
                        System.out.print("0 ");
                } 
                 else 
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Figura 18: Triangulo con suma similar a triangulo de Pascal
     * @param nroTermino Termino ingresado por el usuario
     */
    public void LudenaSerieFiguras18(int nroTermino) {
        System.out.println("Figura 18 ");
         int [][] matriz = new int[nroTermino][nroTermino];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j)
                matriz[i][j]=2;
                else if(j==0)
                matriz[i][j]=1;
            }
         }
         for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if(i>j)
                matriz[i][j]=matriz[i-1][j]+matriz[i-1][j-1];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(j<=i)
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
         }
    }
    /**
     * Figura 19: Triangulo con similar a Pascal con * y + en diagonal principal y en cateto lateral
     * @param nroTermino
     */
    public void LudenaSerieFiguras19(int nroTermino) {
        System.out.println("Figura 19 ");
         int [][] matriz = new int[nroTermino][nroTermino];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j)
                matriz[i][j]=2;
                else if(j==0)
                matriz[i][j]=1;
            }
         }
         for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if(i>j)
                matriz[i][j]=matriz[i-1][j]+matriz[i-1][j-1];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if((j==0)&&(i!=0))
                System.out.print("+ ");
                if((i>j)&&(j!=0))
                System.out.print(matriz[i][j]+" ");
                if(i==j)
                System.out.print("* ");
            }
            System.out.println();
         }
}
}
