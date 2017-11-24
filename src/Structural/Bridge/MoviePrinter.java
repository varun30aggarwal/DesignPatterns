package Structural.Bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

	private Movie movie;
	
	public MoviePrinter(Movie movie)
	{
		this.movie=movie;
	}
	
	protected String getheader() {
		// TODO Auto-generated method stub
		return movie.getClassification();
 
	}

	protected List<Detail> getDetails() {
		// TODO Auto-generated method stub
List<Detail> details = new ArrayList<>();
		
		details.add(new Detail("Title", movie.getTitle()));
		details.add(new Detail("Year", movie.getYear()));
		details.add(new Detail("Runtime", movie.getRuntime()));

		return details;

	}

}
