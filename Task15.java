package by.jonline.module_2.part_2;

/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        int a[][] = new int[m][n];
        int max;

        System.out.println("Начальная матрица: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент матрицы: " + max);

        System.out.println("Конечная матрица: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j + 1) % 2 == 1) {
                    a[i][j] = max;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
