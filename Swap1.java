import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n1=10;
		int n2=20;
		System.out.println("enter the elements before swaping"+"\n"+n1+"\t"+n2);
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println("after swaping"+"\n"+n1+"\t"+n2);
	}

}
