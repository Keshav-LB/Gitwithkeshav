package array;
import java.util.*;

public class ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and Column: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int [][] A= new int[x][y];  
		System.out.println("Enter the elements of the array: ");   
		
		for(int i=0; i<x;i++)
		{
			for(int j =0; j<y; j++)
			{
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<x;i++)
		{
			for(int j =0; j<y; j++)
			{
				System.out.print(A[i][j] + " ");   
			}
			System.out.println();
		}
		
		System.out.println("The reverse of the array is :");
		for(int i = A.length-1; i >= 0; i--) {
			for(int j = A.length-1; j >= 0; j--) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
