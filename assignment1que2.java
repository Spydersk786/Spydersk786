import java.util.Scanner;
class assignment1que2 {
    public static void main(String[] args) {
         System.out.println("enter the number of elements in array and the elements");
         Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
        	 arr[i]=sc.nextInt();
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++)
        	 {
        		 if(arr[i]==arr[j])
        			 arr=delete(arr,j);
        	 }
         }
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.println(arr[i]);
         }
    }
    public static int[] delete(int arr[],int index){
    	int temp[]=new int[arr.length-1];
        for(int i=0;i<index;i++)
            temp[i]=arr[i];
        for(int i=index+1;i<arr.length;i++)
            temp[i-1]=arr[i];
        return temp;
    }
}

