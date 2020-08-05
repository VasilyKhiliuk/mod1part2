package by.jonline.module_2.part_2;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу: 
 * a[i][j] = sin(pow(i, 2) - pow(j, 2)) / n);
 * и подсчитать количество положительных элементов в ней.
 */

public class Task07 {
    public static void main(String[] args) {
        int n = 4;
        double a[][] = new double[n][n];
        int l = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                System.out.print(a[i][j] + " ");
                if (a[i][j] > 0) {
                    l++;
                }
            }
            System.out.println();
        }

        System.out.println("Количество положительных элементов: " + l);
    }
}
