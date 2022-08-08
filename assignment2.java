import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter the order of square matrix");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the diagonal elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[k]+" ");
                    k++;
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
