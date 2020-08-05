package by.jonline.module_2.part_2;

/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int a[][] = new int[m][n];
        int temp;

        System.out.println("Начальная матрица: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int l = 0; l < m; l++) {
                for (int j = 0; j < m; j++) {
                    if (a[l][i] > a[j][i]) {
                        temp = a[l][i];
                        a[l][i] = a[j][i];
                        a[j][i] = temp;
                    }
                }
            }
        }
        System.out.println("Отсортированные по убыванию столбцы: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int l = 0; l < m; l++) {
                for (int j = 0; j < m; j++) {
                    if (a[l][i] < a[j][i]) {
                        temp = a[l][i];
                        a[l][i] = a[j][i];
                        a[j][i] = temp;
                    }
                }
            }
        }
        System.out.println("Отсортированные по возрастанию столбцы: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
