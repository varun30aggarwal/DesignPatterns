package Creational.BuilderDesign;

public class TipiHouseBuilder implements HouseBuilder {
  private House house;
  
  
  private TipiHouseBuilder()
  {
	  this.house= new House();
  }
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("wood basement");
		

	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
       house.setStructure("wood pillars");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
           house.setRoof("woodenn roof");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
          house.setInterior("wooden interior");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
