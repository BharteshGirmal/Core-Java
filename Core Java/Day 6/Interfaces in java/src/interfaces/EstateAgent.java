package interfaces;

public class EstateAgent 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static void CostOfPlot(Shape shape)
	{
		final double Cost_Sq_Ft=3000;
		double cost=0;
		
		// if we don't write abstract method 
		/*if(shape instanceof Circle)
		{
			cost=((Circle)shape).AreaOfCircle() * Cost_Sq_Ft;
		}
		if(shape instanceof Rectangle)
		{
			cost=((Rectangle)shape).AreaOfRectnagle() * Cost_Sq_Ft;
		}
		*/
		
		
		System.out.println("The Cost of Plot is : "+cost);
	}
	


}
