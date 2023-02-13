package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class makingOne {
    public static void main(String[] args) {
        System.out.println("나누거나 빼서.. 최종으로 1이 되고자 하는 정수 X를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();//동적 할당 됨

        for(int i=2; i<x; i++){

//            arr.set() = arr.set(i-1) +1;
            //현재 수 에서 1을 뺌
            arr.set(i, arr.get(i-1) +1);

            //2로 나눴을때 나눠지는 경우
            if(i % 2 ==0){
                Integer a = arr.get(i);
                Integer b = arr.get(i)/2 +1;
                Integer min = (a>b)? b : a;
                arr.set(i, min);
            }

//            int [] a = new Array(); 1,2, 3,4
//                    1, a[2], 1+a[3]

//            Collections.min(list)

            //2로 나눴을때 나눠지는 경우

        }

    }

}
