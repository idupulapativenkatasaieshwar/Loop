package loop;
import java.util.*;
public class Fourteen {

	public static void main(String[] args) {
		int i,m,flag=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        for(i=1;i<=m;i++)
        {
        	if(m%i==0)
        	{
        		flag++;
        	}
        
        }
        if(m==1||m==0)
        {
        	System.out.println("neither prime nor composite");
        }
        else
        {
        if(flag==2)
        {
        	System.out.println("prime");
        }
        else
        {
        	System.out.println("not prime");
        }
        }
	}

	}

