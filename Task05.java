package by.jonline.module_2.part_2;

/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1, 1, 1, ..., 1, 1, 1
 * 2, 2, 2, ..., 2, 2, 0
 * 3, 3, 3, ..., 3, 0, 0
 * ...
 * n-1, n-1, 0 ... 0, 0, 0
 * n, 0, 0, ..., 0, 0, 0
 */

public class Task05 {
    public static void main(String[] args) {
        int n = 12;
        int a[][] = new int[n][n];
        int k = 0;
        int l = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - k) {
                    a[i][j] = l;
                } else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            k++;
            l++;
            System.out.println();
        }
    }

}
