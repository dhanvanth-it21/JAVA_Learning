package linearSearchAlgorithm;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Dhanvanth";
		char target = 'v';
		boolean ans = linearSearchString(name,target,1,5);
		System.out.println(ans);
		

	}
	
	
//	Using a normal for loop 
	static boolean linearSearchString(String name,char target,int start,int end) {
		if(name.length() == 0) {
			return false;
		}
		for (int i = start; i <= end ; i++) {
			if(name.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}
	

}
