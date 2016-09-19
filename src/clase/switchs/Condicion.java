package clase.switchs;

public class Condicion {

	public void obtenerMes(int mes) {
		switch (mes) {
		case 1: System.out.println("Este es el mes de Enero"); break;
		case 2: System.out.println("Este es el mes de Febrero"); break;
		case 3:	System.out.println("Este es el mes de Marzo"); break;
		case 4:	System.out.println("Este es el mes de Abril"); break;
		case 5:	System.out.println("Este es el mes de Mayo");break;
		case 6:	System.out.println("Este es el mes de Junio");break;
		case 7:	System.out.println("Este es el mes de Julio");break;
		case 8:	System.out.println("Este es el mes de Agosto");break;
		case 9:	System.out.println("Este es el mes de Setiembre");break;
		case 10:System.out.println("Este es el mes de Octubre");break;
		case 11:System.out.println("Este es el mes de Noviembre");break;
		case 12:System.out.println("Este es el mes de Diciembre");break;
		default: System.out.println("El mes no es correcto"); 
		}
	}
	
	public static void main(String[] args){
		Condicion condicion = new Condicion();
		condicion.obtenerMes(1);
	}
}
