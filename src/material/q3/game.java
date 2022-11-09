package material.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class game {
    //왼쪽으로 회전
    static int direction =0;
    public static int turn_left(){

        direction -=1;
        if(direction == -1){
            direction =3;
        }

        return direction;
    }
    public static void main(String[] args) {

        System.out.println("세로: n, 가로: m 값 입력 받기>> ");
        Scanner sc = new Scanner(System.in);
        // 세로: n, 가로: m 값 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(N+"    "+M);

        // 0으로 찬 2차원 배열 만든다
        int[][] arr = new int[N][M];


        //위치 입력 받기, 방향
        System.out.println("캐릭터의 현재 위치, 방향 입력>>>");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int posion = sc.nextInt();
        System.out.println(x+" "+y+" "+posion);

        System.out.println("draw map>>>>");
//        for(int i=0; i<N; i++){
//            String[] tempS = sc.nextLine().split(" ");
//            for(int j=0; j<M; j++){
//                arr[i][j] = Integer.parseInt(tempS[j]);
//            }
//        }
//        int[] temp = new int[M];

//        ArrayList list = new ArrayList();
//        for(int i=0; i<M; i++){
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);
//        arr[0] = list;

        for(int i=0; i<N; i++){
            System.out.println("입력해라>> ");
            for(int j =0; j<M; j++){
               int temp = sc.nextInt();
                arr[i][j] = temp;
            }
        }

//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        //북 동 남 서 방향 정의
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};




    }
}
