package sirenaVerde;

public abstract class AgregadoDecorator implements ICafe {
	protected ICafe cafe;
	
    public AgregadoDecorator(ICafe cafe) {
        this.cafe = cafe;
    }

    public String getDescription() {
        return cafe.getDescription();
    }

    public double costo() {
        return cafe.costo();
    }

}
