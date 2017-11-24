package Structural.Bridge;

import java.util.List;

public abstract class Printer {

	
	public String print(Formatter formatter)
	{
		return formatter.Format(getheader(), getDetails());
	}
	
	abstract protected String getheader();
	abstract protected List<Detail> getDetails();
	
}
