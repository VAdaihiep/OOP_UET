package chapter2.exercise3;

import java.util.Scanner;

public class BreakTest {
  public static void main(String[] args) {
	float sum = 0;
	int count, subject = 10;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the marks for " + subject + " subjects: ");
	for (count = 0; count < subject; count++) {
	  float mark;
	  mark = input.nextFloat();
	  sum += mark;
	}

	if (count >= subject)
	  System.out.println("Average mark = " + sum / subject);
	else
	  System.out.println("Error: Invalid mark!");
  }
}
