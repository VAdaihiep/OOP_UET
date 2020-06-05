package chapter2.exercise3;

import java.util.Scanner;

public class WhileExample {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int count, number;
	System.out.println("Enter a number: ");
	number = input.nextInt();

	count = 1;
	while (count <= number) {
	  System.out.println(count + " ");
	  count++;
	}
	System.out.println("BOOOOOM!");
  }
}
