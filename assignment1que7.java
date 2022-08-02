import java.util.Scanner;
public class assignment{
	public static void main(String args[]){
		System.out.println("enter the length and elements of the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        		arr[i]=sc.nextInt();
        }
        if(n==0||n==1){
        	System.out.println("no missing element");
        	return;
        }
        	
        for(int i=0;i<n-1;i++)
        {
        	if(arr[i]+1!=arr[i+1])
        	{
        		System.out.println("missing element is "+ (arr[i]+1));
        		return;
        	}
        }
        System.out.println("no missing element");
	}
}
