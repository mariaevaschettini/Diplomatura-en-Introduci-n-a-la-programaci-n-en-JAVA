/** Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del
número que ingrese el usuario. Para definir hasta que numero desea que muestre la
tabla de multiplicación el usuario también deberá ingresar este valor. La tabla de
multiplicación a mostrar debe empezar en la multiplicación por 1.
x **/

import java.util.Scanner;

public class Tablademultiplicar {
    public static void main(String args[]) {
      int tablamultiplicar;
      int contador  = 1;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese un numero del que desee conocer su tabla de multiplicar:");
      int numero = entrada.nextInt();
      System.out.println("Ingrese un numero hasta el que desee que se muestre la tabla de multiplicar");
      int numerofinal = entrada.nextInt();
      
      while(contador <= numerofinal){
         tablamultiplicar = numero * contador;
         System.out.println(numero+"*"+contador+"="+tablamultiplicar);
         contador++;
      }
    }
}