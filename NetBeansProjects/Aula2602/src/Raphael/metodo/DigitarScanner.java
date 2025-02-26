package Raphael.metodo;

import java.util.Scanner;

public class DigitarScanner {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
   
    System.out.println("Digite o primeiro valor");
    int valor1 = x.nextInt();
    
    System.out.println("Digite o Segundo valor");
    int valor2 = x.nextInt();
    
    int resultado = valor1 + valor2;
    
        System.out.println("O valor da soma é: "+ resultado);
    }
    
}
