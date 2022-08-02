import java.util.Scanner;
public class assignment{
	public static void main(String args[]){
		System.out.println("enter the dimentions of 1st matrix and its elements");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int arr1[][]=new int[n1][m1];
        for(int i=0;i<n1;i++)
        	for(int j=0;j<m1;j++)
        		arr1[i][j]=sc.nextInt();
        System.out.println("enter the dimentions of 2st matrix and its elements");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int arr2[][]=new int[n2][m2];
        for(int i=0;i<n2;i++)
        	for(int j=0;j<m2;j++)
        		arr2[i][j]=sc.nextInt();
        if(m1!=n2)
        {
        	System.out.println("multiplication not possible");
        	return;
        }
        int result[][]=new int[n1][m2];
        for(int i=0;i<n1;i++)
        {
        	for(int k=0;k<m1;k++)
        	{
        		for(int j=0;j<m2;j++)
        		{
        			result[i][j]+=arr1[i][k]*arr2[k][j];
        		}
        	}
        }
        for(int i=0;i<n1;i++)
        {
        	for(int j=0;j<m2;j++)
        	{
        		System.out.print(result[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}
