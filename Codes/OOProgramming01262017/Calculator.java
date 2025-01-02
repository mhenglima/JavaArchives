package OOProgramming01262017;

import java.util.Scanner;

public class Calculator {
	
	public static Scanner sc = new Scanner(System.in);
	public static int nNum1, nNum2;
	private String sBrand, sColor, sType;

	public String getBrand() {
		return sBrand;
	}

	public void setBrand(String sBrand) {
		this.sBrand = sBrand;
	}

	public String getColor() {
		return sColor;
	}

	public void setColor(String sColor) {
		this.sColor = sColor;
	}

	public String getType() {
		return sType;
	}

	public void setType(String sType) {
		this.sType = sType;
	}
	
	public void addition(){
		System.out.print("First number: ");
		nNum1 = sc.nextInt();
		
		System.out.print("Second number: ");
		nNum2 = sc.nextInt();
		
		System.out.println(nNum1 + " + " + nNum2 + " = " + (nNum1+nNum2));
	}
	
	public void subtraction() {
		System.out.print("First number: ");
		nNum1 = sc.nextInt();
		
		System.out.print("Second number: ");
		nNum2 = sc.nextInt();
		
		System.out.println(nNum1 + " - " + nNum2 + " = " + (nNum1-nNum2));		
	}

}
