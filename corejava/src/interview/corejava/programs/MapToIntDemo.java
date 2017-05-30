package interview.corejava.programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MapToIntDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 20);
		Employee e2 = new Employee(2, 15);
		Employee e3 = new Employee(3, 30);
		List<Employee> list = Arrays.asList(e1, e2, e3);
		int sum = list.stream().mapToInt(e -> e.getAge()).sum();
		System.out.println("Sum: " + sum);
		int count = (int) list.stream().mapToInt(e -> e.getAge()).count();
		
		System.out.println("count: " + count);
		OptionalInt average =  list.stream().mapToInt(e -> e.getAge()).min();
		System.out.println("average: " + average);
	}
}

class Employee {
	private int id;
	private int age;

	public Employee(int id, int age) {
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
}