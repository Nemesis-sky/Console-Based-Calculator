package operations;

import java.util.Scanner;
import logs.logCalculations;

public class d2bandb2d extends logCalculations{
Scanner sc=new Scanner(System.in);
public void d2b() {
	System.out.println("Enter the number to convert to binary");
	double number=sc.nextDouble();
	String result = Integer.toBinaryString((int) number);
	System.out.println("Your Binary code is "+result);
	String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
	logCal("Inputs given is "+number+" for the operation "+methodName+" and the result is "+result);

}
public void b2d() {
	System.out.println("Enter the number to convert to binary");
	String number=sc.nextLine();
	int result = Integer.parseInt(number,2);
	System.out.println("Your decimal number is "+result);
	String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
	logCal("Inputs given is "+number+" for the operation "+methodName+" and the result is "+result);
}
}
