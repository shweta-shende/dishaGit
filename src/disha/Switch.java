package disha;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a day");
		int day=scn.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid");
			
		}
		

	}

}
