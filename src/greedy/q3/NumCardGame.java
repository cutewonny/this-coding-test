package greedy.q3;

import java.util.Arrays;
import java.util.Scanner;

public class NumCardGame {

    public static void main(String[] args) {
        //행 열 입력받기
        System.out.println("n: 행, m: 열 을 입력하시오>>> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //행
        int m = sc.nextInt(); //열

        int result = 0;

        System.out.println("행별로 배열의 값을 입력하시오>> ");
        // 중요!:for 문으로 행열의 숫자들을 한줄로 입력받는다.(for문을 두번 돌리지 않는다)

        int[] tempMin = new int[m];
        for(int i=0; i<n; i++){
            int[] array =  new int[m];

            for(int j=0; j<m; j++){
                array[j] = sc.nextInt();
            }
            // 행>>> 입력받은 배열 중에서 가장 작은 수를 구한다 : 배열에 min()

            tempMin[i] = Arrays.stream(array).min().getAsInt();
        }
        // 가장 작은 수를 가진 배열에서 가장 큰 값을 찾는다 : max()
        result = Arrays.stream(tempMin).max().getAsInt();


        //가장 큰 수를 출력한다
        System.out.println("가장 작은 수 중에서 큰 수>>> "+ result);
    }

}
