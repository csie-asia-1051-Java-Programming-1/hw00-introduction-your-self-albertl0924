/*
 * 
 * 
 */
import java.util.Scanner;
public class main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		STUDENT[] student = new STUDENT[3];
		for(int i=0; i<3; i++) 
		{
			System.out.print("請輸入學生 名稱, 學號, 電話");
			student[i] = new STUDENT(scn.next(), scn.next(), scn.next());
		}
		System.out.print("請問輸入要找尋的學生名稱");
		String name = scn.next();
		int i = 0;
		boolean flag1 = true;
		while(i<3 && flag1) 
		{
			if(student[i].getName().equals(name))
			{
				student[i].showAll();
			}
			i++;
		}
		TEACHER[] teacher = new TEACHER[3];
		for(int j=0; j<3; j++) 
		{
			System.out.println("請輸入教師的　1.名稱　2.ID　3.部門　4.性別　5.身高　6.體重　7.網路地址　8.電話　9.課程　10.Email");
			teacher[j] = new TEACHER(scn.next(), scn.next(), scn.next(), scn.next(), scn.nextInt(), scn.nextInt(), scn.next(), scn.next(), scn.next(), scn.next());
		}
		System.out.print("請問輸入要找尋的教師名稱");
		i = 0;
		boolean flag2 = true;
		while(i<3 && flag2) 
		{
			if(teacher[i].getName().equals(name))
			{
				teacher[i].showAll();
			}
			i++;
		}
		
	}

}
