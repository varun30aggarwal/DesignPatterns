package Structural.Decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sandwich sandwich = new DressingDecorator(new MeatSandwich(new SimpleSandwich()));
		System.out.println(sandwich.make());
		
		Sandwich sandwich1 = new DressingDecorator(new VeganDecorator(new SimpleSandwich()));
		System.out.println(sandwich1.make());
	}

}
