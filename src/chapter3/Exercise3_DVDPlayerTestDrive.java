package chapter3;

class DVDPlayer{
  boolean canRecord = false;
  void recordDVD(){
	System.out.println("DVD recording");
  }
}

class Exercise3_DVDPlayerTestDrive {
  public static void main(String[] args) {
	DVDPlayer d = new DVDPlayer();
	d.canRecord = true;

	// Bỏ đoạn code
	// d.playDVD();

	/* Sua loi bai 2
	if (d.canRecord == true){
	  d.recordDVD();
	}
	Thành d.recordDVD();
	*/
	d.recordDVD();
  }
}
