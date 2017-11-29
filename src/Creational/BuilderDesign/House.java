package Creational.BuilderDesign;

public class House implements HousePlan {
 
	
	private String basement;
	private String structure;
	private String roof;
	private String interior;
	
	
	
	
	public void setBasement(String basement) {
		// TODO Auto-generated method stub
            this.basement=basement;
	}

	
	public void setStructure(String structure) {
		// TODO Auto-generated method stub
        this.structure=structure;
	}

	
	public void setRoof(String roof) {
		this.roof=roof;
             
	}

	
	public void setInterior(String interior) {
		// TODO Auto-generated method stub
		this.interior=interior;

	}

}
