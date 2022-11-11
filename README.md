# createSpiral-5kyu-
# 11.11.2022
# Генерация "спирального" массива
# [ссылка на задание](https://www.codewars.com/kata/536a155256eb459b8700077e/train/java)
# Код:
``` java
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
```
# понравивщееся решение (автор vladkha)
```java
public class TheClockwiseSpiral {

    public static int[][] createSpiral(int N) {
        int[][] result = new int[N][N];
        int counter = 1;
        int total = N * N;
        int rowLimit = N;
        int columnLimit = N;
        int row = 0, column = 0;
        while (counter <= total) {
            for (int i = column; i < columnLimit; i++) {
                result[row][i] = counter++;
            }
            for (int i = row+1; i < rowLimit; i++) {
                result[i][columnLimit-1] = counter++;
            }
            for (int i = columnLimit-2; i >= column; i--) {
                result[rowLimit-1][i] = counter++;
            }
            for (int i = rowLimit-2; i > row; i--) {
                result[i][column] = counter++;
            }
            row++;
            column++;
            rowLimit--;
            columnLimit--;
        }
        return result;
    }
}
    
    
