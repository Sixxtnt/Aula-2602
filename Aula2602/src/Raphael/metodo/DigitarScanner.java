package Raphael.metodo;

import java.util.Scanner;
import javax.print.DocFlavor;

public class DigitarScanner {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
   
    System.out.println("Digite o primeiro valor");
    int valor1 = x.nextInt();
    
    System.out.println("Digite o Segundo valor");
    int valor2 = x.nextInt();
    
        System.out.println("Qual tipo de Operação vc quer fazer? (+) (-) (*) (/) ");
        String operador = x.next();
    
        
  
        if ("+".equals(operador)){
         int resultado = valor1 + valor2;
            System.out.println("O resultado da operação foi: "+ resultado);
            
        }else if("-" .equals (operador)){
            int resultado = valor1 - valor2;
            System.out.println("O resultado da operação foi: "+ resultado);
        }else if ("*" .equals (operador)){
            int resultado = valor1 * valor2;
            System.out.println("O resultado da operação foi: "+ resultado);
        }else if ("/" .equals (operador)){
            int resultado = valor1 / valor2;
            System.out.println("O resultado da operação foi: "+ resultado);
            
        }
           
            
        
        
    }
    
}
