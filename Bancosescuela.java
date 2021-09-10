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