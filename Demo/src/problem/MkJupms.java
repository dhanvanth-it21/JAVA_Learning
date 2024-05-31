package problem;
import java.util.Scanner;
import java.util.ArrayList;

class fs {
	static int remain = 0;
	static int max = 0;
	int offset;
	int set;
	fs(int f, int s){
		this.offset = f;
		this.set = s;
		remain += set;
		if(max < f+s) max = f+s;
	}
}
public class MkJupms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNo = 0;
		while(true) {
			int n = sc.nextInt();
			caseNo++;
			fs.remain = 0;
			fs.max = 0;
			if(n == 0) break;
			ArrayList<fs> arrFs = new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				arrFs.add(new fs(sc.nextInt(),sc.nextInt()));
			}
			
			int[][] arr = new int[n][fs.max];
			for(int i = 0;i<n;i++) {
				int offset = arrFs.get(i).offset;
				int set = arrFs.get(i).set;
				for(int j = offset;j<offset + set;j++) {
					arr[i][j] = 1;
				}
			}
//			int[][] arr = new int[10][10];
//			for(int i = 0;i<n;i++) {
//				int offset = arrFs.get(i).offset;
//				int set = arrFs.get(i).set;
//				for(int j = offset;j<offset + set;j++) {
//					arr[i][j] = 1;
//				}
//			}
			int startCol = arrFs.get(0).offset;
			int startRow = 0;
			helper(arr, startRow, startCol ,n, fs.max);
			System.out.println(fs.remain);


		}

	}
		
		public static void helper(int[][]arr,int row, int col, int n, int m) {
		if(!isValid(arr, row, col , n,m)) return;
		
		fs.remain--;
		arr[row][col] = 0;
		
		helper(arr, row-2, col-1, n, m);
		helper(arr, row-2, col+1, n, m);
		helper(arr, row+2, col-1, n, m);
		helper(arr, row+2, col+1, n, m);
		helper(arr, row-1, col-2, n, m);
		helper(arr, row-1, col+2, n, m);
		helper(arr, row+1, col-2, n, m);
		helper(arr, row+1, col+2, n, m);
		

		
	}
	
	public static boolean isValid(int[][]arr,int row, int col, int n, int m) {
		if(row >= n || col >= m || row < 0 || col < 0) return false;
		if(arr[row][col] == 0) return false;
		return true;
		
	}
	

}
