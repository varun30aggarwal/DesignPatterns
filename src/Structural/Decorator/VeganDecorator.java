package Structural.Decorator;

public class VeganDecorator extends SandwichDecorator {

	public VeganDecorator(Sandwich sandwich) {
		super(sandwich);
		// TODO Auto-generated constructor stub
	}
	
	 public String make()
	   {
		   return sandwich.make()+addDressing();
	   }
	
	   private String addDressing()
	   {
		   return " + Lettuce + Cabbage";
	   }

}
