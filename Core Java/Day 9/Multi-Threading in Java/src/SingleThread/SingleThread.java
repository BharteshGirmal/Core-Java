
package SingleThread;
public class SingleThread
{
	public static void main(String[] args) 
	{
		Video();
		Chat();
	}
	public static void Video()
	{
		while(true)
			System.out.println("Zoom Video is running");
	}
	
	public static void Chat()
	{
		while(true)
			System.out.println("Zoom Chat is running");
	}

}
