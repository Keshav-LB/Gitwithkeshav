package flow_control_statements;
import java.util.*;

public class ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("ENter the number : ");
	//	String a = sc.nextLine();
	//	int sum =0;
		//for(int i =0; i<=a.length();i++)
	//	{
	//		sum = a[i]+a[length];
			
	//	}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		//String num = scan.nextLine();
		int sum;
		
		for(sum = 0; num > 0; num = num/10) 
	        	sum = sum + (num % 10);
		
		System.out.println(sum);
		
		

	}

}
