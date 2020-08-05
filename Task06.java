package by.jonline.module_2.part_2;

/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1, 1, 1, ..., 1, 1, 1
 * 0, 1, 1, ..., 1, 1, 0
 * 0, 0, 1, ..., 1, 0, 0
 * ...
 * 0, 1, 1, ..., 1, 1, 0
 * 1, 1, 1, ..., 1, 1, 1
 */

public class Task06 {
    public static void main(String[] args) {
        int n = 12;
        int a[][] = new int[n][n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = k; j < n - k; j++) {
                    a[i][j] = 1;
                }
                k++;
            } else {
                for (int j = k - 1; j < n - k + 1; j++) {
                    a[i][j] = 1;
                }
                k--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
