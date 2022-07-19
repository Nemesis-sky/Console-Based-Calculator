package operations;

import java.lang.Math;
import java.util.Scanner;
import logs.logCalculations;


public class BasicCal extends logCalculations{
	int result=0;
	Scanner sc = new Scanner(System.in);


//1.Addition
	public  Integer addition(int x,int y) {
		result=Math.addExact(x,y);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+x+" and "+ y +"for the operation "+methodName+" and the result is "+result);
		return result;
	 	
	}

//	2.Subtraction
	public Integer subtraction(int x,int y) {
        result=Math.subtractExact(x,y);
    	String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+x+" and "+ y +"for the operation "+methodName+" and the result is "+result);
		return result;
	}

//	3.Multiplication
	public Integer multiplication(int x,int y) {
	result=Math.multiplyExact(x,y);
	String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
	logCal("Inputs given is "+x+" and "+ y +"for the operation "+methodName+" and the result is "+result);
		return result;
	}

//	4.Division
	public Integer division(int x,int y) {
		result=Math.floorDiv(x, y);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+x+" and "+ y +"for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	5.PowerOf
	public Integer powerOf(int x,int y) {
		result=(int) Math.pow(x,y);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+x+" and "+ y +"for the operation "+methodName+" and the result is "+result);
		return result;
		
	}
}

