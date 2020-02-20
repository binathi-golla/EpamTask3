package com.demo.calculator;

import java.util.Scanner;

public class calci1 {
	 public static void main(String[] args) 
	 {
		 int a, b, res;
		 char ch;
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.print("Enter First Number : ");
		 a=scan.nextInt();
		 System.out.print("Enter Second Number : ");
		 b=scan.nextInt();
		 System.out.print("Enter Operator (+,-,*,/) : ");
		 ch=scan.next().charAt(0);
		 
		 if(ch == '+')
		 {
			 res = a + b;
			 System.out.print("Result = " +res);
		 }
		 else if(ch == '+')
		 {
			 res = a - b;
			 System.out.print("Result = " +res); 
		 }
		 else if(ch == '*')
		 {
			 res = a * b;
			 System.out.print("Result = " +res);
		 }
		 else if(ch == '/')
		 {
			 res = a / b;
			 System.out.println("Result = " +res);
		 }
		 else 
		 {
			 System.out.println("Wrong Operator !!!");
		 }
	 
	 scan.close();
	 }


}
