package flow_control_statements;
import java.lang.*;
import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		char a = 'b';
		
		if((a >= 65 && a <= 90) || (a >= 97 && a <= 122) ) {
			System.out.println("Alphabet");
		}
		else if(a >= 48 && a <= 57) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
		

	}

}

