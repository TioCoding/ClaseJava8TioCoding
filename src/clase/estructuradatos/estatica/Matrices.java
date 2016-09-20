package clase.estructuradatos.estatica;

public class Matrices {

	//			columna0	columna1	columna2	columna3	columna4
	// fila0	[		]	[		]	[		]	[		]	[		]
	// fila1	[		]	[		]	[		]	[		]	[		]
	// fila2	[		]	[		]	[		]	[		]	[		]
	// fila3	[		]	[		]	[		]	[		]	[		]
	// fila4	[		]	[		]	[		]	[		]	[		]
	
	public static void main(String[] args) {
		Integer[][] datoMatriz = new Integer[5][5];
		
		int filas = datoMatriz.length;
		int columnas = datoMatriz[0].length;
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){
				datoMatriz[i][j] = i*j;
			}
		}
		
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){
				System.out.print("["+datoMatriz[i][j]+"]");
			}
			System.out.println("");
		}
		
	}
}
