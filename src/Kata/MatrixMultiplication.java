package Kata;

public class MatrixMultiplication {
	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
		int n = a[0].length;
		int[][] c = new int[a.length][a[0].length];
		for(int i= 0; i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = 0;
				for(int k=0;k<n;k++) {      
					c[i][j]+=a[i][k]*b[k][j];      
				}
			}
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		 int[][] a = {
		    		{1,2}, 
		    		{3, 2}};
				
		    int[][] b = {
		    		{3,2}, 
		    		{1, 1}};
		    
		    int[][] expected = {
		    		{5, 4},
		    		{11, 8}};
		    
		    matrixMultiplication(a, b);
		    
	}
	
}
