package array;
import java.util.*;

public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,10,10,2};
		System.out.println("Array: "+Arrays.toString(A));
		
		Arrays.sort(A);										//sort
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		int[] temp = new int[A.length];
		int j = 0;											
		
		for (int i = 0; i < A.length-1; i++)
		{
			if (A[i] == A[i+1])
			{
				A[i]=0;
				A[i+1]=0;
			}
		}
		
		for(int element : A) {
			System.out.print(element + " ");
		}
	}

}
