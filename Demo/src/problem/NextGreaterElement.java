package problem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class NextGreaterElement {
	static Stack<Integer> stack = new Stack<>();
	static int check(int n) {
		if(stack.isEmpty()) {
			stack.add(n);
			return -1;
		}
		int top_element = stack.peek();
		if(top_element > n) {
			stack.add(n);
			return top_element;
		}
		else {
			stack.pop();
			return check(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(7);
		list1.add(1);
		list1.add(4);
		list1.add(8);
		list1.add(3);
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<>(Collections.nCopies(list1.size(),-1));
		System.out.println(list2);
		for(int i = list1.size()-1;i >= 0 ;i--) {
			int c = check(list1.get(i));
			list2.set(i,c);
		}
		System.out.println(list2);
	}

}
