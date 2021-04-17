public class CiclosDos {
    public static void main(String[] args) {
        int i=1, j=99;
        System.out.println("Serie con ciclo for: ");
        for(i=1; i<=5; i++){
            if (i<5){
                System.out.print(i+",");
                System.out.print(j+",");
            }
            else{
                System.out.print(i+",");
                System.out.print(j);
            }
            j--;
        }
        System.out.println("");
        System.out.println("");
        i=1; j=99;
        System.out.println("Serie con ciclo While: ");
        while(i<=5){
            if (i<5){
                System.out.print(i+",");
                System.out.print(j+",");
            }
            else{
                System.out.print(i+",");
                System.out.print(j);
            }
            j--;
            i++;
        }
        System.out.println("");
        System.out.println("");
        i=1; j=99;    
        System.out.println("Serie con ciclo DO-While: ");
        do{
            if (i<5){
                System.out.print(i+",");
                System.out.print(j+",");
            }
            else{
                System.out.print(i+",");
                System.out.print(j);
            }
            j--;
            i++;
        }
    
        while (i<=5);        
    }
    
}
