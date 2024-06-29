package sirenaVerde;

public class CremaBatida extends AgregadoDecorator {

	public CremaBatida(ICafe cafe) {
		super(cafe);
	}
    public String getDescription() {
        return cafe.getDescription() + ", con Crema Batida";
    }

    public double costo() {
        return cafe.costo() + 200;
    }

}
