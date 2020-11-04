
package PracticasU1;
import java.util.Scanner;
/**
 *
 * @author Marcos Nochebuena
 */
public class Datos {
    public static void main(String[] args) {
        double ld=0;
        double ap=0;
        Scanner le=new Scanner(System.in);
        System.out.println("Introduce el valor de un lado: ");
        ld=le.nextDouble();
        System.out.println("Introduce el valor del apotema: ");
        ap=le.nextDouble();
        AreaPentagono ar= new AreaPentagono(ld,ap);
        double area=ar.calcularArea();
        System.out.println("El area es: "+area);
    }
}
