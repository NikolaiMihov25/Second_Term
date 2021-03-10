package generics;

import java.util.ArrayList;

public class Generics2<E> extends ArrayList {
	private ArrayList list = new ArrayList<>();
	
	public Object peek() {
		return get(size()-1);
	}
	
	public void push(Object o) {
		add(o);
	}
	
	public Object pop() {
		Object o = get(size()-1);
		remove(size()-1);
		return o;
	}
	
	public String toString() {
		return "stack: " + super.toString();
	}
}
