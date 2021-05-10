package loop;

public class Nineteen {

	public static void main(String[] args) {
		int n=0,i=0;
		while(n<5)
		{
			if(i%2==0&&i%3==0&&i%5==0)
			{
				System.out.println(i);
				n++;
			}
			i++;
		}

	}

}
