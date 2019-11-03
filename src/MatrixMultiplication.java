public class MatrixMultiplication {
    public static void main(String[] args) {
      int[][] a = new int [3][3];
      a[0][0] = 4;
      a[0][1] = 3;
      a[0][2] = 1;
      a[1][0] = 1;
      a[1][1] = -2;
      a[1][2] = 3;
      a[2][0] = 5;
      a[2][1] = 7;
      a[2][2] = 0;
      int [][]b = new int [1][3];
      b[0][0] = 7;
      b[0][1] = 2;
      b[0][2] = 1;
      int i = 0;
      int[][] c=new int [a.length][b[i].length];
      for (; i <c.length ; i++) {
        for (int j = 0; j <c[i].length ; j++) {
          int k = 0;
          if(k <b.length){
            int num = a[i][k] * b[k][j];
            k++;
            num += a[i][k]*b[k][j];
            System.out.print( num );
          }
        }
        System.out.println();
      }
    }
}
