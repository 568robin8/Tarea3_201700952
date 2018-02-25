/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201700952;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author PC
 */
public class IPC1Tarea3_201700952 {

   
    
    public static void main(String[] args) {   
        Scanner leer = new Scanner(System.in);
        int respuesta;
        int numero1=0;
        int a;
        int b;
        
        do{
        System.out.println("MENU PRINCIPAL");
        System.out.println("1] Usuarios");
        System.out.println("2] Contador de dígitos");
        System.out.println("3] Tres numero de mayor a menor");
        System.out.println("4] Salir\n");
        
        System.out.println("INGRESE UNA OPCION\n");
        respuesta = leer.nextInt();

        try{
            
            switch(respuesta){ 
                case 1:
                    do{
                        System.out.println("USUARIOS");
                        System.out.println("1] Ingresar Usuarios");
                        System.out.println("2] Mostrar usuarios ascendente");
                        System.out.println("3] Mostrar usuarios descendente");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        
                        respuesta = leer.nextInt();
                        //System.out.println("\n");
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Ingrese su usuario\n");
                                    break;
                                case 2:
                                    System.out.println("Usuarios en forma ascendente\n");
                                    break;
                                case 3:
                                    System.out.println("Usuarios en forma descendente\n");
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta\n");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    break;
                case 2:
                    do{
                        System.out.println("CONTADOR DE DIGITOS");
                        System.out.println("1] Ingresar numero");
                        System.out.println("2] Mostrar numero de digitos");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        
                        respuesta = leer.nextInt();
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                //Cuando el usuario ingresa en "case 1" ingresa un numero el cual
                                //va a contar los digitos que dicho numero tiene.
                                case 1:
                                    System.out.println("Ingres un numero\n");
                                    numero1 = leer.nextInt();
                                    break;
                                //Pero cuando regresa al menu y el usuario entra en "case 2"
                                //el valor que ingreso el usuario se pierde, y "numero 1" no me lo reconoce.
                                case 2:
                                    System.out.println("Mostrar el número de "
                                            + "digitos del numero ingresado\n");
                                    System.out.println("EL NUMERO " + numero1 + " tiene " 
                                            + Integer.toString(numero1).length()+" digitos\n ");
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta\n");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    break;
                case 3:
                    do{
                        System.out.println("TRES NUMEROS DE MAYOR A MENOR");
                        System.out.println("1] Ingresar numeros");
                        System.out.println("2] Mostrar ordenados");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        
                        respuesta = leer.nextInt();
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Ingres los numeros\n");
                                    break;
                                case 2:
                                    System.out.println("Mostrar en orden los números\n");
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta\n");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    
                    break;
                case 4:
                    do{
                        System.out.println("PROMEDIO DE NOTAS(4 NOTAS 6 ESTUDIANTES)");
                        System.out.println("1] Ingresar NOTAS");
                        System.out.println("0] Menu principal\n");
                        System.out.println("Ingrese una opcion\n");
                        
                        respuesta = leer.nextInt();
                        try{
                            switch(respuesta){
                                case 0:
                                    break;
                                case 1:
                                    System.out.println("Ingres las notas\n");
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta\n");
                            }
                        }catch(Exception e){
                        System.out.println("Ingrese una opcion correcta");
                        leer.next();
                        }
                    }while(respuesta !=0);
                    break;
                default:
                    break;
            }
            }catch(Exception e){
                System.out.println("Ingrese una opcion correcta");
                leer.next();
            }
        }while(respuesta !=4);
    }     
} 
