package chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise3 {
  public static void main(String[] args) {
	String dataText;
	Scanner input = null;
	File file = new File("");
	try {
	  input = new Scanner(new File(file.getAbsoluteFile() + "\\src\\chapter6\\Exercise3_Test.txt"));
//	  input.skip("[^a-zA-Z]*");
	  input.useDelimiter(Pattern.compile("[^a-zA-Z]"));
	} catch (FileNotFoundException e) {
	  System.out.println("Cannot open file.");
	  System.exit(0);
	}
	while (input.hasNext()) {
	  dataText = input.next();
	  System.out.print(dataText + " ");
	}
	input.close();
  }
}
