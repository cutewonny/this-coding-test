package greedy.programmers;

public class 숫자변환하기 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/154538

	public static int solution(int x, int y, int n) {
		int answer = 0;
		// x에 n을 더합니다
		// x에 2를 곱합니다.
		// x에 3을 곱합니다.

		int remainNum = y - x;

		while (remainNum > 0) {
			if (remainNum < n) {
				return -1;
			}

			if (remainNum % 3 == 0) {
				remainNum = remainNum / 3;
				answer++;
			} else if (remainNum % 2 == 0) {
				remainNum = remainNum / 2;
				answer++;
			} else if (remainNum - 5 > 0) {
				remainNum = remainNum - 5;
				answer++;
			}
		}

		return answer;
	}


	public static void main(String[] args) {
		int x = 10;
		int y = 40;
		int n = 5;
		int result = solution(x, y, n);
		System.out.println(result);
	}

}
