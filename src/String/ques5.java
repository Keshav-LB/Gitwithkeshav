package String;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(str.substring(1, str.length()-1));

	}

}
