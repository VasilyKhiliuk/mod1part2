package by.jonline.module_2.part_2;

/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.

 */
public class Task09 {
    public static void main(String[] args) {
        int n = 6;
        int m = 7;
        int a[][] = new int[n][m];
        int b[] = new int[m];
        int max;
        int index;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                b[j] += a[i][j];
            }
        }

        max = b[0];
        index = 0;
        for (int i = 0; i < m; i++) {
            if (max < b[i]) {
                max = b[i];
                index = i;
            }
        }
        System.out.println("Максимальная сумма: " + max + "\nВ столбце: " + (index + 1));
    }

}
