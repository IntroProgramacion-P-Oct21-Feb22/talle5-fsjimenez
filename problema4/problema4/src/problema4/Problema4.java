/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* En una hosteria de la ciudad de Loja se hace un descuento del 10% si el 
cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 
20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de 
entrada el número de días y el precio diario de la habitación y luego calcule 
e imprima el subtotal por pagar, el descuento y el total por pagar.
*/

package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       
        int numeroDias;
        double precioDiario;
        double porcentaje_1 = 10;
        double porcentaje_2 = 15;
        double porcentaje_3 = 20;
        double subtotal;
        double descuento;
        double valorTotal;
        
        System.out.println("Ingrese la catidad de días a hospedarse: ");
        numeroDias = entrada.nextInt();
        
        System.out.println("Ingrese el precio diario de la habitación: ");
        precioDiario = entrada.nextDouble();
        
        subtotal = numeroDias * precioDiario;
        
        valorTotal = subtotal; 
        descuento = 0;
        
        if (numeroDias<0) {
         subtotal = 0;
         valorTotal = 0;
        }else{
       
        if (numeroDias <= 5) {
           valorTotal = subtotal; 
           descuento = 0;
        }else{       
            if (numeroDias > 5 && numeroDias <= 10) {
                descuento = (porcentaje_1 * subtotal)/100;
                valorTotal = subtotal - descuento;  
        }else{         
                if (numeroDias > 10 && numeroDias <= 15) {
                    descuento = (porcentaje_2 * subtotal)/100;
                    valorTotal = subtotal - descuento;  
            }else{       
                    if (numeroDias > 15) {
                        descuento = (porcentaje_3 * subtotal)/100;
                        valorTotal = subtotal - descuento;  
        }
                    }
        }
      
        
        System.out.printf("El total a pagar es de: %.2f\n", valorTotal);
        System.out.printf("El subtotal a pagar es de: %.2f\n", subtotal);
        System.out.printf("El descuento es de: %.2f\n", descuento);
        
      }
        
        
    }
}
}    

