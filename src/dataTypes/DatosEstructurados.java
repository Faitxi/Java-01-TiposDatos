package dataTypes;

public class DatosEstructurados {
	public static void main (String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)*/
		
		String myString = "Hola, soy un String";
		System.out.println(myString);
		
		String helloString = new String ("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/* Método para Strings.
		 * -- */
		
		String texto = "AsDfGhJkLñ";
		//String lenght. Metodo que permite medir la longitud de una cadena de caracteres
		System.out.println("La longitud de la variable texto de tipo String es: " + texto.length());
		
		/* Guardando la variable texto en una nueva variable de tipo int para pasarle el método lenght 
		 * int metodoLenght = texto.lenght();
		 * --Output: 10
		 * Imprimimos en consola la nueva variable
		 * System.out.println(metodoLenght);
		 * */
		
		// --String: toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el metodo toUpperCase: " + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el metodo toLowerCase: " + lowerCase);
		
		// -- indexOf (). Devuelve el índice de la primera aparición de un texto especifico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal"); //8
		System.out.println("La palabra 'temporal' inicia en el indice: " + indexOf);
		
		// --Concatenacion
		String firstName = "Fatima ";
		String lastName = "Fernandez";
		
		String userName = firstName + " " +  lastName; //Metodo más utilizado
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		
		//-- Metodos de conversion
		String presupuesto = "50000"; //string es un objeto
		System.out.println("El presupuesto es de $" + presupuesto + " Y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseado = Integer.parseInt(presupuesto); //int no es un objeto
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseado + " que ahora es de tipo " + ((Object)parseado).getClass().getSimpleName());
		
		
		/* Arrays. Conocidos como arreglos, se trata de una coleccion de datos del mismo tipo donde cada elemento corresponde a una posicion identificada por indices numericos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el termino matriz*/
		
		String[] cars = {"Volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars);
		
		/* Variables por tipo de declaracion
		 * --Variables dinamicas: son aquellas que se declaran con un valor, pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. El valor no se puede modificar.
		 * -- Variablers literales: (palabras reservadas). Su identificacion es la representacion de su valor y ya tiene un significado en el codigo fuente de java.
		 * 
		 * */
		//Variables dinámicas
		float gastosMensuales = 35684.30f;
		System.out.println(gastosMensuales);

		gastosMensuales = 42699.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a: " + gastosMensuales);
		
		//Variables finales o constantes
		final int SALARIO = 15000; // final Nos permite hacer variables constantes
		System.out.println(SALARIO); //Utilizar mayusculas en variables final
		

	}
	
	
}
