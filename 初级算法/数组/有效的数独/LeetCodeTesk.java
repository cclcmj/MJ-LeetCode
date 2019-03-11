/*
 *判断一个 9x9 的数独是否有效。
 *只需要根据以下规则，验证已经填入的数字是否有效即可。
 *1.数字 1-9 在每一行只能出现一次。
 *2.数字 1-9 在每一列只能出现一次。
 *3.数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *数独部分空格内已填入了数字，空白格用 '.' 表示。
 */
import java.util.HashMap;
import java.util.ArrayList;

class LeetCodeTesk{
	public static void main(String[] args){
		char[][] board = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'},
			};
		
		//开始
		boolean booleanResult = true;
		HashMap<Integer, Integer> [] rows = new HashMap[9];
		HashMap<Integer, Integer> [] columns = new HashMap[9];
		HashMap<Integer, Integer> [] boxes = new HashMap[9];
		for (int i = 0; i < 9; i++) {
			rows[i] = new HashMap<Integer, Integer>();
			columns[i] = new HashMap<Integer, Integer>();
			boxes[i] = new HashMap<Integer, Integer>();
		}
		//元素遍历
		int box,n;
		for(int r=0;r<9;r++){
			for(int c=0;c<9;c++){
				System.out.print(c+",");
				if(board[r][c]=='.')
					continue;
				n = board[r][c];
				box = (r/3)*3+c/3;
				rows[r].put(n,rows[r].getOrDefault(n,0)+1);
				columns[c].put(n,columns[c].getOrDefault(n,0)+1);
				boxes[box].put(n,boxes[box].getOrDefault(n,0)+1);
				//判断
				//System.out.println(rows[r].get(n)+","+columns[c].get(n)+","+boxes[box].get(n));
				if(rows[r].get(n)==2||columns[c].get(n)==2||boxes[box].get(n)==2){
					booleanResult = false;
					c=10;
					r=10;
				}
			}
			System.out.println(r+":");
		}
		//return
		System.out.println(booleanResult);
		/*
		//输出数组所有元素
		for(int n=0;n<result.length;n++)
			System.out.print(result[n]+",");
		*/
	}
}