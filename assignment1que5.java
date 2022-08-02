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
        System.out.println("enter the elment to be searched");
        int key=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        	int mid=start+(end-start)/2;
        	if(arr[mid]==key)
        	{
        		System.out.println("Index of the element is"+mid);
        		return;
        	}
        	else if(arr[mid]>key)
        		end=mid-1;
        	else
        		start=mid+1;
        }
        System.out.println("Not found");
	}
}
