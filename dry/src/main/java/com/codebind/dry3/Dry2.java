package com.codebind.dry3;

public class Dry2 {
	public void lab(){
	    System.out.println("Welcome to lab session");
	    performTasks();
	    }
	    
	    public void theory(){
	     System.out.println("Welcome to theory session");
	      performTasks();
	    }
	    public void performTasks(){
	        System.out.println("Lecturer delivering a lesson");
	        System.out.println("Marking attendance");
	        System.out.println("Students taking down their notes");
	    }
	    }
	    class dryMain{
	          public static void main(String args[]){
	           Dry2 d=new Dry2();
	           d.lab();
	           d.theory();
	           }

}
