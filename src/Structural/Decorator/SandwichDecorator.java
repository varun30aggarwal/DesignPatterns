package Structural.Decorator;

public class SandwichDecorator implements Sandwich {

	protected Sandwich sandwich;
	
	public SandwichDecorator( Sandwich sandwich) {
		this.sandwich=sandwich;
	}
	
	
	@Override
	public String make() {
		// TODO Auto-generated method stub
		return sandwich.make();
	}

}
