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
			System.out.print("�п�J�ǥ� �W��, �Ǹ�, �q��");
			student[i] = new STUDENT(scn.next(), scn.next(), scn.next());
		}
		System.out.print("�аݿ�J�n��M���ǥͦW��");
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
			System.out.println("�п�J�Юv���@1.�W�١@2.ID�@3.�����@4.�ʧO�@5.�����@6.�魫�@7.�����a�}�@8.�q�ܡ@9.�ҵ{�@10.Email");
			teacher[j] = new TEACHER(scn.next(), scn.next(), scn.next(), scn.next(), scn.nextInt(), scn.nextInt(), scn.next(), scn.next(), scn.next(), scn.next());
		}
		System.out.print("�аݿ�J�n��M���Юv�W��");
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
