/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;
import java.util.Scanner;
/**
 *
 * @author elkin
 */
public class Cruz_Elkin_Exam1 {
    public static void main(String[] args) {
        
   Scanner lea= new Scanner(System.in);
    while(true){
        System.out.println("------MENU-------"); 
        System.out.println("1. Piramide");
        System.out.println("2. Clave");
        System.out.println("3. Piedra Papel o Tijera");
        System.out.println("4. Adivinar");
        System.out.println("5. Salir");
        System.out.print("Ingrese opcion: ");
        int opcion= lea.nextInt();
    
   
        switch(opcion){
    
       case 1 ->{
           System.out.print("Ingrese cantidad de fila de piramide:");
           int fila= lea.nextInt();
         int i=1;
         int num=1;
         int j=0;
         int suma=0;
         while(i<=fila){
           j=0;
            suma=0; 
           while(j<i){
             if(num%2!=0){   
             suma += num;
                 System.out.print(num+" ");
                  j++;
             
             } 
         
         num++;
        
          }
             System.out.println(" = "+suma);
           System.out.print("");
             i++;
         }
       
       }
       case 2 ->{
       
       }
       case 3 ->{
       
       }
       case 4 ->{
       
       }
       case 5 ->{
       
       }
      
   }
    break;
    } 
    }
   
}
