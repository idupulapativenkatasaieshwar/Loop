package loop;
import java.util.*;
public class Eight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='R')
		{
			System.out.println("Red");
		}
		else if(ch=='B')
		{
			System.out.println("Blue");
		} 
		else if(ch=='G')
		{
			System.out.println("Green");
		} 
		else if(ch=='O')
		{
			
			System.out.println("Orange");
		}
		else if(ch=='Y')
		{
			System.out.println("Yellow");
		} 
		else if(ch=='W')
		{
			System.out.println("White");
		} 
		else
		{
				System.out.println("Invalid code");
		
		}
	}

}
