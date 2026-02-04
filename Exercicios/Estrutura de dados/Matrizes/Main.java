import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] mat = new int[n][n];

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    System.out.println("Diagonal principal:");
    for (int i=0; i<n; i++) {
      System.out.print(mat[i][i] + " ");
    }
    System.out.println();

    int count = 0;
    for (int i=0; i<mat.length; i++) {
      for (int j=0; j<mat[i].length; j++) {
        if (mat[i][j] < 0) {
          count++;
        }
      }
    }
    System.out.println("Numeros negativos: " + count);
    sc.close();
  }
}