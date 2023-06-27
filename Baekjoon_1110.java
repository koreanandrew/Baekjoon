package baekjoon.week8;

import java.util.Scanner;

public class Baekjoon_1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;
        int copy = number;

        while (true) {
            number = ((number % 10) * 10) + (((number / 10) + (number % 10)) % 10);
            count++;

            if (copy == number) {
                break;
            }
        }

        System.out.println(count);
    }
}
