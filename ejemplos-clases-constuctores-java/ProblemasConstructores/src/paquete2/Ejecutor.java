package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Hospital ");
        String nombr=leer.next();
        System.out.println("Ingrese la ciudad");
        String ciuda =leer.next();
        System.out.println("Ingrese el numero de doctores");
        int numeroDoctore = leer.nextInt();
        System.out.println("Ingrese el numero de enfermeros");
        int numeroEnfermero = leer.nextInt();
        
        Hospital h2 = new Hospital(nombr, ciuda, numeroDoctore, numeroEnfermero);
        System.out.printf("%s\n", h2);
    }
}
