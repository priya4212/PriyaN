import java.util.Scanner;

public class FindUnique {

	public static void main(String[] args) {
		int arr[]={10,10,20,30,20};
		int count;
        for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]!=-1 && arr[i]==arr[j])
				{
					arr[i]=-1;
					arr[j]=-1;
				}
			
			}
		}
        for(int i=0;i<arr.length;i++){
			if(arr[i]!=-1) {
				System.out.println(arr[i]);
			}
		}
	}

}
