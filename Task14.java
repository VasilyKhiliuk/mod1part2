package by.jonline.module_2.part_2;

/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task14 {
    public static void main(String[] args) {
        int m = 8;
        int n = 6;
        int a[][] = new int[m][n];
        int k;

        for (int i = 0; i < n; i++) {
            k = 0;
            for (int j = 0; j < m; j++) {
                if (k != i + 1) {
                    a[j][i] = (int) (Math.random() * 2);
                    if ((m - j) == ((i + 1) - k)) {
                        a[j][i] = 1;
                    }
                    if (a[j][i] == 1) {
                        k++;
                    }
                } else {
                    a[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
