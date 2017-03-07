
public class TEACHER 
{
	private String Name, ID, Sex, Phone, Email, Dept,Courses;
	//dept---部門,courses---課程,
	
	public TEACHER (String name1, String id1, String sex1, String phone1, String email1, String dept1,String courses1) 
	{
		Name = name1;
		ID = id1;
		Sex = sex1;
		Phone = phone1;
		Email = email1;
		Dept = dept1;
		Courses = courses1;		
	}
	
	public void setName(String name2) 
	{
		Name = name2;
	}
	public void setID(String id2) 
	{
		ID = id2;
	}
	public void setSex(String sex2) 
	{
		Sex = sex2;
	}
	public void setPhone(String phone2) 
	{
		Phone = phone2;
	}
	public void setEmail(String email2) 
	{
		Email = email2;
	}
	public void setDept(String dept2) 
	{
		Dept = dept2;
	}
	public void setCourses(String courses2) 
	{
		Courses = courses2;
	}
	
	public String getName(){return Name;}
	public String getID(){return ID;}
	public String getSex(){return Sex;}
	public String getPhone(){return Phone;}
	public String getEmail(){return Email;}
	public String getDept(){return Dept;}
	public String getCourses(){return Courses;}
	
	public void showAll() 
	{
		System.out.println("---------------------------------------");
		System.out.println("名字: " +this.getName() + "");
		System.out.println("ID: " +this.getID() + "");
		System.out.println("性別: " +this.getSex() + "");
		System.out.println("連絡電話: " +this.getPhone() + "");
		System.out.println("Email: " +this.getEmail() + "");
		System.out.println("部門: " +this.getDept() + "");
		System.out.println("教授課程: " +this.getCourses() + "");
		System.out.println("---------------------------------------");
	}
}

