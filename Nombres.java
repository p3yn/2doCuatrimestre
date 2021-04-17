import java.util.Scanner;

public class Nombres{
    public static void main(String[] args) {

        String nombre1="";
        String nombre2="";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer nombre: ");
        nombre1 = teclado.nextLine();

        System.out.print("Ingresa el segundo nombre: ");
        nombre2 = teclado.nextLine();

        if(nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Los nombres son iguales.");
        }
        else{
            System.out.println("Los nombres son diferentes.");
        }
        teclado.close();
        
    }
}