package Creational.BuilderDesign;

public class IglooHouseBuilder implements HouseBuilder {

	private House house;
	
	public IglooHouseBuilder()
	{
		house= new House();
	}
	
	
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
           house.setBasement("Ice Bars");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
          house.setStructure("Ice Rods");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
         house.setRoof("Ice roof");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
           house.setInterior("ice interior");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
