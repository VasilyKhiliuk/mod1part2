package by.jonline.module_2.part_2;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task03 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int k = 3;
        int p = 5;
        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 21 - 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n" + k + "-я строка: ");
        for (int i = 0; i < m; i++) {
            System.out.print(a[k - 1][i] + " ");
        }

        System.out.println("\n" + p + "-ый столбец: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i][p - 1]);
        }
    }
}
