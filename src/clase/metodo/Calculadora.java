package clase.metodo;

public class Calculadora {
	//[modificador de acceso][tipo de retorno][nombre del metodo][(variables del metodo)]
	private int suma(int valor1, int valor2){
		return valor1+valor2;
	}
	
	private int resta(int valor1, int valor2){
		return valor1-valor2;
	}
	
	private int multiplicacion(int valor1, int valor2){
		return valor1*valor2;
	}
	
	private double division(int valor1, int valor2){
		return valor1/valor2;
	}
	
	public static void main(String[] args){
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.suma(10, 10));
	}
}
