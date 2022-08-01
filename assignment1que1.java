import java.util.Scanner;
class assignment1que1 {
    public static void main(String[] args) {
         System.out.println("Enter the no. of elements in array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x;
        do
        {
        System.out.println("Enter your choice");
        x=sc.nextInt();
        switch(x)
        {
            case 1:
                create(arr);
                break;
            case 2:
                display(arr);
                break;
             case 3:
                 arr=insert(arr);
                 break;
            case 4:
                arr=delete(arr);
                break;
            case 5:
                search(arr);
                break;
        }
        }
        while(x!=6);
        System.out.println("Exited");
    }
    public static void create(int arr[]){
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static int[] insert(int arr[])
    {
    	System.out.println("Enter the element to be inserted and its index");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
    	int index=sc.nextInt();
    	int temp[]=arr;
    	arr=new int[temp.length+1];
    	for(int i=0;i<index;i++)
    		arr[i]=temp[i];
    	arr[index]=element;
    	for(int i=index+1;i<=temp.length;i++)
    	{
    		arr[i]=temp[i-1];
    	}
		return arr;
    }
    public static int[] delete(int arr[])
    {
        System.out.println("Enter the index of element to be deleted");
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int temp[]=new int[arr.length-1];
        for(int i=0;i<index;i++)
            temp[i]=arr[i];
        for(int i=index+1;i<arr.length;i++)
            temp[i-1]=arr[i];
        arr=new int[temp.length];
        arr=temp;
        return temp;
//        int temp[]=arr;
//        arr=new int[temp.length-1];
//        for(int i=0;i<index;i++)
//           arr[i]=temp[i];
//        for(int i=index+1;i<temp.length;i++)
//           arr[i-1]=temp[i];
    }
    public static void search(int arr[]){
        System.out.println("Enter the element to search");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            {
                if(arr[i]==element)
                {
                    index=i;
                    break;
                }
            }
        }
        if(index==-1)
            System.out.println("not found!");
        else
            System.out.println("Element found at index "+index);
    }
}

