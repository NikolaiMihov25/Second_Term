package generics;

import java.util.Scanner;

public class TestGenerics2 {

	public static void main(String[] args) {
		Generics2<String> stack2 = new Generics2<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Input 5 strings");
		for(int i = 0; i < 5; i++) {
			stack2.push(in.next());
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(stack2.pop());
		}

	}
	

	}


