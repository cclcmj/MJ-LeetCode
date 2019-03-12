/*
 *给定一个 n × n 的二维矩阵表示一个图像。
 *将图像顺时针旋转 90 度。
 *说明：
 *你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 *示例 1:
 *给定 matrix = 
 *[
 *  [1,2,3],
 *  [4,5,6],
 *  [7,8,9]
 *],
 *原地旋转输入矩阵，使其变为:
 *[
 *  [7,4,1],
 *  [8,5,2],
 *  [9,6,3]
 *]
 *
 *示例 2:
 *给定 matrix =
 *[
 *  [ 5, 1, 9,11],
 *  [ 2, 4, 8,10],
 *  [13, 3, 6, 7],
 *  [15,14,12,16]
 *], 
 *原地旋转输入矩阵，使其变为:
 *[
 *  [15,13, 2, 5],
 *  [14, 3, 4, 1],
 *  [12, 6, 8, 9],
 *  [16, 7,10,11]
 *]
 *
 *想法————先行列转置，再根据中心轴做镜像变换。
 */


class LeetCodeTesk{
	public static void main(String[] args){
		int[][] matrix = {{5,1,9,11},
			              {2,4,8,10},
		                  {13,3,6,7},
		                  {15,14,12,16}};
		
		//开始
		//做行列转置
		for(int i = 0;i < matrix.length;i++) {
			for(int j = i;j < matrix[i].length;j++) {
				//交换值
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		//做中心轴对称
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix.length/2;j++) {
				//交换值
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[i].length-j-1];
				matrix[i][matrix[i].length-j-1] = temp;
			}
		}
		
		
		
		//return
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[i].length;j++) {
				System.out.print(matrix[i][j]+",");
			}
			System.out.print("\n");
		}
		/*
		//输出布尔变量
		System.out.println(booleanResult);
		*/
		/*
		//输出数组所有元素
		for(int n=0;n<result.length;n++)
			System.out.print(result[n]+",");
		*/
	}
}