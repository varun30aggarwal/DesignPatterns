package Structural.Decorator;

public class MeatSandwich extends SandwichDecorator {

	public MeatSandwich(Sandwich sandwich) {
		super(sandwich);
		// TODO Auto-generated constructor stub
	}
	
	public String make(){
		return sandwich.make()+ addMeat();
	}
	
	private String addMeat()
	{
		return " + turkey";
	}

}
