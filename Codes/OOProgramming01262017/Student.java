package OOProgramming01262017;

import java.util.Scanner;
public class Student {
	
	private String sName, sIdNum;
	private int nAge;
	
	public void setName(String sName) {
		this.sName = sName;
	}	
	public String getName() {
		return sName;
	}	
	public void setIdNum(String sIdNum) {
		this.sIdNum = sIdNum;
	}	
	public String getIdNum() {
		return sIdNum;
	}	
	public void setAge(int nAge) {
		this.nAge = nAge;
	}	
	public int getAge() {
		return nAge;
	}
	
	public void shout(){ // Unique method. Will print ANIMO when executed/invoked.
		System.out.println("ANIMO!");
	}
	
	/*
		The following method will let the Student object interact with the Calculator object.
		The Calculator object in this case is called "calc".
		It will access the addition<calc.addition()> subtraction<calc.subtraction()> methods of the Calculator class.  
	*/
	
	public void useCalculator(Calculator calc) { 
		Scanner sc = new Scanner(System.in);
		int nChoice;
		System.out.println("What operation would you like to do?");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.print("You choice " + sName + ": ");
		nChoice = sc.nextInt();
		
		if(nChoice == 1)
			calc.addition();
		else
			calc.subtraction();
	}	
	
}
