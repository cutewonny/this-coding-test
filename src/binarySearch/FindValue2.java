package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindValue2 {

    public static int binary_search(ArrayList<Integer> arrayList, int target, int start, int end){
        // N의 인덱스 기준으로 움직인다. start=0, end =N-1;
        while(start <= end){//시작 숫자가 끝 숫자보다 작아야지 계속 도는 군
            // 27을 찾는다고 하면 : 25와 35사이에 있다 25+35 = 60 /2 = 30
            int mid = (start+end)/2;

            if(arrayList.get(mid)==target){
                return mid; // 정답! 멈춘다
            }
            else if(arrayList.get(mid)> target){
                //중간 값보다 목표가 작을때 왼쪽을 뒤진다.
                // mid =30, target=27 start= 25, end=35
                // 25~30 => 30 아니라고 했지? 더 왼쪽 => -1
                end = mid-1;// return 지워라
            }
            else{
                // 중간 값보다 목표가 클때 오른쪽 뒤진다.
                // mid=30, target=33, start= 25, end=35
                // 30~35 => 30 아니라고 했지? 더 오른쪽 => +1
                start = mid+1;// return 지워라
            }

        }// while end
        // while문에서 못 찾으면 값이 없는거다. 음수 반환
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("부품의 개수 N 입력해라");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);

        sc.nextLine();//청소
        ArrayList<Integer> NarrayList= new ArrayList<>(N);
        ArrayList<Integer> MarrayList= new ArrayList<>(N);

        System.out.println("부품의 배열 입력>>>");
        for(int i=0; i<N; i++){
            Integer temp = sc.nextInt();
            NarrayList.add(temp);
        }

        sc.nextLine();//청소
        System.out.println("NarrayList>>> "+NarrayList.toString());

        System.out.println("손님이 원하는 개수 M 입력해라");
        int M = sc.nextInt();
        System.out.println(M);


        System.out.println("손님이 구하고자 하는 M 배열 입력>>>");
        for(int i=0; i<M; i++){
            Integer temp = sc.nextInt();
            MarrayList.add(temp);
        }

        sc.nextLine();//청소
        System.out.println("MarrayList>>> "+MarrayList.toString());

        //오름차순
        Collections.sort(NarrayList);// 사전 정렬 필요
        //오름차순
        Collections.sort(MarrayList);


        // 재귀함수 사용
        for(int i=0; i<M; i++){//손님이 찾고자 하는 것(M)이
            int check = 0;
            // 판매하는 물건 중(N)에 있는지 찾기
            check = binary_search(NarrayList, MarrayList.get(i), 0, N-1);

            if(check>0) System.out.println(MarrayList.get(i)+">>>> yes");
            else System.out.println(MarrayList.get(i)+">>>> no");
        }



    }
}
