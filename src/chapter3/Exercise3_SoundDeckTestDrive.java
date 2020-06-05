package chapter3;

class Exercise3_SoundDeck {
  boolean canRecord = false;

  void play() {
	System.out.println("playing");
  }

  void record() {
	System.out.println("recording");
  }
}

class Exercise3_SoundDeckTestDrive {
  public static void main(String[] args) {
	//Sua loi bai 2
	Exercise3_SoundDeck t = new Exercise3_SoundDeck();
	t.canRecord = true;
	t.play();
	//Sua loi bai 2
	// t.canRecord == true -> t.canRecord
	if (t.canRecord) {
	  t.record();
	}
  }
}
