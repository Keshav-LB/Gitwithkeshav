package array;

import java.util.Arrays;
import java.util.Scanner;

public class ques14 {

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
		
		//2System.out.println("Array: "+Arrays.toString(A)); 
		
		

			
		int max=0;
		for(int i=0; i<A.length;i++)
		{
			for(int j =0; j<A.length; j++)
			{
				if(A[i][j]>max)
					max = A[i][j];
				
			}
			
		}
		System.out.println(max);

	}

}
