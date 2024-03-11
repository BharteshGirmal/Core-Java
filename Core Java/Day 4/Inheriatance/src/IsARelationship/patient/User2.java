
package IsARelationship.patient;
public class User2 
{
	public static void main(String[] args) 
	{
		Patient PP = new Patient();
		System.out.println(PP);
		
		Patient P2 = new Patient("Bhartesh","O+","92","88");
		System.out.println(P2);
		System.out.println("Patient Name : "+P2.getName()+"\nBlood Group : "+P2.getBloodGroup());
	}
}
