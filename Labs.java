
public class Labs
{
	public static void main(String[] args)
	{
		double distanceLeft = 10.0;
		int steps = 0;
		
		while (distanceLeft > 0)
		{
			distanceLeft = distanceLeft/2;
			steps++;
			System.out.println(distanceLeft);
			
		}
		
		System.out.println("Paris stepped " + steps + " many times to get to Helen.");
	}
}