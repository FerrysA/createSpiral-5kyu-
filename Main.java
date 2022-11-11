
import java.util.Random;
import java.util.Scanner;// библ для ввода с клавиатуры

public class Main {

    public static void Print(int[][] A) {
        int m = A[0].length;//длина
        int n = A.length;// высота

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }

            System.out.println(" ");
        }
    }


    public static int[][] createSpiral(int N) {

        int a[][] = new int[N][N];
        int i = 0;
        int j = 0;
        int n = 1;
        String s = "R";// R-Rigt, D-Down , L-Left, U-Up; Move:R-D-L-U

        while (n <= N * N) {

            if (s == "R") {
                for (; j < N && a[i][j] == 0 && n <= N * N; j++, n++) {

                    a[i][j] = n;
                }
                s = "D";
                j--;
                i++;
            }

            if (s == "D") {
                for (; i < N && a[i][j] == 0 && n <= N * N; i++, n++) {

                    a[i][j] = n;

                }
                s = "L";
                i--;
                j--;
            }

            if (s == "L") {
                for (; j >= 0 && a[i][j] == 0 && n <= N * N; j--, n++) {

                    a[i][j] = n;

                }
                s = "U";
                j++;
                i--;
            }

            if (s == "U") {
                for (; i >= 0 && a[i][j] == 0 && n <= N * N; i--, n++) {

                    a[i][j] = n;

                }
                s = "R";
                i++;
                j++;
            }
        }
        return a;
    }

    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {

        int[][] A = createSpiral(10);
        Print(A);

    }
}
