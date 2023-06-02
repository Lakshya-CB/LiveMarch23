package Lec_27;

public class word_sea {
	public boolean exist(char[][] board, String word) {
		for(int r =0;r<board.length;r++) {
			for(int c =0;c<board[0].length;c++) {
				if(board[r][c]==word.charAt(0)) {
//					r,c => word!!
					if(exist(r,c,word,board)) {
						return true;
					}
				}
			}
		}
		return false; 
	}

	private boolean exist(int r, int c, String word, char[][] board) {
		if(r<0||c<0||r==board.length || c==board[0].length
				|| board[r][c]!=word.charAt(0)||board[r][c]=='.') {
			return false;
		}
		String remain = word.substring(1);
		char prev = board[r][c];
		board[r][c]='.';
		boolean ans = false;
		ans = ans|| exist(r-1, c, remain, board);
		ans = ans|| exist(r+1, c, remain, board);
		ans = ans|| exist(r, c-1, remain, board);
		ans = ans|| exist(r, c+1, remain, board);
		board[r][c]=prev;
		return ans;
	}
	
}
