package chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise3 {
  public static void main(String[] args) {
	long startTime = System.currentTimeMillis();
	String dataLine;
	Scanner input = null;
	try {
	  input = new Scanner(new File("C:\\HNL\\OOP_UET\\src\\chapter6\\Exercise3_Test.txt"));
//	  input.skip("[^a-zA-Z]*");
	  input.useDelimiter(Pattern.compile("[^a-zA-Z]"));
	} catch (FileNotFoundException e) {
	  System.out.println("Cannot open file.");
	  System.exit(0);
	}
	while (input.hasNext()) {
	  dataLine = input.next();
	  System.out.print(dataLine + " ");
	}
	input.close();
	System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");
  }
}
