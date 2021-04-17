import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre="";
        int clave=0, antiguedad=0;
        System.out.println("******************************************************");
        System.out.println("*Bienvenido al Sistema Vacacional de Cocacola Company*");
        System.out.println("******************************************************");
        System.out.println("");
        System.out.println("");
        System.out.print("¿Cuál es el nombre del trabajador?: ");
        nombre=teclado.nextLine();
        System.out.println("");
        System.out.println("¿Cuanto tiempo de antigüedad tiene el trabajador?");
        antiguedad=teclado.nextInt();
        System.out.println("¿Cuál es la clave del trabajador?");
        clave=teclado.nextInt();
        if(clave == 1){
            if(antiguedad == 1){
            System.out.println("El trabajador "+nombre+" tiene derecho a 6 días de vacaciones");
            }else if(antiguedad >=2 && antiguedad <6){
                System.out.println("El trabajador "+nombre+" tiene derecho a 14 días de vacaciones");
            }
            else if(antiguedad >= 7){
                System.out.println("El trabajador "+nombre+" tiene derecho a 20 días de vacaciones");
            }    
        }
        else if(clave==2){
            if(antiguedad == 1){
                System.out.println("El trabajador "+nombre+" tiene derecho a 7 días de vacaciones");
                }else if(antiguedad >=2 && antiguedad <6){
                    System.out.println("El trabajador "+nombre+" tiene derecho a 15 días de vacaciones");
                }
                else if(antiguedad >= 7){
                    System.out.println("El trabajador "+nombre+" tiene derecho a 22 días de vacaciones");
                }

        }
        else if(clave==3){
            if(antiguedad == 1){
                System.out.println("El trabajador "+nombre+" tiene derecho a 10 días de vacaciones");
                }else if(antiguedad >=2 && antiguedad <6){
                    System.out.println("El trabajador "+nombre+" tiene derecho a 20 días de vacaciones");
                }
                else if(antiguedad >= 7){
                    System.out.println("El trabajador "+nombre+" tiene derecho a 30 días de vacaciones");
                }

        }
        else {
            System.out.println("Error la clave del depertamento no existe...");
        }
        teclado.close();




    }
    
}
