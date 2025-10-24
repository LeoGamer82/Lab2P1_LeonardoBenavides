/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_leonardobenavides;
import java.util.Scanner;
/**
 *
 * @author benav
 */
public class Lab2P1_LeonardoBenavides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    char continuar = 's';
    while (continuar == 's'|| continuar == 'S'){
        System.out.println(" MENU ");
        System.out.println(" 1. Hola Mundo ");
        System.out.println(" 2. Protege tu Nota ");
        System.out.println(" 3. Sumatoria de cuadrados ");
        System.out.println(" Eliga una opcion: ");
        int opcion = leer.nextInt();
        if (opcion == 1){
            System.out.println(" Ingrese un numero mayor que 1 y menor que 100: ");
            int numero = leer.nextInt();
            if (numero>=1 && numero<100){
                int contador = 0;
                while (contador<numero){
                   
                    
                    contador = contador + 1;
                    if (contador%3==0 && contador%5==0){
                        System.out.println("HolaMundo");
                    }
                    else
                        if(contador%3==0){
                            System.out.println("Hola");
                        }
                    else
                       if(contador%5==0 ) {
                           System.out.println("Mundo");
                       }
                        else{
                           System.out.println(contador);
                       }
                }
                
                    
               }
               
            
                    
                
            }// fin opcion 1
            else
                if(opcion == 2){
                   int contador_turnos = 5;
                   int presa_vidas = 3;
                   while (contador_turnos>0&&presa_vidas>0){
                       System.out.println("Intentos restantes " + contador_turnos);
                       System.out.println("PRESA");
                       System.out.println("Elige un lugar en el que esconderte");
                       System.out.println("1. - Tu cuarto");
                       System.out.println("2. - La cocina");
                       System.out.println("3. - El bano ");
                       
                       int opcion_presa = leer.nextInt();
                       
                       System.out.println("EL CAZADOR");
                       System.out.println("1. - El cuarto");
                       System.out.println("2. - La cocina ");
                       System.out.println("3. - El bano"); 
                       
                       int opcion_cazador = leer.nextInt();
                       if (opcion_presa>0&&opcion_presa<4&&opcion_cazador>0&&opcion_cazador<4){
                            if (opcion_presa == opcion_cazador){
                                System.out.println("HAS SIDO ENCONTRADO!!");
                                contador_turnos = contador_turnos - 1;
                                presa_vidas = presa_vidas - 1;
                       }    else{
                                System.out.println("EL CAZADOR NO PUDO ENCONTRARTE");
                                contador_turnos = contador_turnos - 1;
                            
                       }
                        }else{
                           System.out.println("Opcion Invalida. Intente de nuevo");
                       }
                           
                           
                       
                               
                       

                        
                                 
                                          
                           
                           
                       
                               
                              
                       
                       
                   }
                   if (presa_vidas == 0){
                       System.out.println("EL CAZADOR GANA");
                   }
                   else{
                       System.out.println("LA PRESA GANA ");
                   }
                    
                }// fin opcion 2
                else
                    if(opcion == 3){
                        System.out.println("Ingrese un numero mayor que 0: ");
                        int numeros = leer.nextInt();
                        if (numeros>0){
                         int contador_cuadrados = 1;
                         int acum = 0;
                         int total = 0;
                         while (contador_cuadrados<=numeros){
                                total = (contador_cuadrados * contador_cuadrados);
                              
                                acum = acum + total;
                                contador_cuadrados = contador_cuadrados + 1;
                               
                             
                         }
                          System.out.println(acum);
                        }
                        
                    }
                        
            
        System.out.println("Desea continuar? S/N");
        continuar = leer.next().charAt(0);}// fin del menu
    }// fin de clase
       
        
        
        
        
    }// fin del main
    

