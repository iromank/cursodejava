
package declaraciondevariables;

import java.util.Scanner;

public class operadoresaritneticos {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
         System.err.println("ingrese un numero1");
         // suma de dos numeros
         int numero1=i.nextInt();
         System.err.println("ingrese un numero2");
         int numero2=i.nextInt();
         
         int suma=numero1+numero2;
         int resta=numero1-numero2;
         int divicion=numero1/numero2;
         int multiplicacion=numero1*numero2;
         
         System.err.println("la suma es "+suma);
         System.err.println("la resta es "+resta);
         System.err.println("la multilicacion es "+multiplicacion);
         System.err.println("la divicion es "+divicion);
          
    }
}
