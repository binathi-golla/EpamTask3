package com.codebind.hello3;

public class Month {

	public void weekday2(int day) {
		if ((day < 1) || (day > 12)) 
			System.out.println("Enter months in range");
		else {
		String[] days = {
		"jan",
		"feb",
		"march",
		"april",
		"may",
		"june",
		"july",
		"aug",
		"sep",
		"oct",
		"nov",
		"dec"
		};
		System.out.println(days[day-1]);
		}
		
		
	}
}
class kissmain{
	public static void main(String[] args) {
		Month obj=new Month();
		obj.weekday2(4);
		
	}
}
