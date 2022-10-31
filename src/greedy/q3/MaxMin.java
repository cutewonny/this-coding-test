package greedy.q3;

import java.util.Arrays;

public class MaxMin {

    //자바에서 최소 최대값 구하는 방법
    //1. List + 스트림
    //2. array + Arrays.sort() 후에 인덱스 0, length-1 의 값 리턴
    //3. int + Math.max(a,b) 숫자만 가능
    public static void main(String[] args) {
        int[] arr = {11,2,3,4,5};
//        List list = Arrays.asList(ArrayUtils.toObject(arr));
//        System.out.println(Collections.min(list));
//        System.out.println(Collections.max(list));

        //1. List + 스트림
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("1. List + 스트림 min>> "+min);
        System.out.println("1. List + 스트림 max>>> "+max);

        //3. int + Math.max(a,b) 숫자만 가능
        int tempMax =0;
        int tempMin =1001;
        for(int i=0; i<arr.length; i++){
            tempMax = Math.max(tempMax, arr[i]);
            tempMin = Math.min(tempMin, arr[i]);
        }
        System.out.println("3. int + Math.max(a,b) 숫자만 가능 min>> "+tempMin);
        System.out.println("3. int + Math.max(a,b) 숫자만 가능 max>>> "+tempMax);

        //2. array + Arrays.sort() 후에 인덱스 0, length-1 의 값 리턴



    }

}
