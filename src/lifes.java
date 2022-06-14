package dailyCodingPractice;

/**
 * Conway's Game of Life takes place on an infinite two-dimensional board of square cells. 
 * Each cell is either dead or alive, and at each tick, the following rules apply:

Any live cell with less than two live neighbours dies.
Any live cell with two or three live neighbours remains living.
Any live cell with more than three live neighbours dies.
Any dead cell with exactly three live neighbours becomes a live cell.
A cell neighbours another cell if it is horizontally, vertically, or diagonally adjacent.
 * @author rushvikallampally
 *
 */

public class lifes {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		
		for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
		
		 gameOfLife(arr);
		 System.out.println();
		 System.out.println("after change");
		 System.out.println();
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
		 
	}
	
	public static void gameOfLife(int[][] board) {
	    for(int i=0; i<board.length; i++) {
	        for(int j=0; j<board[0].length; j++) {
	            int live = countNeighbors(board, i, j);
	            if(board[i][j] == 1 && (live < 2 || live > 3)) board[i][j] = 3;
	            if(board[i][j] == 0 && live == 3) board[i][j] = 2;
	        }
	    }
	    
	    for(int i=0; i<board.length; i++) {
	        for(int j=0; j<board[0].length; j++) {
	            if(board[i][j] == 2) {
	                board[i][j] = 1;
	                continue;
	            }
	            if(board[i][j] == 3) {
	                board[i][j] = 0;
	                continue;
	            }
	        }
	    }
	}

	public static int countNeighbors(int[][] board, int row, int col) {
	    int count = 0, rowN = board.length, colN = board[0].length;
	    if(row>0 && (board[row-1][col] == 1 || board[row-1][col] == 3)) count++;
	    if(row<rowN-1 && (board[row+1][col] == 1 || board[row+1][col] == 3)) count++;
	    if(col>0 && (board[row][col-1] == 1 || board[row][col-1] == 3)) count++;
	    if(col<colN-1 && (board[row][col+1] == 1 || board[row][col+1] == 3)) count++;
	    if(row>0 && col>0 && (board[row-1][col-1] == 1 || board[row-1][col-1] == 3)) count++;
	    if(row<rowN-1 && col<colN-1 && (board[row+1][col+1] == 1 || board[row+1][col+1] == 3)) count++;
	    if(row>0 && col<colN-1 && (board[row-1][col+1] == 1 || board[row-1][col+1] == 3)) count++;
	    if(row<rowN-1 && col>0 && (board[row+1][col-1] == 1 || board[row+1][col-1] == 3)) count++;
	    return count;
	}

}
