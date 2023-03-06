package array;
import java.util.*;
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int A[]= {12, 77, 84, 3, 14, 15, 17, 19};
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		for(int i = 0 ; i<A.length-1; i++ )
		{
			for(int j = 0 ; j<A.length-1; j++)
			{
				if(A[j]>A[j+1])
				{
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
				}
			}
		}
		
		System.out.print("Sorted Array : ");
		for(int element : A) {
			System.out.print(element + " ");
		}
		

	}

}
