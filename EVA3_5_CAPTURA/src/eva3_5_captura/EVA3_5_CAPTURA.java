/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_5_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int X;

        do {
            try{
         
        Scanner input = new Scanner(System.in);
                System.out.println("INtruducir valor (entero) de X:");
            X = input.nextInt();
            break;
            }catch(InputMismatchException e){
                System.out.println("no se introdujo valor valido, vuelve a capturar");
              
                        
            }
        } while (true);
        

        System.out.println("valor de x =" + X);
    }

}
