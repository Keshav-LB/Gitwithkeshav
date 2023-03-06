package String;
import java.util.*;
public class ques10 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		
		String repStr = str.substring(str.length()-n);				//substring(beginIndex)
		String outStr = "";
		
		for(int i = 0; i  < n; i++) 
		{
			outStr += repStr;
		}
		
		System.out.println(outStr);
		
	}

}
