package Creational.Singelton;

public class DBInstance {

	private static DBInstance instance=null;
	
	// Validates only one instance can be created
	private DBInstance() {
		// TODO Auto-generated constructor stub
	}
	
	public static DBInstance getInstance()
	{
		// This is lazy loading which can be helpful in the performance for larger applciations
		if(instance==null)
		{
			synchronized (DBInstance.class) {
				
				if(instance==null)
				{
					instance= new DBInstance();
				}
			}
		}
		
		return instance;
	}
	
}
