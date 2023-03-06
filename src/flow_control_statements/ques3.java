package flow_control_statements;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		if(args.length == 0) {
			System.out.println("No values");
		}
		else {
			for(String name : args) {
				System.out.print(name + " ");
			}
		}*/
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		int k = args.length;
		if(k==0) {System.out.println("No values");}
		else 
		{
			System.out.print(args[3]);
			for(int i=1;i<k;i++)
			{
				System.out.print(","+ args[i]);
			}
		}

	}

}
