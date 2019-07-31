package PhoneBook;

import java.util.*;

public class expandArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] numbers = {8,7};
		numbers = expandArray(numbers);
		numbers [numbers.length - 1]=9;
		numbers = expandArray(numbers);
		numbers [numbers.length - 1]=76;
		numbers = expandArray(numbers);
		numbers [numbers.length - 1]=100;
		numbers = expandArray(numbers);
		numbers [numbers.length - 1]=14;
		numbers = expandArray(numbers);
		numbers [numbers.length - 1]=43;
		System.out.println(Arrays.toString(numbers));

	}
	public static int [] expandArray(int[] source) {
		int[] result = new int[source.length + 1];
		for (int i = 0; i<source.length;i++) {
			result[i]=source[i];
		}
		return result;
		
	
	}

}
