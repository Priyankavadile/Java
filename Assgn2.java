package Nest4Code;

public class Assgn2 
{
	static float heightConverter(int heightFeet, int heightInch)
	{
		float heighInCm = (float) (((heightFeet*12)+(heightInch))*2.54);
		return heighInCm;
		
	}
	
	static  float weightConverter(int weight)
	{
	   float weightPound;
	   weightPound = (float) (weight*2.2);
	   return weightPound;
	}

	public static void main(String[] args) 
	{
		Assgn2 a = new Assgn2();
		System.out.println("Height in cm="+a.heightConverter(5, 11));
		System.out.println("Weight in pounds="+weightConverter(60));

	}

}

