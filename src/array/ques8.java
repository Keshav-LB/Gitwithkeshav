package array;
import java.util.*;

public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {10,3,6,1,2,7,9};
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		int sum = 0;
		int bmark = 0;
		for(int i = 0; i < A.length; i++) 
		{
			if(A[i] == 6)
				bmark = 1;
			else if(A[i] == 7) 			
			{
					bmark = 0;
					i++;
			}
			
			if(bmark != 1)
				sum = sum + A[i];
		}
		System.out.println(sum);
	}

}
