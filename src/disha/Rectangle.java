package disha;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int l,b,a,p;
		System.out.println("enter the length and breadth");
		l=scn.nextInt();
		b=scn.nextInt();
		a=l*b;
		p=2*(l+b);
		System.out.println("area of rectangle "+a);
		System.out.println("perimeter of rectangle "+p);
		

	}

}
