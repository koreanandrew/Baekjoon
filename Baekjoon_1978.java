package baekjoon.week6;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Baekjoon_1978 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N= sc.nextInt();        //N은 100이하

        int [] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int elem : arr)
        {
            if(elem==1)
            {
                continue;
            }
            int count=0;

            for(int j=2;j<=(int)sqrt(elem);j++)
            {
                if(elem%j==0)
                {

                    count+=1;
                }
            }

            if(count==0)
            {
                sum+=1;
            }
        }

        System.out.println(sum);

    }
}
