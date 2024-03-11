package study.wrapper;

public class EXAMPLE 
{
	public static void main(String[] args) 
	{
		// Integer Constant pool is created only for -128 to 127
		/// it creates new objects
		Integer S=90;
		Integer Z= 90;
		
		Integer i1=Integer.valueOf(500); // Value forces to the use of constant pool 
		Integer i2=Integer.valueOf(500);
		
		if( S == Z)
			System.out.println(" Both Are Refering to same Object due to constant pool");
		else
			
			
			
			System.out.println(" Both Are Refering to Diffrent Object ");
		
		if( i1 == i2)
			System.out.println(" Both Are Refering to same Object due to constant pool");
		else
			System.out.println(" Both Are Refering to Diffrent Object ");
	}

}
