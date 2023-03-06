package String;
import java.util.*;
public class ques7 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		
		if (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
		{
			System.out.println(str.substring(1, str.length()-1));
		}
		else
			System.out.println(str);
		
	}

}
