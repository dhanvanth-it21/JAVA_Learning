package stackProblems;

import java.util.Scanner;
import java.util.Stack;

public class StackIntro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s  =new Stack<>();
		s.push(1); 
	    s.push(2); 
	    s.push(3); 
	    s.push(4); 
	    s.push(5); 
	    System.out.println(s);
	    System.out.println(s.empty());
	    int x = s.pop();
	    System.out.println(x);
	    System.out.println(s);
	    while(!s.empty()) {
	    	s.pop();
	    }
	    System.out.println(s);
	    System.out.println(s.empty());
//	    
	    s.push(1); 
	    s.push(2); 
	    s.push(3); 
	    s.push(4); 
	    s.push(5); 
	    System.out.println(s.peek());
	    System.out.println(s);
	    System.out.println(s.size());
	    System.out.println(s.search(10));
	    

	}
}
