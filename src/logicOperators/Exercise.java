package logicOperators;

public class Exercise {

	public static void main(String[] args) {

		// Enrique, Paola y Mariana compran un iphone 15. Si el total de la compra
		// supera los 25mil pesos, por lo tanto obitnenen un 10% de descuento. La tienda
		// en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo
		// tanto, deciden pagar con la TDC de Mariana. ¿ Cuál sería el costo total de
		// los equipos?¿Aplica descuento? ¿Cuál sería el costo total con descuento?
		// ¿Cuánto pagarían mensualmente?

		int costoUnitario = 20000;
		double total = costoUnitario * 3;
		double totalCompra = 0d;
		double mensualidad = 0d;

		System.out.println("El total de tu compra es: $" + total);

		if (total> 25000) {
			double descuento = total * .10d;
			System.out.println("Se le aplica un 10% de descuento a tu compra");
			totalCompra = total - descuento;
			System.out.println("El total de tu compra con descuento es de: $" + totalCompra);
		} else {
			totalCompra = total;
			System.out.println("No aplica descuento");
		}
		
		mensualidad = totalCompra / 12;
		System.out.println("Tus pagos mensuales serán de: $" + mensualidad);

	}

}
