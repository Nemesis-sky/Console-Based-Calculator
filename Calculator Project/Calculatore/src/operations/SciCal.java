package operations;
import java.lang.Math;
import java.util.Scanner;
import logs.logCalculations;

public class SciCal extends logCalculations {
	int result=0;
	Scanner sc=new Scanner(System.in);
//6.SquareRoot
	public int squareRoot(int x) {
     result=(int) Math.sqrt(x);
 	String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
	logCal("Inputs given is "+x+" for the operation "+methodName+" and the result is "+result);
     return result;
	}
//8.Logarithmic value
	public int log(double var) {
		result=(int) Math.log(var);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	9.Natural log
	public int logn(double var) {
		result=(int) Math.log10(var);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	10. sine
	public double sine(double var) {
		double value =Math.toRadians(var) ;
		result=(int) Math.sin(value);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	11.Inverse sine
	public double inverseSine(double var) {
		double value =Math.toRadians(var) ;
		result=(int) Math.asin(value);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	12.Cosine
	public double cosin(double var) {
		double value =Math.toRadians(var) ;
		result=(int) Math.cos(value);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	14. Inverse cosine
	public double inverseCosin(double var) {
		double value =Math.toRadians(var) ;
		result=(int) Math.acos(value);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	15.Tangent
	public double tangent(double var) {
		double value =Math.toRadians(var) ;
		result=(int) Math.tan(value);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
//	16.Inverse tangent
	public double inverseTangent(double var) {
		double value =Math.toRadians(var) ;
		result=(int) Math.atan(value);
		String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
		logCal("Inputs given is "+var+" for the operation "+methodName+" and the result is "+result);
		return result;
	}
	
}
