package chapter7.exercise5;

import chapter7.exercise5.peoples.Employee;
import chapter7.exercise5.peoples.Person;

public class PeopleTest {

  public static void main(String[] args) {
	Person[] people = new Person[3];
	people[0] = new Person("B Thi", "20/02/2002");
	people[1] = new Employee("A Nguyen", "9/6/96", 1000);
	people[2] = new Manager("Hai Nguyen", "3/3/2000", 2000, (Employee) people[1]);

	for (Person person : people) {
	  System.out.println(person.toString());
	}

  }
}
