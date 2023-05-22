package baekjoon.week6;

import java.util.Scanner;

public class Baekjoon_2309_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }

        boolean k=false;

        for (int i = 0; i < arr.length; i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if((arr[i]+arr[j]==sum-100)&&arr[i]!=arr[j])
                    {
                        arr[i]=0;
                        arr[j]=0;
                        k=true;
                        break;
                    }

                }
                if(k==true)
                {
                    break;
                }
            }


        for(int i=arr.length-1;i>0;i--)
        {

            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];

                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        for(int i=0;i<9;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }

            System.out.println(arr[i]);
        }



    }
}
