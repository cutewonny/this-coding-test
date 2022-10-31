package greedy.q2;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {
    public static void main(String[] args) {
        System.out.println("N(배열의 크기), M(숫자가 더해지는 횟수), K(연속해서 올 수 있는 횟수)를 공백을 기준으로 구분하여 입력 받기>>>");

        Scanner sc = new Scanner(System.in);

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

        // 입력 받은 수들 정렬하기
        Arrays.sort(arr);

        // 가장 큰 수
        int first = arr[n-1];
        // 두번째로 큰 수
        int sencond = arr[n-2];

        int result =0;

        while(m>=1){
            System.out.println("m>> "+m);
            for(int i=0; i<k; i++){
                if(m==0){
                    break;
                }
                result += first;
                m--;
            }

            if (m==0){
                break;
            }else{
                result+=sencond;
                m--;
            }
        }

        System.out.println("최대 값은>>>>> "+result);

    }
}
