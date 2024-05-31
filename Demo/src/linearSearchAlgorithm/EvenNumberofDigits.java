package linearSearchAlgorithm;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,4,8,7,658,121,84,485,4,45};
		int n = findNumbers(arr);
		System.out.println(n);

	}
	
	// to find how many numbers in array are evenDigitedNumbers
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int i : nums) {
			if(even(i)) {
				count++;
			}
		}
		return count;
	}
	
	
	// checking it as even or not
	public static boolean even(int a) {
		int n = nDigits2(a);
		return n%2 == 0;
	}
	
	
//	counting the number of digits in a number
	static int nDigits(int a) {
		if(a == 0) {
			return 1;
		}
		int c = 0;
		while(a>0) {
			c++;
			a = a/10;
		}
		return c;
	}
//	still more efficient way to count the number of digits in a number
	static int nDigits2(int a) {
		return (int)(Math.log10(a)) + 1;
	}

}
