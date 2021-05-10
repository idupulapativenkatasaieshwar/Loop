package loop;
import java.util.*;
public class Fifteen {

	public static void main(String[] args) {
		int m,r,sum=0;
		Scanner sc=new Scanner(System.in);
	    m=sc.nextInt();
	    while(m>0)
	    {
	    	r=m%10;
	    	sum=sum+r;
	    	m=m/10;
	    }
	    System.out.println(sum);
	}

}
