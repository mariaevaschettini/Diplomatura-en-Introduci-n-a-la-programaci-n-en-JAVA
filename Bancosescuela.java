
/** Escribir el algoritmo que, a partir de la cantidad de bancos de un aula y la cantidad
de alumnos inscriptos para un curso, permita determinar si alcanzan los bancos
existentes. De no ser así, informar además cuantos bancos sería necesario agregar. El
usuario deberá ingresar por teclado tanto la cantidad de bancos que tiene el aula, como
la cantidad de alumnos inscriptos para el curso. **/

import java.util.Scanner;

public class Bancosescuela {
    public static void main(String args[]) {
     
      int bancosfaltantes;
      int alumnos;
      int bancos;
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        alumnos = entrada.nextInt ();
        System.out.println ("Ingrese la cantidad de bancos disponibles");
        bancos = entrada.nextInt ();

        if (alumnos <= bancos){
            System.out.println ("La cantidad de bancos es suficiente");
         }else {
         bancosfaltantes = alumnos - bancos;
            System.out.println ("Faltan "+bancosfaltantes+" bancos");
         }
     }
}
