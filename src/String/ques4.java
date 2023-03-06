package String;
import java.util.*;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		if(str.length() % 2 ==0)
		{
			System.out.println(str.substring(0, str.length()/2));
		}
		else
			System.out.println("null");

	}

}
