
public class TEACHER 
{
	private String Name, ID, Dept, Gender, WebAddress, Phone, Courses, Email;
	private int Height, Weight; 
	//dept---部門,gender---性別,courses---課程,
	
	public TEACHER (String name1, String id1, String dept1, String gender1, int height1, int weight1, String webaddress1, String phone1, String courses1, String email1) 
	{
		Name = name1;
		ID = id1;
		Dept = dept1;
		Gender = gender1;
		Height = height1;
		Weight = weight1;
		WebAddress = webaddress1;
		Phone = phone1;
		Courses = courses1;
		Email = email1;		
	}
	
	public void setName(String name2) 
	{
		Name = name2;
	}
	public void setID(String id2) 
	{
		ID = id2;
	}
	public void setDept(String dept2) 
	{
		Dept = dept2;
	}
	public void setGender(String gender2) 
	{
		Gender = gender2;
	}
	public void setHeight(int height2) 
	{
		Height = height2;
	}
	public void setWeight(int weight2) 
	{
		Weight = weight2;
	}
	public void setWebAddress(String webaddress2) 
	{
		WebAddress = webaddress2;
	}
	public void setPhone(String phone2) 
	{
		Phone = phone2;
	}
	public void setCourses(String courses2) 
	{
		Courses = courses2;
	}
	public void setEmail(String email2) 
	{
		Email = email2;
	}
	
	public String getName(){return Name;}
	public String getID(){return ID;}
	public String getDept(){return Dept;}
	public String getGender(){return Gender;}
	public int getHeight(){return Height;}
	public int getWeight(){return Weight;}
	public String getWebAddress(){return WebAddress;}
	public String getPhone(){return Phone;}
	public String getCourses(){return Courses;}
	public String getEmail(){return Email;}
	
	public void showAll() 
	{
		System.out.println("---------------------------------------");
		System.out.println("Name: " +this.getName() + "");
		System.out.println("ID: " +this.getID() + "");
		System.out.println("Dept: " +this.getDept() + "");
		System.out.println("Gender: " +this.getGender() + "");
		System.out.println("Height: " +this.getHeight() + "");
		System.out.println("Weight: " +this.getWeight() + "");
		System.out.println("WebAddress: " +this.getWebAddress() + "");
		System.out.println("Phone: " +this.getPhone() + "");
		System.out.println("Courses: " +this.getCourses() + "");
		System.out.println("Email: " +this.getEmail() + "");
		System.out.println("---------------------------------------");
	}
}

