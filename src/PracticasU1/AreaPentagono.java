
package PracticasU1;
/**
 *
 * @author Marcos Nochebuena
 * TDA para calcular el area de un Pentagono
 */
public class AreaPentagono {
    double lado=0;
    double apotema=0;
    double perimetro=0;
    
    public AreaPentagono(double l,double a){
        lado=l;
        apotema=a;
    }
    double calcularArea(){
        perimetro=lado*5; 
        return (perimetro*apotema)/2;
    }
}
