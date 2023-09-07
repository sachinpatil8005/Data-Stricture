package Array;

import java.util.Scanner;

public class Primeapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Primeno p = new Primeno();
		while(true)
		{
			System.err.println("enter your choice ");
			System.out.println("1.check no is prime or not");
			System.out.println("2.list prime no from 0 to your number ");
			System.out.println("3.exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter your no to check");
				int a=sc.nextInt();
				if(p.checkprime(a))
					System.out.println("no is prime no");
				else
					System.out.println("entered no is not a prime no");
				break;
			case 2:
				System.out.println("enter your no to grt prime no's ");
				int b=sc.nextInt();
				p.listPrimes(b);
				break;
			case 3:
				System.out.println("exit from programme bye..........");
				System.exit(0);
			}
		}

	}

}
