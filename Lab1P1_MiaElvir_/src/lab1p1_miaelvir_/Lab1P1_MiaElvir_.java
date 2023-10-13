
package lab1p1_miaelvir_;

import java.util.Scanner; 

public class Lab1P1_MiaElvir_ {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        
        
        int numero = 0; 
        char character = 'a'; 
        double doble = 1.25; 
        boolean VoF = true; 
        System.out.println("Elija el ejercicio: ");
        numero = input.nextInt(); 
        
        
        if (numero==1){
            int num1 = 15; 
            int num2 = 30; 
            int resultado; 
            resultado = 15*30; 
            System.out.print("Resultado: ");
            System.out.println(resultado);
            
         }else if (numero==2){
             System.out.println("Ingrese un numero entero: ");
             int numeroUsuario = input.nextInt(); 
             System.out.println("Ingrese un numero entero: ");
             int numeroUsuario2 = input.nextInt(); 
             System.out.println("Ingrese un numero entero: ");
             int numeroUsuario3 = input.nextInt(); 
             
             double promedio = (numeroUsuario+numeroUsuario2+numeroUsuario3)/3; 
             
             System.out.println("Promedio: "+promedio);
             
         
        }else{
             System.out.println("Salio del programa.");
            
        
        }
        
       
    }
    
}
