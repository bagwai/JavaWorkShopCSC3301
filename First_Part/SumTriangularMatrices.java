class SumTriangularMatrices{
  public static void main(String[] args) {

    int[][] triangleArrayUpper {
      {1,2,3,4,5,6,7,8},
      {2,3,4,5,6,7,8},
      {1,2,6,7,5,6},
      {6,5,3,4,3},
      {4,5,4,7},
      {7,5,6},
      {2,5},
      {9}
    };

    int[][] triangleArrayLower {
      {1},
      {1,2},
      {1,2,3},
      {1,2,3,4},
      {1,2,3,4,5},
      {1,2,3,4,5,6},
      {1,2,3,4,5,6,7},
      {1,2,3,4,5,6,7,8}
    };

for (int i=0; i < triangleArrayLower.length-1; i++){
    for(int j=0; j < triangleArrayLower[i].length -1; j++){
      System.out.print(triangleArrayLower[j] + " ");
    }
    System.out.println();
  }
}
}
