package chapter6.defaultMethod;

class Default {
}

public class DefaultMethod extends Default {
  public static void main(String[] args) {
	DefaultMethod defaultMethod = new DefaultMethod();
	DefaultMethod defaultMethod2 = new DefaultMethod();

    /*
    public final Class getClass():
    Phương thức này trả về một lớp Class, lớp Class này chứa đựng các thông tin được xây dựng sẵn liên quan đến đối tượng đang gọi.
     */
	System.out.println(defaultMethod.getClass());
	System.out.println(defaultMethod.getClass().getName());
	System.out.println(defaultMethod.getClass().getSimpleName());

    /*
    int hashCode(): Phương thức này trả về một giá trị hash code.
     */
	System.out.println(defaultMethod.hashCode());
	System.out.println(defaultMethod2.hashCode());

    /*
    boolean equals(Object obj):
      So sánh 2 đối tượng bất kỳ với nhau.
      Chuỗi là một Đối tượng, vì vậy nó sẽ kế thừa phương thức equals() này từ lớp cha Object.
      equals() của Chuỗi đã có override lại phương thức này của lớp cha chứ không hoàn toàn kế thừa.
     */
	System.out.println(defaultMethod.equals(defaultMethod2));
	//Hai đối tượng giống nhau, không phải là do chúng được tạo ra từ một lớp, mà vì chúng có giá trị tham chiếu như nhau.

	/*
	String toString(): trả về một kiểu Chuỗi diễn đạt cho đối tượng này.
	Nội dung của nó là sự kết hợp của chuỗi (getClass().getName() + “@” + Integer.toHexString(hashCode())).
	 */
	System.out.println("toString: " + defaultMethod);
	System.out.println("toString: ".toString() + defaultMethod.toString());
  }
}
