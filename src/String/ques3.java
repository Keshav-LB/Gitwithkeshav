package String;
import java.util.*;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		String Str1 = str.substring(0, 2);				//substring(beginIndex, endIndex)
		String outStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			outStr += Str1;
		}
		System.out.println(outStr);
		
		

	}

}
