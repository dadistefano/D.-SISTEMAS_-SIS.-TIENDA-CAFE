package sirenaVerde;

public class Main {

	public static void main(String[] args) {
	
		ICafe cafe = new TostadoSuave();
		cafe = new Leche(cafe); // Agregardo de leche
		cafe = new JarabeDeVainilla(cafe); // Agregardo de jarabe de vainilla

		System.out.println("Descripción de la bebida: " + cafe.getDescription());
		System.out.println("Costo total: $" + cafe.costo());
		
		ICafe cafe2 = new TostadoIntenso();
		cafe2 = new CremaBatida(cafe2); // Agregardo de Crema batida


		System.out.println("Descripción de la bebida: " + cafe2.getDescription());
		System.out.println("Costo total: $" + cafe2.costo());

	}

}
