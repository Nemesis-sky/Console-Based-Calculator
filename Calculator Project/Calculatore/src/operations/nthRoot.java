package operations;

import java.util.Scanner;
import logs.logCalculations;

public class nthRoot extends logCalculations{
	  public void nth_Root() {
	        Scanner s = new Scanner(System.in);
	        int num, n;
	        System.out.println("Enter the number");
	        num = s.nextInt();
	        System.out.println("Enter the number to find the nth root");
	        n = s.nextInt();
	        nthRoot nth = new nthRoot();
	        nth.root(num, n);
	    	String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
	    	logCal("Inputs given is "+num+" and "+n+" for the operation "+methodName);
	    	s.close();
	    }
	    void root(int num, int n) {
	        int count = 0, prod = 1, i;
	        for (i = 1; i <= num / n; i++) {
	            int j = 1;
	            while (j <= n) {
	                prod = prod * i;
	                j++;
	            }
	            if (prod == num) {
	                System.out.println(i + " is the " + n + " th root of " + num);
	                count++;
	            }
	            prod = 1;
	        }
	        if (count == 0){
	            System.out.println(n + " th root does not exist");
	        }     
	    }
}
