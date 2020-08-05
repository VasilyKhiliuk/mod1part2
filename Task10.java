package by.jonline.module_2.part_2;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 19 - 9);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Положительные элементы главной диагонали матрицы: ");
        for (int i = 0, j = 0; i < n && j < n; i++, j++) {
            if (a[i][j] > 0) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
