package by.jonline.module_2.part_2;

import java.util.Scanner;

/*
 * 8. В числовой матрице поменять местами два столбца любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 * а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int p;
        int k;
        int n = 5;
        int m = 6;
        int temp;
        int a[][] = new int[n][m];

        System.out.println("Начальный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        do {
            System.out.println("Введите номер первого столбца: ");
            while (!sc.hasNextInt()) {
                System.out.println("Введено неверно.");
                System.out.println("Введите номер первого столбца: ");
                sc.next();
            }
            p = sc.nextInt();
        } while (p < 0 || p > m);

        do {
            System.out.println("Введите номер второго столбца: ");
            while (!sc.hasNextInt()) {
                System.out.println("Введено неверно.");
                System.out.println("Введите номер второго столбца: ");
                sc.next();
            }
            k = sc.nextInt();
        } while (k < 0 || k > m || k == p);

        p--;
        k--;
        for (int i = 0; i < n; i++) {
            temp = a[i][p];
            a[i][p] = a[i][k];
            a[i][k] = temp;
        }

        System.out.println("Конечный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
