package disha;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(a>b)
		{
			System.out.println(a + "is greater than " +b);
		}else
		{
			System.out.println(a + "is less than " +b);
		}

	}

}
