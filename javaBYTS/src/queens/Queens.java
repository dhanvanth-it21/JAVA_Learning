package queens;
import java.util.Scanner;
public class Queens {
	
	
	static void printSolution(int board[][], int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }
	
	static boolean isSafe(int board[][], int row, int col, int N)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
            
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }
	
	
	
	public static boolean solveNQueen(int board[][], int col,int N)
    {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            //if it is safe to place the queen at position i,col -> place it
            if (isSafe(board, i, col,N)) {
                board[i][col] = 1;

                if (solveNQueen(board, col + 1,N))
                    return true;

                //backtrack if the above condition is false
                board[i][col] = 0;
            }
        }
        return false;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int board[][]  = new int[N][N];
        if (!solveNQueen(board, 0,N)) {
            System.out.print("Solution does not exist");
            return;
        }

        printSolution(board,N);

	}

}
