package volumen1;

import java.util.Scanner;

public class Vampiro125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		boolean check=false;
		while (i==0) {
			System.out.println("Escribe un número para comprobar si es vampiro");
			int numero = sc.nextInt();
			check = comprobarVampiro(numero);
			i=1;
		}
		
	}
	
	public static boolean comprobarVampiro(int entrada) {
		boolean check = false;
		String digitos = String.valueOf(entrada);
		
		for (int i = 0; i < digitos.length(); i++) {
			
			if( i == (digitos.length()/2) ) {
				
			}
			
		}
		
		
		
		return check;
	}
	
	
}
