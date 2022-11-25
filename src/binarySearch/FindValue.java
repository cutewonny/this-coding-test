package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        System.out.println("N 입력해라");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);

        sc.nextLine();//청소
        ArrayList<Integer> NarrayList= new ArrayList<>(N);
        ArrayList<Integer> MarrayList= new ArrayList<>(N);

        System.out.println("배열 입력>>>");
        for(int i=0; i<N; i++){
            Integer temp = sc.nextInt();
            NarrayList.add(temp);
        }

        sc.nextLine();//청소
        System.out.println("NarrayList>>> "+NarrayList.toString());

        System.out.println("M 입력해라");
        int M = sc.nextInt();
        System.out.println(M);


        System.out.println("M 배열 입력>>>");
        for(int i=0; i<M; i++){
            Integer temp = sc.nextInt();
            MarrayList.add(temp);
        }

        sc.nextLine();//청소
        System.out.println("MarrayList>>> "+MarrayList.toString());

        //오름차순
        Collections.sort(NarrayList);
        //오름차순
        Collections.sort(MarrayList);


        // 이중 for문으로 해결
        for(int i=0; i<M; i++){
            boolean check = false;
            int Mvalue = MarrayList.get(i);
            for(int j=0; j<N; j++){

                int Nvalue = NarrayList.get(j);

                if(Mvalue == Nvalue) check=true;
            }
            if(check) System.out.println(Mvalue+">>>> yes");
            else System.out.println(Mvalue+">>>> no");
        }



    }
}
