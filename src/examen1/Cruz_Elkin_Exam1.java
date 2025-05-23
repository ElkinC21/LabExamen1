/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elkin
 */
public class Cruz_Elkin_Exam1 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner lea = new Scanner(System.in);
        while (true) {
            System.out.println("------MENU-------");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Piedra Papel o Tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir");
            System.out.print("Ingrese opcion: ");
            int opcion = lea.nextInt();
            lea.nextLine();
            switch (opcion) {

                case 1 -> {
                    System.out.print("Ingrese cantidad de fila de piramide:");
                    int fila = lea.nextInt();
                    int i = 1;
                    int num = 1;
                    int j = 0;
                    int suma = 0;
                    while (i <= fila) {
                        j = 0;
                        suma = 0;
                        while (j < i) {
                            if (num % 2 != 0) {
                                suma += num;
                                System.out.print(num + " ");
                                j++;

                            }

                            num++;

                        }
                        System.out.println(" = " + suma);
                        System.out.print("");
                        i++;
                    }

                }
                case 2 -> {
                    System.out.println("------CLAVE------");
                    System.out.println("Ingrese texto");
                    String texto=lea.nextLine();
                  
                    
                     
                     
                    
                    
                    
                }
                case 3 -> {

                    boolean salir = true;
                    boolean ganar = true;
                    boolean empate = false;
                    String mensaje = "";

                    while (true) {
                        int num = random.nextInt(3) + 1;
                        String eleccioncpu = "";

                        String eleccion = " ";
                        if (num == 2) {
                            eleccioncpu = "PAPEL";
                        }
                        if (num == 1) {
                            eleccioncpu = "PIEDRA";
                        }
                        if (num == 3) {
                            eleccioncpu = "TIJERA";
                        }

                        System.out.println("--------BIENVENIDO--------");
                        System.out.println("");
                        while (true) {
                            System.out.println("Papel   Piedra   Tijera");
                            System.out.println("");
                            System.out.print("Ingrese eleccion: ");

                            eleccion = lea.nextLine();
                            eleccion = eleccion.toUpperCase();
                            System.out.println("");
                            if (eleccion.equals("PAPEL") || eleccion.equals("PIEDRA") || eleccion.equals("TIJERA")) {
                                break;
                            } else {
                                System.out.println("Porfavor ingrese una opcion valida");
                                System.out.println("");
                            }

                        }

                        if (eleccion.equals("PIEDRA") && eleccioncpu.equals("PAPEL")) {
                            ganar = false;
                        } else if (eleccion.equals("PAPEL") && eleccioncpu.equals("TIJERA")) {
                            ganar = false;
                        } else if (eleccion.equals(eleccioncpu)) {

                            empate = true;
                            mensaje = "EMPATE!!!!";
                        }
                        System.out.println("Eleccion de la computadora: " + eleccioncpu);
                        System.out.println("");
                        if (!empate) {

                            if (ganar) {
                                mensaje = "GANADOR: USUARIO\n "
                                        + "FELICIDADES!!!!!";
                            } else {
                                mensaje = "GANADOR: COMPUTADORA\n"
                                        + "HAS PERDIDO :(";
                            }

                        }

                        System.out.println(mensaje);
                        System.out.println("");
                        System.out.print("Desea volver a jugar?: ");
                        String pregunta = lea.nextLine();

                        pregunta = pregunta.toUpperCase();
                        if (pregunta.equals("NO")) {
                            break;
                        }

                    }
                }
                case 4 -> {

                    System.out.println("-----ADIVINA EL NUMERO-------");
                    int num = random.nextInt(100) + 1;
                    int intentos = 10;
                    
                    boolean ganar = true;
                    String mensaje="";
                    while (true) {

                        System.out.print("Ingrese numero: ");
                        int numusuario = lea.nextInt();
                        System.out.println("");
                        if (num == numusuario) {

                            break;
                        } else {
                            intentos -= 1;
                            System.out.println("FALLASTE");
                            
                            if (numusuario > num) {
                                System.out.println("El numero a adivinar es menor que el ingresado");
                            } else if (numusuario < num) {
                                System.out.println("El numero a adivinar es mayor que el ingresado");

                            }
                        System.out.println("TE QUEDAN " + intentos + " INTENTOS");
                            System.out.println("");
                        }
                        if (intentos == 0) {
                            ganar = false;
                            break;
                        }
                    }
                       if(ganar){
                       mensaje="FELICIDADES HAS GANADO!!!!!\n"
                               + "Lo lograstes en: "+(10-intentos)+" Intentos";
                       }else{
                       mensaje="HAS PERDIDO\n"
                               + "El numero a adivinar era: "+num;
                       }
                    System.out.println(mensaje);
                continue;
                }
                
                case 5 -> {
                    System.out.println("Cerrando programa");
                }

            }
            break;
        }
    }

}
