package stackProblems;

import java.util.Scanner;
import java.util.Stack;

public class FindDupilcateParanthesis {
	public static boolean fdp(char[] charr) {
		Stack<Character> st = new Stack<>();
		for(char ch : charr) {
			if(ch == ')') {
				if(st.peek() == '(') {
					return true;
				}
				while(st.peek() != '('){
					st.pop();
				}
				st.pop();
			}
			else{
				st.push(ch);
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("enter the expression: ");
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		char[] charr = s.toCharArray();
		boolean check = fdp(charr);
		System.out.println(check);
		

	}

}
