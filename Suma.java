import java.util.Scanner;
public class Suma {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int numUno=5; 
        int numDos=2; 
        int resultado=0;
        System.out.println("¿Cuál es tu nombre? ");
        nombre = teclado.nextLine();
        System.out.println("Dame el primer valor para tu suma: ");
        numUno = teclado.nextInt();
        System.out.println("Dame el segundo valor para tu suma: ");
        numDos = teclado.nextInt();
        resultado = numUno + numDos;
        System.out.println("Hola, "+nombre+" El resultado de la suma es: " + resultado);
        teclado.close();


    }
}
