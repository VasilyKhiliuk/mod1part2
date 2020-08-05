package by.jonline.module_2.part_2;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task02 {
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 21 - 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0, j = 0; i < n && j < n; i++, j++) {
            System.out.print(a[i][j] + " ");
        }
    }

}
