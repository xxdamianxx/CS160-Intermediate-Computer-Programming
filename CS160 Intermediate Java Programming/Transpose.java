public class Transpose {

	public int[][] createPatterned2DArray(int numRows, int numCols) {
		int[][] arr = new int[numRows][numCols];
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; ++j) {
				arr[i][j] = 10 + ((i + 1) * numRows) + j;
			}
		}
		return arr;
	}
	
	public void print2DArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.printf("%-4d", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public void print2DArrayTransposed(int[][] a, int numRows, int numCols) {

		for (int i = 0; i < numCols; i++) {
			for (int j = 0; j < numRows; ++j) {
				System.out.printf("%-4d",a[j][i]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
