package DFS;

import BFS.Node;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DesertIsland {
	//https://school.programmers.co.kr/learn/courses/30/lessons/154540

	static class Solution {

		public int[] solution(String[] maps) {
			List<Integer> resultList = new ArrayList<Integer>();

//			3 ≤ maps[i]의 길이 ≤ 100
			String[][] mapsArr = new String[6][6];

			int asisXX = maps.length;//4
			int asisYY = 0;
			for (int X = 0; X < asisXX; X++) {

				String[] rowArr = maps[X].split("");
				asisYY = rowArr.length;//5

				for (int Y = 0; Y < asisYY; Y++) {
					mapsArr[X][Y] = rowArr[Y];

				}
			}

			System.out.println("이중 배열>> " + Arrays.deepToString(mapsArr));
			System.out.println("asisXX>> " + asisXX);
			System.out.println("asisYY>> " + asisYY);
			// mapsArr를 이중 배열로 만들었으니 이제..DFS

			int bread = 0;

			for (int X = 0; X < asisXX; X++) {
				for (int Y = 0; Y < asisYY; Y++) {
					//DFS시작

					Integer checkNum = dfs(X, Y, asisXX, asisYY, mapsArr, bread);

					if (checkNum != null && checkNum > 0) {
						resultList.add(checkNum);
					}

				}
			}

			System.out.println("resultList>>> " + resultList);

			// 오름차순
			Collections.sort(resultList);

			int[] answer = new int[resultList.size()];
			int size = 0;

			for (int temp : resultList) {

				answer[size++] = temp;

			}
			return answer;
		}


		private static Integer dfs(int x, int y, int N, int M, String[][] mapsArr, Integer savedBread) {

			//범위에서 벗어나면 return null;
			if (x <= -1 || x >= N || y <= -1 || y >= M) {// 범위를 벗어나면
				return 0;
			}

			String cellValue = mapsArr[x][y];

			if ("X".equals(cellValue)) {
				return 0;

			} else if (cellValue.isEmpty()) {// 크기를 쓸데 없이 크게 해놔서 그래
				return 0;

			} else {
				// 현재 노드를 방문하지 않았다면 숫자 -> V로 변경
				Integer bread = Integer.parseInt(cellValue);
				mapsArr[x][y] = "X";
				System.out.println("x> " + x + "     y> " + y);
				// 나를 중심으로 상하좌우 체크한다
				Integer a = dfs(x, y - 1, N, M, mapsArr, savedBread + bread);
				Integer b = dfs(x, y + 1, N, M, mapsArr, savedBread + bread);
				Integer c = dfs(x - 1, y, N, M, mapsArr, savedBread + bread);
				Integer d = dfs(x + 1, y, N, M, mapsArr, savedBread + bread);

				Integer rere = bread + a + b + c + d;
				System.out.println("a + b + c + d>> " + rere);

				return rere;
				//값을 저장

			}

			//현재가 바다가 아니라면(문자가 아니라면 == 숫자라면) 문자로 만든다
			//자신의 값을 뱅크에 저장한다.
			// 나를 중심으로 상하좌우를 체크하여 방문한다.
			// 상 없음, 하 있음, 좌 없음, 우 있음
			// 하: 문자임 거기서 또 상하좌우
			// 우: 숫자나옴 -> 방문표시함 -> 자신의 숫자를 뱅크에 저장한다

		}
	}

	public static void main(String[] args) {
		DesertIsland.Solution desertIsland = new Solution();

		String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};
		int[] res = desertIsland.solution(maps);

		System.out.println(Arrays.toString(res));//[1, 1, 27]


	}

}
