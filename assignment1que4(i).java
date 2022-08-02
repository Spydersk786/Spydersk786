import java.util.Scanner;
public class assignment1que4i{
	public static void main(String args[]){
		System.out.println("enter the number of elements in array and the elements");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        for(int i=0;i<n/2;i++)
        {
        	int temp=arr[i];
        	arr[i]=arr[n-i-1];
        	arr[n-i-1]=temp;
        }
        for(int i=0;i<n;i++)
        	System.out.println(arr[i]);
	}
}