
package Recursividad;
import java.util.Scanner;
public class Ejercicio3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero: ");
        n = sc.nextInt();
        System.out.print("Binario: ");
        binario(n);
    }

    public static void binario(int n) {
        int valor;
        int bina = 0;
        if (n < 2) {
            System.out.print(n);
           
        } else {
            binario(n / 2);
            valor = n % 2;
            bina=bina+valor;
            System.out.print(bina);
        }
    }
}
