package clase.cadenas;

import java.util.StringTokenizer;

public class MetodosDeCadena {
	
	
	public static void main(String[] args) {

		// String mensaje = "Bienvenidos al tutorial".toLowerCase();
		// String mensaje = "Bienvenidos al tutorial".toUpperCase();

		// -------------
		// for(int i=0; i<mensaje.length();i++){
		// System.out.println(mensaje.charAt(i));
		// }

		// ------------

		// String mensaje = "Bienvenidos al tutorial";
		// System.out.println(mensaje.lastIndexOf("dos"));

		// String mensaje2 = "Este tutorial, es gratis para la comunidad
		// Javera";
		// System.out.println(mensaje2.substring(0,24));

		// -----------------

		// String mensaje = "Suscribanse al canal para mas contenido";
		//
		// if(mensaje.startsWith("Sus")){
		// System.out.println("Esta cadena empieza con Sus \n");
		// }else{
		// System.out.println("Esta cadena no empieza con Sus\n");
		// }
		//
		// if(mensaje.endsWith("contenido")){
		// System.out.println("Esta cadena termina con contenido");
		// }else{
		// System.out.println("Esta cadena no termina con contenido");
		// }

		// ------------------
		
//		String suscriptores = "yo*juan*junior*pepe*carlos";
//		
//		StringTokenizer token = new StringTokenizer(suscriptores, "*");
//		
//		String[] suscriptoresTraidos = new String[5];
//		
//		int i = 0;
//		while(token.hasMoreTokens()){
//			suscriptoresTraidos[i] = token.nextToken();
//			i++;
//		}
//		
//		for(String sus: suscriptoresTraidos){
//			System.out.println("Mi suscriptor se llama: " + sus);
//		}
		
		String mensaje = "Mensaje";
		
		if(mensaje.equals("Mensaje")){
			System.out.println("El mensaje es con mayuscula");
		}else{
			System.out.println("El mensaje es con minuscula");
		}

		
		
		
		
	}
}
