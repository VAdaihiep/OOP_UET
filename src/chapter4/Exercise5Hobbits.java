package chapter4;

public class Exercise5Hobbits {
  String name;

  public static void main(String[] args) {
	Exercise5Hobbits[] h = new Exercise5Hobbits[3];
	int z = 0;

	//Change z < 4 to z < 2
	while (z < 3) {
	  h[z] = new Exercise5Hobbits();
	  h[z].name = "bilbo";
	  if (z == 1) {
		h[z].name = "frodo";
	  }
	  if (z == 2) {
		h[z].name = "sam";
	  }
	  System.out.println(h[z].name + " is a");
	  System.out.println("good Hoobit name");
	  z = z + 1;
	}
  }
}
