/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene la 
descripción, la cantidad que se requiere y el precio unitario. Si la cantidad 
pedida excede de 50 unidades, se hace un descuento de 15%..
 */

package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        double cantidad;
        double precioUnitario;
        double precioTotal;
        double descuento;
        double porcentaje = 15;
        
        System.out.println("Ingrese la cantidad de unidades a comprar: ");
        cantidad = entrada.nextDouble();
        
        System.out.println("Ingrese el costo por unidad:");
        precioUnitario = entrada.nextDouble();
        
        precioTotal = cantidad * precioUnitario;
        
        if (cantidad > 50) {
        descuento = (porcentaje * precioTotal)/100;
        precioTotal = precioTotal - descuento;
        }
        
        System.out.printf("El costo por unidad es: " + "%.2f\n", precioTotal);
    }
    
}
