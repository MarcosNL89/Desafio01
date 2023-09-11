import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        /* Crear un método main que permita mostrar la parte entera y separado la parte decimal de un tipo de dato Float*/

        Scanner numero = new Scanner(System.in);

        //Pido que se digite un número
        System.out.println("Digite un número con decimales: ");
        //Declaro el tipo de dato que voy a usar
        float numeroDecimal;
        // Se guardan los datos ingresados con el Scanner número pedido al usuario, en numeroDecimal.
        numeroDecimal = numero.nextFloat();

        int parteEntero = (int)numeroDecimal; // se toma el float y lo convierte a entero. Al ser entero deja fuera todos los números después de la coma.
        float parteDecimal;
        parteDecimal = numeroDecimal - parteEntero; // Al declarar el entero sin decimal, resto para que queden los decimales solos cuando solicite la info.

        System.out.println("La parte entera del número ingresado es: " + parteEntero);
        System.out.println("La parte decimal del número ingresado es: " + parteDecimal);


    }
}
