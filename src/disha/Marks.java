package disha;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int m1,m2,m3,m4,t;
	float per;
	char gr;
	System.out.println("enter marks in 4 subjects");
	m1=scn.nextInt();
	m2=scn.nextInt();
	m3=scn.nextInt();
	m4=scn.nextInt();
	
	t =m1+m2+m3+m4;
	per=t/4;
	if(per>=90)
	{gr='A';
	}
	else if(per>=70)
	{gr='B';}
	
	else if(per>=50)
	{gr='C';}
	else {
		gr='D';
	}
	
	System.out.println("total marks="+t);
	System.out.println("percentage="+per);
	System.out.println("grade="+gr);
	

	}

}
