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
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        for(int i=0;i<n;i++)
        {
        		System.out.println(arr[i]+" ");
        }
	}
}
