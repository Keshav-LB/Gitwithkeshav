/*
 *
*/
package array;
import java.lang.*;
import java.util.*;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scan = new Scanner(System.in);
		int A[]= {1,4,34,56,7};
		
		System.out.println("Array List: " +Arrays.toString(A));
		//System.out.println("Array: "+Arrays.toString(A)); 	
		
		int  key = 34;
		int i, flag = 0;
		
		for( i = 0; i < A.length; i++) {
			if(A[i] == key) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println(i+1);
		}
		else {
			System.out.println("-1");
		}
				
		
	}

}
