import java.util.Scanner;

public class TestTranspose {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numRows = scan.nextInt();
		int numCols = scan.nextInt();
		
		Transpose t = new Transpose();
		int[][] arr = t.createPatterned2DArray(numRows, numCols);
		t.print2DArray(arr);
		t.print2DArrayTransposed(arr, numRows, numCols);
	}

}
