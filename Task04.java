package by.jonline.module_2.part_2;

/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1, 2, 3, ..., n
 * n, n-1, n-2, ... 1
 * 1, 2, 3, ..., n
 * n, n-1, n-2, ... 1
 * ..................
 * n, n-1, n-2, ... 1
 */

public class Task04 {
    public static void main(String[] args) {
        int n = 8;
        int m;
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            m = n;
            for (int j = 0; j < n; j++) {
                if ((i + 1) % 2 != 0) {
                    a[i][j] = j + 1;
                } else if ((i + 1) % 2 == 0) {
                    a[i][j] = m;
                    m--;
                }

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
