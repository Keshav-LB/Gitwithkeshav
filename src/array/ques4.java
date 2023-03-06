package array;
import java.util.*;
import java.lang.*;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] ascii = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
		System.out.println("Array List: "+Arrays.toString(ascii)); 
		for(int i = 0; i < ascii.length; i++) {
			System.out.print((char)ascii[i]+" ");
		}
		System.out.println();
		System.out.println("Ascii length : "+ascii.length);
	}

}
