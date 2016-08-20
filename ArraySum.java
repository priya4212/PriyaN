import java.util.Scanner;


public class ArraySum {

	
	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements for first array");
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter elements for second array");
		for(int i=0;i<b.length;i++){
			b[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==b[i]){
				System.out.println(a[i]);
			}
			else{
				System.out.println("-1");
			}
		}

	}

}
