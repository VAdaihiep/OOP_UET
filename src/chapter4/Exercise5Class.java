package chapter4;

class Books {
  String title;
  String author;
}

public class Exercise5Class {
  public static void main(String[] args) {
    //Change Books(3) to Books[3]
	Books[] books = new Books[3];
	int x = 0;

	//add this
	books[0] = new Books();
	books[1] = new Books();
	books[2] = new Books();

	books[0].title = "A";
	books[1].title = "B";
	books[2].title = "C";

	books[0].author = "1";
	books[1].author = "2";
	books[2].author = "3";

	while (x < 3) {
	  System.out.println(books[x].title);
	  System.out.println(" by ");
	  // Change rnyBooks to books
	  System.out.println(books[x].author);
	  x = x + 1;
	}
  }
}
