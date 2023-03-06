package String;
import java.lang.*;
import java.util.*;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		String str3;
		
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
		{
					
			str3 = str1.substring(0, str1.length()-1) + str2;
			
			System.out.println("The string: "+str1.substring(0, str1.length()-1));
			System.out.print("The string: "+str3.toLowerCase());
			
		}
		else
		{
			str3 = str1 + " "+str2;
			System.out.print("The string: "+str3.toLowerCase());
		}


		

	}

}
