package linearSearchAlgorithm;

public class SearchInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Dhanvanth";
		char target = 'v';
		boolean ans = linearSearchString(name,target);
		System.out.println(ans);
		System.out.println(linearSearchString1(name, target));

	}
	
	
//	Using a normal for loop 
	static boolean linearSearchString(String name,char target) {
		if(name.length() == 0) {
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}
	
//	Using for each loop 
	static boolean linearSearchString1(String name,char target) {
		if(name.length() == 0) {
			return false;
		}
		for (char ch:name.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
		return false;
	}
	

}
