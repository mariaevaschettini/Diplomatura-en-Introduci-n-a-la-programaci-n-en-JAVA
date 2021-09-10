/** Diseñar un algoritmo que devuelva el nombre de la semana, a partir de un número
ingresado por el usuario **/

import java.util.Scanner;

public class Diasdelasemana {
    public static void main(String args[]) {
     
      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese un numero del 1 al 7:");
      int numero = entrada.nextInt();
      
      switch(numero){
          case 1: System.out.println("El dia ingresado es Lunes");
          break;
          case 2: System.out.println("El dia ingresado es Martes");
          break;
          case 3: System.out.println("El dia ingresado es Miercoles");
          break;
          case 4: System.out.println("El dia ingresado es Jueves");
          break;
          case 5: System.out.println("El dia ingresado es Viernes");
          break;
          case 6: System.out.println("El dia ingresado es Sabado");
          break;
          case 7: System.out.println("El dia ingresado es Domingo");
          break;
      }
    }
}