package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CookTteokbokki {
    public static void main(String[] args) {
        System.out.println("떡의 개수 N과 나머지 떡의 길이 M을 입력해주세요>> ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println("떡의 길이를 입력하시오>>");
        sc.nextLine();//청소

        ArrayList<Integer> Tteok = new ArrayList<>();
        for(int i=0; i<N; i++){
            Tteok.add(sc.nextInt());
        }
        sc.nextLine();//청소


        System.out.println("정렬 전: "+Tteok.toString());
        //떡 오름차순
        Collections.sort(Tteok);
        System.out.println("정렬 후: "+Tteok.toString());

        int max = Collections.max(Tteok);
        System.out.println("max: "+max);


        //이진 탐색을 위한 시작점, 끝점 설정
        int start = 0;
        int end = max;

        int result =0;

        // 이진 탐색
        while (start<end){
            int total =0;
            int mid = (start + end) / 2;
            System.out.println("mid>> "+mid);

            // 부스레기 떡의 합 구하기
//            Tteok.stream().forEach( function(tteok){
//                total += (tteok-mid)
//            });

            for(Integer element : Tteok){
//                int temp = element - mid;
//                if(temp>0){
//                    total += temp;
//                }
                if(element>mid){
                    total += element - mid;
                }

            }// for end


            //남은 떡 양이 부족한 경우: mid 기준을 왼쪽으로 탐색 : end ==> mid
            if(total<M) end = mid -1;

            //남은 떡 양이 많은 경우: mid 기준으로 오른쪽으로 탐색 : start ==> mid
            if(total>M){
                result = mid;
                start = mid +1;
            }

            if(total == M){
                result = mid;
                break;
            }

        }// while end

        System.out.println("result>> "+result);

    }// main end
}// class end
