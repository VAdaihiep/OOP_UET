package chapter7.exersice4;

public class Exercise4_MixedUp {
  public static void main(String[] args) {
	A a = new A();
	B b = new B();
	C c = new C();
	A a2 = new C();
	//a
	//B's m1, A's m2, A's m3,
	b.m1();
	c.m2();
	a.m3();

	//b
	//B's m1, A's m2, C's m3, 8
	c.m1();
	c.m2();
	c.m3();

	//c
	//A's m1, A's m2, C's m3, 8
	a.m1();
	b.m2();
	c.m3();

	//d
	//B's m1, A's m2, C's m3, 8
	a2.m1();
	a2.m2();
	a2.m3();
  }
}
