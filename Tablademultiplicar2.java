/** Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del
número que ingrese el usuario. Para definir hasta que numero desea que muestre la
tabla de multiplicación el usuario también deberá ingresar este valor. La tabla de
multiplicación a mostrar debe empezar en la multiplicación por 1. Se le preguntara al
usuario si desea imprimir otra tabla y se terminara cuando ingrese un “no”.**/

import java.util.Scanner;

public class Tablademultiplicar2 {
    public static void main(String args[]) {
      int tablamultiplicar;
      int contador;
      String nuevatabla;
      Scanner entrada = new Scanner(System.in);
      do{
      contador = 1; 
      System.out.println("Ingrese un numero del que desee conocer su tabla de multiplicar:");
      int numero = entrada.nextInt();
      System.out.println("Ingrese un numero hasta el que desee que se muestre la tabla de multiplicar:");
      int numerofinal = entrada.nextInt();
        do{
         tablamultiplicar = numero * contador;
         System.out.println(numero+"*"+contador+"="+tablamultiplicar);
         contador++;
        } while(contador <= numerofinal);
         System.out.println("¿Desea imprimir otra tabla? Responder Si o No");
         nuevatabla = entrada.next();
        }while(nuevatabla.equals("Si"));
      }  
    }
    
