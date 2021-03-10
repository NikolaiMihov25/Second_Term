package generics;

import java.util.Scanner;

public class TestGenericStack {
	public static void main(String[] args) {
		// Create a Scanner
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Input 5 strings");
		for(int i = 0; i < 5; i++) {
			stack1.push(in.nextLine());
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}

	}
	

}
