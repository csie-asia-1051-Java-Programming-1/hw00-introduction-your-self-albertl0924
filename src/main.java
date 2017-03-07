
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
			System.out.print("請輸入學生的1.名稱 2.學號　3.電話");
			student[i] = new STUDENT(scn.next(), scn.next(), scn.next());
		}
		System.out.print("請輸入要查尋的學生名稱");
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
		/*teacher[0] = new TEACHER("aaa", "001", "男", "0910", "aaa@", "部門A", "課程A");
		teacher[1] = new TEACHER("bbb", "002", "女", "0911", "bbb@", "部門B", "課程B");
		teacher[2] = new TEACHER("ccc", "003", "男", "0912", "ccc@", "部門C", "課程C");*/
		for(int j=0; j<3; j++) 
		{
			System.out.println
			("請輸入教師的　1.名稱　2.ID 3.性別　4.聯絡電話　5.Email 6.部門　 7.教授課程");
			teacher[j] = new TEACHER(scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next());
		}
		System.out.print("請問輸入要查尋的教師名稱");
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
