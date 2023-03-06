package flow_control_statements;
import java.lang.*;
import java.util.*;




public class ques1 {
	static boolean lastdigit(int a, int b)
	{
		int digit1= a%10;
		int digit2= b%10;
		if (digit1==digit2)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if (n>0) {System.out.println("Positive number : "+n);}
		else if(n<0) {System.out.println("Negative number : "+n);}
		else 
			System.out.println("Zero : "+n);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//int lastdigit(int a, int b);
		
		
		
		System.out.print(lastdigit(a,b));

	}

}
