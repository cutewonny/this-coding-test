package material.q2;

import java.util.Scanner;

public class HourMinuteSecond {
    public static void main(String[] args) {
        //정수 N이 까지의 시간 중에서 3이 하나라도 들어간 시간의 개수를 구하기
        //hh시 mm분 ss초 ==> 00시 00분 00초 ~ N시 59분 59초

        //모든 경우의 수를 세야한다.==> 완전 탐색
        //하루는 24시간 == 1440분 == 86,400초 개라서 100,000개도 안되서 2초안에 연산 가능

        //3중 반복문을 사용해라.

        //시간 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("N 시간을 정해주세요>> ");
        int N = sc.nextInt();

        //시간 for문 N개
        // 분 for문 60개
        // 초 for문 60개

        int count =0;

        for(int i=0; i<N+1; i++){
            for(int j=0; j<60; j++){
                for(int k=0; k<60; k++){
                    // 3이 있는 숫자가 오면 카운트를 올린다
                    if(i%10==3 || j%10==3 || k%10==3 || j/10==3 || k/10==3){
                        count++;
                    }else{
                        continue;
                    }

                }
            }
        }

        System.out.println("count>> "+ count);


        //005903

    }
}
