package baekjoon.week6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Baekjoon_10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            switch (command) {
                case "push_front":
                    int x = sc.nextInt();
                    deque.offerFirst(x);
                    break;

                case "push_back":
                    int y = sc.nextInt();
                    deque.offerLast(y);
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    break;

                case "pop_back":
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;

                case "size":
                    System.out.println(deque.size());
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(deque.peekLast());
                    }
                    break;
            }
        }
    }
}
