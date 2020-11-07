package com.ecodation.a005.Diziler;

public class Dizi004_cok_boyutlu {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 0;
		matrix[1][1] = 1;
		matrix[2][2] = 2;

		for (int i = 0; i < matrix.length; i++) { // satýrlarý

			for (int j = 0; j < matrix.length; j++) { // sutunlarý
				System.out.print(matrix[i][j] + " "); // print vermemim sebebi ayný satýrda kalsýn diye
			}
			// alt satýra geçmesi için
		}
	}
}
