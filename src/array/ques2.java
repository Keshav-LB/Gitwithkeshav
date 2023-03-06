package array;
import java.util.*;
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {19, 14, 15, -17, 18,3, 77, 23, 16};
		
		System.out.println("Array: "+Arrays.toString(A)); 	
		
		int max = A[0];																	//max value
		for(int i = 1; i < A.length; i++) {
			if(A[i] > max)
				max = A[i];
		}
		System.out.println("The maximum value of Array is: "+max);
		
		
		
		int min = A[0];																	//min value
		for(int i = 1; i < A.length; i++) {
			if(A[i] < min)
				min = A[i];
		}
		System.out.println("The minimum value of Array is: "+min);
		
	}

}
