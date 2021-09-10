/** Diseñar un algoritmo que permita aplicar un descuento del 10% al monto total de
una compra si la forma de pago empleada es de contado. El usuario deberá ingresar el
monto de la compra realizada y la forma de pago utilizada. Si es contado, deberá aplicar
el descuento, sino se deberá mostrar un mensaje informando que para dicha forma de
pago no tiene descuento. **/

import java.util.Scanner;

public class Descuentocontado {
    public static void main(String args[]) {
     
      double montocompra;
      String formapago;
      double pagofinal;
     
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto a pagar");
        montocompra = entrada.nextFloat ();
        System.out.println ("Ingrese la forma de pago");
        formapago = entrada.next();

        if (formapago.equals("contado")){
            pagofinal = montocompra - (montocompra*0.1);
            System.out.println ("El monto a abonar es de $"+pagofinal);
         }else {
            System.out.println ("La forma de pago seleccionada no presenta descuento");
         }
     }
}