package array;
import java.util.*;
public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int A[]= {12, 77, 84, 3, 14, 12, 15, 17, 19};
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		Arrays.sort(A);										//sort
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		int[] temp = new int[A.length];
		int j = 0;											//Using temporary array
		for (int i = 0; i < A.length-1; i++)
		{
			if (A[i] != A[i+1])
			{
				temp[j++] = A[i];  
			}
		}
		
		temp[j++] = A[A.length-1];
		
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+"  ");  				//last element
		}
		
		
		

	}

}
