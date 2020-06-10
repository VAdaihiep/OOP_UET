package chapter7.exercise5;

import chapter7.exercise5.peoples.Employee;

public class Manager extends Employee {
  private Employee assistant;

  public Manager(String name, String birthDay, double salary, Employee assistant) {
	super(name, birthDay, salary);
	this.assistant = assistant;
  }

  public void setAssistant(Employee assistant) {
	this.assistant = assistant;
  }

  @Override
  public String toString() {
	return ("\nLý lịch của quản lý: ") + super.toString() + ("\n\nThông tin nhân viên của quản lý: ") + this.assistant;
  }
}
