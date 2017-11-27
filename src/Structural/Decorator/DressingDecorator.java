package Structural.Decorator;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich sandwich) {
		super(sandwich);
		// TODO Auto-generated constructor stub
	}

	   public String make()
	   {
		   return sandwich.make()+addDressing();
	   }
	
	   private String addDressing()
	   {
		   return " + Mayo";
	   }
}
