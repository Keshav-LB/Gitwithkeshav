package flow_control_statements;
import java.util.*;

public class ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int m = num;
		int rev=0;
		int digit;
		
		
		for(int i =0; i!=num; num = num / 10)
		{
			digit=num%10;
			rev = rev * 10 + digit;
			
		}
		
		
		System.out.println("Reverse number: " +rev);
		
		if(m==rev)
			System.out.println("pailndrome number: " +rev);
		else
			System.out.println("not a pailndrome number: " +rev);
		

	}

}
