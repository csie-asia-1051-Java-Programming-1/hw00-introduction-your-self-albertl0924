
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
		/*student[0] = new STUDENT("aaa", "001", "0910");
		student[1] = new STUDENT("bbb", "002", "0911");
		student[2] = new STUDENT("ccc", "003", "0912");*/
		for(int i=0; i<3; i++) 
		{
			System.out.print("�п�J�ǥͪ�1.�W�� 2.�Ǹ��@3.�q��");
			student[i] = new STUDENT(scn.next(), scn.next(), scn.next());
		}
		System.out.print("�п�J�n�d�M���ǥͦW��");
		String nameSD = scn.next();
		int i = 0;
		boolean flag1 = true;
		while(i<3 && flag1)
		{
			if(student[i].getName().equals(nameSD))
			{
				student[i].showAll();
			}
			i++;
		}
		
		TEACHER[] teacher = new TEACHER[3];
		/*teacher[0] = new TEACHER("aaa", "001", "�k", "0910", "aaa@", "����A", "�ҵ{A");
		teacher[1] = new TEACHER("bbb", "002", "�k", "0911", "bbb@", "����B", "�ҵ{B");
		teacher[2] = new TEACHER("ccc", "003", "�k", "0912", "ccc@", "����C", "�ҵ{C");*/
		for(int j=0; j<3; j++) 
		{
			System.out.println
			("�п�J�Юv���@1.�W�١@2.ID 3.�ʧO�@4.�p���q�ܡ@5.Email 6.�����@ 7.�б½ҵ{");
			teacher[j] = new TEACHER(scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next());
		}
		System.out.print("�аݿ�J�n�d�M���Юv�W��");
		String nameTH = scn.next();
		int j = 0;
		boolean flag2 = true;
		while(j<3 && flag2) 
		{
			if(teacher[j].getName().equals(nameTH))
			{
				teacher[j].showAll();
			}
			j++;
		}
		
		scn.close();		
	}

}
