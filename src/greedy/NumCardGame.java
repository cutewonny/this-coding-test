package greedy;

import java.util.Scanner;

public class NumCardGame {

    public static void main(String[] args) {
        //행 열 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //행
        int m = sc.nextInt(); //열
        int result = 0;
        int minNum = 10000;

        // 중요!:for 문으로 행열의 숫자들을 한줄로 입력받는다.(for문을 두번 돌리지 않는다)
        for(int i=0; i<n; i++){
            int[] array =  new int[m];

            for(int j=0; j<m; j++){
                // 입력받은 배열 중에서 가장 작은 수를 구한다 : 배열에 min()
                array[j] = sc.nextInt();

                // 가장 작은 수를 가장 큰 값으로 비교해서 저장한다 : max()
            }
        }



        //가장 큰 수를 출력한다
    }

}
