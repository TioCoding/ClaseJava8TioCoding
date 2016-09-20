package clase.estructuradatos.estatica;

public class Arreglos {

	public static void main(String[] args) {
		int[] arreglo = new int[100];
		// Llenarme mi arreglo
		for(int i=0; i < arreglo.length; i++){
			arreglo[i] = i*3;
		}
		// Me imprima todos los datos de mi arreglo
		//Foreach (Declaracion de una variable : (arreglo) (lista))
		for(Integer dato : arreglo){
			System.out.println("Valor de mi arreglo: "+ dato);
		}
		
	}
}
