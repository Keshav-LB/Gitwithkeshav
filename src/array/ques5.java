package array;
import java.util.*;
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		int A[]= {12, 77, 84, 3, 14, 15, 17, 19};
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		for(int i = 0; i < A.length-1; i++) 
		{
			for(int j = 0; j < A.length-1; j++) 
			{
				if(A[j] > A[j+1]) 
				{
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
				}
			}
			
		}
		System.out.println("Largest two numbers are "+A[A.length-1]+", "+A[A.length-2]);
		System.out.println("Smallest two numbers are "+A[0]+", "+A[1]);

	}

}
