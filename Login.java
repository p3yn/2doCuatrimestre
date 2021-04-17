
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
    
        String usuario="";
        String password="";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        usuario = teclado.nextLine();
        System.out.print("Ingresa tu contraeseña: ");
        password = teclado.nextLine();

        if (usuario.equals("Ivan")&& password.equals("123456")){
         System.out.println("Inicio de sesión correcto.");
        }
        else {
            System.out.println("Usuario/contraseña incorrectos.");
        }
        teclado.close();
    }
}