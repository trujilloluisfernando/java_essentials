/*Implementa un programa que reporte el uso de agua de un usuario que dura x minutos en la 
ducha expresado en botellas de agua.
$ ./botellas_agua
Minutos: 1
Botellas: 12

$ ./botellas_agua
Minutos: 10
Botellas: 120*/


package src1.tareas;

import libs.Input;

public class botellas_agua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Minutos: ");
		int minutos = Input.get_int();
		int botellas = 12*minutos;
		System.out.println("Botellas: "+ botellas);

	}

}
