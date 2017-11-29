package Creational.BuilderDesign;

public class CivilEngineer {

	private HouseBuilder housebuilder;
	public CivilEngineer(HouseBuilder houseBuilder)
	{
		this.housebuilder=houseBuilder;
	}
	
	public House getHouse()
	{
		return this.housebuilder.getHouse();
	}
	
	public void constructHouse()
	{
		this.housebuilder.buildBasement();
		this.housebuilder.buildInterior();
		this.housebuilder.buildRoof();
		this.housebuilder.buildStructure();
	}
	
	
}
