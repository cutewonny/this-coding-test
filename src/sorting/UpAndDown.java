package sorting;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UpAndDown {

    private static int[] push(int[] array, int push){
        int[] longer = new int[array.length+1];
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
            longer[i] = array[i];
        }
        longer[array.length] = push;
        return longer;
    }

    public static void main(String[] args) {
        System.out.println("N을 입력하라>> ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr;
        arr = new int[N];
        System.out.println("배열에 값을 넣을 것을 입력하고 엔터 치세요>> ");
        sc.nextLine();//청소
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
//            System.out.println(temp);
//            sorting.UpAndDown.push(arr, temp);
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("Sorted arr[]: "+ Arrays.toString(arr));

        // To boxed array
        //http://daplus.net/java-java%EC%97%90%EC%84%9C-int-%EB%A5%BC-integer-%EB%A1%9C-%EB%B3%80%ED%99%98%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95/
        Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Integer[] ever = IntStream.of( arr ).boxed().toArray( Integer[]::new );


        Arrays.sort(what, Collections.reverseOrder());
        System.out.println("reverseOrder arr[]: "+ Arrays.toString(what));


    }
}
