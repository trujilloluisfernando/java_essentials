package src1.tareas;

import libs.Input;

public class mario_dificil {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingresa la altura de la torre: ");
		int altura = Input.get_int();
		for(int i = 0; i < altura; i++) {
			espacios(altura-1-i);
			hash(2+i);
			System.out.print("  ");
			hash(2+i);
			System.out.print("\n");
		}	
	}
	
	public static void espacios(int numEspacios) {
		for(int i = 0; i < numEspacios; i++) {
			System.out.print(" ");
		}
	}
	
	public static void hash(int numHash) {
		for(int i = 0; i < numHash; i++) {
			System.out.print("#");
		}
	}

}
