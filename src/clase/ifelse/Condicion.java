package clase.ifelse;

import clase.metodo.Calculadora;

public class Condicion {

	public void verificaNumero(int numero){
		//if([condicion que sea verdad])
		//else[se ejecutaria en caso de que no fuera verdad lo que esta dentro del if]
		if(numero < 50){
			System.out.println("El numero " + numero + ", es menor que 50");
		}else{
			System.out.println("El numero " + numero + ", es mayor que 50");
		}
	}
	
	public static void main(String[] args){
		Condicion condicion = new Condicion();
		Calculadora calculadora = new Calculadora();
		condicion.verificaNumero(calculadora.suma(20, 10));
	}
	
}
