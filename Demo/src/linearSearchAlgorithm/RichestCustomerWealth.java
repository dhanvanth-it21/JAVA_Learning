package linearSearchAlgorithm;



public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{2,3,5},
				{3,2,1}
		};
		System.out.println(maximumWealth(arr));

	}
public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
        	int sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			if(max < sum) {
				max =sum;
			}
		}
        
        
        return max;
    }

}
