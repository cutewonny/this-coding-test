package greedy.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayValueAdd {
//    배열에 값 추가하는 방법: https://developer-talk.tistory.com/709
    // 1. 반복문 + a[i] = value;
    // 2. List로 변환
    // 3. System class의 arraycopy
    // 4. Arrays 클래의 copyOf메서드


    // 1. 반복문 + a[i] = value;
    private static String[] ADD1(String[] originArr, String addValue){
        // 순서 1. (원본 배열의 크기 + 1)를 크기를 가지는 배열을 생성
        String[] newArr = new String[originArr.length + 1];

        System.out.println("newArr.length>> "+ newArr.length);

        // 순서 2. 새로운 배열에 값을 순차적으로 할당
        for(int i=0; i<originArr.length; i++){
            newArr[i] = originArr[i];
        }
//        Arrays.stream(newArr).forEach(a->System.out.print(a));

        // 순서 3. 새로운 배열의 마지막 위치에 추가하려는 값을 할당
        newArr[newArr.length-1] = addValue;

        return newArr;
    }// add method end


    // 2. List로 변환
    private static String[] ADD2(String[] originArray, String Val) {
        // 순서 1. 배열을 List로 변환
        List<String> newList = new ArrayList<>(Arrays.asList(originArray));//새로운 ArrayList 객체를 생성해서 사용할 수 있다

        // 순서 2. List의 Add() 메서드를 호출하여 새로운 값을 할당
        newList.add(Val);

        // 순서 3. List를 배열을 변환 후 반환
        return newList.toArray(new String[0]);
    }


    public static void main(String[] args) {
        String[] strArray = { "AA", "BB", "CC", "DD" };

        System.out.println("\"EE\" 추가 전: " + Arrays.toString(strArray));
        strArray = ADD2(strArray, "EE");
        System.out.println("\"EE\" 추가 후: " + Arrays.toString(strArray));

    }
}
