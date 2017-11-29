package Creational.BuilderDesign;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HouseBuilder igloo = new IglooHouseBuilder();
		CivilEngineer engineeer = new CivilEngineer(igloo);
		engineeer.constructHouse();
		House house= engineeer.getHouse();
		
		System.out.println(house);
		
	}

}
