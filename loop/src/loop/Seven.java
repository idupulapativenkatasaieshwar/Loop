package loop;
import java.util.*;
public class Seven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isUpperCase(ch)==true)
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else
		{
			System.out.println(Character.toUpperCase(ch));
		}
	}

}
