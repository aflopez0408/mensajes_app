/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author anfer
 */
public class Inicio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("-----------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear de mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. editar mensaje");
            System.out.println("4. eliminar mensaje");
            System.out.println("5. salir");
             /// leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    mensajesServices.crearMensaje();
                    break;
                case 2:
                    mensajesServices.listarMensaje();
                    break;
                case 3:
                    mensajesServices.borrarMensaje();
                    break;  
                case 4:
                    mensajesServices.editarMensaje();
                    break;
                default:
                    break;
            }
        }while(opcion !=5);
        
       
        
        
    }
}
