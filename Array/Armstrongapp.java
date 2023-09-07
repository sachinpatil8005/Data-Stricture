package Array;

import java.util.Scanner;

public class Armstrongapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Armstrong p = new Armstrong();
			System.err.println("enter your no to get armstrong nos  ");
			int ch=sc.nextInt();
			System.out.println("list of armstrong no's ");
			p.armstrong(ch);
			
	
		

	}

}
