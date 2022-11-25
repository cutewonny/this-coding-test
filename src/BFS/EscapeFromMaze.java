package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapeFromMaze {

    //공통 받을 것
    static int[][] arr;
    static int N;
    static int M;


    //함수 선언
    private static int bfs(int x, int y){
        //java Queue 구현: 현재 위치 기준으로 사용한다
//        Queue<Integer> queue = new LinkedList<Integer>();
//        Queue<Integer> queue = new ArrayQueue<>();
//        queue.offer(x,y);

        return 1;
    }

    public static void main(String[] args) {
        System.out.println("세로:N 과 가로:M의 값을 입력하시오>> ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        //2차원 배열을 입력 받는다.
        arr = new int[N][M];
        System.out.println("2차원 배열을 입력하시오>>> ");
        sc.nextLine();//청소

        for(int i=0; i<N; i++){
            String temp = sc.nextLine();
            for(int j=0; j<M; j++){
                char c = temp.charAt(j);
                arr[i][j] = c -'0';
            }
        }// arr end

        System.out.println("입력 받은 배열 확인");
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // 괴물: 0, 길: 1



    }
}
