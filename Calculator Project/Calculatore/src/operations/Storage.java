package operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import logs.logCalculations;

public class Storage extends logCalculations {
	File f1 = new File("src/operations/store.txt");
	Scanner sc = new Scanner(System.in);

	public void storeNumber() {
		System.out.println("Enter the number you want to store");
		int number = sc.nextInt();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
			bw.write("Stored number is" + Integer.toString(number));
			System.out.println("number " + number + "is successfully stored");
			bw.close();
			String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
			logCal("Inputs given is "+number+" for the operation "+methodName+" and its stored successfully");
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("ERROR! Could not write the file!");
		}
	}

	public void recall(){
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(f1));
			String s = br.readLine();
			System.out.println("Your stored number is" + s);
			String methodName=new Object(){}.getClass().getEnclosingMethod().getName();
			logCal("You start "+methodName+" method and then value you get is "+s);
			br.close();
		} catch (IOException e) {
			System.out.println("Number is not stored");
		}
		
	}

}
