package backtracking;

import java.util.*;

public class NQueensProblem {
	
	static void printBoard(int[][] board, int n) {
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
		}
		System.out.println();
	}
	
	static boolean isSafe(int[][] board, int row, int col, int n) {
		// for row
		for(int i = 0;i<col;i++) 
			if(board[row][i] == 1) return false;
		
		//for upper diagonal for left
		for(int i = row, j = col;i>= 0 && j>=0;i--,j--)
			if(board[i][j] == 1) return false;
		
		//for down diagonal for left
		for(int i = row, j = col;i<n && j>=0;i++,j--)
			if(board[i][j] == 1) return false;
		return true;
	}
	// finding configuration using backtracking
	static void solve(int[][]board, int col, int n) {
		//base condition
		if(col>=n) {
			printBoard(board,n);
			return;
		}
		// backtracking : set as 1 -> solve -> rest to 0
		for(int i = 0;i<n;i++) {
			if(isSafe(board,i,col,n)) {
				board[i][col] = 1;
				solve(board,col+1,n);
				board[i][col] = 0;
			}
		}
		return ;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getting no. of queens and board n*n
		System.out.println("enter N-Queens: ");
		int n = sc.nextInt();
		//when n is 1
		if(n == 1) {
			System.out.println(1);
			return ;
		}
//		when n is 2 and 3 it is not possible to make it
		if(n == 2 || n == 3) {
			System.out.println("arrangements cann't be made");
			return;
		}
		// making n*n matrix and marking it's value as 0
		int[][] board = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				board[i][j] = 0;
			}
		}
		// finding the configuration
		solve(board,0,n);
		

	}

}
