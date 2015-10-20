import java.util.Random;

public class Dice 
{
	public int numSides;
	public String name;
	public Random r = new Random();
	
	public Dice(int numSides)
	{
		this.numSides = numSides;
		this.name = "D" + numSides;
		System.out.println(name);
	}

	public int roll()
	{
		return r.nextInt(this.numSides) + 1;
	}

	
	
}
