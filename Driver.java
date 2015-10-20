import java.util.Random;

public class Driver 

{
	public static void main(String[] args)
	{
		DiceRoller dr = new DiceRoller("2D6+3D20");
		System.out.println(dr.roll());
	}
}
