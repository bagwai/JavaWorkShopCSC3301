                                            //Java Lab Exercise 2
                                                //SumTriangularMatrices2.java
                                            //Author: Mubarak Daha Isa CST/16/COM/00582

public class SumTriangularMatrices2 {
  public static void main(String[] args) {
    int lowerTriangularMatrix[][] = {
                                      {1,0,0,0,0,0,0,0},
                                      {1,2,0,0,0,0,0,0},
                                      {1,2,3,0,0,0,0,0},
                                      {1,2,3,4,0,0,0,0},
                                      {1,2,3,4,5,0,0,0},
                                      {1,2,3,4,5,6,0,0},
                                      {1,2,3,4,5,6,7,0},
                                      {1,2,3,4,5,6,7,8}
                                    };
    int upperTriangularMatrix[][] = {
                                      {1,2,3,4,5,6,7,8},
                                      {0,1,2,3,4,5,6,7},
                                      {1,2,3,4,5,6,0,0},
                                      {1,2,3,4,5,0,0,0},
                                      {1,2,3,4,0,0,0,0},
                                      {1,2,3,0,0,0,0,0},
                                      {1,2,0,0,0,0,0,0},
                                      {1,0,0,0,0,0,0,0}
                                    };

          int i,j,x,y,a,b;
        //Displaying the lower triangulyar matirix
          System.out.println("The lower Triangular Matrix is: ");
          for (i =0; i< lowerTriangularMatrix.length; i++){
            for (j = 0; j < lowerTriangularMatrix[i].length; j++){
              System.out.print(lowerTriangularMatrix[i][j] + "\t");
            }
            System.out.println();
          }
          //Displaying the Upper triangular Matrix
          System.out.println();
          System.out.println("The Upper Triangular Matrix is: ");
          for (x = 0; x < upperTriangularMatrix.length; x++){
            for (y = 0; y < upperTriangularMatrix[x].length; y++){
              System.out.print(upperTriangularMatrix[x][y] + "\t");
            }
            System.out.println();
          }
          // Displaying the squared Matrix which is sum of the upperTriangularMatrix and lowerTriangularMatrix
System.out.println("The squared matirix is: ");
  int squareMatrix[][] = new int[8][8];  //creating new mutidimentional array to hold the sum,
        for (a = 0; a < 8; a++){
          for (b = 0; b < 8; b++){
          squareMatrix[a][b] = lowerTriangularMatrix[a][b] + upperTriangularMatrix[a][b];
          System.out.print(squareMatrix[a][b] + "\t");
        }
        System.out.println();
      }
  }
}
