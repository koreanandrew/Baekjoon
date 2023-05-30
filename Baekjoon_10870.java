package baekjoon.week7;

import java.util.Scanner;

public class Baekjoon_10870 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(fivo(n));
    }

    static int fivo(int n){
        if(n==0)
            return n;
        else if(n==1)
            return 1;

        return fivo(n-1)+fivo(n-2);
    }

}

