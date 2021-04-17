public class Promedio {
    public static void main(String[] args) {
        int mate=5;
        int bio=5;
        int quimica=2;
        int promedio=0;
        promedio = (mate+bio+quimica)/3;
        if(promedio>=6){
            System.out.println("El alumno aprobó "+promedio);
        }
            else{
                System.out.println("El alumno reprobó "+promedio);

            }
        
        
    }
    
}
