
package Recursividad;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner le=new Scanner(System.in);
         int num;
         System.out.println("Numero");
         num=le.nextInt();
         int res = sumar(num);
         System.out.println("Resultado: "+res);
    }
    
    public static int sumar(int x){
        int suma = 0;
        if (x>0) {
            suma=x+sumar(x-1);
        }
    return suma;
    }
}
