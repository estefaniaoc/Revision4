package com.generation;
//se creo packcage

import java.util.Scanner;

public class codigo4 {
	
	public static void main(String[] args) {


	//Se importo la clase scanner
    Scanner s = new Scanner(System.in);
    //Se agrego system in para leer la entrada desde la consola
   
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    /*Scanner s2 = new Scanner(System.in);*/
    //Se agrego system in para leer la entrada desde la consola
    String j2 = s.nextLine();
    
    //Se quito un parentesis extra
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
        	//Cambiamos == por equals
          if (j2.equals("tijeras")){
            g = 1;
          }
          break; //Se agrega break despues de cada caso

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
            }
          break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
        	System.out.println("No válido");
        	
      }
      System.out.println("Gana el jugador " + g);
    }
      s.close();
      //agregamos el sclose.
    
      }
    }
    
    
