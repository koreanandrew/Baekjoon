package baekjoon.week9;

import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon_1021 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedList<Integer> deque=new LinkedList<>();

        int count=0;

        int N=sc.nextInt();
        int M=sc.nextInt();

        for(int i=1;i<=N;i++)
        {
            deque.offer(i);
        }

        int[] seq=new int[M];

        for(int i=0;i<M;i++){
            seq[i]=sc.nextInt();
        }

        for(int i=0;i<M;i++){

            int target_index=deque.indexOf(seq[i]);
            int half_index;

            if(deque.size()%2==0)
            {
                half_index=deque.size() / 2-1;
            }

            else{
                half_index=deque.size() /2;
            }

            if(target_index<=half_index){

                for(int j=0;j<target_index;j++){
                    int temp=deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }

            else{

                for(int j=0;j<deque.size()-target_index;j++){

                    int temp=deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(count);
    }


}
