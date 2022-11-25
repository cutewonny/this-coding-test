package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Replace2arraysOfElements {
    public static void main(String[] args) {
        System.out.println("N과 K를 입력하라>> ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N);
        System.out.println(K);
        sc.nextLine();//청소

        Integer[] arrA =  new Integer[N];

        ArrayList<Integer> integerArrayListA = new ArrayList<Integer>();
        ArrayList<Integer> integerArrayListB = new ArrayList<Integer>();


        System.out.println("배열A 입력하라>> ");
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            integerArrayListA.add(temp);
        }



        System.out.println("배열B 입력하라>> ");
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            integerArrayListB.add(temp);
        }

        System.out.println("A: "+integerArrayListA.toString());
        System.out.println("B: "+integerArrayListB.toString());


        //오름차순
        Collections.sort(integerArrayListA);

        //내림차순
        Collections.sort(integerArrayListB, Collections.reverseOrder());

        System.out.println("A: "+integerArrayListA.toString());
        System.out.println("B: "+integerArrayListB.toString());

        for(int i=0; i<K; i++){
            Integer tempInt = integerArrayListA.get(i);
            Integer tempInt2 = integerArrayListB.get(i);
            integerArrayListA.set(i, tempInt2);
            integerArrayListB.set(i, tempInt);
        }


        int sum = 0;

        // 합계: 반복문을 사용하여 변수에 값을 누적합니다.
        for (int num: integerArrayListA) {
            sum += num;
        }

        System.out.println(sum);




    }
}
