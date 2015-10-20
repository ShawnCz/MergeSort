
public class DiceRoller 
{
	private String dexpr;
	
	public DiceRoller(String dexpr)
	{
		this.dexpr = dexpr;
	}
	
	public void display()
	{
		System.out.println("DiceRoller: " + this.dexpr);
	}
	
	private int stringToInt(String s)
	{
		//return Integer.parseInt(s);
		int place = 1;
		int total = 0;
		for(int i = s.length()-1; i >= 0; i--)
		{
			total = total + (place * "0123456789".indexOf(s.charAt(i)));
			place = place * 10;
		}
		return total;
	}
	private int parseDice(String d)
	{
		
		String temp = "";
		int numberOfDice = -1;
		int numberOfSides = -1;
		int total = 0;
		for(int i = 0; i < d.length(); i++)
		{
			if(d.charAt(i) != 'D')
			{
				temp = temp + d.charAt(i);
			}
			else
			{
				//number of dice
				numberOfDice = this.stringToInt(temp);
	
				temp = "";
			}
		}
		//number of sides
		numberOfSides = this.stringToInt(temp);
	
		Dice aDice = new Dice(numberOfSides);
		for(int i = 0; i < numberOfDice; i++)
		{
			total += aDice.roll();
		}
		return total;
	}
	
	private void processExpress()
	{
		String temp = "";
		int total = 0;
		for(int i = 0; i < this.dexpr.length(); i++)
		{
			if(this.dexpr.charAt(i) != '+')
			{
				temp = temp + this.dexpr.charAt(i);
			}
			else
			{
				total += this.parseDice(temp);
				temp = "";
			}
		}
		total += this.parseDice(temp);
	}
	public int roll()
	{
		//logic
	this.processExpress();
	}
}
