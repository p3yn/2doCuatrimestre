import java.util.Scanner;

public class MatricesDinamicas{
    public static void main(String[] args){
        int filas=0, columnas=0, contador=1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas filas deseas?");
        filas = teclado.nextInt();
        System.out.println("¿Cuántas columnas deseas?");
        columnas = teclado.nextInt();

        int numeros [][] = new int [filas][columnas];
        for(int j=0; j<filas; j++){
            for(int i=0; i<columnas; i++){
                numeros[j][i]=contador;
                contador++;
                System.out.print("["+numeros[j][i]+"]");
            }
            System.out.println("");
        }
        
    }
}
