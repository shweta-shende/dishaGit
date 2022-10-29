package disha;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int m1,m2,m3,m4,m5,t;
		float per;
		System.out.println("enter m1 marks ");
		m1=scn.nextInt();
		System.out.println("enter m2 marks ");
		m2=scn.nextInt();
		System.out.println("enter m3 marks ");
		m3=scn.nextInt();
	System.out.println("enter m4 marks ");
	m4=scn.nextInt();
	System.out.println("enter m5 marks ");
	m5=scn.nextInt();
	 t=m1+m2+m3+m4+m5;
	 per=t/5;
	 System.out.println("total marks "+t);
	 System.out.println("percentage "+per);

}
}