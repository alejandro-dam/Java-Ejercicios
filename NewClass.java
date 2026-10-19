package prueba_viernes;
import java.util.Scanner;


public class NewClass {
    
    public static void main (String[]args){
        
        
        Scanner sc = new Scanner(System.in);
        
        
        /* Ejercicio 1
        
        System.out.println("Introduce un número");
        
        int num = sc.nextInt();
        
        while(0 < num) {
            
            num--;
            System.out.println(num + 1);
            
        } */
        
        
        
        /*int suma = 0;
        
        int num1;
        int num2;
      
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
            
        System.out.println("Introduce un número");
        num2 = sc.nextInt();
            
        
        
       while (num1 != 0 || num2 != 0) {
                    
            System.out.println("Introduce un número");
            num1 = sc.nextInt();
            
            System.out.println("Introduce un número");
            num2 = sc.nextInt();
            
            suma = num1 + num2;
            
          
            
        }
        
       System.out.println("La suma es " + suma);*/
        
        /*
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        int cifraCount = 0;
        
        while(0 < num) {
            
            
            int cifra = num % 10;
            
            num = num / 10;
            
            
            
            cifraCount++;
            
          
            
        }
          
        System.out.println("Tiene " + cifraCount + " cifras");*/
        
        
      
        
        System.out.println("Introduce un número");
        
        int num = sc.nextInt();
        int cifra = 0;
        
        while(0 < num){
            
            
            cifra = num % 10;
            num = num / 10;
            
            System.out.println(cifra);
            
            
        }
        
        
        
        
        
        

    }
}
        
        
        
        
  