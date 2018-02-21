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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int respuesta;
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
                                case 1:
                                    System.out.println("Ingres un numero\n");
                                    break;
                                case 2:
                                    System.out.println("Mostrar el número de "
                                            + "digitos del numero ingresado\n");
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
                    break;
                case 4:
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
