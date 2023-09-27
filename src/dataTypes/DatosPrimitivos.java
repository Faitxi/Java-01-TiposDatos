package dataTypes;

public class DatosPrimitivos {
	public static void main (String[] args) {
		/* 
		 * Datos primitivos: Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 * */
		
	
		//System.out.println();//sysout + ctrl + space
		//System.out.println();//syso + ctrl + space
		
		//byte. Vmin y VMax
		byte minByte = Byte.MIN_VALUE; //va a encontrar el valor minimo de una variable tipo byte
		byte maxByte = Byte.MAX_VALUE; //va a encontrar el valor maximo de una variable tipo byte
		System.out.println("El valo mínimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);

		//short. Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		//char. Vmin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de Character es: " + minChar);
		System.out.println("El valor máximo de Character es: " + maxChar);
	
		
		long isbn = 9788499169019L;
		System.out.println(isbn);
		
		float salary = 15000f; //Poner siempre la f en mínuscula al final de los numeros
		System.out.println(salary);
		
		double ISR = 1239.45d; //Poner siempre la d en mínuscula al final de los números.
		System.out.println(ISR);
		
		//int. Vmin y VMx
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de Integer es: " + minInt);
		System.out.println("El valor máximo de Integer es: " + maxInt);
		
		
		//long Vmin y VMax
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de Long es: " + minLong);
		System.out.println("El Valor máximo de Long es: " + maxLong);
		
		//float. Vmin y VMax
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de Float es: " + minFloat);
		System.out.println("El valor máximo de Float es: " + maxFloat);
		
		//double. Vmin y Vmax
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de Double es: " + minDouble);
		System.out.println("El valor máximo de Double es: " + maxDouble);
		
		char valorChar1 = 64; //La comas sencillas forzan a java a dejar el mismo valor
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/*Casteo (Conversión de tipos en Java).
		 *  -- Automático (dato más pequeño a un dato más grande).
		 *  -- Manual (tipo de dato más grande a tipo de dato más pequeño.
		 */
		
		
		//Casteo automático
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		 
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		
		//Casteo manual
		 int myNewCasting = (int) myCasting;
		 System.out.println(myNewCasting);
		 
		 //Convertir de float a int
		 float myFloat = 1.99f;
		 System.out.println(myFloat);
		 //conversion
		  int myNewFloat = (int) myFloat;
		  System.out.println(myNewFloat); //En java los valores se redondean hacia abajo
		
		  
		  //convertir de char a int
		  char myChar = 'M';
		  int myNewChar = myChar;
		  System.out.println(myNewChar);
	}
}
