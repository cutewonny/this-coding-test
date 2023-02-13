package DFS;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesertIsland {

	static class Solution {

		public int[] solution(String[] maps) {
			List<Integer> resultList = new ArrayList<Integer>();

//			3 ≤ maps[i]의 길이 ≤ 100
			String[][] mapsArr = new String[100][100];

			int asisY = maps.length;
			int asisX = 0;
			for (int i = 0; i < asisY; i++) {

				String[] tempArr = maps[i].split("");
				asisX = tempArr.length;

				for (int j = 0; j < asisX; j++) {
					mapsArr[i][j] = tempArr[j];

				}
			}

			System.out.println(Arrays.deepToString(mapsArr));
			System.out.println("asisY>> " + asisY);
			System.out.println("asisX>> " + asisX);
			// mapsArr를 이중 배열로 만들었으니 이제..DFS

			int bank = 0;

			for (int i = 0; i < asisY; i++) {
				for (int j = 0; j < asisX; j++) {
					//DFS시작

					int checkNum = dfs(i, j, asisY, asisX, mapsArr, bank);

					if(checkNum == 0){
						resultList.add(checkNum);
					}

					if(checkNum >= 1 ){
						bank += checkNum;
					}


				}
			}

			int[] answer = {};
			return answer;
		}


		private static int dfs(int x, int y, int N, int M, String[][] mapsArr, int bank) {

			//범위에서 벗어나면 return null;
			if (x <= -1 || x >= N || y <= -1 || y >= M) {// 범위를 벗어나면
				return 0;
			}

			String cellValue = mapsArr[x][y];

			if ("X".equals(cellValue)) {
				return 0;

			} else if (cellValue.isEmpty()) {
				return 0;

			} else {
				return Integer.parseInt(cellValue);
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

		System.out.println(res);//[1, 1, 27]


	}

}
