import java.util.Scanner;

public class matMult{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt(); //row of first
		int m1 = s.nextInt();
		int n2 = s.nextInt(); // row of second
		int m2 = s.nextInt();

		int[][] matrix1 = new int[n1][m1];
		int[][] matrix2 = new int[n2][m2];

		for(int i=0;i<n1;i++)
			for(int j=0;j<m1;j++)
				matrix1[i][j] = s.nextInt();

		for(int i=0;i<n2;i++)
			for(int j=0;j<m2;j++)
				matrix2[i][j] = s.nextInt();

		int[][] product = mult(matrix1,matrix2);

		for(int i=0;i<n1;i++){
			for(int j=0;j<m2;j++)
				System.out.print(product[i][j]+" ");
			System.out.println("");
		}
	}

	private static int[][] mult(int[][] matrix1,int[][] matrix2){
		int n1 = matrix1[0].length;
		int m1 = matrix1.length;

		int c[][] = new int[n1][m1];
		for(int i = 0;i<n1;i++)
			for(int j = 0;j<m1;j++){
				c[i][j] = 0;
				for(int k = 0;k<m1;k++){
					c[i][j] = c[i][j]+matrix1[i][k]*matrix2[k][j];
				}
			}
			return c;
	}
}

