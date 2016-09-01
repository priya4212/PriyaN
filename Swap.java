import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements before swaping");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int t=0;
		t=n1;
		n1=n2;
		n2=t;
		System.out.println("after swaping"+"\n"+n1+"\t"+n2);
	}

}
