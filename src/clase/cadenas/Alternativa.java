package clase.cadenas;

public class Alternativa {

	public static void main(String[] args) {

		// StringBuffer
		StringBuilder datoStringBuilder = new StringBuilder("Hola");
		datoStringBuilder.append(" a todos").append(" los").append(" que").append(" me ven");
		
		String datoString = "Hola";

		datoString = datoString + " a todos";
		datoString = datoString + " los";
		datoString = datoString + " que";
		datoString = datoString + " me ven";

		System.out.println(datoString);
		System.out.println("***************");
		System.out.println(datoStringBuilder.toString());
		
	}
}
