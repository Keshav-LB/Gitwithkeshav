package String;
import java.util.*;
public class question1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		System.out.println("String lengths: "+str.length());
		
		StringBuffer sbr = new StringBuffer(str);
		System.out.println("String Reverse:: "+sbr.reverse());
		
		
		String revStr = sbr.toString();
		
		if (str==revStr)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
		

	}

}
