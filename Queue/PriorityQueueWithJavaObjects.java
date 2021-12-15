package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}


class EmpComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.salary - e2.salary;
		
	}
	
}

public class PriorityQueueWithJavaObjects {
	

	public static void main(String[] args) {
		
		EmpComparator comparator = new EmpComparator();
		PriorityQueue<Employee> pr = new PriorityQueue<>(10, comparator);
		
		pr.add(new Employee("A",1000));
		pr.add(new Employee("B",2000));
		pr.add(new Employee("C",2500));
		pr.add(new Employee("D",2100));
		pr.add(new Employee("E",10));
		pr.add(new Employee("F",100));
		pr.add(new Employee("G",50));
		
		System.out.println(pr.size());
		System.out.println(pr.poll()); //remove the value
		
		System.out.println(pr);
		

	}

}
