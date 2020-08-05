package by.jonline.module_2.part_2;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class Task12 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
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

        for (int i = 0; i < m; i++) {
            for (int l = 0; l < n; l++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][l] > a[i][j]) {
                        temp = a[i][l];
                        a[i][l] = a[i][j];
                        a[i][j] = temp;
                    }
                }
            }
        }
        System.out.println("Отсортированные по убыванию строки: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int l = 0; l < n; l++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][l] < a[i][j]) {
                        temp = a[i][l];
                        a[i][l] = a[i][j];
                        a[i][j] = temp;
                    }
                }
            }
        }
        System.out.println("Отсортированные по возрастанию строки: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
