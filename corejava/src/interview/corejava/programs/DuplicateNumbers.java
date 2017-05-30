package interview.corejava.programs;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
	private static Integer findDuplicateNumbers(List<Integer> numbers) {
		int highestNUmber = numbers.size() - 1;
		int total = getSum(numbers);
			//	- (highestNUmbers*(highestNUmbers+1)/2);
		int duplicate = total - (highestNUmber*(highestNUmber+1)/2);
		return duplicate;
	}

	private static int getSum(List<Integer> numbers) {
		int sum=0;
		for (int num : numbers) {
			sum+=num;
		}
		return sum;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			list.add(i);
		}
		list.add(5);
		Integer duplicateNumbers = findDuplicateNumbers(list);
		System.out.println("duplicate NUbers:" + duplicateNumbers);

	}

}
