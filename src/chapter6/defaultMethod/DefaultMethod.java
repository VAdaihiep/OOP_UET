package chapter6.defaultMethod;

class Default {
}

public class DefaultMethod extends Default {
  public static void main(String[] args) {
	DefaultMethod defaultMethod = new DefaultMethod();
	DefaultMethod defaultMethod2 = new DefaultMethod();

    /*
    public final Class getClass():
     trả về lớp mà đối tượng hiện hành đã được tạo từ đó.
     */
	System.out.println(defaultMethod.getClass());
	System.out.println(defaultMethod.getClass().getName());
	System.out.println(defaultMethod.getClass().getSimpleName());

    /*
    int hashCode(): Phương thức này trả về một giá trị hash code(mã băm) (số nguyên) là địa chỉ bộ nhớ của đối tượng.).
     */
	System.out.println(defaultMethod.hashCode());
	System.out.println(defaultMethod2.hashCode());

    /*
    boolean equals(Object obj):
      kiểm tra xem hai đối tượng hiện hành có 'bằng nhau' hay không.
      Chuỗi là một Đối tượng, vì vậy nó sẽ kế thừa phương thức equals() này từ lớp cha Object.
      equals() của Chuỗi đã có override lại phương thức này của lớp cha chứ không hoàn toàn kế thừa.
     */
	System.out.println(defaultMethod.equals(defaultMethod2));
	//Hai đối tượng giống nhau, không phải là do chúng được tạo ra từ một lớp, mà vì chúng có giá trị tham chiếu như nhau.

	/*
	String toString(): trả về biểu diễn dạng String của đối tượng.
	Nội dung của nó là sự kết hợp của chuỗi (getClass().getName() + “@” + Integer.toHexString(hashCode())).
	Thường cài đè phương thức này để trả về biểu diễn String theo ý muốn của ta thay vì trả về
		chuỗi kí tự được kết xuất một cách tổng quát như bên trên.
	 */
	System.out.println("toString: " + defaultMethod);
	System.out.println("toString: ".toString() + defaultMethod.toString());
  }
}
