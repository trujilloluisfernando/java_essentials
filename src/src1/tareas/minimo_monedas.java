/*Implementa un programa que muestre el numero minimo de monedas necesarias para darle el cambio a un usuario.

$ ./minimo_monedas
Hola!  Cuanto cambio te debo?O hai!
0.41
4


Consideraciones:  
25c
10c
5c
1c

algoritmo seguirian
45c
25c - 1 => 20c
10c - 2 => 0c
5c  - 0 => 0c
1c  - 0 -> 0c

$1.23
25c - 4 => 23c
10c - 2 => 3c
5c  - 0 => 3c
1c  - 3 -> 0c

1.  pedir al usuario cuanto es el cambio en fraccion.
2.  tener un acumulador de monedas
3.  tener un contador del resto de cambio sobrante
4.  dividir por la moneda de 25c, sacar cuantas monedas de 25c necesito, y sumarlas al acumulador.
5.  sacar el residuo para obtener el resto de cambio sobrante.
6.  dividir por la moneda de 10c. sacar.........
7.  repetir el paso 5 con la moneda de 10c
8.  repetir el paso 4 con la moneda de 5c
9   repetir el paso 5 con la moneda de 5c
10. repetir el paso 4 con la moneda de 1c
11. repetir el paso 5 con la moneda de 1c
12  imprimir el numero de monedas en el acumulador.  
*/




package src1.tareas;


import libs.Input;

public class minimo_monedas {
	//25,10,5,1
	public static void main(String[] args) {

		int acumulador = 0;
		int temp = 0;
		int [] denominacion = {25,10,5,1};
		System.out.print("Hola, cuanto cambio necesitas?");
		float cambio = Input.get_float();
		cambio = cambio*100;
		
		for(int i = 0; i < denominacion.length;i++) {
			
			temp = (int) (cambio/denominacion[i]);
			cambio = (int) (cambio%denominacion[i]);
			acumulador += temp;
			
		}
		
		System.out.println("Monedas: " + acumulador);
		
	}

}
