package sirenaVerde;

public class Leche extends AgregadoDecorator {

	public Leche(ICafe cafe) {
		super(cafe);
	}
	
    public String getDescription() {
        return cafe.getDescription() + ", con Leche";
    }

    public double costo() {
        return cafe.costo() + 100;
    }

}
