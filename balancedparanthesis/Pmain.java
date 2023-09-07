package balancedparanthesis;

import java.util.Scanner;

public class Pmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter yor parenthesis");
		Scanner sc = new Scanner(System.in);
		String input;
		input=sc.next();
		System.out.println(input);
		Pstack s=new Pstack(input);
		if(s.balenced())
			System.out.println("balanced paranthesis");
		else
			System.out.println("not balanced");
		

	}

}
