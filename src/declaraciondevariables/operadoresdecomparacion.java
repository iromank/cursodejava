
package declaraciondevariables;

import java.util.Scanner;

public class operadoresdecomparacion {
    public static void main(String[] args) {
         Scanner i=new Scanner(System.in);
         System.err.println("ingrese nota1");
         // suma de dos numeros
         int nota1=i.nextInt();
         System.err.println("ingrese nota2");
         int nota2=i.nextInt();
          System.err.println("ingrese nota3");
         int nota3=i.nextInt();
        int promedio=(nota1+nota2+nota3)/3;
        //mayor o =
        if(promedio>=13){
            System.err.println("aprobado");
        }else{
            System.err.println("desaprobado");
        }
         // menor
         if(promedio<12){
              System.err.println("desaprobado");
        }else{
             System.err.println("aprobado");
          
        }
    
    }
   
}
