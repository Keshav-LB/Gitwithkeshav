package array;
import java.util.*;
//import java.lang.*;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {12, 14, 15, 17, 19};
		int sum = 0;
		//int avg;
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		for(int i =0; i<A.length; i++)
		{
			sum = sum + A[i];
		}
		
		System.out.println("Total Sum: "+sum); 	
		
		double avg = (sum/A.length);											//average
		System.out.println("The average of the array is: "+avg);

	}

}
