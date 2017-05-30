package interview.corejava.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FilterFindFirstAndForEach {
	public static void main(String[] args) {
		List<Users> list = Users.getUsers();
		System.out.println("Using findFirst() ---");
		Users user = list.stream().filter(u -> u.getName().endsWith("sh"))
				.findFirst().orElse(null);
		System.out.println(user.getName());
		System.out.println("Using forEach() ---");
		list.stream().filter(u -> u.getName().endsWith("sh"))
				.forEach(u -> System.out.println(u.getName()));
		
		
		
		
		List<String> lists = new ArrayList<>();
		lists.add("Mohan");
		lists.add("Sohan");
		lists.add("Mahesh");
		Map<String, Object> map = lists.stream().collect(Collectors.toMap(Function.identity(), s->s));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}
} 

 class Users {
	private int id;
	private String name;
	private int age;
	public Users(int id, String name, int age) {
		this.id = id; 
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static List<Users> getUsers() {
		List<Users> list = new ArrayList<Users>();
		list.add(new Users(1, "Dinesh", 20));
		list.add(new Users(2, "Kamal", 15));
		list.add(new Users(3, "Vijay", 25));
		list.add(new Users(4, "Ramesh", 30));
		list.add(new Users(5, "Mahesh", 18));
		return list;
	}
} 