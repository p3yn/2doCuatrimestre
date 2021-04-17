import java.util.Scanner;
public class VectoresDinamicos{
    public static void main(String[] args) {
        int longitud = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cantos números deseas ingresar?");
        longitud = teclado.nextInt();
        int numeros[] = new int [longitud];
        for (int i = 0; i<numeros.length; i++){
            System.out.println("Ingresa el valor  # "+(i+1));
            numeros[i]=teclado.nextInt();
        }
        for(int i=0; i<numeros.length; i++){
            System.out.print("["+numeros[i]+"]");
        }
        teclado.close();

    }
}