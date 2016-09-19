package clase.ifelse;

public class Condicion {

	public void verificaNumero(int numero){
		//if([condicion que sea verdad])
		//else[se ejecutaria en caso de que no fuera verdad lo que esta dentro del if]
		
		//<,<=,>,>=, &&,||, &,|, !, ==
		
		// && = (true)(true)(true) = true
		// && = (true)(true)(true) ....... (false) = false
		
		// || = (true)(true)(true) = true;
		// || = (true)(false)(false)......  (false) = true;
		
		//OPERADOR AND (&&) Ejemplo
		
//		if(numero > 0 && numero < 50){
//			System.out.println("El numero " + numero + ", esta entre 0 y 50");
//		}else if(numero >50 && numero < 100){
//			System.out.println("El numero " + numero + ", esta entre 50 y 100");
//		}else{
//			System.out.println("El numero " + numero + ", es mayor que 100");
//		}
		
		//Operador OR (||) EJEMPLO
		
		if(numero > 50 || numero ==20 || numero == 30){
			System.out.println("El numero "+ numero + ", a sido evaluado");
		}else{
			System.out.println("El numero "+ numero + ", no se ejecuto en el if");	
		}
	}
	
	public static void main(String[] args){
		Condicion condicion = new Condicion();
		condicion.verificaNumero(20);
	}
	
}
