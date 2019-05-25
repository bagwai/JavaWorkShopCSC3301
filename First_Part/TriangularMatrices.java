class LowTrigMatrix{
	int[][] ltm;

}

class TriangularMatrices{
	public static void main(String[] args){
		//Array[] lowTrigMatrix;
		
		int[][] lA= {{1, 0, 0, 0, 0, 0}, 
					{1, 8, 0, 0, 0, 0}, 
					{5, 7, 9, 0, 0, 0}, 
					{4, 9, 3, 2, 0, 0}, 
					{1, 7, 6, 2, 3, 0},
					{3, 1, 2, 6, 5, 7}
					};
					
		//the lower triangular matrix

		System.out.println("The elements of lower triangular matrix are: " );
		for (int i = 0; i <= lA.length-1; i++){
			for (int j = 0; j <= lA[i].length-1; j++){
			System.out.print(lA[i][j] + " ");
			}
			System.out.println(" ");
		}
		//prints the elements of the lower triangular matrix
		
		int[][] uA= {{1, 8, 9, 4, 3, 7}, 
					{0, 6, 5, 2, 1, 8}, 
					{0, 0, 5, 7, 9, 3}, 
					{0, 0, 0, 4, 8, 1}, 
					{0, 0, 0, 0, 6, 2},
					{0, 0, 0, 0, 0, 7}
					};
			//the upper triangular matrix
					
		System.out.println("\nThe elements are of upper triangular matrix are: " );
		for (int x = 0; x <= uA.length-1; x++){
			for (int y = 0; y <= uA[x].length-1; y++){
			System.out.print(uA[x][y] + " ");
			}
			System.out.println(" ");
		}
		//prints the elements of the upper triangular matrix
		System.out.println("  ");
		
		int[][] sqr;
		//creates a new 6x6 matrix as a 2-dimensional array
		sqr = new int[6][6];
		int n=0;
		System.out.println("The sum of the elements: ");
		for (int a = 0; a <= 5; a++){
			for (int b =0; b <= 5; b++){
				sqr[a][b] = lA[a][b] + uA[a][b];
				System.out.print(" " + sqr[a][b] + "  ");
			}	
			System.out.println(" ");
		}
		
	}
}
