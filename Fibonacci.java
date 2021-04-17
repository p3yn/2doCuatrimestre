public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("SErie Fibonaci con ciclo for ");
        int i, a=0, b=1, c;
        for(i=0; i<10; i++){
            if(i<9){
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
            }
            else{
                System.out.println(a);
            }
            
        }
        i=0;
        a=0;
        b=1;
        c=0;
        System.out.println("Serie Fibonaci serie While");
        while(i<10){
            if(i<9){
                System.out.print(a+",");
                c=a+b;
                a=b;
                b=c;
            }
            else{
                System.out.println(a);
            }
            i++;
        }
        i=0;
        a=0;
        b=1;
        c=0;
        System.out.println("Serie Fibonaci serie Do-While");
        
    }
    
}
