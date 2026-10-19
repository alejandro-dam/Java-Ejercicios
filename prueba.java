package prueba_viernes;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
 

        
        System.out.println("Introduce un día (en número)");
        int dia = sc.nextInt();
        
        System.out.println("Introduce el mes (en número)");
        int mes = sc.nextInt();
        
        System.out.println("Introduce el año (en número)");
        int año = sc.nextInt();
 
        
        
         if (año > 2050){
            
            System.out.println("Año fuera del rango permitido");
            return;
            
        }
        
        if (mes > 12 || dia > 31 || año > 2050){
            
            System.out.println("Error la fecha no es correcta");
            return;
        }
        
       
        
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && año >= 2000 && año < 2050) {
            
            System.out.println(dia + "/" + mes + "/" + año);
            
        } else {
            
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && año >= 2000 && año < 2050) {
                
                 System.out.println(dia + "/" + mes + "/" + año);
                
            }
            
            
        } if (mes == 2 && año == 2019) {
            
            System.out.println("Error la fecha no es correcta (febrero no fue bisiesto en el 2019)");
            
        } else {
            
            if (mes == 2 && año == 2020) {
                
                System.out.println("29 de febrero de 2020 (2020 fue bisiesto");
                
            }
            
        }
        
        if (mes == 2 && año == 2000){
            
            System.out.println(dia + "/" + mes + "/" + año);
            return;
        }
           
     
        
      
        
        
        
        
        
    }
}
