package Creational.Singelton;

public class DBSingeltonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		DBInstance oneInstance= DBInstance.getInstance();
		
		System.out.println(oneInstance);
		
		DBInstance secondInstance = DBInstance.getInstance();
		System.out.println(secondInstance);
	}

}
