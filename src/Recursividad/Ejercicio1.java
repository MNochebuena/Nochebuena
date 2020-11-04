package Recursividad;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner le=new Scanner(System.in);
    int num1, num2;
        System.out.println("Numero1");
        num1=le.nextInt();
        System.out.println("Numero2");
        num2=le.nextInt();
        numeros(num1,num2);
    }
    
    public static void numeros(int x, int y){
        if (x<=y) {
            System.out.print(x + " ");
            numeros(x+1,y);
        }
        
    }
}
