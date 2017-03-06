
public class STUDENT 
{
	private String Name, ID, Phone;

	public STUDENT (String name1, String id1, String phone1) 
	{
		Name = name1;
		ID = id1;
		Phone = phone1;
	
	}
	
	public void setName(String name2) 
	{
		Name = name2;
	}
	public void setID(String id2) 
	{
		ID = id2;
	}
	public void setPhone(String phone2) 
	{
		Phone = phone2;
	}

	
	public String getName(){return Name;}
	public String getID(){return ID;}
	public String getPhone(){return Phone;}
	
	public void showAll() 
	{
		System.out.println("---------------------------------------");
		System.out.println("Name: " +this.getName() + "");
		System.out.println("ID: " +this.getID() + "");
		System.out.println("Phone: " +this.getPhone() + "");
		System.out.println("---------------------------------------");
	}
}

