package logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class logCalculations {
public void logCal(String result) {
	File logfile=new File("src/logs/CalculationsHistory.txt");
	try {
		BufferedWriter bw=new BufferedWriter(new FileWriter(logfile,true));
		bw.write(result);
		bw.newLine();
		bw.close();
	} catch (IOException e) {
	System.out.println("unable to write in file due to "+e);
	}
}
}
