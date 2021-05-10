package loop;
import java.util.*;
public class Sixteen {

	public static void main(String[] args) {
		int i,j,m;
		Scanner sc=new Scanner(System.in);
	    m=sc.nextInt();
		for(i=0;i<m;i++)
		{
			for(j=0;j<=i;j++)
			{
			System.out.print("* ");
		}
			System.out.printf("\n");
		}

	}

}
