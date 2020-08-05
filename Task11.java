package by.jonline.module_2.part_2;

/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int a[][] = new int[m][n];
        int b[] = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 16);
                if (a[i][j] == 5) {
                    b[i]++;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Номера строк, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < m; i++) {
            if (b[i] > 2) {
                System.out.print((i + 1) + " ");
            }
        }

    }
}
