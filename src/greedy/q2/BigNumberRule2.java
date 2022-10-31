package greedy.q2;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("N(배열의 크기), M(숫자가 더해지는 횟수), K(연속해서 올 수 있는 횟수)를 공백을 기준으로 구분하여 입력 받기>>>");
        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();// 배열
        int m = sc.nextInt();// 합쳐야 하는 수
        int k = sc.nextInt();// 연속으로 올 수 있는 수
        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];


        System.out.println("N크기의 배열 값 입력 받기>>>");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //큰 수 두개를 뽑는다,
        Arrays.sort(arr);
        //가장 큰 수
        int first = arr[n-1];
        //두번 째로 큰 수
        int second = arr[n-2];


        int k_temp = 0, answer =0;
        //m번 동안
        for(int i=0;i<m;i++){
            //가장 큰 수 k개 더하고
            if(k_temp < k){
                answer+=first;
                k_temp++;
            }
            else{
                answer+=second;
                k_temp=0;
            }
            //두번째 큰 수 한번 더하기
        }

        System.out.println(answer);
    }
}
