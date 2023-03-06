package flow_control_statements;
import java.util.*;

public class ques15 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		for(int i = 0; i<num; i++)
		{
			//inner loop work for space      
			for (int j=2*(num-i); j>=0; j--)         
			{  
				System.out.print(" ");  //prints space between two stars       
			}   
			
			
			for(int j = 0; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
