/*
 * Suma de matrices
 * Nota: Se realiza con numeros generados aleatoriamente!
 * 
 * Resultado de la ejecucion:
 *
 *  [ 3 ][ 2 ][ 2 ]         [ 0 ][ 3 ][ 2 ]         [ 3 ][ 5 ][ 4 ]
 *  [ 3 ][ 2 ][ 0 ]    +    [ 1 ][ 3 ][ 2 ]    =    [ 4 ][ 5 ][ 2 ]
 *  [ 2 ][ 0 ][ 0 ]         [ 2 ][ 3 ][ 3 ]         [ 4 ][ 3 ][ 3 ]
*/

public class SumaMatrices {

     public static void main(String[] args) {
          int[][] matrizUno = new int[3][3];
          int[][] matrizDos = new int[3][3];
          int[][] matrizTres = new int[3][3];
          
          // Llenado de matriz uno
          for (int i = 0; i < matrizUno.length; i++) {
               for (int x = 0; x < matrizUno.length; x++) {
                    matrizUno[i][x] = (int) (Math.random() * 4);
               }
          }
          
          // Llenado de matriz dos
          for (int i = 0; i < matrizDos.length; i++) {
               for (int x = 0; x < matrizDos.length; x++) {
                    matrizDos[i][x] = (int) (Math.random() * 4);
               }
          }
          
          // Llenado de matriz tres
          for (int i = 0; i < matrizTres.length; i++) {
               for (int x = 0; x < matrizTres.length; x++) {
                    matrizTres[i][x] = matrizUno[i][x] + matrizDos[i][x];
               }
          }

          // Imprimir matrices
          for (int i = 0; i < matrizUno.length; i++) {
               for (int x = 0; x < matrizUno.length; x++) {
                    System.out.print("[ " + matrizUno[i][x] + " ]");
               }

               if (i == 1) {
                    System.out.print("    +    ");

               } else {
                    System.out.print("         ");
               }

               for (int x = 0; x < matrizDos.length; x++) {
                    System.out.print("[ " + matrizDos[i][x] + " ]");
               }

               if (i == 1) {
                    System.out.print("    =    ");

               } else {
                    System.out.print("         ");
               }

               for (int x = 0; x < matrizTres.length; x++) {
                    System.out.print("[ " + matrizTres[i][x] + " ]");
               }

               System.out.println("");
          }
     }

}
