package sirenaVerde;

public class JarabeDeVainilla extends AgregadoDecorator {

	public JarabeDeVainilla(ICafe cafe) {
		super(cafe);
	}
    public String getDescription() {
        return cafe.getDescription() + ", con Jarabe de Vainilla";
    }

    public double costo() {
        return cafe.costo() + 300;
    }

}
