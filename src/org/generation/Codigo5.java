package org.generation;
import java.util.Scanner; // Se importa la clase Scanner para poder utilizarla

/* Descripción del funcionamiento del código:
El programa solicita al usuario ingresar un número, después se verifica si el número es "afortunado"
(si contiene más dígitos 3, 7, 8 o 9 que cualquier otro dígito). */

public class Codigo5 {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in); // Se crea una instancia de Scanner y se pasa System.in como argumento
	        System.out.print("Introduzca un número: "); // Se cambia comillas simples por comillas dobles
	        String ni = s.nextLine();
	        int c = Integer.parseInt(ni); // Convierte la cadena 'ni' a un entero utilizando Integer.parseInt
	        
	        int afo = 0;
	        int noAfo = 0;
	        int i =c;

	        while (i > 0) { // Cambia 'ni' a 'i' ya que estamos trabajando con números ingresado
	        	int digito = i % 10;
	            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	                afo++;
	            } else {
	                noAfo++;
	            }
	            i /= 10; // Se mueve la operación dentro del bucle while
	        }

	        if (afo > noAfo) {
	            System.out.println("El " + c + " es un número afortunado."); // Se cambia 'prinln' a 'println'
	        } else {
	            System.out.println("El " + c + " no es un número afortunado."); // Se cambia 'prinln' a 'println'
	        }
	    }
	}
