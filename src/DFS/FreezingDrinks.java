package DFS;

import java.util.Scanner;

public class FreezingDrinks {

    //static 한 값을 미리 만든다.
    static int[][] arr;
    static int N;
    static int M;


    //함수 선언
    private static boolean dfs(int x, int y){
        if(x<=-1 || x>= N || y <=-1 || y >= M){// 범위를 벗어나면
            return false;
        }
        //현재노드를 방문하지 않았다면 0 -> 방문:1로 처리, true 리턴
        if(arr[x][y]==0){
            arr[x][y] = 1;
            // 나를 중심으로 상하좌우 체크하여 0->1 로 바꾼다.
            dfs(x,y-1);
            dfs(x,y+1);
            dfs(x-1, y);
            dfs(x+1, y);
            return true;
        }
        //방문했다면
        return false;
    }

    public static void main(String[] args) {
        System.out.println("세로 가로를 입력하시오");
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        // 0으로 찬 2차원 배열 만든다
        arr = new int[N][M];

//        System.out.println("위에서 아래로 값을 입력하시오");
//
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//
//                arr[i][j] = sc.nextInt();
//            }
//        }

//        String index out of range: 0
        System.out.println("입력받을 배열의 모양은>>>");
        sc.nextLine();
        for(int i=0; i<N; i++){
            String temp = sc.nextLine();
//            System.out.println(temp);
            for(int j=0; j<M; j++){

//                System.out.println(j+"  "+temp);
                char c = temp.charAt(j);
                arr[i][j] = c - '0';
            }
        }

        System.out.println("입력받은 배열의 모양은>>>");
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int result =0;

        //이중배열 모든 위치를 돌면서 0->1이 바뀌는 순간의 개수를 누적하여 구한다
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(dfs(i,j)){
                    result +=1;
                }
            }
        }
        System.out.println("결과는>>> "+result);
    }
}
