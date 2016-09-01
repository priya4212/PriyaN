import java.util.Scanner;

public class import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=s.nextInt();
		int n1=0,n2=1,c=0;
		System.out.println(n1+"\n"+n2);
		for(int i=0;i<limit;i++)
		{
			c=n1+n2;
			n1=n2;
			n2=c;
			System.out.println(c);
		}
	}

}
