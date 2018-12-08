package vectorsorderbubble;

import java.util.Scanner;

/**
 *
 * @author renzo
 */
public class VectorsOrderBubble {

    public static void main(String[] args) {
        String[] nombres = new String[3];
        int[] edades = new int[3];
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
            nombres[i] = sc.next();
            System.out.println("Ingrese edad: ");
            edades[i] = sc.nextInt();
            System.out.println("------------------");

        }
        //Ordenar de menor a mayor el vector edades
        int aux;
       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - 1; j++) {
               
                if (edades[j] > edades[j + 1]) {
                    aux = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = aux;

                }
            }
        }
        for (Integer valor:edades) {
            System.out.println(valor);
            
        }

    }

}
