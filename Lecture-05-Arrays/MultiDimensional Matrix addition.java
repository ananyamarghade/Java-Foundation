
public class AdditionOfMatrix {
	public int[][] add(int[][] matrix1, int[][] matrix2) {
		if (matrix1 == null || matrix2 == null) return null;
		if (matrix1.length != matrix2.length) return null;
		int rows = matrix1.length;
		for (int i = 0; i < rows; i++) {
			if (matrix1[i].length != matrix2[i].length) return null;
		}
		
		int[][] result = new int[rows][];
		for (int i = 0; i < rows; i++) {
			int cols = matrix1[i].length;
			result[i] = new int[cols];
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		
	}
		return result;
	}
	}
