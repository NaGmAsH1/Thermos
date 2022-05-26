package see_qt;

public class Theroms {
	
	int volume;
	String brand;
	String liquid;
	int capacity = 0;
	
	public Theroms(int volume, String brand)
	{
		this.volume=volume;
		this.brand=brand;
	}
	
	public void addliquid(String liquid)
	{
		this.liquid=liquid;
		capacity=1;
	}
	
	public void display() {
		System.out.println("Volume" + volume);
		System.out.println(" Brand" + brand);
		System.out.println("Liquid"+liquid);
	}
	
	public void pour() {
		String liquid= null;
		capacity= 0;
	}
	
	public static void  main(String[] args)
	{
		
	}
}
