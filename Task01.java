package by.jonline.module_2.part_2;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task01 {
    public static void main(String[] args) {
        int n = 7;
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 21);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Столбцы: ");

        for (int i = 0; i < n; i = i + 2) {
            if (a[0][i] > a[n - 1][i]) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j][i] + " ");
                }
            }
            System.out.println();

        }
    }

}
