package JungleBook;

public class Snake {
	String name;
	String weight;
	String color;
	String length;
	 
	
	public void sleep() 
	{
		System.out.println("\n" +name + "is sleeping");
	}
	
	public void bite()
	{
		System.out.println(name + "is biting ");
	}
	
	public void eat()
	{
		System.out.println(name + "is eating");
	}
	
	public void drink()
	{
		System.out.println(name + "is drinking");
	}

}
