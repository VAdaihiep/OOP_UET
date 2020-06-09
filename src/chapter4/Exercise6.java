package chapter4;

public class Exercise6 {
  int id = 0;

  public static void main(String[] args) {
	int x = 0;
	Exercise6[] hq = new Exercise6[5];
	while (x < 3) {
	  hq[x] = new Exercise6();
	  hq[x].id = x;
	  x = x + 1;
	}

	hq[3] = hq[1];
	hq[4] = hq[1];
	hq[3] = null;
	hq[4] = hq[0];
	hq[0] = hq[3];
	hq[3] = hq[2];
	hq[2] = hq[0];

	/*
	HQ[0]: không tham chiếu đến đối tượng nào
	HQ[1]: chiếu đến đối tượng hq
	HQ[2]: không tham chiếu đến đối tượng nào
	HQ[3]: chiếu đến đối tượng hq
	HQ[4]: chiếu đến đối tượng hq

	for (int i = 0; i < 5; i++) {
	  System.out.println("hq[i]" + hq[i] + " i " + i);
	}
	System.out.println("hq[0]" + hq[0]);
	System.out.println("hq[1]" + hq[1]);
	System.out.println("hq[2]" + hq[2]);
	System.out.println("hq[3]" + hq[3]);
	System.out.println("hq[4]" + hq[4]);

	*/
  }
}
