package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapeFromMaze {
    /*
    동빈의 위치 (1,1)
    출구의 위치 (N,M)
        0: 괴물이 있다
        1: 괴물이 없다
    탈출하기 위해 움직여야하는 최소 칸 구하기
    */


	public static int[][] arr;
	public static int N;
	public static int M;

	// 현재 변한 숫자를 카운트할 배열을 만든다
	public static int[][] graph = new int[201][201];

	// 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
	public static int dx[] = {-1, 1, 0, 0};
	public static int dy[] = {0, 0, -1, 1};


	//함수 선언
	private static int bfs(int x, int y) {
		//java Queue 구현: 현재 위치 기준으로 사용한다
//        Queue<Integer> queue = new LinkedList<Integer>();
//        Queue<Integer> queue = new ArrayQueue<>();
//        queue.offer(x,y);

		// 큐(Queue) 구현을 위해 queue 라이브러리 사용
		Queue<Node> deque = new LinkedList<Node>();
		deque.offer(new Node(x, y));// 삽입

		// 큐가 빌 때까지 반복하기
		while (deque.isEmpty() == false) {
			Node node = deque.poll();
			x = node.getX();
			y = node.getY();

			// 현재 위치에서 4가지 방향으로의 위치 확인
			for (int i = 0; i < 4; i++) {
				
				int newX = x + dx[i];
				int newY = y + dy[i];

				// 미로 찾기 공간을 벗어난 경우 무시
				if (newX < 0 || newX >= N || newY < 0 || newY >= M) {
					continue;
				}

				// 괴물인 경우(0) 건너뜀
				if (arr[newX][newY] == 0) {
					continue;
				}

				// 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
				if (arr[newX][newY] == 1) {
					arr[newX][newY] = arr[x][y] + 1;
					deque.offer(new Node(newX, newY));
				}


			}// end fpr

		}// end while

		// 가장 오른쪽 아래까지의 최단 거리 반환
		return arr[N - 1][M - 1];
	}// end dfs

	public static void main(String[] args) {

		이중배열입력받기();
		이중배열출력하기();

		int result = bfs(0, 0);
		System.out.println("result>>>>>> " + result);


	}

	private static void 이중배열입력받기() {
		System.out.println("세로:N 과 가로:M의 값을 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		//2차원 배열을 입력 받는다.
		arr = new int[N][M];
		System.out.println("2차원 배열을 입력하시오>>> ");
		sc.nextLine();//청소

		for (int i = 0; i < N; i++) {
			String temp = sc.nextLine();
			for (int j = 0; j < M; j++) {
				char c = temp.charAt(j);
				arr[i][j] = c - '0';
			}
		}// arr end

	}

	private static void 이중배열입력받기2() {
		System.out.println("세로:N 과 가로:M의 값을 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		//2차원 배열을 입력 받는다.
		arr = new int[N][M];
		System.out.println("2차원 배열을 입력하시오>>> ");
		sc.nextLine();//청소

		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			for (int j = 0; j < M; j++) {
				arr[i][j] = temp;
			}
		}// arr end

	}

	private static void 이중배열출력하기() {

		System.out.println("입력 받은 배열 확인");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
